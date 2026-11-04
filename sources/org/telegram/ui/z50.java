package org.telegram.ui;
public final class z50 implements Runnable {
    public final int f52537a;
    public final LanguageSelectActivity f52538b;

    public z50(LanguageSelectActivity languageSelectActivity, int i3) {
        this.f52537a = i3;
        this.f52538b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f52537a) {
            case 0:
                LanguageSelectActivity.d0(this.f52538b);
                return;
            case 1:
                LanguageSelectActivity.b0(this.f52538b);
                return;
            default:
                this.f52538b.f41276a.f();
                return;
        }
    }
}
