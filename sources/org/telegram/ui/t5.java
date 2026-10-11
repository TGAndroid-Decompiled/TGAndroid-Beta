package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class t5 extends og.a {
    public final String f42097c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f42098e;
    public boolean f42099f;
    public final int f42100g;

    public t5(int i10, String str) {
        super(i10, false);
        this.f42097c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f42099f;
        if (this == obj) {
            return true;
        }
        if (obj == null || t5.class != obj.getClass()) {
            return false;
        }
        t5 t5Var = (t5) obj;
        TL_stories.Boost boost = t5Var.d;
        boolean z11 = t5Var.f42099f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f42098e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = t5Var.f42098e) != null) {
            if (prepaidGiveaway2.f20304id == prepaidGiveaway.f20304id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20300id.hashCode() == boost.f20300id.hashCode() && z10 == z11 && this.f42100g == t5Var.f42100g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f42097c, this.d, this.f42098e, Boolean.valueOf(this.f42099f), Integer.valueOf(this.f42100g));
    }

    public t5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f42099f = z10;
        this.f42100g = i10;
    }
}
