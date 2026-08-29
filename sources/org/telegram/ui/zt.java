package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zt implements Runnable {
    public final int f45314a;
    public final DataSettingsActivity f45315b;

    public zt(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f45314a = i10;
        this.f45315b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f45314a) {
            case 0:
                this.f45315b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f45315b;
                dataSettingsActivity.T = true;
                if (dataSettingsActivity.f35521a != null && (i10 = dataSettingsActivity.f35528s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                x6.f44480i0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f45315b;
                zt ztVar = new zt(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(ztVar, 100L);
                x6.j0(new au(dataSettingsActivity2, ztVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
