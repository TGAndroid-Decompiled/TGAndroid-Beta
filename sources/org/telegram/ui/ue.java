package org.telegram.ui;
public final class ue implements Runnable {
    public final int f50384a;
    public final an f50385b;
    public final boolean f50386c;

    public ue(an anVar, boolean z9, int i7) {
        this.f50384a = i7;
        this.f50385b = anVar;
        this.f50386c = z9;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f50384a) {
            case 0:
                if (this.f50386c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f50385b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f50385b.cd(0, this.f50386c);
                return;
        }
    }
}
