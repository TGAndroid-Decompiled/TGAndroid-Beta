package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class x5 extends bg.b {
    public final String f39858c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f39859f;
    public final int f39860g;

    public x5(int i10, String str) {
        super(i10, false);
        this.f39858c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z4 = this.f39859f;
        if (this == obj) {
            return true;
        }
        if (obj == null || x5.class != obj.getClass()) {
            return false;
        }
        x5 x5Var = (x5) obj;
        TL_stories.Boost boost = x5Var.d;
        boolean z10 = x5Var.f39859f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = x5Var.e) != null) {
            if (prepaidGiveaway2.f19418id == prepaidGiveaway.f19418id && z4 == z10) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f19414id.hashCode() == boost.f19414id.hashCode() && z4 == z10 && this.f39860g == x5Var.f39860g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f39858c, this.d, this.e, Boolean.valueOf(this.f39859f), Integer.valueOf(this.f39860g));
    }

    public x5(TL_stories.Boost boost, boolean z4, int i10) {
        super(5, true);
        this.d = boost;
        this.f39859f = z4;
        this.f39860g = i10;
    }
}
