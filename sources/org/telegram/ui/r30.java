package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r30 implements Runnable {
    public final i60 f37060a;

    public r30(i60 i60Var) {
        this.f37060a = i60Var;
    }

    @Override
    public final void run() {
        int i10;
        i60 i60Var = this.f37060a;
        org.telegram.ui.ActionBar.j5 j5Var = i60Var.U;
        n50 n50Var = i60Var.V;
        if (n50Var != null && !i60Var.isDismissed()) {
            ChatObject.Call call = i60Var.f34380a1;
            if (call != null) {
                i10 = call.call.schedule_date;
            } else {
                i10 = i60Var.f34422k2;
            }
            if (i10 != 0) {
                int currentTime = i10 - i60Var.d.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    n50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
                } else {
                    n50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
                    if (currentTime < 0 && j5Var.getTag() == null) {
                        j5Var.setTag(1);
                        j5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
                    }
                }
                i60Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
                AndroidUtilities.runOnUIThread(i60Var.f34472w2, 1000L);
            }
        }
    }
}
