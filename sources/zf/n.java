package zf;

import org.telegram.messenger.AndroidUtilities;
public final class n {
    public final m f52055a;
    public long f52056b;
    public boolean f52057c;
    public final tg.p d = new tg.p(this, 21);

    public n(m mVar) {
        this.f52055a = mVar;
    }

    public final void a(long j10) {
        if (this.f52057c && this.f52056b == j10) {
            return;
        }
        this.f52056b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f52057c = true;
        tg.p pVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(pVar);
        AndroidUtilities.runOnUIThread(pVar, 1000L);
    }

    public final void b() {
        this.f52057c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
