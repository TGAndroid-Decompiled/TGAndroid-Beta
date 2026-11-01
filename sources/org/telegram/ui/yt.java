package org.telegram.ui;
public final class yt implements Runnable {
    public final int f43721a;
    public final DataSettingsActivity f43722b;

    public yt(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f43721a = i10;
        this.f43722b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f43721a) {
            case 0:
                this.f43722b.getMediaDataController().E(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f43722b;
                dataSettingsActivity.W = true;
                if (dataSettingsActivity.f33318a != null && (i10 = dataSettingsActivity.f33324s) >= 0) {
                    dataSettingsActivity.s0(i10);
                    return;
                }
                return;
            default:
                y6.f43568j0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f43722b;
                yt ytVar = new yt(dataSettingsActivity2, 1);
                org.telegram.messenger.i0.h3(ytVar, 100L);
                y6.m0(new zt(dataSettingsActivity2, ytVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
