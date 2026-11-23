package wi;

import android.widget.ImageView;
import org.telegram.messenger.g0;
public final class b implements Runnable {
    public final int f60061a;
    public final h f60062b;

    public b(h hVar, int i7) {
        this.f60061a = i7;
        this.f60062b = hVar;
    }

    @Override
    public final void run() {
        switch (this.f60061a) {
            case 0:
                h hVar = this.f60062b;
                ImageView imageView = hVar.f60083l;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    hVar.f60083l.setImageDrawable(null);
                    return;
                }
                return;
            case 1:
                h hVar2 = this.f60062b;
                if (hVar2.b() && hVar2.c()) {
                    boolean z10 = false;
                    float f10 = hVar2.M[0];
                    if (f10 >= hVar2.f60094x * 0.5f) {
                        z10 = true;
                    }
                    if (hVar2.f60075b.A1(z10, f10, hVar2.G) && !hVar2.f60092u) {
                        hVar2.f60092u = true;
                        hVar2.o(true);
                        if (!hVar2.f60093w) {
                            hVar2.f60093w = true;
                            g0.h3(hVar2.P, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                g0.g3(new b(this.f60062b, 0));
                return;
            default:
                h hVar3 = this.f60062b;
                hVar3.getClass();
                g0.g3(new b(hVar3, 0));
                return;
        }
    }
}
