package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class tc0 extends org.telegram.ui.ActionBar.j {
    public final gd0 f40848a;

    public tc0(gd0 gd0Var) {
        this.f40848a = gd0Var;
    }

    @Override
    public final void b(int i10) {
        gd0 gd0Var = this.f40848a;
        if (i10 == -1) {
            gd0Var.finishFragment();
        } else if (i10 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = gd0Var.B0.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Activity parentActivity = gd0Var.getParentActivity();
                parentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        } else if (i10 == 5) {
            gd0Var.s0(false);
        } else if (i10 == 6) {
            gd0Var.r0(null);
        }
    }
}
