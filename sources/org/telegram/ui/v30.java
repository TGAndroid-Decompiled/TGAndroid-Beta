package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v30 implements Runnable {
    public final n60 f40568a;

    public v30(n60 n60Var) {
        this.f40568a = n60Var;
    }

    @Override
    public final void run() {
        int i10;
        n60 n60Var = this.f40568a;
        org.telegram.ui.ActionBar.h5 h5Var = n60Var.U;
        s50 s50Var = n60Var.V;
        if (s50Var != null && !n60Var.isDismissed()) {
            ChatObject.Call call = n60Var.f38157a1;
            if (call != null) {
                i10 = call.call.schedule_date;
            } else {
                i10 = n60Var.f38200k2;
            }
            if (i10 != 0) {
                int currentTime = i10 - n60Var.d.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    s50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
                } else {
                    s50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
                    if (currentTime < 0 && h5Var.getTag() == null) {
                        h5Var.setTag(1);
                        h5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
                    }
                }
                n60Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
                AndroidUtilities.runOnUIThread(n60Var.f38250w2, 1000L);
            }
        }
    }
}
