package org.telegram.ui;
public final class zt implements Runnable {
    public final int f44227a;
    public final DataSettingsActivity f44228b;

    public zt(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f44227a = i10;
        this.f44228b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f44227a) {
            case 0:
                this.f44228b.getMediaDataController().E(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f44228b;
                dataSettingsActivity.W = true;
                if (dataSettingsActivity.f33311a != null && (i10 = dataSettingsActivity.f33317s) >= 0) {
                    dataSettingsActivity.r0(i10);
                    return;
                }
                return;
            default:
                y6.f43712j0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f44228b;
                zt ztVar = new zt(dataSettingsActivity2, 1);
                org.telegram.messenger.i0.h3(ztVar, 100L);
                y6.l0(new au(dataSettingsActivity2, ztVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
