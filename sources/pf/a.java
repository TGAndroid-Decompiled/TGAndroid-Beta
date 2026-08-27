package pf;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;

public final class a implements Runnable {

    public final int f45734a;

    public final c f45735b;

    public final String f45736c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f45734a = i10;
        this.f45735b = cVar;
        this.f45736c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f45734a) {
            case 0:
                c cVar = this.f45735b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f45736c, this.d, 1));
                break;
            default:
                c cVar2 = this.f45735b;
                cVar2.A = null;
                cVar2.v = null;
                cVar2.H(this.f45736c, this.d, true);
                break;
        }
    }
}
