package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class y5 extends pg.a {
    public final String f43349c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f43350f;
    public final int f43351g;

    public y5(int i10, String str) {
        super(i10, false);
        this.f43349c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f43350f;
        if (this == obj) {
            return true;
        }
        if (obj == null || y5.class != obj.getClass()) {
            return false;
        }
        y5 y5Var = (y5) obj;
        TL_stories.Boost boost = y5Var.d;
        boolean z11 = y5Var.f43350f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = y5Var.e) != null) {
            if (prepaidGiveaway2.f20512id == prepaidGiveaway.f20512id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20508id.hashCode() == boost.f20508id.hashCode() && z10 == z11 && this.f43351g == y5Var.f43351g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f43349c, this.d, this.e, Boolean.valueOf(this.f43350f), Integer.valueOf(this.f43351g));
    }

    public y5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f43350f = z10;
        this.f43351g = i10;
    }
}
