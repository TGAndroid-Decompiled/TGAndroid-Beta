package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class ri1 implements org.telegram.ui.Components.voip.d {
    public final ti1 f37248a;

    public ri1(ti1 ti1Var) {
        this.f37248a = ti1Var;
    }

    public final void a() {
        ti1 ti1Var = this.f37248a;
        if (ti1Var.f37787p0 == 17) {
            Intent intent = new Intent(ti1Var.f37759b, VoIPService.class);
            intent.putExtra("user_id", ti1Var.d.f18268id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", ti1Var.U0);
            intent.putExtra("can_video_call", ti1Var.U0);
            intent.putExtra("account", ti1Var.f37756a);
            try {
                ti1Var.f37759b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (Build.VERSION.SDK_INT >= 23 && ti1Var.f37759b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            ti1Var.f37759b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            ti1Var.r(new g01(this, 24));
        }
    }

    public final void b() {
        ti1 ti1Var = this.f37248a;
        if (ti1Var.f37787p0 == 17) {
            ti1Var.f37794u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            ti1Var.f37794u0.b();
        }
    }
}
