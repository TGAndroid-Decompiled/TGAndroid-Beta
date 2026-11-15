package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class rb extends rg.a {
    public final String f50898c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f50899e;
    public boolean f50900f;
    public final int f50901g;

    public rb(int i7, String str) {
        super(i7, false);
        this.f50898c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f50900f;
        if (this == obj) {
            return true;
        }
        if (obj == null || rb.class != obj.getClass()) {
            return false;
        }
        rb rbVar = (rb) obj;
        TL_stories.Boost boost = rbVar.d;
        boolean z11 = rbVar.f50900f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f50899e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = rbVar.f50899e) != null) {
            if (prepaidGiveaway2.f28289id == prepaidGiveaway.f28289id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f28285id.hashCode() == boost.f28285id.hashCode() && z10 == z11 && this.f50901g == rbVar.f50901g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f50898c, this.d, this.f50899e, Boolean.valueOf(this.f50900f), Integer.valueOf(this.f50901g));
    }

    public rb(TL_stories.Boost boost, boolean z10, int i7) {
        super(5, true);
        this.d = boost;
        this.f50900f = z10;
        this.f50901g = i7;
    }
}
