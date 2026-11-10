package org.telegram.ui;
public final class ve implements Runnable {
    public final int f50716a;
    public final cn f50717b;
    public final boolean f50718c;

    public ve(cn cnVar, boolean z9, int i7) {
        this.f50716a = i7;
        this.f50717b = cnVar;
        this.f50718c = z9;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f50716a) {
            case 0:
                if (this.f50718c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f50717b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f50717b.fd(0, this.f50718c);
                return;
        }
    }
}
