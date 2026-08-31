package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class zb extends cg.b {
    public final String f43883c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f43884e;
    public boolean f43885f;
    public final int f43886g;

    public zb(int i10, String str) {
        super(i10, false);
        this.f43883c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z4 = this.f43885f;
        if (this == obj) {
            return true;
        }
        if (obj == null || zb.class != obj.getClass()) {
            return false;
        }
        zb zbVar = (zb) obj;
        TL_stories.Boost boost = zbVar.d;
        boolean z10 = zbVar.f43885f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f43884e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = zbVar.f43884e) != null) {
            if (prepaidGiveaway2.f21079id == prepaidGiveaway.f21079id && z4 == z10) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f21075id.hashCode() == boost.f21075id.hashCode() && z4 == z10 && this.f43886g == zbVar.f43886g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f43883c, this.d, this.f43884e, Boolean.valueOf(this.f43885f), Integer.valueOf(this.f43886g));
    }

    public zb(TL_stories.Boost boost, boolean z4, int i10) {
        super(5, true);
        this.d = boost;
        this.f43885f = z4;
        this.f43886g = i10;
    }
}
