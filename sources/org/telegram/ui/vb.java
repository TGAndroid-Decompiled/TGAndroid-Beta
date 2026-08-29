package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class vb extends zf.a {
    public final String f43494c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f43495e;
    public boolean f43496f;
    public final int f43497g;

    public vb(int i10, String str) {
        super(i10, false);
        this.f43494c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f43496f;
        if (this == obj) {
            return true;
        }
        if (obj == null || vb.class != obj.getClass()) {
            return false;
        }
        vb vbVar = (vb) obj;
        TL_stories.Boost boost = vbVar.d;
        boolean z11 = vbVar.f43496f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f43495e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = vbVar.f43495e) != null) {
            if (prepaidGiveaway2.f22628id == prepaidGiveaway.f22628id && z10 == z11) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f22624id.hashCode() == boost.f22624id.hashCode() && z10 == z11 && this.f43497g == vbVar.f43497g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f43494c, this.d, this.f43495e, Boolean.valueOf(this.f43496f), Integer.valueOf(this.f43497g));
    }

    public vb(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f43496f = z10;
        this.f43497g = i10;
    }
}
