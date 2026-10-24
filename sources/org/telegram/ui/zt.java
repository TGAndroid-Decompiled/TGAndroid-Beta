package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zt implements Runnable {
    public final int f44204a;
    public final DataSettingsActivity f44205b;

    public zt(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f44204a = i10;
        this.f44205b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f44204a) {
            case 0:
                this.f44205b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f44205b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f33424a != null && (i10 = dataSettingsActivity.f33430s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                c7.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f44205b;
                zt ztVar = new zt(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(ztVar, 100L);
                c7.k0(new ai.f2(dataSettingsActivity2, ztVar, System.currentTimeMillis(), 1));
                return;
        }
    }
}
