package org.telegram.ui;
public final class se implements Runnable {
    public final int f51208a;
    public final an f51209b;
    public final boolean f51210c;

    public se(an anVar, boolean z10, int i7) {
        this.f51208a = i7;
        this.f51209b = anVar;
        this.f51210c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f51208a) {
            case 0:
                if (this.f51210c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f51209b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f51209b.gd(0, this.f51210c);
                return;
        }
    }
}
