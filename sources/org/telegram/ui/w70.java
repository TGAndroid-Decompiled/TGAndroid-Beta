package org.telegram.ui;
public final class w70 implements Runnable {
    public final int f42478a;
    public final LanguageSelectActivity f42479b;

    public w70(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f42478a = i10;
        this.f42479b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f42478a) {
            case 0:
                LanguageSelectActivity.Y(this.f42479b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f42479b);
                return;
            default:
                this.f42479b.f33143a.l();
                return;
        }
    }
}
