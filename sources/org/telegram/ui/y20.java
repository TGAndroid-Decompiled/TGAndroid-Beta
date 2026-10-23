package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class y20 implements Runnable {
    public final q50 f43340a;

    public y20(q50 q50Var) {
        this.f43340a = q50Var;
    }

    @Override
    public final void run() {
        int i10;
        q50 q50Var = this.f43340a;
        org.telegram.ui.ActionBar.j5 j5Var = q50Var.U;
        v40 v40Var = q50Var.V;
        if (v40Var != null && !q50Var.isDismissed()) {
            ChatObject.Call call = q50Var.f40380a1;
            if (call != null) {
                i10 = call.call.schedule_date;
            } else {
                i10 = q50Var.f40423k2;
            }
            if (i10 != 0) {
                int currentTime = i10 - q50Var.d.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    v40Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
                } else {
                    v40Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
                    if (currentTime < 0 && j5Var.getTag() == null) {
                        j5Var.setTag(1);
                        j5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
                    }
                }
                q50Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
                AndroidUtilities.runOnUIThread(q50Var.f40473w2, 1000L);
            }
        }
    }
}
