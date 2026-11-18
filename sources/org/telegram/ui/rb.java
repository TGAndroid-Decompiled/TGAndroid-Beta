package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class rb extends rg.a {
    public final String f51555c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f51556e;
    public boolean f51557f;
    public final int f51558g;

    public rb(int i7, String str) {
        super(i7, false);
        this.f51555c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f51557f;
        if (this == obj) {
            return true;
        }
        if (obj == null || rb.class != obj.getClass()) {
            return false;
        }
        rb rbVar = (rb) obj;
        TL_stories.Boost boost = rbVar.d;
        boolean z11 = rbVar.f51557f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f51556e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = rbVar.f51556e) != null) {
            if (prepaidGiveaway2.f28643id == prepaidGiveaway.f28643id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f28639id.hashCode() == boost.f28639id.hashCode() && z10 == z11 && this.f51558g == rbVar.f51558g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f51555c, this.d, this.f51556e, Boolean.valueOf(this.f51557f), Integer.valueOf(this.f51558g));
    }

    public rb(TL_stories.Boost boost, boolean z10, int i7) {
        super(5, true);
        this.d = boost;
        this.f51557f = z10;
        this.f51558g = i7;
    }
}
