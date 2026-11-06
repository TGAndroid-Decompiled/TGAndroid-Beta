package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class sb extends rg.a {
    public final String f49703c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f49704e;
    public boolean f49705f;
    public final int f49706g;

    public sb(int i7, String str) {
        super(i7, false);
        this.f49703c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z9 = this.f49705f;
        if (this == obj) {
            return true;
        }
        if (obj == null || sb.class != obj.getClass()) {
            return false;
        }
        sb sbVar = (sb) obj;
        TL_stories.Boost boost = sbVar.d;
        boolean z10 = sbVar.f49705f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f49704e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = sbVar.f49704e) != null) {
            if (prepaidGiveaway2.f27190id == prepaidGiveaway.f27190id && z9 == z10) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f27186id.hashCode() == boost.f27186id.hashCode() && z9 == z10 && this.f49706g == sbVar.f49706g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f49703c, this.d, this.f49704e, Boolean.valueOf(this.f49705f), Integer.valueOf(this.f49706g));
    }

    public sb(TL_stories.Boost boost, boolean z9, int i7) {
        super(5, true);
        this.d = boost;
        this.f49705f = z9;
        this.f49706g = i7;
    }
}
