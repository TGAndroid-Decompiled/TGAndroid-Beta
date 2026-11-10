package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class s5 extends rg.a {
    public final String f49666c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f49667e;
    public boolean f49668f;
    public final int f49669g;

    public s5(int i7, String str) {
        super(i7, false);
        this.f49666c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z9 = this.f49668f;
        if (this == obj) {
            return true;
        }
        if (obj == null || s5.class != obj.getClass()) {
            return false;
        }
        s5 s5Var = (s5) obj;
        TL_stories.Boost boost = s5Var.d;
        boolean z10 = s5Var.f49668f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f49667e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = s5Var.f49667e) != null) {
            if (prepaidGiveaway2.f27198id == prepaidGiveaway.f27198id && z9 == z10) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f27194id.hashCode() == boost.f27194id.hashCode() && z9 == z10 && this.f49669g == s5Var.f49669g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f49666c, this.d, this.f49667e, Boolean.valueOf(this.f49668f), Integer.valueOf(this.f49669g));
    }

    public s5(TL_stories.Boost boost, boolean z9, int i7) {
        super(5, true);
        this.d = boost;
        this.f49668f = z9;
        this.f49669g = i7;
    }
}
