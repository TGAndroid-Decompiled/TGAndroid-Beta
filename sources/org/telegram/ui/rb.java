package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class rb extends rg.a {
    public final String f51533c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f51534e;
    public boolean f51535f;
    public final int f51536g;

    public rb(int i7, String str) {
        super(i7, false);
        this.f51533c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f51535f;
        if (this == obj) {
            return true;
        }
        if (obj == null || rb.class != obj.getClass()) {
            return false;
        }
        rb rbVar = (rb) obj;
        TL_stories.Boost boost = rbVar.d;
        boolean z11 = rbVar.f51535f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f51534e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = rbVar.f51534e) != null) {
            if (prepaidGiveaway2.f28672id == prepaidGiveaway.f28672id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f28668id.hashCode() == boost.f28668id.hashCode() && z10 == z11 && this.f51536g == rbVar.f51536g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f51533c, this.d, this.f51534e, Boolean.valueOf(this.f51535f), Integer.valueOf(this.f51536g));
    }

    public rb(TL_stories.Boost boost, boolean z10, int i7) {
        super(5, true);
        this.d = boost;
        this.f51535f = z10;
        this.f51536g = i7;
    }
}
