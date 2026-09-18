package org.telegram.ui;
public final class s80 implements Runnable {
    public final int f37418a;
    public final LanguageSelectActivity f37419b;

    public s80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f37418a = i10;
        this.f37419b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f37418a) {
            case 0:
                LanguageSelectActivity.Y(this.f37419b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f37419b);
                return;
            default:
                this.f37419b.f30825a.l();
                return;
        }
    }
}
