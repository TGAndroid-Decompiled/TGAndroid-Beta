package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class vj implements Runnable {
    public final tn f43609a;

    public vj(tn tnVar) {
        this.f43609a = tnVar;
    }

    @Override
    public final void run() {
        String formatPluralString;
        tn tnVar = this.f43609a;
        MessageObject messageObject = tnVar.Z4;
        if (messageObject != null && tnVar.P8 != null) {
            int max = Math.max(0, messageObject.messageOwner.ttl_period - (tnVar.getConnectionsManager().getCurrentTime() - tnVar.Z4.messageOwner.date));
            if (max < 86400) {
                formatPluralString = AndroidUtilities.formatDuration(max, false, true);
            } else {
                formatPluralString = LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0]);
            }
            tnVar.P8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, formatPluralString));
            AndroidUtilities.runOnUIThread(tnVar.Q8, 1000L);
        }
    }
}
