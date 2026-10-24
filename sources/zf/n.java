package zf;

import org.telegram.messenger.AndroidUtilities;
public final class n {
    public final m f52054a;
    public long f52055b;
    public boolean f52056c;
    public final tg.p d = new tg.p(this, 21);

    public n(m mVar) {
        this.f52054a = mVar;
    }

    public final void a(long j10) {
        if (this.f52056c && this.f52055b == j10) {
            return;
        }
        this.f52055b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f52056c = true;
        tg.p pVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(pVar);
        AndroidUtilities.runOnUIThread(pVar, 1000L);
    }

    public final void b() {
        this.f52056c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
