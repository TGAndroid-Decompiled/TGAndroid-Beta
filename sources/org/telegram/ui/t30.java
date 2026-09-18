package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t30 implements Runnable {
    public final k60 f37643a;

    public t30(k60 k60Var) {
        this.f37643a = k60Var;
    }

    @Override
    public final void run() {
        int i10;
        k60 k60Var = this.f37643a;
        org.telegram.ui.ActionBar.k5 k5Var = k60Var.U;
        p50 p50Var = k60Var.V;
        if (p50Var != null && !k60Var.isDismissed()) {
            ChatObject.Call call = k60Var.f35017a1;
            if (call != null) {
                i10 = call.call.schedule_date;
            } else {
                i10 = k60Var.f35059k2;
            }
            if (i10 != 0) {
                int currentTime = i10 - k60Var.d.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    p50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
                } else {
                    p50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
                    if (currentTime < 0 && k5Var.getTag() == null) {
                        k5Var.setTag(1);
                        k5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
                    }
                }
                k60Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
                AndroidUtilities.runOnUIThread(k60Var.f35109w2, 1000L);
            }
        }
    }
}
