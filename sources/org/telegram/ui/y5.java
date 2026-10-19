package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class y5 extends pg.a {
    public final String f43342c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f43343f;
    public final int f43344g;

    public y5(int i10, String str) {
        super(i10, false);
        this.f43342c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f43343f;
        if (this == obj) {
            return true;
        }
        if (obj == null || y5.class != obj.getClass()) {
            return false;
        }
        y5 y5Var = (y5) obj;
        TL_stories.Boost boost = y5Var.d;
        boolean z11 = y5Var.f43343f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = y5Var.e) != null) {
            if (prepaidGiveaway2.f20508id == prepaidGiveaway.f20508id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20504id.hashCode() == boost.f20504id.hashCode() && z10 == z11 && this.f43344g == y5Var.f43344g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f43342c, this.d, this.e, Boolean.valueOf(this.f43343f), Integer.valueOf(this.f43344g));
    }

    public y5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f43343f = z10;
        this.f43344g = i10;
    }
}
