package org.telegram.ui;
public final class ue implements Runnable {
    public final int f50405a;
    public final an f50406b;
    public final boolean f50407c;

    public ue(an anVar, boolean z9, int i7) {
        this.f50405a = i7;
        this.f50406b = anVar;
        this.f50407c = z9;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f50405a) {
            case 0:
                if (this.f50407c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f50406b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f50406b.cd(0, this.f50407c);
                return;
        }
    }
}
