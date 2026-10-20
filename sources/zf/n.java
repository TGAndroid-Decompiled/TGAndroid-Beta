package zf;

import org.telegram.messenger.AndroidUtilities;
public final class n {
    public final m f51589a;
    public long f51590b;
    public boolean f51591c;
    public final tg.p d = new tg.p(this, 21);

    public n(m mVar) {
        this.f51589a = mVar;
    }

    public final void a(long j10) {
        if (this.f51591c && this.f51590b == j10) {
            return;
        }
        this.f51590b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f51591c = true;
        tg.p pVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(pVar);
        AndroidUtilities.runOnUIThread(pVar, 1000L);
    }

    public final void b() {
        this.f51591c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
