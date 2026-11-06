package org.telegram.ui;
public final class ue implements Runnable {
    public final int f50406a;
    public final an f50407b;
    public final boolean f50408c;

    public ue(an anVar, boolean z9, int i7) {
        this.f50406a = i7;
        this.f50407b = anVar;
        this.f50408c = z9;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f50406a) {
            case 0:
                if (this.f50408c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f50407b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f50407b.cd(0, this.f50408c);
                return;
        }
    }
}
