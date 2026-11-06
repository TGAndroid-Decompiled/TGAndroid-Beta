package p4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f53069a;
    public final b f53070b;

    public a(b bVar, int i7) {
        this.f53069a = i7;
        this.f53070b = bVar;
    }

    @Override
    public final void run() {
        int i7 = this.f53069a;
        b bVar = this.f53070b;
        switch (i7) {
            case 0:
                bVar.f53074a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f53073g;
                bVar.b();
                return;
        }
    }
}
