package rf;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Runnable {
    public final int f47135a;
    public final c f47136b;
    public final String f47137c;
    public final Location d;

    public a(c cVar, String str, Location location, int i10) {
        this.f47135a = i10;
        this.f47136b = cVar;
        this.f47137c = str;
        this.d = location;
    }

    @Override
    public final void run() {
        switch (this.f47135a) {
            case 0:
                c cVar = this.f47136b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.f47137c, this.d, 1));
                return;
            default:
                c cVar2 = this.f47136b;
                cVar2.A = null;
                cVar2.v = null;
                cVar2.H(this.f47137c, this.d, true);
                return;
        }
    }
}
