package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class uc0 extends org.telegram.ui.ActionBar.j {
    public final hd0 f42445a;

    public uc0(hd0 hd0Var) {
        this.f42445a = hd0Var;
    }

    @Override
    public final void b(int i10) {
        hd0 hd0Var = this.f42445a;
        if (i10 == -1) {
            hd0Var.finishFragment();
        } else if (i10 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = hd0Var.B0.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Activity parentActivity = hd0Var.getParentActivity();
                parentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        } else if (i10 == 5) {
            hd0Var.r0(false);
        } else if (i10 == 6) {
            hd0Var.q0(null);
        }
    }
}
