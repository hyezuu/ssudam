package com.ssudam.bookmark.entity;

import com.ssudam.member.entity.Member;
import com.ssudam.party.entity.Party;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Bookmark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookmarkId;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "PARTY_ID")
    private Party party;

    public Bookmark(Member member, Party party) {
        this.member = member;
        this.party = party;
    }

    public void addMember(Member member) {
        this.member = member;
        if (!this.member.getBookmarks().contains(this)) {
            this.member.getBookmarks().add(this);
        }
    }

    public void addParty(Party party) {
        this.party = party;
        if (!this.party.getBookmarks().contains(this)) {
            this.party.getBookmarks().add(this);
        }
    }
}
