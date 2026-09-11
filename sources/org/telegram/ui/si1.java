package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class si1 implements org.telegram.ui.Components.voip.d {
    public final ui1 f40461a;

    public si1(ui1 ui1Var) {
        this.f40461a = ui1Var;
    }

    public final void a() {
        ui1 ui1Var = this.f40461a;
        if (ui1Var.f41139p0 == 17) {
            Intent intent = new Intent(ui1Var.f41110b, VoIPService.class);
            intent.putExtra("user_id", ui1Var.d.f20016id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", ui1Var.U0);
            intent.putExtra("can_video_call", ui1Var.U0);
            intent.putExtra("account", ui1Var.f41107a);
            try {
                ui1Var.f41110b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (Build.VERSION.SDK_INT >= 23 && ui1Var.f41110b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            ui1Var.f41110b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            ui1Var.r(new f01(this, 24));
        }
    }

    public final void b() {
        ui1 ui1Var = this.f40461a;
        if (ui1Var.f41139p0 == 17) {
            ui1Var.f41146u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            ui1Var.f41146u0.b();
        }
    }
}
