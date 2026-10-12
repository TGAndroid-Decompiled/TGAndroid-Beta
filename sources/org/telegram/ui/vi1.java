package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class vi1 implements org.telegram.ui.Components.voip.d {
    public final xi1 f42809a;

    public vi1(xi1 xi1Var) {
        this.f42809a = xi1Var;
    }

    public final void a() {
        xi1 xi1Var = this.f42809a;
        if (xi1Var.f44015p0 == 17) {
            Intent intent = new Intent(xi1Var.f43986b, VoIPService.class);
            intent.putExtra("user_id", xi1Var.d.f19950id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", xi1Var.U0);
            intent.putExtra("can_video_call", xi1Var.U0);
            intent.putExtra("account", xi1Var.f43983a);
            try {
                xi1Var.f43986b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (xi1Var.f43986b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            xi1Var.f43986b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            xi1Var.q(new pz0(this, 25));
        }
    }

    public final void b() {
        xi1 xi1Var = this.f42809a;
        if (xi1Var.f44015p0 == 17) {
            xi1Var.f44022u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            xi1Var.f44022u0.b();
        }
    }
}
