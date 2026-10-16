package zf;

import org.telegram.messenger.AndroidUtilities;
public final class o {
    public final n f50203a;
    public long f50204b;
    public boolean f50205c;
    public final c d = new c(this, 1);

    public o(n nVar) {
        this.f50203a = nVar;
    }

    public final void a(long j10) {
        if (this.f50205c && this.f50204b == j10) {
            return;
        }
        this.f50204b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f50205c = true;
        c cVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(cVar);
        AndroidUtilities.runOnUIThread(cVar, 1000L);
    }

    public final void b() {
        this.f50205c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
