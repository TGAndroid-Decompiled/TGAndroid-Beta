package p4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f53172a;
    public final b f53173b;

    public a(b bVar, int i7) {
        this.f53172a = i7;
        this.f53173b = bVar;
    }

    @Override
    public final void run() {
        int i7 = this.f53172a;
        b bVar = this.f53173b;
        switch (i7) {
            case 0:
                bVar.f53177a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f53176g;
                bVar.b();
                return;
        }
    }
}
