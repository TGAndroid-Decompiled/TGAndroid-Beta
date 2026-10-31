package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;
public final class zd1 implements org.telegram.ui.Components.voip.d {
    public final be1 f44136a;

    public zd1(be1 be1Var) {
        this.f44136a = be1Var;
    }

    public final void a() {
        be1 be1Var = this.f44136a;
        if (be1Var.f36227p0 == 17) {
            Intent intent = new Intent(be1Var.f36199b, VoIPService.class);
            intent.putExtra("user_id", be1Var.d.f19942id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", be1Var.U0);
            intent.putExtra("can_video_call", be1Var.U0);
            intent.putExtra("account", be1Var.f36196a);
            try {
                be1Var.f36199b.startService(intent);
            } catch (Throwable th2) {
                org.telegram.messenger.f8.g(th2, true);
            }
        } else if (be1Var.f36199b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            be1Var.f36199b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            be1Var.o(new wv0(this, 29));
        }
    }

    public final void b() {
        be1 be1Var = this.f44136a;
        if (be1Var.f36227p0 == 17) {
            be1Var.f36234u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            be1Var.f36234u0.b();
        }
    }
}
