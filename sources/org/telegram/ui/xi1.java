package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class xi1 implements org.telegram.ui.Components.voip.d {
    public final zi1 f38763a;

    public xi1(zi1 zi1Var) {
        this.f38763a = zi1Var;
    }

    public final void a() {
        zi1 zi1Var = this.f38763a;
        if (zi1Var.f39387p0 == 17) {
            Intent intent = new Intent(zi1Var.f39359b, VoIPService.class);
            intent.putExtra("user_id", zi1Var.d.f17342id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", zi1Var.U0);
            intent.putExtra("can_video_call", zi1Var.U0);
            intent.putExtra("account", zi1Var.f39356a);
            try {
                zi1Var.f39359b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (Build.VERSION.SDK_INT >= 23 && zi1Var.f39359b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            zi1Var.f39359b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            zi1Var.r(new k01(this, 24));
        }
    }

    public final void b() {
        zi1 zi1Var = this.f38763a;
        if (zi1Var.f39387p0 == 17) {
            zi1Var.f39394u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            zi1Var.f39394u0.b();
        }
    }
}
