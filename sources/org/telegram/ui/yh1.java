package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class yh1 implements org.telegram.ui.Components.voip.d {
    public final ai1 f40528a;

    public yh1(ai1 ai1Var) {
        this.f40528a = ai1Var;
    }

    public final void a() {
        ai1 ai1Var = this.f40528a;
        if (ai1Var.m0 == 17) {
            Intent intent = new Intent(ai1Var.f32601b, VoIPService.class);
            intent.putExtra("user_id", ai1Var.d.f19331id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", ai1Var.R0);
            intent.putExtra("can_video_call", ai1Var.R0);
            intent.putExtra("account", ai1Var.f32598a);
            try {
                ai1Var.f32601b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (Build.VERSION.SDK_INT >= 23 && ai1Var.f32601b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            ai1Var.f32601b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            ai1Var.r(new vy0(this, 26));
        }
    }

    public final void b() {
        ai1 ai1Var = this.f40528a;
        if (ai1Var.m0 == 17) {
            ai1Var.f32630r0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            ai1Var.f32630r0.b();
        }
    }
}
