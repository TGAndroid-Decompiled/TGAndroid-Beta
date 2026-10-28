package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class yt implements Runnable {
    public final int f46079a;
    public final DataSettingsActivity f46080b;

    public yt(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f46079a = i10;
        this.f46080b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f46079a) {
            case 0:
                this.f46080b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f46080b;
                dataSettingsActivity.W = true;
                if (dataSettingsActivity.f35512a != null && (i10 = dataSettingsActivity.f35518s) >= 0) {
                    dataSettingsActivity.o0(i10);
                    return;
                }
                return;
            default:
                c7.f38186k0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f46080b;
                yt ytVar = new yt(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(ytVar, 100L);
                c7.i0(new bi.c2(dataSettingsActivity2, ytVar, System.currentTimeMillis(), 1));
                return;
        }
    }
}
