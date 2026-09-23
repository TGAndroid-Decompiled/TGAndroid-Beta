package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class v5 extends og.a {
    public final String f38298c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f38299f;
    public final int f38300g;

    public v5(int i10, String str) {
        super(i10, false);
        this.f38298c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f38299f;
        if (this == obj) {
            return true;
        }
        if (obj == null || v5.class != obj.getClass()) {
            return false;
        }
        v5 v5Var = (v5) obj;
        TL_stories.Boost boost = v5Var.d;
        boolean z11 = v5Var.f38299f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = v5Var.e) != null) {
            if (prepaidGiveaway2.f18317id == prepaidGiveaway.f18317id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f18313id.hashCode() == boost.f18313id.hashCode() && z10 == z11 && this.f38300g == v5Var.f38300g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f38298c, this.d, this.e, Boolean.valueOf(this.f38299f), Integer.valueOf(this.f38300g));
    }

    public v5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f38299f = z10;
        this.f38300g = i10;
    }
}
