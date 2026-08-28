package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class t5 extends wf.a {
    public final String f42854c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f42855e;
    public boolean f42856f;
    public final int f42857g;

    public t5(int i9, String str) {
        super(i9, false);
        this.f42854c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f42856f;
        if (this == obj) {
            return true;
        }
        if (obj == null || t5.class != obj.getClass()) {
            return false;
        }
        t5 t5Var = (t5) obj;
        TL_stories.Boost boost = t5Var.d;
        boolean z11 = t5Var.f42856f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f42855e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = t5Var.f42855e) != null) {
            if (prepaidGiveaway2.f22616id == prepaidGiveaway.f22616id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f22612id.hashCode() == boost.f22612id.hashCode() && z10 == z11 && this.f42857g == t5Var.f42857g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f42854c, this.d, this.f42855e, Boolean.valueOf(this.f42856f), Integer.valueOf(this.f42857g));
    }

    public t5(TL_stories.Boost boost, boolean z10, int i9) {
        super(5, true);
        this.d = boost;
        this.f42856f = z10;
        this.f42857g = i9;
    }
}
