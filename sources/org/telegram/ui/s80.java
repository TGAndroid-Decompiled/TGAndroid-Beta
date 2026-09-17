package org.telegram.ui;
public final class s80 implements Runnable {
    public final int f37413a;
    public final LanguageSelectActivity f37414b;

    public s80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f37413a = i10;
        this.f37414b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f37413a) {
            case 0:
                LanguageSelectActivity.Y(this.f37414b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f37414b);
                return;
            default:
                this.f37414b.f30822a.l();
                return;
        }
    }
}
