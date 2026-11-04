package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;
public final class xb1 implements org.telegram.ui.Components.voip.d {
    public final zb1 f51906a;

    public xb1(zb1 zb1Var) {
        this.f51906a = zb1Var;
    }

    public final void a() {
        zb1 zb1Var = this.f51906a;
        if (zb1Var.f52637q0 == 17) {
            Intent intent = new Intent(zb1Var.f52607b, VoIPService.class);
            intent.putExtra("user_id", zb1Var.d.f27150id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", zb1Var.V0);
            intent.putExtra("can_video_call", zb1Var.V0);
            intent.putExtra("account", zb1Var.f52604a);
            try {
                zb1Var.f52607b.startService(intent);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        } else if (zb1Var.f52607b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            zb1Var.f52607b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            zb1Var.n(new pu0(this, 26));
        }
    }

    public final void b() {
        zb1 zb1Var = this.f51906a;
        if (zb1Var.f52637q0 == 17) {
            zb1Var.f52644v0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            zb1Var.f52644v0.b();
        }
    }
}
