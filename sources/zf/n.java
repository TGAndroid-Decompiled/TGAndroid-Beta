package zf;

import org.telegram.messenger.AndroidUtilities;
public final class n {
    public final m f51584a;
    public long f51585b;
    public boolean f51586c;
    public final tg.p d = new tg.p(this, 21);

    public n(m mVar) {
        this.f51584a = mVar;
    }

    public final void a(long j10) {
        if (this.f51586c && this.f51585b == j10) {
            return;
        }
        this.f51585b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f51586c = true;
        tg.p pVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(pVar);
        AndroidUtilities.runOnUIThread(pVar, 1000L);
    }

    public final void b() {
        this.f51586c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
