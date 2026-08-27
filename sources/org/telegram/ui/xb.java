package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;

public final class xb extends xf.a {

    public final String f44368c;
    public final TL_stories.Boost d;

    public TL_stories.PrepaidGiveaway f44369e;

    public boolean f44370f;

    public final int f44371g;

    public xb(int i10, String str) {
        super(i10, false);
        this.f44368c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f44370f;
        if (this == obj) {
            return true;
        }
        if (obj == null || xb.class != obj.getClass()) {
            return false;
        }
        xb xbVar = (xb) obj;
        TL_stories.Boost boost = xbVar.d;
        boolean z11 = xbVar.f44370f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.f44369e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = xbVar.f44369e) != null) {
            return prepaidGiveaway2.f22616id == prepaidGiveaway.f22616id && z10 == z11;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        return boost2.f22612id.hashCode() == boost.f22612id.hashCode() && z10 == z11 && this.f44371g == xbVar.f44371g;
    }

    public final int hashCode() {
        return Objects.hash(this.f44368c, this.d, this.f44369e, Boolean.valueOf(this.f44370f), Integer.valueOf(this.f44371g));
    }

    public xb(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f44370f = z10;
        this.f44371g = i10;
    }
}
