package vh;

import android.app.Activity;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.e20;
import org.telegram.messenger.k20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.un;
public final class r3 extends un {
    public final k20 f51833kd;
    public final b4 f51834ld;

    public r3(b4 b4Var, k20 k20Var) {
        super(null);
        this.f51834ld = b4Var;
        this.f51833kd = k20Var;
    }

    @Override
    public final boolean O9() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint;
        TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint2;
        if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
            tL_mediaAreaGeoPoint2 = new TL_stories.TL_mediaAreaGeoPoint();
            tL_mediaAreaGeoPoint2.geo = messageMedia.geo;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) messageMedia;
            long j11 = tL_messageMediaVenue.query_id;
            if (j11 != -1 && j11 != -2) {
                TL_stories.TL_inputMediaAreaVenue tL_inputMediaAreaVenue = new TL_stories.TL_inputMediaAreaVenue();
                tL_inputMediaAreaVenue.query_id = tL_messageMediaVenue.query_id;
                tL_inputMediaAreaVenue.result_id = tL_messageMediaVenue.result_id;
                tL_mediaAreaGeoPoint = tL_inputMediaAreaVenue;
            } else {
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint3 = new TL_stories.TL_mediaAreaGeoPoint();
                tL_mediaAreaGeoPoint3.geo = messageMedia.geo;
                TL_stories.TL_geoPointAddress tL_geoPointAddress = tL_messageMediaVenue.geoAddress;
                tL_mediaAreaGeoPoint3.address = tL_geoPointAddress;
                if (tL_geoPointAddress != null) {
                    tL_mediaAreaGeoPoint3.flags |= 1;
                }
                Utilities.e.c(new r0(4, messageMedia, tL_mediaAreaGeoPoint3));
                tL_mediaAreaGeoPoint = tL_mediaAreaGeoPoint3;
            }
            tL_mediaAreaGeoPoint2 = tL_mediaAreaGeoPoint;
        } else {
            return;
        }
        this.f51833kd.a(messageMedia, tL_mediaAreaGeoPoint2);
    }

    @Override
    public final Activity getParentActivity() {
        return org.telegram.messenger.i0.W(this.f51834ld.getContext());
    }

    @Override
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.f51834ld.f50988p1;
    }

    @Override
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override
    public final TLRPC.User j() {
        return e20.i(this.currentAccount).f();
    }
}
