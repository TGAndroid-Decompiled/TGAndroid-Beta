package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wt implements Runnable {
    public final int f45548a;
    public final DataSettingsActivity f45549b;

    public wt(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f45548a = i10;
        this.f45549b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f45548a) {
            case 0:
                this.f45549b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f45549b;
                dataSettingsActivity.W = true;
                if (dataSettingsActivity.f35485a != null && (i10 = dataSettingsActivity.f35491s) >= 0) {
                    dataSettingsActivity.o0(i10);
                    return;
                }
                return;
            default:
                c7.f38340k0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f45549b;
                wt wtVar = new wt(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(wtVar, 100L);
                c7.i0(new bi.c2(dataSettingsActivity2, wtVar, System.currentTimeMillis(), 1));
                return;
        }
    }
}
