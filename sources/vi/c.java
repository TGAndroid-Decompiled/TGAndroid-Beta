package vi;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import m4.d0;
import org.telegram.messenger.me;
import org.telegram.messenger.u0;
public final class c implements Runnable {
    public final int f57433a;
    public final h f57434b;
    public final g f57435c;

    public c(h hVar, g gVar, int i7) {
        this.f57433a = 4;
        this.f57434b = hVar;
        this.f57435c = gVar;
    }

    @Override
    public final void run() {
        File file;
        switch (this.f57433a) {
            case 0:
                h hVar = this.f57434b;
                g gVar = this.f57435c;
                hVar.f57453g.O(gVar.f57444a, gVar.f57445b);
                return;
            case 1:
                h hVar2 = this.f57434b;
                g gVar2 = this.f57435c;
                d0 d0Var = hVar2.f57453g;
                long j3 = gVar2.f57444a;
                d0Var.getClass();
                return;
            case 2:
                h hVar3 = this.f57434b;
                g gVar3 = this.f57435c;
                hVar3.f57453g.O(gVar3.f57444a, gVar3.f57445b);
                return;
            case 3:
                h hVar4 = this.f57434b;
                g gVar4 = this.f57435c;
                d0 d0Var2 = hVar4.f57453g;
                long j10 = gVar4.f57444a;
                d0Var2.getClass();
                return;
            default:
                h hVar5 = this.f57434b;
                g gVar5 = this.f57435c;
                d0 d0Var3 = hVar5.f57453g;
                long j11 = gVar5.f57444a;
                synchronized (((e0.g) d0Var3.f19609b).f10055f) {
                    file = (File) ((HashMap) ((e0.g) d0Var3.f19609b).f10056g).remove(Long.valueOf(j11));
                }
                if (file != null) {
                    ((Handler) ((e0.g) d0Var3.f19609b).d).post(new u0(d0Var3, j11, (me) d0Var3.f19608a, file, 0));
                    return;
                }
                return;
        }
    }

    public c(h hVar, g gVar, long j3, long j10, int i7) {
        this.f57433a = i7;
        this.f57434b = hVar;
        this.f57435c = gVar;
    }

    public c(h hVar, g gVar, Exception exc) {
        this.f57433a = 3;
        this.f57434b = hVar;
        this.f57435c = gVar;
    }
}
