package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class s5 extends rg.a {
    public final String f49631c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f49632e;
    public boolean f49633f;
    public final int f49634g;

    public s5(int i7, String str) {
        super(i7, false);
        this.f49631c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z9 = this.f49633f;
        if (this == obj) {
            return true;
        }
        if (obj == null || s5.class != obj.getClass()) {
            return false;
        }
        s5 s5Var = (s5) obj;
        TL_stories.Boost boost = s5Var.d;
        boolean z10 = s5Var.f49633f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f49632e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = s5Var.f49632e) != null) {
            if (prepaidGiveaway2.f27190id == prepaidGiveaway.f27190id && z9 == z10) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f27186id.hashCode() == boost.f27186id.hashCode() && z9 == z10 && this.f49634g == s5Var.f49634g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f49631c, this.d, this.f49632e, Boolean.valueOf(this.f49633f), Integer.valueOf(this.f49634g));
    }

    public s5(TL_stories.Boost boost, boolean z9, int i7) {
        super(5, true);
        this.d = boost;
        this.f49633f = z9;
        this.f49634g = i7;
    }
}
