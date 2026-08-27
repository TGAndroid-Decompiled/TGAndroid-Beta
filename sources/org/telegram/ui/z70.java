package org.telegram.ui;

public final class z70 implements Runnable {

    public final int f45066a;

    public final LanguageSelectActivity f45067b;

    public z70(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f45066a = i10;
        this.f45067b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f45066a) {
            case 0:
                LanguageSelectActivity.Y(this.f45067b);
                break;
            case 1:
                LanguageSelectActivity.W(this.f45067b);
                break;
            default:
                this.f45067b.f35489a.l();
                break;
        }
    }
}
