package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sc;
public final class s1 implements Runnable {
    public final int f53269a;
    public final s3 f53270b;
    public final String f53271c;

    public s1(s3 s3Var, String str, int i10) {
        this.f53269a = i10;
        this.f53270b = s3Var;
        this.f53271c = str;
    }

    @Override
    public final void run() {
        switch (this.f53269a) {
            case 0:
                s3.j1(this.f53270b, this.f53271c);
                return;
            case 1:
                s3.i1(this.f53270b, this.f53271c);
                return;
            case 2:
                s3.v0(this.f53270b, this.f53271c);
                return;
            case 3:
                s3.R0(this.f53270b, this.f53271c);
                return;
            case 4:
                s3.E0(this.f53270b, this.f53271c);
                return;
            case 5:
                s3.R(this.f53270b, this.f53271c);
                return;
            case 6:
                s3.y0(this.f53270b, this.f53271c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f53271c);
                sc k10 = this.f53270b.getBulletinFactory().k(false);
                k10.f30843t = true;
                k10.j();
                return;
            default:
                s3.p0(this.f53270b, this.f53271c);
                return;
        }
    }
}
