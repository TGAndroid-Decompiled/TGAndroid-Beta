package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class u5 extends pg.a {
    public final String f40926c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f40927e;
    public boolean f40928f;
    public final int f40929g;

    public u5(int i10, String str) {
        super(i10, false);
        this.f40926c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f40928f;
        if (this == obj) {
            return true;
        }
        if (obj == null || u5.class != obj.getClass()) {
            return false;
        }
        u5 u5Var = (u5) obj;
        TL_stories.Boost boost = u5Var.d;
        boolean z11 = u5Var.f40928f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f40927e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = u5Var.f40927e) != null) {
            if (prepaidGiveaway2.f20105id == prepaidGiveaway.f20105id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20101id.hashCode() == boost.f20101id.hashCode() && z10 == z11 && this.f40929g == u5Var.f40929g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f40926c, this.d, this.f40927e, Boolean.valueOf(this.f40928f), Integer.valueOf(this.f40929g));
    }

    public u5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f40928f = z10;
        this.f40929g = i10;
    }
}
