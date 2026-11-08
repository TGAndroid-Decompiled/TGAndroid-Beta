package p4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f53161a;
    public final b f53162b;

    public a(b bVar, int i7) {
        this.f53161a = i7;
        this.f53162b = bVar;
    }

    @Override
    public final void run() {
        int i7 = this.f53161a;
        b bVar = this.f53162b;
        switch (i7) {
            case 0:
                bVar.f53166a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f53165g;
                bVar.b();
                return;
        }
    }
}
