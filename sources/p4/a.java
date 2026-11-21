package p4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f55188a;
    public final b f55189b;

    public a(b bVar, int i7) {
        this.f55188a = i7;
        this.f55189b = bVar;
    }

    @Override
    public final void run() {
        int i7 = this.f55188a;
        b bVar = this.f55189b;
        switch (i7) {
            case 0:
                bVar.f55194a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f55193g;
                bVar.b();
                return;
        }
    }
}
