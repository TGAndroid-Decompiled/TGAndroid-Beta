package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public final class zb extends cg.b {
    public final String f43881c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway f43882e;
    public boolean f43883f;
    public final int f43884g;

    public zb(int i10, String str) {
        super(i10, false);
        this.f43881c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z4 = this.f43883f;
        if (this == obj) {
            return true;
        }
        if (obj == null || zb.class != obj.getClass()) {
            return false;
        }
        zb zbVar = (zb) obj;
        TL_stories.Boost boost = zbVar.d;
        boolean z10 = zbVar.f43883f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f43882e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = zbVar.f43882e) != null) {
            if (prepaidGiveaway2.f21081id == prepaidGiveaway.f21081id && z4 == z10) {
                return true;
            }
            return false;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        if (boost2.f21077id.hashCode() == boost.f21077id.hashCode() && z4 == z10 && this.f43884g == zbVar.f43884g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f43881c, this.d, this.f43882e, Boolean.valueOf(this.f43883f), Integer.valueOf(this.f43884g));
    }

    public zb(TL_stories.Boost boost, boolean z4, int i10) {
        super(5, true);
        this.d = boost;
        this.f43883f = z4;
        this.f43884g = i10;
    }
}
