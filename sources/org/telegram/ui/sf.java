package org.telegram.ui;
public final class sf implements Runnable {
    public final int f39807a;
    public final fo f39808b;
    public final boolean f39809c;

    public sf(fo foVar, boolean z10, int i10) {
        this.f39807a = i10;
        this.f39808b = foVar;
        this.f39809c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f39807a) {
            case 0:
                if (this.f39809c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f39808b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f39808b.Cc(0, this.f39809c);
                return;
        }
    }
}
