package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class x5 extends cg.b {
    public final String f42963c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f42964e;
    public boolean f42965f;
    public final int f42966g;

    public x5(int i10, String str) {
        super(i10, false);
        this.f42963c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z4 = this.f42965f;
        if (this == obj) {
            return true;
        }
        if (obj == null || x5.class != obj.getClass()) {
            return false;
        }
        x5 x5Var = (x5) obj;
        TL_stories.Boost boost = x5Var.d;
        boolean z10 = x5Var.f42965f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f42964e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = x5Var.f42964e) != null) {
            if (prepaidGiveaway2.f21079id == prepaidGiveaway.f21079id && z4 == z10) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f21075id.hashCode() == boost.f21075id.hashCode() && z4 == z10 && this.f42966g == x5Var.f42966g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f42963c, this.d, this.f42964e, Boolean.valueOf(this.f42965f), Integer.valueOf(this.f42966g));
    }

    public x5(TL_stories.Boost boost, boolean z4, int i10) {
        super(5, true);
        this.d = boost;
        this.f42965f = z4;
        this.f42966g = i10;
    }
}
