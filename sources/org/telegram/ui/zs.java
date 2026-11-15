package org.telegram.ui;
public final class zs implements Runnable {
    public final int f54018a;
    public final DataSettingsActivity f54019b;

    public zs(DataSettingsActivity dataSettingsActivity, int i7) {
        this.f54018a = i7;
        this.f54019b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f54018a) {
            case 0:
                this.f54019b.getMediaDataController().E(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f54019b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f42568a != null && (i7 = dataSettingsActivity.f42575s) >= 0) {
                    dataSettingsActivity.s0(i7);
                    return;
                }
                return;
            default:
                y6.f53432k0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f54019b;
                zs zsVar = new zs(dataSettingsActivity2, 1);
                org.telegram.messenger.g0.i3(zsVar, 100L);
                y6.m0(new di.o1(dataSettingsActivity2, zsVar, System.currentTimeMillis(), 1));
                return;
        }
    }
}
