package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class u5 extends pg.a {
    public final String f40953c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f40954e;
    public boolean f40955f;
    public final int f40956g;

    public u5(int i10, String str) {
        super(i10, false);
        this.f40953c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f40955f;
        if (this == obj) {
            return true;
        }
        if (obj == null || u5.class != obj.getClass()) {
            return false;
        }
        u5 u5Var = (u5) obj;
        TL_stories.Boost boost = u5Var.d;
        boolean z11 = u5Var.f40955f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f40954e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = u5Var.f40954e) != null) {
            if (prepaidGiveaway2.f20132id == prepaidGiveaway.f20132id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20128id.hashCode() == boost.f20128id.hashCode() && z10 == z11 && this.f40956g == u5Var.f40956g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f40953c, this.d, this.f40954e, Boolean.valueOf(this.f40955f), Integer.valueOf(this.f40956g));
    }

    public u5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f40955f = z10;
        this.f40956g = i10;
    }
}
