package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class v5 extends og.a {
    public final String f41557c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f41558e;
    public boolean f41559f;
    public final int f41560g;

    public v5(int i10, String str) {
        super(i10, false);
        this.f41557c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f41559f;
        if (this == obj) {
            return true;
        }
        if (obj == null || v5.class != obj.getClass()) {
            return false;
        }
        v5 v5Var = (v5) obj;
        TL_stories.Boost boost = v5Var.d;
        boolean z11 = v5Var.f41559f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f41558e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = v5Var.f41558e) != null) {
            if (prepaidGiveaway2.f20273id == prepaidGiveaway.f20273id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20269id.hashCode() == boost.f20269id.hashCode() && z10 == z11 && this.f41560g == v5Var.f41560g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f41557c, this.d, this.f41558e, Boolean.valueOf(this.f41559f), Integer.valueOf(this.f41560g));
    }

    public v5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f41559f = z10;
        this.f41560g = i10;
    }
}
