package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;

public final class u5 extends xf.a {

    public final String f43117c;
    public final TL_stories.Boost d;

    public TL_stories.PrepaidGiveaway f43118e;

    public boolean f43119f;

    public final int f43120g;

    public u5(int i10, String str) {
        super(i10, false);
        this.f43117c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f43119f;
        if (this == obj) {
            return true;
        }
        if (obj == null || u5.class != obj.getClass()) {
            return false;
        }
        u5 u5Var = (u5) obj;
        TL_stories.Boost boost = u5Var.d;
        boolean z11 = u5Var.f43119f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f43118e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = u5Var.f43118e) != null) {
            return prepaidGiveaway2.f22616id == prepaidGiveaway.f22616id && z10 == z11;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        return boost2.f22612id.hashCode() == boost.f22612id.hashCode() && z10 == z11 && this.f43120g == u5Var.f43120g;
    }

    public final int hashCode() {
        return Objects.hash(this.f43117c, this.d, this.f43118e, Boolean.valueOf(this.f43119f), Integer.valueOf(this.f43120g));
    }

    public u5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f43119f = z10;
        this.f43120g = i10;
    }
}
