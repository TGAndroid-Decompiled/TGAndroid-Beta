package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class yb extends hg.b {
    public final String f43628c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f43629f;
    public final int f43630g;

    public yb(int i10, String str) {
        super(i10, false);
        this.f43628c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f43629f;
        if (this == obj) {
            return true;
        }
        if (obj == null || yb.class != obj.getClass()) {
            return false;
        }
        yb ybVar = (yb) obj;
        TL_stories.Boost boost = ybVar.d;
        boolean z11 = ybVar.f43629f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = ybVar.e) != null) {
            if (prepaidGiveaway2.f20031id == prepaidGiveaway.f20031id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20027id.hashCode() == boost.f20027id.hashCode() && z10 == z11 && this.f43630g == ybVar.f43630g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f43628c, this.d, this.e, Boolean.valueOf(this.f43629f), Integer.valueOf(this.f43630g));
    }

    public yb(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f43629f = z10;
        this.f43630g = i10;
    }
}
