package wi;

import android.widget.ImageView;
import org.telegram.messenger.g0;
public final class b implements Runnable {
    public final int f59974a;
    public final h f59975b;

    public b(h hVar, int i7) {
        this.f59974a = i7;
        this.f59975b = hVar;
    }

    @Override
    public final void run() {
        switch (this.f59974a) {
            case 0:
                h hVar = this.f59975b;
                ImageView imageView = hVar.f59996l;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    hVar.f59996l.setImageDrawable(null);
                    return;
                }
                return;
            case 1:
                h hVar2 = this.f59975b;
                if (hVar2.b() && hVar2.c()) {
                    boolean z10 = false;
                    float f10 = hVar2.M[0];
                    if (f10 >= hVar2.f60007x * 0.5f) {
                        z10 = true;
                    }
                    if (hVar2.f59988b.V(z10, f10, hVar2.G) && !hVar2.f60005u) {
                        hVar2.f60005u = true;
                        hVar2.o(true);
                        if (!hVar2.f60006w) {
                            hVar2.f60006w = true;
                            g0.h3(hVar2.P, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                g0.g3(new b(this.f59975b, 0));
                return;
            default:
                h hVar3 = this.f59975b;
                hVar3.getClass();
                g0.g3(new b(hVar3, 0));
                return;
        }
    }
}
