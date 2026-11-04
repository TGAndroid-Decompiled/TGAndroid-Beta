package org.telegram.ui;
public final class us implements Runnable {
    public final int f50179a;
    public final DataSettingsActivity f50180b;

    public us(DataSettingsActivity dataSettingsActivity, int i3) {
        this.f50179a = i3;
        this.f50180b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i3;
        switch (this.f50179a) {
            case 0:
                this.f50180b.getMediaDataController().E(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f50180b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f41243a != null && (i3 = dataSettingsActivity.f41250s) >= 0) {
                    dataSettingsActivity.s0(i3);
                    return;
                }
                return;
            default:
                z6.f52543k0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f50180b;
                us usVar = new us(dataSettingsActivity2, 1);
                org.telegram.messenger.g0.i3(usVar, 100L);
                z6.m0(new ci.u1(dataSettingsActivity2, usVar, System.currentTimeMillis(), 1));
                return;
        }
    }
}
