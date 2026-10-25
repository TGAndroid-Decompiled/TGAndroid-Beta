package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class w5 extends qg.a {
    public final String f44976c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f44977f;
    public final int f44978g;

    public w5(int i10, String str) {
        super(i10, false);
        this.f44976c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f44977f;
        if (this == obj) {
            return true;
        }
        if (obj == null || w5.class != obj.getClass()) {
            return false;
        }
        w5 w5Var = (w5) obj;
        TL_stories.Boost boost = w5Var.d;
        boolean z11 = w5Var.f44977f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = w5Var.e) != null) {
            if (prepaidGiveaway2.f22263id == prepaidGiveaway.f22263id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f22259id.hashCode() == boost.f22259id.hashCode() && z10 == z11 && this.f44978g == w5Var.f44978g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f44976c, this.d, this.e, Boolean.valueOf(this.f44977f), Integer.valueOf(this.f44978g));
    }

    public w5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f44977f = z10;
        this.f44978g = i10;
    }
}
