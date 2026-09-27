package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class sc0 extends org.telegram.ui.ActionBar.j {
    public final fd0 f37399a;

    public sc0(fd0 fd0Var) {
        this.f37399a = fd0Var;
    }

    @Override
    public final void b(int i10) {
        fd0 fd0Var = this.f37399a;
        if (i10 == -1) {
            fd0Var.finishFragment();
        } else if (i10 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = fd0Var.B0.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Activity parentActivity = fd0Var.getParentActivity();
                parentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 5) {
            fd0Var.s0(false);
        } else if (i10 == 6) {
            fd0Var.r0(null);
        }
    }
}
