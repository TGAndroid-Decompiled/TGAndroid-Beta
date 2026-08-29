package org.telegram.ui;
public final class y70 implements Runnable {
    public final int f44761a;
    public final LanguageSelectActivity f44762b;

    public y70(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f44761a = i10;
        this.f44762b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f44761a) {
            case 0:
                LanguageSelectActivity.Y(this.f44762b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f44762b);
                return;
            default:
                this.f44762b.f35553a.l();
                return;
        }
    }
}
