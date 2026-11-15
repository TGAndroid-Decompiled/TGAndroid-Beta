package p4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f54578a;
    public final b f54579b;

    public a(b bVar, int i7) {
        this.f54578a = i7;
        this.f54579b = bVar;
    }

    @Override
    public final void run() {
        int i7 = this.f54578a;
        b bVar = this.f54579b;
        switch (i7) {
            case 0:
                bVar.f54583a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f54582g;
                bVar.b();
                return;
        }
    }
}
