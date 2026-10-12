package org.telegram.ui;
public final class u80 implements Runnable {
    public final int f40564a;
    public final LanguageSelectActivity f40565b;

    public u80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f40564a = i10;
        this.f40565b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f40564a) {
            case 0:
                LanguageSelectActivity.Y(this.f40565b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f40565b);
                return;
            default:
                this.f40565b.f32097a.l();
                return;
        }
    }
}
