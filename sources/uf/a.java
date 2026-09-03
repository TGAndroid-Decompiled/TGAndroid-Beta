package uf;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f48537a;
    public final c f48538b;
    public final String f48539c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f48537a = i10;
        this.f48538b = cVar;
        this.f48539c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f48537a) {
            case 0:
                c cVar = this.f48538b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f48539c, this.d, 1));
                return;
            default:
                c cVar2 = this.f48538b;
                cVar2.B = null;
                cVar2.v = null;
                cVar2.H(this.f48539c, this.d, true);
                return;
        }
    }
}
