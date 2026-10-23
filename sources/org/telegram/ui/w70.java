package org.telegram.ui;
public final class w70 implements Runnable {
    public final int f42489a;
    public final LanguageSelectActivity f42490b;

    public w70(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f42489a = i10;
        this.f42490b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f42489a) {
            case 0:
                LanguageSelectActivity.Y(this.f42490b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f42490b);
                return;
            default:
                this.f42490b.f33154a.l();
                return;
        }
    }
}
