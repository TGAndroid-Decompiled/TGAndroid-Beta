package zf;

import org.telegram.messenger.AndroidUtilities;
public final class n {
    public final m f51582a;
    public long f51583b;
    public boolean f51584c;
    public final tg.p d = new tg.p(this, 21);

    public n(m mVar) {
        this.f51582a = mVar;
    }

    public final void a(long j10) {
        if (this.f51584c && this.f51583b == j10) {
            return;
        }
        this.f51583b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f51584c = true;
        tg.p pVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(pVar);
        AndroidUtilities.runOnUIThread(pVar, 1000L);
    }

    public final void b() {
        this.f51584c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
