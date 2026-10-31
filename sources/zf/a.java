package zf;

import android.location.Location;
public final class a implements Runnable {
    public final int f55436a;
    public final c f55437b;
    public final String f55438c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f55436a = i10;
        this.f55437b = cVar;
        this.f55438c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f55436a) {
            case 0:
                c cVar = this.f55437b;
                cVar.getClass();
                org.telegram.messenger.i0.g3(new a(cVar, this.f55438c, this.d, 1));
                return;
            default:
                c cVar2 = this.f55437b;
                cVar2.E = null;
                cVar2.f55456w = null;
                cVar2.H(this.f55438c, this.d, true);
                return;
        }
    }
}
