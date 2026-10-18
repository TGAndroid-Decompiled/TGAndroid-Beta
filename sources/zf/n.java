package zf;

import org.telegram.messenger.AndroidUtilities;
public final class n {
    public final m f51629a;
    public long f51630b;
    public boolean f51631c;
    public final tg.p d = new tg.p(this, 21);

    public n(m mVar) {
        this.f51629a = mVar;
    }

    public final void a(long j10) {
        if (this.f51631c && this.f51630b == j10) {
            return;
        }
        this.f51630b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f51631c = true;
        tg.p pVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(pVar);
        AndroidUtilities.runOnUIThread(pVar, 1000L);
    }

    public final void b() {
        this.f51631c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
