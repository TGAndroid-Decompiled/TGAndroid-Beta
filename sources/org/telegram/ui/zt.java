package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zt implements Runnable {
    public final int f44201a;
    public final DataSettingsActivity f44202b;

    public zt(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f44201a = i10;
        this.f44202b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f44201a) {
            case 0:
                this.f44202b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f44202b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f33422a != null && (i10 = dataSettingsActivity.f33428s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                c7.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f44202b;
                zt ztVar = new zt(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(ztVar, 100L);
                c7.k0(new ai.f2(dataSettingsActivity2, ztVar, System.currentTimeMillis(), 1));
                return;
        }
    }
}
