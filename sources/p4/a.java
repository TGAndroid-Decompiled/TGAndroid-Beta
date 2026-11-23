package p4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f55192a;
    public final b f55193b;

    public a(b bVar, int i7) {
        this.f55192a = i7;
        this.f55193b = bVar;
    }

    @Override
    public final void run() {
        int i7 = this.f55192a;
        b bVar = this.f55193b;
        switch (i7) {
            case 0:
                bVar.f55198a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f55197g;
                bVar.b();
                return;
        }
    }
}
