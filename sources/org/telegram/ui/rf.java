package org.telegram.ui;
public final class rf implements Runnable {
    public final int f41623a;
    public final eo f41624b;
    public final boolean f41625c;

    public rf(eo eoVar, boolean z10, int i10) {
        this.f41623a = i10;
        this.f41624b = eoVar;
        this.f41625c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f41623a) {
            case 0:
                if (this.f41625c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f41624b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f41624b.Cc(0, this.f41625c);
                return;
        }
    }
}
