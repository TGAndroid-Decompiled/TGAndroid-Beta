package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

public final class uj implements Runnable {

    public final rn f43240a;

    public uj(rn rnVar) {
        this.f43240a = rnVar;
    }

    @Override
    public final void run() {
        rn rnVar = this.f43240a;
        MessageObject messageObject = rnVar.Z4;
        if (messageObject == null || rnVar.P8 == null) {
            return;
        }
        int iMax = Math.max(0, messageObject.messageOwner.ttl_period - (rnVar.getConnectionsManager().getCurrentTime() - rnVar.Z4.messageOwner.date));
        rnVar.P8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, iMax < 86400 ? AndroidUtilities.formatDuration(iMax, false, true) : LocaleController.formatPluralString("Days", Math.round(iMax / 86400.0f), new Object[0])));
        AndroidUtilities.runOnUIThread(rnVar.Q8, 1000L);
    }
}
