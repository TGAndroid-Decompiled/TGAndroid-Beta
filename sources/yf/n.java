package yf;

import org.telegram.messenger.AndroidUtilities;
import sg.p0;
public final class n {
    public final m f50121a;
    public long f50122b;
    public boolean f50123c;
    public final p0 d = new p0(this, 15);

    public n(m mVar) {
        this.f50121a = mVar;
    }

    public final void a(long j3) {
        if (this.f50123c && this.f50122b == j3) {
            return;
        }
        this.f50122b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f50123c = true;
        p0 p0Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(p0Var);
        AndroidUtilities.runOnUIThread(p0Var, 1000L);
    }

    public final void b() {
        this.f50123c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
