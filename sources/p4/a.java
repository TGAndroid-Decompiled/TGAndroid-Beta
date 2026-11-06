package p4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f53067a;
    public final b f53068b;

    public a(b bVar, int i7) {
        this.f53067a = i7;
        this.f53068b = bVar;
    }

    @Override
    public final void run() {
        int i7 = this.f53067a;
        b bVar = this.f53068b;
        switch (i7) {
            case 0:
                bVar.f53072a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f53071g;
                bVar.b();
                return;
        }
    }
}
