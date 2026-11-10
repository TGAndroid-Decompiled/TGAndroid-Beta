package org.telegram.ui;
public final class zs implements Runnable {
    public final int f52524a;
    public final DataSettingsActivity f52525b;

    public zs(DataSettingsActivity dataSettingsActivity, int i7) {
        this.f52524a = i7;
        this.f52525b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f52524a) {
            case 0:
                this.f52525b.getMediaDataController().E(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f52525b;
                dataSettingsActivity.W = true;
                if (dataSettingsActivity.f41212a != null && (i7 = dataSettingsActivity.f41219s) >= 0) {
                    dataSettingsActivity.s0(i7);
                    return;
                }
                return;
            default:
                y6.f51906j0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f52525b;
                zs zsVar = new zs(dataSettingsActivity2, 1);
                org.telegram.messenger.g0.i3(zsVar, 100L);
                y6.m0(new bi.b2(dataSettingsActivity2, zsVar, System.currentTimeMillis(), 1));
                return;
        }
    }
}
