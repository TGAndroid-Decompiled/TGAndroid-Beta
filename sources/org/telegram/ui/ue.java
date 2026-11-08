package org.telegram.ui;
public final class ue implements Runnable {
    public final int f50328a;
    public final an f50329b;
    public final boolean f50330c;

    public ue(an anVar, boolean z9, int i7) {
        this.f50328a = i7;
        this.f50329b = anVar;
        this.f50330c = z9;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f50328a) {
            case 0:
                if (this.f50330c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f50329b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f50329b.cd(0, this.f50330c);
                return;
        }
    }
}
