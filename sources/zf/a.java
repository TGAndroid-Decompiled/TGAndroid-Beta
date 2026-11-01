package zf;

import android.location.Location;
public final class a implements Runnable {
    public final int f55454a;
    public final c f55455b;
    public final String f55456c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f55454a = i10;
        this.f55455b = cVar;
        this.f55456c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f55454a) {
            case 0:
                c cVar = this.f55455b;
                cVar.getClass();
                org.telegram.messenger.i0.g3(new a(cVar, this.f55456c, this.d, 1));
                return;
            default:
                c cVar2 = this.f55455b;
                cVar2.E = null;
                cVar2.f55474w = null;
                cVar2.H(this.f55456c, this.d, true);
                return;
        }
    }
}
