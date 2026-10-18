package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class yt implements Runnable {
    public final int f43468a;
    public final DataSettingsActivity f43469b;

    public yt(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f43468a = i10;
        this.f43469b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f43468a) {
            case 0:
                this.f43469b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f43469b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f33108a != null && (i10 = dataSettingsActivity.f33114s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                c7.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f43469b;
                yt ytVar = new yt(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(ytVar, 100L);
                c7.j0(new ai.e2(dataSettingsActivity2, ytVar, System.currentTimeMillis(), 1));
                return;
        }
    }
}
