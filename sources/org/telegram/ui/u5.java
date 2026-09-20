package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class u5 extends og.a {
    public final String f37956c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f37957f;
    public final int f37958g;

    public u5(int i10, String str) {
        super(i10, false);
        this.f37956c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f37957f;
        if (this == obj) {
            return true;
        }
        if (obj == null || u5.class != obj.getClass()) {
            return false;
        }
        u5 u5Var = (u5) obj;
        TL_stories.Boost boost = u5Var.d;
        boolean z11 = u5Var.f37957f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = u5Var.e) != null) {
            if (prepaidGiveaway2.f18562id == prepaidGiveaway.f18562id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f18558id.hashCode() == boost.f18558id.hashCode() && z10 == z11 && this.f37958g == u5Var.f37958g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f37956c, this.d, this.e, Boolean.valueOf(this.f37957f), Integer.valueOf(this.f37958g));
    }

    public u5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f37957f = z10;
        this.f37958g = i10;
    }
}
