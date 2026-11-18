package p4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f55147a;
    public final b f55148b;

    public a(b bVar, int i7) {
        this.f55147a = i7;
        this.f55148b = bVar;
    }

    @Override
    public final void run() {
        int i7 = this.f55147a;
        b bVar = this.f55148b;
        switch (i7) {
            case 0:
                bVar.f55152a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f55151g;
                bVar.b();
                return;
        }
    }
}
