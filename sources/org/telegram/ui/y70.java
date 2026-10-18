package org.telegram.ui;
public final class y70 implements Runnable {
    public final int f43322a;
    public final LanguageSelectActivity f43323b;

    public y70(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f43322a = i10;
        this.f43323b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f43322a) {
            case 0:
                LanguageSelectActivity.Y(this.f43323b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f43323b);
                return;
            default:
                this.f43323b.f33137a.l();
                return;
        }
    }
}
