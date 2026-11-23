package p4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f55273a;
    public final b f55274b;

    public a(b bVar, int i7) {
        this.f55273a = i7;
        this.f55274b = bVar;
    }

    @Override
    public final void run() {
        int i7 = this.f55273a;
        b bVar = this.f55274b;
        switch (i7) {
            case 0:
                bVar.f55278a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f55277g;
                bVar.b();
                return;
        }
    }
}
