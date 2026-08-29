package org.telegram.ui;
public final class ye implements Runnable {
    public final int f44849a;
    public final tn f44850b;
    public final boolean f44851c;

    public ye(tn tnVar, boolean z10, int i10) {
        this.f44849a = i10;
        this.f44850b = tnVar;
        this.f44851c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f44849a) {
            case 0:
                if (this.f44851c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f44850b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f44850b.yc(0, this.f44851c);
                return;
        }
    }
}
