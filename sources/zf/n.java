package zf;

import org.telegram.messenger.AndroidUtilities;
public final class n {
    public final m f51593a;
    public long f51594b;
    public boolean f51595c;
    public final tg.p d = new tg.p(this, 21);

    public n(m mVar) {
        this.f51593a = mVar;
    }

    public final void a(long j10) {
        if (this.f51595c && this.f51594b == j10) {
            return;
        }
        this.f51594b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f51595c = true;
        tg.p pVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(pVar);
        AndroidUtilities.runOnUIThread(pVar, 1000L);
    }

    public final void b() {
        this.f51595c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
