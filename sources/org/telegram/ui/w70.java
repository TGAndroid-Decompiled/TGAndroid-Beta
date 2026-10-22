package org.telegram.ui;
public final class w70 implements Runnable {
    public final int f42488a;
    public final LanguageSelectActivity f42489b;

    public w70(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f42488a = i10;
        this.f42489b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f42488a) {
            case 0:
                LanguageSelectActivity.Y(this.f42489b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f42489b);
                return;
            default:
                this.f42489b.f33153a.l();
                return;
        }
    }
}
