package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class x5 extends cg.b {
    public final String f42923c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f42924e;
    public boolean f42925f;
    public final int f42926g;

    public x5(int i10, String str) {
        super(i10, false);
        this.f42923c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z4 = this.f42925f;
        if (this == obj) {
            return true;
        }
        if (obj == null || x5.class != obj.getClass()) {
            return false;
        }
        x5 x5Var = (x5) obj;
        TL_stories.Boost boost = x5Var.d;
        boolean z10 = x5Var.f42925f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f42924e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = x5Var.f42924e) != null) {
            if (prepaidGiveaway2.f21081id == prepaidGiveaway.f21081id && z4 == z10) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f21077id.hashCode() == boost.f21077id.hashCode() && z4 == z10 && this.f42926g == x5Var.f42926g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f42923c, this.d, this.f42924e, Boolean.valueOf(this.f42925f), Integer.valueOf(this.f42926g));
    }

    public x5(TL_stories.Boost boost, boolean z4, int i10) {
        super(5, true);
        this.d = boost;
        this.f42925f = z4;
        this.f42926g = i10;
    }
}
