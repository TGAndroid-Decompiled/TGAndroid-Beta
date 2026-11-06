package p4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f53043a;
    public final b f53044b;

    public a(b bVar, int i7) {
        this.f53043a = i7;
        this.f53044b = bVar;
    }

    @Override
    public final void run() {
        int i7 = this.f53043a;
        b bVar = this.f53044b;
        switch (i7) {
            case 0:
                bVar.f53048a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f53047g;
                bVar.b();
                return;
        }
    }
}
