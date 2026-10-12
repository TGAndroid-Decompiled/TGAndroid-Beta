package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class x5 extends og.a {
    public final String f43759c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f43760e;
    public boolean f43761f;
    public final int f43762g;

    public x5(int i10, String str) {
        super(i10, false);
        this.f43759c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f43761f;
        if (this == obj) {
            return true;
        }
        if (obj == null || x5.class != obj.getClass()) {
            return false;
        }
        x5 x5Var = (x5) obj;
        TL_stories.Boost boost = x5Var.d;
        boolean z11 = x5Var.f43761f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f43760e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = x5Var.f43760e) != null) {
            if (prepaidGiveaway2.f20041id == prepaidGiveaway.f20041id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20037id.hashCode() == boost.f20037id.hashCode() && z10 == z11 && this.f43762g == x5Var.f43762g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f43759c, this.d, this.f43760e, Boolean.valueOf(this.f43761f), Integer.valueOf(this.f43762g));
    }

    public x5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f43761f = z10;
        this.f43762g = i10;
    }
}
