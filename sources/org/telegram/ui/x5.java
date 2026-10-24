package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class x5 extends pg.a {
    public final String f43472c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f43473f;
    public final int f43474g;

    public x5(int i10, String str) {
        super(i10, false);
        this.f43472c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f43473f;
        if (this == obj) {
            return true;
        }
        if (obj == null || x5.class != obj.getClass()) {
            return false;
        }
        x5 x5Var = (x5) obj;
        TL_stories.Boost boost = x5Var.d;
        boolean z11 = x5Var.f43473f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = x5Var.e) != null) {
            if (prepaidGiveaway2.f20577id == prepaidGiveaway.f20577id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20573id.hashCode() == boost.f20573id.hashCode() && z10 == z11 && this.f43474g == x5Var.f43474g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f43472c, this.d, this.e, Boolean.valueOf(this.f43473f), Integer.valueOf(this.f43474g));
    }

    public x5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f43473f = z10;
        this.f43474g = i10;
    }
}
