package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class sb extends rg.a {
    public final String f49853c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f49854e;
    public boolean f49855f;
    public final int f49856g;

    public sb(int i7, String str) {
        super(i7, false);
        this.f49853c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z9 = this.f49855f;
        if (this == obj) {
            return true;
        }
        if (obj == null || sb.class != obj.getClass()) {
            return false;
        }
        sb sbVar = (sb) obj;
        TL_stories.Boost boost = sbVar.d;
        boolean z10 = sbVar.f49855f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f49854e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = sbVar.f49854e) != null) {
            if (prepaidGiveaway2.f27194id == prepaidGiveaway.f27194id && z9 == z10) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f27190id.hashCode() == boost.f27190id.hashCode() && z9 == z10 && this.f49856g == sbVar.f49856g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f49853c, this.d, this.f49854e, Boolean.valueOf(this.f49855f), Integer.valueOf(this.f49856g));
    }

    public sb(TL_stories.Boost boost, boolean z9, int i7) {
        super(5, true);
        this.d = boost;
        this.f49855f = z9;
        this.f49856g = i7;
    }
}
