package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class v5 extends og.a {
    public final String f41558c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f41559e;
    public boolean f41560f;
    public final int f41561g;

    public v5(int i10, String str) {
        super(i10, false);
        this.f41558c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f41560f;
        if (this == obj) {
            return true;
        }
        if (obj == null || v5.class != obj.getClass()) {
            return false;
        }
        v5 v5Var = (v5) obj;
        TL_stories.Boost boost = v5Var.d;
        boolean z11 = v5Var.f41560f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f41559e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = v5Var.f41559e) != null) {
            if (prepaidGiveaway2.f20274id == prepaidGiveaway.f20274id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20270id.hashCode() == boost.f20270id.hashCode() && z10 == z11 && this.f41561g == v5Var.f41561g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f41558c, this.d, this.f41559e, Boolean.valueOf(this.f41560f), Integer.valueOf(this.f41561g));
    }

    public v5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f41560f = z10;
        this.f41561g = i10;
    }
}
