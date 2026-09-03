package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class z5 extends bg.b {
    public final String f40397c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f40398f;
    public final int f40399g;

    public z5(int i10, String str) {
        super(i10, false);
        this.f40397c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z4 = this.f40398f;
        if (this == obj) {
            return true;
        }
        if (obj == null || z5.class != obj.getClass()) {
            return false;
        }
        z5 z5Var = (z5) obj;
        TL_stories.Boost boost = z5Var.d;
        boolean z10 = z5Var.f40398f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = z5Var.e) != null) {
            if (prepaidGiveaway2.f19393id == prepaidGiveaway.f19393id && z4 == z10) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f19389id.hashCode() == boost.f19389id.hashCode() && z4 == z10 && this.f40399g == z5Var.f40399g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f40397c, this.d, this.e, Boolean.valueOf(this.f40398f), Integer.valueOf(this.f40399g));
    }

    public z5(TL_stories.Boost boost, boolean z4, int i10) {
        super(5, true);
        this.d = boost;
        this.f40398f = z4;
        this.f40399g = i10;
    }
}
