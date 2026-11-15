package org.telegram.ui;
public final class se implements Runnable {
    public final int f51204a;
    public final an f51205b;
    public final boolean f51206c;

    public se(an anVar, boolean z10, int i7) {
        this.f51204a = i7;
        this.f51205b = anVar;
        this.f51206c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f51204a) {
            case 0:
                if (this.f51206c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f51205b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f51205b.gd(0, this.f51206c);
                return;
        }
    }
}
