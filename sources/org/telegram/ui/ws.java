package org.telegram.ui;
public final class ws implements Runnable {
    public final int f51504a;
    public final DataSettingsActivity f51505b;

    public ws(DataSettingsActivity dataSettingsActivity, int i7) {
        this.f51504a = i7;
        this.f51505b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f51504a) {
            case 0:
                this.f51505b.getMediaDataController().E(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f51505b;
                dataSettingsActivity.W = true;
                if (dataSettingsActivity.f41214a != null && (i7 = dataSettingsActivity.f41221s) >= 0) {
                    dataSettingsActivity.s0(i7);
                    return;
                }
                return;
            default:
                y6.f52094j0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f51505b;
                ws wsVar = new ws(dataSettingsActivity2, 1);
                org.telegram.messenger.g0.i3(wsVar, 100L);
                y6.m0(new bi.b2(dataSettingsActivity2, wsVar, System.currentTimeMillis(), 1));
                return;
        }
    }
}
