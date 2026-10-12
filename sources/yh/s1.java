package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sc;
public final class s1 implements Runnable {
    public final int f53384a;
    public final s3 f53385b;
    public final String f53386c;

    public s1(s3 s3Var, String str, int i10) {
        this.f53384a = i10;
        this.f53385b = s3Var;
        this.f53386c = str;
    }

    @Override
    public final void run() {
        switch (this.f53384a) {
            case 0:
                s3.j1(this.f53385b, this.f53386c);
                return;
            case 1:
                s3.i1(this.f53385b, this.f53386c);
                return;
            case 2:
                s3.v0(this.f53385b, this.f53386c);
                return;
            case 3:
                s3.R0(this.f53385b, this.f53386c);
                return;
            case 4:
                s3.E0(this.f53385b, this.f53386c);
                return;
            case 5:
                s3.R(this.f53385b, this.f53386c);
                return;
            case 6:
                s3.y0(this.f53385b, this.f53386c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f53386c);
                sc k10 = this.f53385b.getBulletinFactory().k(false);
                k10.f30546t = true;
                k10.j();
                return;
            default:
                s3.p0(this.f53385b, this.f53386c);
                return;
        }
    }
}
