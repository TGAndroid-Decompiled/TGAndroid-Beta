package yf;

import org.telegram.messenger.AndroidUtilities;
import sg.p0;
public final class n {
    public final m f50151a;
    public long f50152b;
    public boolean f50153c;
    public final p0 d = new p0(this, 15);

    public n(m mVar) {
        this.f50151a = mVar;
    }

    public final void a(long j3) {
        if (this.f50153c && this.f50152b == j3) {
            return;
        }
        this.f50152b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f50153c = true;
        p0 p0Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(p0Var);
        AndroidUtilities.runOnUIThread(p0Var, 1000L);
    }

    public final void b() {
        this.f50153c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
