package org.telegram.ui;
public final class ws implements Runnable {
    public final int f51487a;
    public final DataSettingsActivity f51488b;

    public ws(DataSettingsActivity dataSettingsActivity, int i7) {
        this.f51487a = i7;
        this.f51488b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f51487a) {
            case 0:
                this.f51488b.getMediaDataController().E(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f51488b;
                dataSettingsActivity.W = true;
                if (dataSettingsActivity.f41186a != null && (i7 = dataSettingsActivity.f41193s) >= 0) {
                    dataSettingsActivity.s0(i7);
                    return;
                }
                return;
            default:
                y6.f52082j0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f51488b;
                ws wsVar = new ws(dataSettingsActivity2, 1);
                org.telegram.messenger.g0.i3(wsVar, 100L);
                y6.m0(new bi.b2(dataSettingsActivity2, wsVar, System.currentTimeMillis(), 1));
                return;
        }
    }
}
