package org.telegram.ui;
public final class y70 implements Runnable {
    public final int f43336a;
    public final LanguageSelectActivity f43337b;

    public y70(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f43336a = i10;
        this.f43337b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f43336a) {
            case 0:
                LanguageSelectActivity.Y(this.f43337b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f43337b);
                return;
            default:
                this.f43337b.f33137a.l();
                return;
        }
    }
}
