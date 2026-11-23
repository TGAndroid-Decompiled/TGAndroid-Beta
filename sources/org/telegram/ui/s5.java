package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class s5 extends rg.a {
    public final String f51971c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f51972e;
    public boolean f51973f;
    public final int f51974g;

    public s5(int i7, String str) {
        super(i7, false);
        this.f51971c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f51973f;
        if (this == obj) {
            return true;
        }
        if (obj == null || s5.class != obj.getClass()) {
            return false;
        }
        s5 s5Var = (s5) obj;
        TL_stories.Boost boost = s5Var.d;
        boolean z11 = s5Var.f51973f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f51972e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = s5Var.f51972e) != null) {
            if (prepaidGiveaway2.f28730id == prepaidGiveaway.f28730id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f28726id.hashCode() == boost.f28726id.hashCode() && z10 == z11 && this.f51974g == s5Var.f51974g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f51971c, this.d, this.f51972e, Boolean.valueOf(this.f51973f), Integer.valueOf(this.f51974g));
    }

    public s5(TL_stories.Boost boost, boolean z10, int i7) {
        super(5, true);
        this.d = boost;
        this.f51973f = z10;
        this.f51974g = i7;
    }
}
