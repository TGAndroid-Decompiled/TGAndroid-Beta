package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class sb extends rg.a {
    public final String f49724c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f49725e;
    public boolean f49726f;
    public final int f49727g;

    public sb(int i7, String str) {
        super(i7, false);
        this.f49724c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z9 = this.f49726f;
        if (this == obj) {
            return true;
        }
        if (obj == null || sb.class != obj.getClass()) {
            return false;
        }
        sb sbVar = (sb) obj;
        TL_stories.Boost boost = sbVar.d;
        boolean z10 = sbVar.f49726f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f49725e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = sbVar.f49725e) != null) {
            if (prepaidGiveaway2.f27190id == prepaidGiveaway.f27190id && z9 == z10) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f27186id.hashCode() == boost.f27186id.hashCode() && z9 == z10 && this.f49727g == sbVar.f49727g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f49724c, this.d, this.f49725e, Boolean.valueOf(this.f49726f), Integer.valueOf(this.f49727g));
    }

    public sb(TL_stories.Boost boost, boolean z9, int i7) {
        super(5, true);
        this.d = boost;
        this.f49726f = z9;
        this.f49727g = i7;
    }
}
