package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class xc0 extends org.telegram.ui.ActionBar.j {
    public final kd0 f39516a;

    public xc0(kd0 kd0Var) {
        this.f39516a = kd0Var;
    }

    @Override
    public final void b(int i10) {
        kd0 kd0Var = this.f39516a;
        if (i10 == -1) {
            kd0Var.finishFragment();
        } else if (i10 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = kd0Var.B0.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Activity parentActivity = kd0Var.getParentActivity();
                parentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 5) {
            kd0Var.s0(false);
        } else if (i10 == 6) {
            kd0Var.r0(null);
        }
    }
}
