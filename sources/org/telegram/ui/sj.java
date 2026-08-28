package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class sj implements Runnable {
    public final qn f42709a;

    public sj(qn qnVar) {
        this.f42709a = qnVar;
    }

    @Override
    public final void run() {
        String formatPluralString;
        qn qnVar = this.f42709a;
        MessageObject messageObject = qnVar.Z4;
        if (messageObject != null && qnVar.P8 != null) {
            int max = Math.max(0, messageObject.messageOwner.ttl_period - (qnVar.getConnectionsManager().getCurrentTime() - qnVar.Z4.messageOwner.date));
            if (max < 86400) {
                formatPluralString = AndroidUtilities.formatDuration(max, false, true);
            } else {
                formatPluralString = LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0]);
            }
            qnVar.P8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, formatPluralString));
            AndroidUtilities.runOnUIThread(qnVar.Q8, 1000L);
        }
    }
}
