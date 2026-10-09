package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class u5 extends og.a {
    public final String f42327c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f42328e;
    public boolean f42329f;
    public final int f42330g;

    public u5(int i10, String str) {
        super(i10, false);
        this.f42327c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f42329f;
        if (this == obj) {
            return true;
        }
        if (obj == null || u5.class != obj.getClass()) {
            return false;
        }
        u5 u5Var = (u5) obj;
        TL_stories.Boost boost = u5Var.d;
        boolean z11 = u5Var.f42329f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f42328e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = u5Var.f42328e) != null) {
            if (prepaidGiveaway2.f20274id == prepaidGiveaway.f20274id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20270id.hashCode() == boost.f20270id.hashCode() && z10 == z11 && this.f42330g == u5Var.f42330g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f42327c, this.d, this.f42328e, Boolean.valueOf(this.f42329f), Integer.valueOf(this.f42330g));
    }

    public u5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f42329f = z10;
        this.f42330g = i10;
    }
}
