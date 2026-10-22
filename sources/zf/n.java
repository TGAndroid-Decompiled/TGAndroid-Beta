package zf;

import org.telegram.messenger.AndroidUtilities;
public final class n {
    public final m f51592a;
    public long f51593b;
    public boolean f51594c;
    public final tg.p d = new tg.p(this, 21);

    public n(m mVar) {
        this.f51592a = mVar;
    }

    public final void a(long j10) {
        if (this.f51594c && this.f51593b == j10) {
            return;
        }
        this.f51593b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f51594c = true;
        tg.p pVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(pVar);
        AndroidUtilities.runOnUIThread(pVar, 1000L);
    }

    public final void b() {
        this.f51594c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
