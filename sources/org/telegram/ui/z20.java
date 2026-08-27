package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class z20 implements Runnable {

    public final s50 f45000a;

    public z20(s50 s50Var) {
        this.f45000a = s50Var;
    }

    @Override
    public final void run() {
        s50 s50Var = this.f45000a;
        org.telegram.ui.ActionBar.h5 h5Var = s50Var.Q;
        x40 x40Var = s50Var.R;
        if (x40Var == null || s50Var.isDismissed()) {
            return;
        }
        ChatObject.Call call = s50Var.W0;
        int i10 = call != null ? call.call.schedule_date : s50Var.f42438g2;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - s50Var.d.getConnectionsManager().getCurrentTime();
        if (currentTime >= 86400) {
            x40Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
        } else {
            x40Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
            if (currentTime < 0 && h5Var.getTag() == null) {
                h5Var.setTag(1);
                h5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        s50Var.S.l(LocaleController.formatStartsTime(i10, 3), false);
        AndroidUtilities.runOnUIThread(s50Var.f42487s2, 1000L);
    }
}
