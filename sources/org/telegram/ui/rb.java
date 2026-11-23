package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class rb extends rg.a {
    public final String f51681c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f51682e;
    public boolean f51683f;
    public final int f51684g;

    public rb(int i7, String str) {
        super(i7, false);
        this.f51681c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f51683f;
        if (this == obj) {
            return true;
        }
        if (obj == null || rb.class != obj.getClass()) {
            return false;
        }
        rb rbVar = (rb) obj;
        TL_stories.Boost boost = rbVar.d;
        boolean z11 = rbVar.f51683f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f51682e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = rbVar.f51682e) != null) {
            if (prepaidGiveaway2.f28730id == prepaidGiveaway.f28730id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f28726id.hashCode() == boost.f28726id.hashCode() && z10 == z11 && this.f51684g == rbVar.f51684g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f51681c, this.d, this.f51682e, Boolean.valueOf(this.f51683f), Integer.valueOf(this.f51684g));
    }

    public rb(TL_stories.Boost boost, boolean z10, int i7) {
        super(5, true);
        this.d = boost;
        this.f51683f = z10;
        this.f51684g = i7;
    }
}
