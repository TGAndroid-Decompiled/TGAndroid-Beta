package org.telegram.ui;
public final class w70 implements Runnable {
    public final int f42479a;
    public final LanguageSelectActivity f42480b;

    public w70(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f42479a = i10;
        this.f42480b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f42479a) {
            case 0:
                LanguageSelectActivity.Y(this.f42480b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f42480b);
                return;
            default:
                this.f42480b.f33143a.l();
                return;
        }
    }
}
