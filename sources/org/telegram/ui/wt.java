package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wt implements Runnable {
    public final int f42955a;
    public final DataSettingsActivity f42956b;

    public wt(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f42955a = i10;
        this.f42956b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f42955a) {
            case 0:
                this.f42956b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f42956b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f33124a != null && (i10 = dataSettingsActivity.f33130s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                c7.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f42956b;
                wt wtVar = new wt(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(wtVar, 100L);
                c7.j0(new ai.f2(dataSettingsActivity2, wtVar, System.currentTimeMillis(), 1));
                return;
        }
    }
}
