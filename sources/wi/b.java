package wi;

import android.widget.ImageView;
import org.telegram.messenger.g0;
public final class b implements Runnable {
    public final int f59943a;
    public final h f59944b;

    public b(h hVar, int i7) {
        this.f59943a = i7;
        this.f59944b = hVar;
    }

    @Override
    public final void run() {
        switch (this.f59943a) {
            case 0:
                h hVar = this.f59944b;
                ImageView imageView = hVar.f59965l;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    hVar.f59965l.setImageDrawable(null);
                    return;
                }
                return;
            case 1:
                h hVar2 = this.f59944b;
                if (hVar2.b() && hVar2.c()) {
                    boolean z10 = false;
                    float f10 = hVar2.M[0];
                    if (f10 >= hVar2.f59976x * 0.5f) {
                        z10 = true;
                    }
                    if (hVar2.f59957b.V(z10, f10, hVar2.G) && !hVar2.f59974u) {
                        hVar2.f59974u = true;
                        hVar2.o(true);
                        if (!hVar2.f59975w) {
                            hVar2.f59975w = true;
                            g0.h3(hVar2.P, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                g0.g3(new b(this.f59944b, 0));
                return;
            default:
                h hVar3 = this.f59944b;
                hVar3.getClass();
                g0.g3(new b(hVar3, 0));
                return;
        }
    }
}
