package org.telegram.ui;
public final class ys implements Runnable {
    public final int f52180a;
    public final DataSettingsActivity f52181b;

    public ys(DataSettingsActivity dataSettingsActivity, int i7) {
        this.f52180a = i7;
        this.f52181b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f52180a) {
            case 0:
                this.f52181b.getMediaDataController().E(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f52181b;
                dataSettingsActivity.W = true;
                if (dataSettingsActivity.f41221a != null && (i7 = dataSettingsActivity.f41228s) >= 0) {
                    dataSettingsActivity.s0(i7);
                    return;
                }
                return;
            default:
                y6.f51918j0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f52181b;
                ys ysVar = new ys(dataSettingsActivity2, 1);
                org.telegram.messenger.g0.i3(ysVar, 100L);
                y6.m0(new bi.b2(dataSettingsActivity2, ysVar, System.currentTimeMillis(), 1));
                return;
        }
    }
}
