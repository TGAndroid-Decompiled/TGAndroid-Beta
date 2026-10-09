package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tc;
public final class s1 implements Runnable {
    public final int f53146a;
    public final s3 f53147b;
    public final String f53148c;

    public s1(s3 s3Var, String str, int i10) {
        this.f53146a = i10;
        this.f53147b = s3Var;
        this.f53148c = str;
    }

    @Override
    public final void run() {
        switch (this.f53146a) {
            case 0:
                s3.j1(this.f53147b, this.f53148c);
                return;
            case 1:
                s3.i1(this.f53147b, this.f53148c);
                return;
            case 2:
                s3.v0(this.f53147b, this.f53148c);
                return;
            case 3:
                s3.R0(this.f53147b, this.f53148c);
                return;
            case 4:
                s3.E0(this.f53147b, this.f53148c);
                return;
            case 5:
                s3.R(this.f53147b, this.f53148c);
                return;
            case 6:
                s3.y0(this.f53147b, this.f53148c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f53148c);
                tc k10 = this.f53147b.getBulletinFactory().k(false);
                k10.f31140t = true;
                k10.j();
                return;
            default:
                s3.p0(this.f53147b, this.f53148c);
                return;
        }
    }
}
