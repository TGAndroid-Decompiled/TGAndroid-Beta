package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class u5 extends sg.a {
    public final String f49979c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f49980e;
    public boolean f49981f;
    public final int f49982g;

    public u5(int i3, String str) {
        super(i3, false);
        this.f49979c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f49981f;
        if (this == obj) {
            return true;
        }
        if (obj == null || u5.class != obj.getClass()) {
            return false;
        }
        u5 u5Var = (u5) obj;
        TL_stories.Boost boost = u5Var.d;
        boolean z11 = u5Var.f49981f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f49980e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = u5Var.f49980e) != null) {
            if (prepaidGiveaway2.f27239id == prepaidGiveaway.f27239id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f27235id.hashCode() == boost.f27235id.hashCode() && z10 == z11 && this.f49982g == u5Var.f49982g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f49979c, this.d, this.f49980e, Boolean.valueOf(this.f49981f), Integer.valueOf(this.f49982g));
    }

    public u5(TL_stories.Boost boost, boolean z10, int i3) {
        super(5, true);
        this.d = boost;
        this.f49981f = z10;
        this.f49982g = i3;
    }
}
