package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wt implements Runnable {
    public final int f45551a;
    public final DataSettingsActivity f45552b;

    public wt(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f45551a = i10;
        this.f45552b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f45551a) {
            case 0:
                this.f45552b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f45552b;
                dataSettingsActivity.W = true;
                if (dataSettingsActivity.f35488a != null && (i10 = dataSettingsActivity.f35494s) >= 0) {
                    dataSettingsActivity.o0(i10);
                    return;
                }
                return;
            default:
                c7.f38343k0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f45552b;
                wt wtVar = new wt(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(wtVar, 100L);
                c7.i0(new bi.c2(dataSettingsActivity2, wtVar, System.currentTimeMillis(), 1));
                return;
        }
    }
}
