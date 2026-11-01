package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;
public final class xd1 implements org.telegram.ui.Components.voip.d {
    public final zd1 f43359a;

    public xd1(zd1 zd1Var) {
        this.f43359a = zd1Var;
    }

    public final void a() {
        zd1 zd1Var = this.f43359a;
        if (zd1Var.f43966p0 == 17) {
            Intent intent = new Intent(zd1Var.f43938b, VoIPService.class);
            intent.putExtra("user_id", zd1Var.d.f19943id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", zd1Var.U0);
            intent.putExtra("can_video_call", zd1Var.U0);
            intent.putExtra("account", zd1Var.f43935a);
            try {
                zd1Var.f43938b.startService(intent);
            } catch (Throwable th2) {
                org.telegram.messenger.f8.g(th2, true);
            }
        } else if (zd1Var.f43938b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            zd1Var.f43938b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            zd1Var.n(new vv0(this, 29));
        }
    }

    public final void b() {
        zd1 zd1Var = this.f43359a;
        if (zd1Var.f43966p0 == 17) {
            zd1Var.f43973u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            zd1Var.f43973u0.b();
        }
    }
}
