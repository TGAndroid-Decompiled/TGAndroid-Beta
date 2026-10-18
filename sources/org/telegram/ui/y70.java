package org.telegram.ui;
public final class y70 implements Runnable {
    public final int f43360a;
    public final LanguageSelectActivity f43361b;

    public y70(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f43360a = i10;
        this.f43361b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f43360a) {
            case 0:
                LanguageSelectActivity.Y(this.f43361b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f43361b);
                return;
            default:
                this.f43361b.f33144a.l();
                return;
        }
    }
}
