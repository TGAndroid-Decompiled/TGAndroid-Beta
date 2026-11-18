package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class rb extends rg.a {
    public final String f51540c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f51541e;
    public boolean f51542f;
    public final int f51543g;

    public rb(int i7, String str) {
        super(i7, false);
        this.f51540c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f51542f;
        if (this == obj) {
            return true;
        }
        if (obj == null || rb.class != obj.getClass()) {
            return false;
        }
        rb rbVar = (rb) obj;
        TL_stories.Boost boost = rbVar.d;
        boolean z11 = rbVar.f51542f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f51541e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = rbVar.f51541e) != null) {
            if (prepaidGiveaway2.f28641id == prepaidGiveaway.f28641id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f28637id.hashCode() == boost.f28637id.hashCode() && z10 == z11 && this.f51543g == rbVar.f51543g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f51540c, this.d, this.f51541e, Boolean.valueOf(this.f51542f), Integer.valueOf(this.f51543g));
    }

    public rb(TL_stories.Boost boost, boolean z10, int i7) {
        super(5, true);
        this.d = boost;
        this.f51542f = z10;
        this.f51543g = i7;
    }
}
