package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class rb extends rg.a {
    public final String f51564c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f51565e;
    public boolean f51566f;
    public final int f51567g;

    public rb(int i7, String str) {
        super(i7, false);
        this.f51564c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f51566f;
        if (this == obj) {
            return true;
        }
        if (obj == null || rb.class != obj.getClass()) {
            return false;
        }
        rb rbVar = (rb) obj;
        TL_stories.Boost boost = rbVar.d;
        boolean z11 = rbVar.f51566f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f51565e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = rbVar.f51565e) != null) {
            if (prepaidGiveaway2.f28636id == prepaidGiveaway.f28636id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f28632id.hashCode() == boost.f28632id.hashCode() && z10 == z11 && this.f51567g == rbVar.f51567g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f51564c, this.d, this.f51565e, Boolean.valueOf(this.f51566f), Integer.valueOf(this.f51567g));
    }

    public rb(TL_stories.Boost boost, boolean z10, int i7) {
        super(5, true);
        this.d = boost;
        this.f51566f = z10;
        this.f51567g = i7;
    }
}
