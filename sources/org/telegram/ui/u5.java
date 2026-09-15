package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class u5 extends og.a {
    public final String f37857c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f37858f;
    public final int f37859g;

    public u5(int i10, String str) {
        super(i10, false);
        this.f37857c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f37858f;
        if (this == obj) {
            return true;
        }
        if (obj == null || u5.class != obj.getClass()) {
            return false;
        }
        u5 u5Var = (u5) obj;
        TL_stories.Boost boost = u5Var.d;
        boolean z11 = u5Var.f37858f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = u5Var.e) != null) {
            if (prepaidGiveaway2.f18347id == prepaidGiveaway.f18347id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f18343id.hashCode() == boost.f18343id.hashCode() && z10 == z11 && this.f37859g == u5Var.f37859g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f37857c, this.d, this.e, Boolean.valueOf(this.f37858f), Integer.valueOf(this.f37859g));
    }

    public u5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f37858f = z10;
        this.f37859g = i10;
    }
}
