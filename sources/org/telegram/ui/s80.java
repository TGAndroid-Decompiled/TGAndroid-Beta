package org.telegram.ui;
public final class s80 implements Runnable {
    public final int f41829a;
    public final LanguageSelectActivity f41830b;

    public s80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f41829a = i10;
        this.f41830b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f41829a) {
            case 0:
                LanguageSelectActivity.Y(this.f41830b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f41830b);
                return;
            default:
                this.f41830b.f33607a.l();
                return;
        }
    }
}
