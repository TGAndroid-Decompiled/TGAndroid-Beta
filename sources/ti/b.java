package ti;

import android.widget.ImageView;
import org.telegram.messenger.g0;
public final class b implements Runnable {
    public final int f55975a;
    public final i f55976b;

    public b(i iVar, int i7) {
        this.f55975a = i7;
        this.f55976b = iVar;
    }

    @Override
    public final void run() {
        switch (this.f55975a) {
            case 0:
                i iVar = this.f55976b;
                ImageView imageView = iVar.f55999l;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    iVar.f55999l.setImageDrawable(null);
                    return;
                }
                return;
            case 1:
                i iVar2 = this.f55976b;
                if (iVar2.b() && iVar2.c()) {
                    boolean z9 = false;
                    float f10 = iVar2.M[0];
                    if (f10 >= iVar2.f56010x * 0.5f) {
                        z9 = true;
                    }
                    if (iVar2.f55991b.R(z9, f10, iVar2.G) && !iVar2.f56008u) {
                        iVar2.f56008u = true;
                        iVar2.o(true);
                        if (!iVar2.f56009w) {
                            iVar2.f56009w = true;
                            g0.i3(iVar2.P, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                g0.h3(new b(this.f55976b, 0));
                return;
            default:
                i iVar3 = this.f55976b;
                iVar3.getClass();
                g0.h3(new b(iVar3, 0));
                return;
        }
    }
}
