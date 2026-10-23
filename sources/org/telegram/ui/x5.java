package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class x5 extends pg.a {
    public final String f43496c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f43497f;
    public final int f43498g;

    public x5(int i10, String str) {
        super(i10, false);
        this.f43496c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f43497f;
        if (this == obj) {
            return true;
        }
        if (obj == null || x5.class != obj.getClass()) {
            return false;
        }
        x5 x5Var = (x5) obj;
        TL_stories.Boost boost = x5Var.d;
        boolean z11 = x5Var.f43497f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = x5Var.e) != null) {
            if (prepaidGiveaway2.f20576id == prepaidGiveaway.f20576id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20572id.hashCode() == boost.f20572id.hashCode() && z10 == z11 && this.f43498g == x5Var.f43498g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f43496c, this.d, this.e, Boolean.valueOf(this.f43497f), Integer.valueOf(this.f43498g));
    }

    public x5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f43497f = z10;
        this.f43498g = i10;
    }
}
