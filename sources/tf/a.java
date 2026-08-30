package tf;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f44662a;
    public final c f44663b;
    public final String f44664c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f44662a = i10;
        this.f44663b = cVar;
        this.f44664c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f44662a) {
            case 0:
                c cVar = this.f44663b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f44664c, this.d, 1));
                return;
            default:
                c cVar2 = this.f44663b;
                cVar2.B = null;
                cVar2.v = null;
                cVar2.H(this.f44664c, this.d, true);
                return;
        }
    }
}
