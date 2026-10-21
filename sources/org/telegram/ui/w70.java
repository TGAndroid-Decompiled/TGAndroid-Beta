package org.telegram.ui;
public final class w70 implements Runnable {
    public final int f42485a;
    public final LanguageSelectActivity f42486b;

    public w70(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f42485a = i10;
        this.f42486b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f42485a) {
            case 0:
                LanguageSelectActivity.Y(this.f42486b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f42486b);
                return;
            default:
                this.f42486b.f33150a.l();
                return;
        }
    }
}
