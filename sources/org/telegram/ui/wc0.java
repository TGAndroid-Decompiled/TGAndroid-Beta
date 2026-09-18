package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class wc0 extends org.telegram.ui.ActionBar.j {
    public final jd0 f38794a;

    public wc0(jd0 jd0Var) {
        this.f38794a = jd0Var;
    }

    @Override
    public final void b(int i10) {
        jd0 jd0Var = this.f38794a;
        if (i10 == -1) {
            jd0Var.finishFragment();
        } else if (i10 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = jd0Var.B0.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Activity parentActivity = jd0Var.getParentActivity();
                parentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 5) {
            jd0Var.s0(false);
        } else if (i10 == 6) {
            jd0Var.r0(null);
        }
    }
}
