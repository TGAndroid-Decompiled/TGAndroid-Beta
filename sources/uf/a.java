package uf;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f48501a;
    public final c f48502b;
    public final String f48503c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f48501a = i10;
        this.f48502b = cVar;
        this.f48503c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f48501a) {
            case 0:
                c cVar = this.f48502b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f48503c, this.d, 1));
                return;
            default:
                c cVar2 = this.f48502b;
                cVar2.B = null;
                cVar2.v = null;
                cVar2.H(this.f48503c, this.d, true);
                return;
        }
    }
}
