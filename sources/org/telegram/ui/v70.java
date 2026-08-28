package org.telegram.ui;
public final class v70 implements Runnable {
    public final int f43400a;
    public final LanguageSelectActivity f43401b;

    public v70(LanguageSelectActivity languageSelectActivity, int i9) {
        this.f43400a = i9;
        this.f43401b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f43400a) {
            case 0:
                LanguageSelectActivity.X(this.f43401b);
                return;
            case 1:
                LanguageSelectActivity.V(this.f43401b);
                return;
            default:
                this.f43401b.f35486a.l();
                return;
        }
    }
}
