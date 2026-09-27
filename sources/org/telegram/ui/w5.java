package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class w5 extends og.a {
    public final String f38813c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f38814f;
    public final int f38815g;

    public w5(int i10, String str) {
        super(i10, false);
        this.f38813c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f38814f;
        if (this == obj) {
            return true;
        }
        if (obj == null || w5.class != obj.getClass()) {
            return false;
        }
        w5 w5Var = (w5) obj;
        TL_stories.Boost boost = w5Var.d;
        boolean z11 = w5Var.f38814f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = w5Var.e) != null) {
            if (prepaidGiveaway2.f18563id == prepaidGiveaway.f18563id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f18559id.hashCode() == boost.f18559id.hashCode() && z10 == z11 && this.f38815g == w5Var.f38815g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f38813c, this.d, this.e, Boolean.valueOf(this.f38814f), Integer.valueOf(this.f38815g));
    }

    public w5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f38814f = z10;
        this.f38815g = i10;
    }
}
