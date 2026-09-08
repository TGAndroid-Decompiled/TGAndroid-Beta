package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class vc0 extends org.telegram.ui.ActionBar.j {
    public final id0 f41540a;

    public vc0(id0 id0Var) {
        this.f41540a = id0Var;
    }

    @Override
    public final void b(int i10) {
        id0 id0Var = this.f41540a;
        if (i10 == -1) {
            id0Var.finishFragment();
        } else if (i10 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = id0Var.B0.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Activity parentActivity = id0Var.getParentActivity();
                parentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        } else if (i10 == 5) {
            id0Var.s0(false);
        } else if (i10 == 6) {
            id0Var.r0(null);
        }
    }
}
