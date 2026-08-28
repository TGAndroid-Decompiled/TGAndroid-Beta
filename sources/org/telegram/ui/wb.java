package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class wb extends wf.a {
    public final String f43717c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f43718e;
    public boolean f43719f;
    public final int f43720g;

    public wb(int i9, String str) {
        super(i9, false);
        this.f43717c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f43719f;
        if (this == obj) {
            return true;
        }
        if (obj == null || wb.class != obj.getClass()) {
            return false;
        }
        wb wbVar = (wb) obj;
        TL_stories.Boost boost = wbVar.d;
        boolean z11 = wbVar.f43719f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f43718e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = wbVar.f43718e) != null) {
            if (prepaidGiveaway2.f22616id == prepaidGiveaway.f22616id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f22612id.hashCode() == boost.f22612id.hashCode() && z10 == z11 && this.f43720g == wbVar.f43720g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f43717c, this.d, this.f43718e, Boolean.valueOf(this.f43719f), Integer.valueOf(this.f43720g));
    }

    public wb(TL_stories.Boost boost, boolean z10, int i9) {
        super(5, true);
        this.d = boost;
        this.f43719f = z10;
        this.f43720g = i9;
    }
}
