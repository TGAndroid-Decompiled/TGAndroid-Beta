package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wt implements Runnable {
    public final int f42946a;
    public final DataSettingsActivity f42947b;

    public wt(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f42946a = i10;
        this.f42947b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f42946a) {
            case 0:
                this.f42947b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f42947b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f33114a != null && (i10 = dataSettingsActivity.f33120s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                c7.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f42947b;
                wt wtVar = new wt(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(wtVar, 100L);
                c7.j0(new ai.f2(dataSettingsActivity2, wtVar, System.currentTimeMillis(), 1));
                return;
        }
    }
}
