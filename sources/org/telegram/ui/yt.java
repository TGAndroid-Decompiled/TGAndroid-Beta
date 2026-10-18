package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class yt implements Runnable {
    public final int f43504a;
    public final DataSettingsActivity f43505b;

    public yt(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f43504a = i10;
        this.f43505b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f43504a) {
            case 0:
                this.f43505b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f43505b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f33115a != null && (i10 = dataSettingsActivity.f33121s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                c7.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f43505b;
                yt ytVar = new yt(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(ytVar, 100L);
                c7.j0(new ai.g2(dataSettingsActivity2, ytVar, System.currentTimeMillis(), 1));
                return;
        }
    }
}
