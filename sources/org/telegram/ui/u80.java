package org.telegram.ui;
public final class u80 implements Runnable {
    public final int f40290a;
    public final LanguageSelectActivity f40291b;

    public u80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f40290a = i10;
        this.f40291b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f40290a) {
            case 0:
                LanguageSelectActivity.Y(this.f40291b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f40291b);
                return;
            default:
                this.f40291b.f31799a.l();
                return;
        }
    }
}
