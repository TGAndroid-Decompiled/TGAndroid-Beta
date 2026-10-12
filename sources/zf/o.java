package zf;

import org.telegram.messenger.AndroidUtilities;
public final class o {
    public final n f50202a;
    public long f50203b;
    public boolean f50204c;
    public final c d = new c(this, 1);

    public o(n nVar) {
        this.f50202a = nVar;
    }

    public final void a(long j10) {
        if (this.f50204c && this.f50203b == j10) {
            return;
        }
        this.f50203b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f50204c = true;
        c cVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(cVar);
        AndroidUtilities.runOnUIThread(cVar, 1000L);
    }

    public final void b() {
        this.f50204c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
