package zf;

import org.telegram.messenger.AndroidUtilities;
public final class n {
    public final m f51604a;
    public long f51605b;
    public boolean f51606c;
    public final tg.p d = new tg.p(this, 21);

    public n(m mVar) {
        this.f51604a = mVar;
    }

    public final void a(long j10) {
        if (this.f51606c && this.f51605b == j10) {
            return;
        }
        this.f51605b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f51606c = true;
        tg.p pVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(pVar);
        AndroidUtilities.runOnUIThread(pVar, 1000L);
    }

    public final void b() {
        this.f51606c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
