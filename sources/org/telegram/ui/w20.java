package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class w20 implements Runnable {
    public final o50 f43639a;

    public w20(o50 o50Var) {
        this.f43639a = o50Var;
    }

    @Override
    public final void run() {
        int i9;
        o50 o50Var = this.f43639a;
        org.telegram.ui.ActionBar.h5 h5Var = o50Var.Q;
        t40 t40Var = o50Var.R;
        if (t40Var != null && !o50Var.isDismissed()) {
            ChatObject.Call call = o50Var.W0;
            if (call != null) {
                i9 = call.call.schedule_date;
            } else {
                i9 = o50Var.f40909g2;
            }
            if (i9 != 0) {
                int currentTime = i9 - o50Var.d.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    t40Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
                } else {
                    t40Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
                    if (currentTime < 0 && h5Var.getTag() == null) {
                        h5Var.setTag(1);
                        h5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
                    }
                }
                o50Var.S.l(LocaleController.formatStartsTime(i9, 3), false);
                AndroidUtilities.runOnUIThread(o50Var.f40958s2, 1000L);
            }
        }
    }
}
