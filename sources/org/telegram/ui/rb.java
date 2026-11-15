package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class rb extends rg.a {
    public final String f50897c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f50898e;
    public boolean f50899f;
    public final int f50900g;

    public rb(int i7, String str) {
        super(i7, false);
        this.f50897c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f50899f;
        if (this == obj) {
            return true;
        }
        if (obj == null || rb.class != obj.getClass()) {
            return false;
        }
        rb rbVar = (rb) obj;
        TL_stories.Boost boost = rbVar.d;
        boolean z11 = rbVar.f50899f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f50898e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = rbVar.f50898e) != null) {
            if (prepaidGiveaway2.f28289id == prepaidGiveaway.f28289id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f28285id.hashCode() == boost.f28285id.hashCode() && z10 == z11 && this.f50900g == rbVar.f50900g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f50897c, this.d, this.f50898e, Boolean.valueOf(this.f50899f), Integer.valueOf(this.f50900g));
    }

    public rb(TL_stories.Boost boost, boolean z10, int i7) {
        super(5, true);
        this.d = boost;
        this.f50899f = z10;
        this.f50900g = i7;
    }
}
