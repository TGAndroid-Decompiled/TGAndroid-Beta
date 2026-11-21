package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class s5 extends rg.a {
    public final String f51930c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f51931e;
    public boolean f51932f;
    public final int f51933g;

    public s5(int i7, String str) {
        super(i7, false);
        this.f51930c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f51932f;
        if (this == obj) {
            return true;
        }
        if (obj == null || s5.class != obj.getClass()) {
            return false;
        }
        s5 s5Var = (s5) obj;
        TL_stories.Boost boost = s5Var.d;
        boolean z11 = s5Var.f51932f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f51931e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = s5Var.f51931e) != null) {
            if (prepaidGiveaway2.f28669id == prepaidGiveaway.f28669id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f28665id.hashCode() == boost.f28665id.hashCode() && z10 == z11 && this.f51933g == s5Var.f51933g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f51930c, this.d, this.f51931e, Boolean.valueOf(this.f51932f), Integer.valueOf(this.f51933g));
    }

    public s5(TL_stories.Boost boost, boolean z10, int i7) {
        super(5, true);
        this.d = boost;
        this.f51932f = z10;
        this.f51933g = i7;
    }
}
