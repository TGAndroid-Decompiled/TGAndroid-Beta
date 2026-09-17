package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r30 implements Runnable {
    public final j60 f40082a;

    public r30(j60 j60Var) {
        this.f40082a = j60Var;
    }

    @Override
    public final void run() {
        int i10;
        j60 j60Var = this.f40082a;
        org.telegram.ui.ActionBar.j5 j5Var = j60Var.U;
        o50 o50Var = j60Var.V;
        if (o50Var != null && !j60Var.isDismissed()) {
            ChatObject.Call call = j60Var.f37541a1;
            if (call != null) {
                i10 = call.call.schedule_date;
            } else {
                i10 = j60Var.f37584k2;
            }
            if (i10 != 0) {
                int currentTime = i10 - j60Var.d.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    o50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
                } else {
                    o50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
                    if (currentTime < 0 && j5Var.getTag() == null) {
                        j5Var.setTag(1);
                        j5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
                    }
                }
                j60Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
                AndroidUtilities.runOnUIThread(j60Var.f37634w2, 1000L);
            }
        }
    }
}
