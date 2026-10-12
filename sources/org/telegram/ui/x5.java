package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class x5 extends og.a {
    public final String f43754c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f43755e;
    public boolean f43756f;
    public final int f43757g;

    public x5(int i10, String str) {
        super(i10, false);
        this.f43754c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f43756f;
        if (this == obj) {
            return true;
        }
        if (obj == null || x5.class != obj.getClass()) {
            return false;
        }
        x5 x5Var = (x5) obj;
        TL_stories.Boost boost = x5Var.d;
        boolean z11 = x5Var.f43756f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f43755e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = x5Var.f43755e) != null) {
            if (prepaidGiveaway2.f20040id == prepaidGiveaway.f20040id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20036id.hashCode() == boost.f20036id.hashCode() && z10 == z11 && this.f43757g == x5Var.f43757g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f43754c, this.d, this.f43755e, Boolean.valueOf(this.f43756f), Integer.valueOf(this.f43757g));
    }

    public x5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f43756f = z10;
        this.f43757g = i10;
    }
}
