package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class t5 extends og.a {
    public final String f42063c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f42064e;
    public boolean f42065f;
    public final int f42066g;

    public t5(int i10, String str) {
        super(i10, false);
        this.f42063c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f42065f;
        if (this == obj) {
            return true;
        }
        if (obj == null || t5.class != obj.getClass()) {
            return false;
        }
        t5 t5Var = (t5) obj;
        TL_stories.Boost boost = t5Var.d;
        boolean z11 = t5Var.f42065f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f42064e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = t5Var.f42064e) != null) {
            if (prepaidGiveaway2.f20268id == prepaidGiveaway.f20268id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20264id.hashCode() == boost.f20264id.hashCode() && z10 == z11 && this.f42066g == t5Var.f42066g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f42063c, this.d, this.f42064e, Boolean.valueOf(this.f42065f), Integer.valueOf(this.f42066g));
    }

    public t5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f42065f = z10;
        this.f42066g = i10;
    }
}
