package p4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f53160a;
    public final b f53161b;

    public a(b bVar, int i7) {
        this.f53160a = i7;
        this.f53161b = bVar;
    }

    @Override
    public final void run() {
        int i7 = this.f53160a;
        b bVar = this.f53161b;
        switch (i7) {
            case 0:
                bVar.f53165a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f53164g;
                bVar.b();
                return;
        }
    }
}
