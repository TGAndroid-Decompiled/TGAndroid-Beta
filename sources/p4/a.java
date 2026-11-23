package p4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f55157a;
    public final b f55158b;

    public a(b bVar, int i7) {
        this.f55157a = i7;
        this.f55158b = bVar;
    }

    @Override
    public final void run() {
        int i7 = this.f55157a;
        b bVar = this.f55158b;
        switch (i7) {
            case 0:
                bVar.f55162a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f55161g;
                bVar.b();
                return;
        }
    }
}
