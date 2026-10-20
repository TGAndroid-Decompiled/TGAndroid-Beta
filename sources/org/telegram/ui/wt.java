package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wt implements Runnable {
    public final int f42952a;
    public final DataSettingsActivity f42953b;

    public wt(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f42952a = i10;
        this.f42953b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f42952a) {
            case 0:
                this.f42953b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f42953b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f33120a != null && (i10 = dataSettingsActivity.f33126s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                c7.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f42953b;
                wt wtVar = new wt(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(wtVar, 100L);
                c7.j0(new ai.f2(dataSettingsActivity2, wtVar, System.currentTimeMillis(), 1));
                return;
        }
    }
}
