package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wt implements Runnable {
    public final int f42947a;
    public final DataSettingsActivity f42948b;

    public wt(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f42947a = i10;
        this.f42948b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f42947a) {
            case 0:
                this.f42948b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f42948b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f33114a != null && (i10 = dataSettingsActivity.f33120s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                c7.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f42948b;
                wt wtVar = new wt(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(wtVar, 100L);
                c7.j0(new ai.h2(dataSettingsActivity2, wtVar, System.currentTimeMillis(), 1));
                return;
        }
    }
}
