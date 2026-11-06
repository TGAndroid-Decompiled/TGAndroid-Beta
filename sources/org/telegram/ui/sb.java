package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class sb extends rg.a {
    public final String f49723c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f49724e;
    public boolean f49725f;
    public final int f49726g;

    public sb(int i7, String str) {
        super(i7, false);
        this.f49723c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z9 = this.f49725f;
        if (this == obj) {
            return true;
        }
        if (obj == null || sb.class != obj.getClass()) {
            return false;
        }
        sb sbVar = (sb) obj;
        TL_stories.Boost boost = sbVar.d;
        boolean z10 = sbVar.f49725f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f49724e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = sbVar.f49724e) != null) {
            if (prepaidGiveaway2.f27191id == prepaidGiveaway.f27191id && z9 == z10) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f27187id.hashCode() == boost.f27187id.hashCode() && z9 == z10 && this.f49726g == sbVar.f49726g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f49723c, this.d, this.f49724e, Boolean.valueOf(this.f49725f), Integer.valueOf(this.f49726g));
    }

    public sb(TL_stories.Boost boost, boolean z9, int i7) {
        super(5, true);
        this.d = boost;
        this.f49725f = z9;
        this.f49726g = i7;
    }
}
