package org.telegram.ui;
public final class re implements Runnable {
    public final int f49206a;
    public final wm f49207b;
    public final boolean f49208c;

    public re(wm wmVar, boolean z10, int i3) {
        this.f49206a = i3;
        this.f49207b = wmVar;
        this.f49208c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f49206a) {
            case 0:
                if (this.f49208c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f49207b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f49207b.cd(0, this.f49208c);
                return;
        }
    }
}
