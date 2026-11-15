package wi;

import android.widget.ImageView;
import org.telegram.messenger.g0;
public final class b implements Runnable {
    public final int f59368a;
    public final h f59369b;

    public b(h hVar, int i7) {
        this.f59368a = i7;
        this.f59369b = hVar;
    }

    @Override
    public final void run() {
        switch (this.f59368a) {
            case 0:
                h hVar = this.f59369b;
                ImageView imageView = hVar.f59390l;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    hVar.f59390l.setImageDrawable(null);
                    return;
                }
                return;
            case 1:
                h hVar2 = this.f59369b;
                if (hVar2.b() && hVar2.c()) {
                    boolean z10 = false;
                    float f10 = hVar2.M[0];
                    if (f10 >= hVar2.f59401x * 0.5f) {
                        z10 = true;
                    }
                    if (hVar2.f59382b.X(z10, f10, hVar2.G) && !hVar2.f59399u) {
                        hVar2.f59399u = true;
                        hVar2.o(true);
                        if (!hVar2.f59400w) {
                            hVar2.f59400w = true;
                            g0.i3(hVar2.P, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                g0.h3(new b(this.f59369b, 0));
                return;
            default:
                h hVar3 = this.f59369b;
                hVar3.getClass();
                g0.h3(new b(hVar3, 0));
                return;
        }
    }
}
