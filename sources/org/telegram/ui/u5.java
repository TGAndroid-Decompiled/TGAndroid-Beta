package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class u5 extends zf.a {
    public final String f43180c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f43181e;
    public boolean f43182f;
    public final int f43183g;

    public u5(int i10, String str) {
        super(i10, false);
        this.f43180c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f43182f;
        if (this == obj) {
            return true;
        }
        if (obj == null || u5.class != obj.getClass()) {
            return false;
        }
        u5 u5Var = (u5) obj;
        TL_stories.Boost boost = u5Var.d;
        boolean z11 = u5Var.f43182f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f43181e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = u5Var.f43181e) != null) {
            if (prepaidGiveaway2.f22628id == prepaidGiveaway.f22628id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f22624id.hashCode() == boost.f22624id.hashCode() && z10 == z11 && this.f43183g == u5Var.f43183g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f43180c, this.d, this.f43181e, Boolean.valueOf(this.f43182f), Integer.valueOf(this.f43183g));
    }

    public u5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f43182f = z10;
        this.f43183g = i10;
    }
}
