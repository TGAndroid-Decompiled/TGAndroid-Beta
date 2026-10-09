package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tc;
public final class s1 implements Runnable {
    public final int f53148a;
    public final s3 f53149b;
    public final String f53150c;

    public s1(s3 s3Var, String str, int i10) {
        this.f53148a = i10;
        this.f53149b = s3Var;
        this.f53150c = str;
    }

    @Override
    public final void run() {
        switch (this.f53148a) {
            case 0:
                s3.j1(this.f53149b, this.f53150c);
                return;
            case 1:
                s3.i1(this.f53149b, this.f53150c);
                return;
            case 2:
                s3.v0(this.f53149b, this.f53150c);
                return;
            case 3:
                s3.R0(this.f53149b, this.f53150c);
                return;
            case 4:
                s3.E0(this.f53149b, this.f53150c);
                return;
            case 5:
                s3.R(this.f53149b, this.f53150c);
                return;
            case 6:
                s3.y0(this.f53149b, this.f53150c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f53150c);
                tc k10 = this.f53149b.getBulletinFactory().k(false);
                k10.f31140t = true;
                k10.j();
                return;
            default:
                s3.p0(this.f53149b, this.f53150c);
                return;
        }
    }
}
