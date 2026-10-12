package org.telegram.ui;
public final class sf implements Runnable {
    public final int f40123a;
    public final fo f40124b;
    public final boolean f40125c;

    public sf(fo foVar, boolean z10, int i10) {
        this.f40123a = i10;
        this.f40124b = foVar;
        this.f40125c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f40123a) {
            case 0:
                if (this.f40125c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f40124b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f40124b.Cc(0, this.f40125c);
                return;
        }
    }
}
