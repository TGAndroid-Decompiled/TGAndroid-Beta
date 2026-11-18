package wi;

import android.widget.ImageView;
import org.telegram.messenger.g0;
public final class b implements Runnable {
    public final int f59932a;
    public final h f59933b;

    public b(h hVar, int i7) {
        this.f59932a = i7;
        this.f59933b = hVar;
    }

    @Override
    public final void run() {
        switch (this.f59932a) {
            case 0:
                h hVar = this.f59933b;
                ImageView imageView = hVar.f59954l;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    hVar.f59954l.setImageDrawable(null);
                    return;
                }
                return;
            case 1:
                h hVar2 = this.f59933b;
                if (hVar2.b() && hVar2.c()) {
                    boolean z10 = false;
                    float f10 = hVar2.M[0];
                    if (f10 >= hVar2.f59965x * 0.5f) {
                        z10 = true;
                    }
                    if (hVar2.f59946b.V(z10, f10, hVar2.G) && !hVar2.f59963u) {
                        hVar2.f59963u = true;
                        hVar2.o(true);
                        if (!hVar2.f59964w) {
                            hVar2.f59964w = true;
                            g0.h3(hVar2.P, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                g0.g3(new b(this.f59933b, 0));
                return;
            default:
                h hVar3 = this.f59933b;
                hVar3.getClass();
                g0.g3(new b(hVar3, 0));
                return;
        }
    }
}
