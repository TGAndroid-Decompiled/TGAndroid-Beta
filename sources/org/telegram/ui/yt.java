package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class yt implements Runnable {
    public final int f44942a;
    public final DataSettingsActivity f44943b;

    public yt(DataSettingsActivity dataSettingsActivity, int i9) {
        this.f44942a = i9;
        this.f44943b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i9;
        switch (this.f44942a) {
            case 0:
                this.f44943b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f44943b;
                dataSettingsActivity.T = true;
                if (dataSettingsActivity.f35454a != null && (i9 = dataSettingsActivity.f35461s) >= 0) {
                    dataSettingsActivity.m0(i9);
                    return;
                }
                return;
            default:
                y6.f44733i0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f44943b;
                yt ytVar = new yt(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(ytVar, 100L);
                y6.i0(new zt(dataSettingsActivity2, ytVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
