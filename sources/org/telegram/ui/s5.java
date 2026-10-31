package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class s5 extends hg.b {
    public final String f41374c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f41375f;
    public final int f41376g;

    public s5(int i10, String str) {
        super(i10, false);
        this.f41374c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f41375f;
        if (this == obj) {
            return true;
        }
        if (obj == null || s5.class != obj.getClass()) {
            return false;
        }
        s5 s5Var = (s5) obj;
        TL_stories.Boost boost = s5Var.d;
        boolean z11 = s5Var.f41375f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = s5Var.e) != null) {
            if (prepaidGiveaway2.f20030id == prepaidGiveaway.f20030id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f20026id.hashCode() == boost.f20026id.hashCode() && z10 == z11 && this.f41376g == s5Var.f41376g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f41374c, this.d, this.e, Boolean.valueOf(this.f41375f), Integer.valueOf(this.f41376g));
    }

    public s5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f41375f = z10;
        this.f41376g = i10;
    }
}
