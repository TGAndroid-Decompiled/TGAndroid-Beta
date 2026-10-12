package org.telegram.ui;
public final class s80 implements Runnable {
    public final int f41833a;
    public final LanguageSelectActivity f41834b;

    public s80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f41833a = i10;
        this.f41834b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f41833a) {
            case 0:
                LanguageSelectActivity.Y(this.f41834b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f41834b);
                return;
            default:
                this.f41834b.f33609a.l();
                return;
        }
    }
}
