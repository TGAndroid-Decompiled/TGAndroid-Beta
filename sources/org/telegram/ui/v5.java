package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class v5 extends ng.a {
    public final String f37410c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f37411f;
    public final int f37412g;

    public v5(int i10, String str) {
        super(i10, false);
        this.f37410c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f37411f;
        if (this == obj) {
            return true;
        }
        if (obj == null || v5.class != obj.getClass()) {
            return false;
        }
        v5 v5Var = (v5) obj;
        TL_stories.Boost boost = v5Var.d;
        boolean z11 = v5Var.f37411f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = v5Var.e) != null) {
            if (prepaidGiveaway2.f17434id == prepaidGiveaway.f17434id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f17430id.hashCode() == boost.f17430id.hashCode() && z10 == z11 && this.f37412g == v5Var.f37412g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f37410c, this.d, this.e, Boolean.valueOf(this.f37411f), Integer.valueOf(this.f37412g));
    }

    public v5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f37411f = z10;
        this.f37412g = i10;
    }
}
