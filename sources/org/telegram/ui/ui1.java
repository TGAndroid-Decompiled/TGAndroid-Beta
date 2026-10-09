package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class ui1 implements org.telegram.ui.Components.voip.d {
    public final wi1 f42446a;

    public ui1(wi1 wi1Var) {
        this.f42446a = wi1Var;
    }

    public final void a() {
        wi1 wi1Var = this.f42446a;
        if (wi1Var.f43658p0 == 17) {
            Intent intent = new Intent(wi1Var.f43629b, VoIPService.class);
            intent.putExtra("user_id", wi1Var.d.f20185id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", wi1Var.U0);
            intent.putExtra("can_video_call", wi1Var.U0);
            intent.putExtra("account", wi1Var.f43626a);
            try {
                wi1Var.f43629b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (wi1Var.f43629b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            wi1Var.f43629b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            wi1Var.q(new nz0(this, 25));
        }
    }

    public final void b() {
        wi1 wi1Var = this.f42446a;
        if (wi1Var.f43658p0 == 17) {
            wi1Var.f43665u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            wi1Var.f43665u0.b();
        }
    }
}
