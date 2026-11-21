package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class rb extends rg.a {
    public final String f51529c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f51530e;
    public boolean f51531f;
    public final int f51532g;

    public rb(int i7, String str) {
        super(i7, false);
        this.f51529c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f51531f;
        if (this == obj) {
            return true;
        }
        if (obj == null || rb.class != obj.getClass()) {
            return false;
        }
        rb rbVar = (rb) obj;
        TL_stories.Boost boost = rbVar.d;
        boolean z11 = rbVar.f51531f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f51530e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = rbVar.f51530e) != null) {
            if (prepaidGiveaway2.f28669id == prepaidGiveaway.f28669id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f28665id.hashCode() == boost.f28665id.hashCode() && z10 == z11 && this.f51532g == rbVar.f51532g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f51529c, this.d, this.f51530e, Boolean.valueOf(this.f51531f), Integer.valueOf(this.f51532g));
    }

    public rb(TL_stories.Boost boost, boolean z10, int i7) {
        super(5, true);
        this.d = boost;
        this.f51531f = z10;
        this.f51532g = i7;
    }
}
