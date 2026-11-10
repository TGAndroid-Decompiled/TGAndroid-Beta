package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class sb extends rg.a {
    public final String f49805c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f49806e;
    public boolean f49807f;
    public final int f49808g;

    public sb(int i7, String str) {
        super(i7, false);
        this.f49805c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z9 = this.f49807f;
        if (this == obj) {
            return true;
        }
        if (obj == null || sb.class != obj.getClass()) {
            return false;
        }
        sb sbVar = (sb) obj;
        TL_stories.Boost boost = sbVar.d;
        boolean z10 = sbVar.f49807f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f49806e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = sbVar.f49806e) != null) {
            if (prepaidGiveaway2.f27198id == prepaidGiveaway.f27198id && z9 == z10) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f27194id.hashCode() == boost.f27194id.hashCode() && z9 == z10 && this.f49808g == sbVar.f49808g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f49805c, this.d, this.f49806e, Boolean.valueOf(this.f49807f), Integer.valueOf(this.f49808g));
    }

    public sb(TL_stories.Boost boost, boolean z9, int i7) {
        super(5, true);
        this.d = boost;
        this.f49807f = z9;
        this.f49808g = i7;
    }
}
