package p4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f53173a;
    public final b f53174b;

    public a(b bVar, int i7) {
        this.f53173a = i7;
        this.f53174b = bVar;
    }

    @Override
    public final void run() {
        int i7 = this.f53173a;
        b bVar = this.f53174b;
        switch (i7) {
            case 0:
                bVar.f53178a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f53177g;
                bVar.b();
                return;
        }
    }
}
