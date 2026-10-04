package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r30 implements Runnable {
    public final h60 f39900a;

    public r30(h60 h60Var) {
        this.f39900a = h60Var;
    }

    @Override
    public final void run() {
        int i10;
        h60 h60Var = this.f39900a;
        org.telegram.ui.ActionBar.i5 i5Var = h60Var.U;
        n50 n50Var = h60Var.V;
        if (n50Var != null && !h60Var.isDismissed()) {
            ChatObject.Call call = h60Var.f36874a1;
            if (call != null) {
                i10 = call.call.schedule_date;
            } else {
                i10 = h60Var.f36917k2;
            }
            if (i10 != 0) {
                int currentTime = i10 - h60Var.d.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    n50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
                } else {
                    n50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
                    if (currentTime < 0 && i5Var.getTag() == null) {
                        i5Var.setTag(1);
                        i5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
                    }
                }
                h60Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
                AndroidUtilities.runOnUIThread(h60Var.f36967w2, 1000L);
            }
        }
    }
}
