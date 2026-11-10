package ti;

import android.widget.ImageView;
import org.telegram.messenger.g0;
public final class b implements Runnable {
    public final int f56078a;
    public final i f56079b;

    public b(i iVar, int i7) {
        this.f56078a = i7;
        this.f56079b = iVar;
    }

    @Override
    public final void run() {
        switch (this.f56078a) {
            case 0:
                i iVar = this.f56079b;
                ImageView imageView = iVar.f56102l;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    iVar.f56102l.setImageDrawable(null);
                    return;
                }
                return;
            case 1:
                i iVar2 = this.f56079b;
                if (iVar2.b() && iVar2.c()) {
                    boolean z9 = false;
                    float f10 = iVar2.M[0];
                    if (f10 >= iVar2.f56113x * 0.5f) {
                        z9 = true;
                    }
                    if (iVar2.f56094b.R(z9, f10, iVar2.G) && !iVar2.f56111u) {
                        iVar2.f56111u = true;
                        iVar2.o(true);
                        if (!iVar2.f56112w) {
                            iVar2.f56112w = true;
                            g0.i3(iVar2.P, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                g0.h3(new b(this.f56079b, 0));
                return;
            default:
                i iVar3 = this.f56079b;
                iVar3.getClass();
                g0.h3(new b(iVar3, 0));
                return;
        }
    }
}
