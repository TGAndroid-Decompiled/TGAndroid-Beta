package vi;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import m4.d0;
import org.telegram.messenger.me;
import org.telegram.messenger.u0;
public final class c implements Runnable {
    public final int f57525a;
    public final h f57526b;
    public final g f57527c;

    public c(h hVar, g gVar, int i7) {
        this.f57525a = 4;
        this.f57526b = hVar;
        this.f57527c = gVar;
    }

    @Override
    public final void run() {
        File file;
        switch (this.f57525a) {
            case 0:
                h hVar = this.f57526b;
                g gVar = this.f57527c;
                hVar.f57545g.O(gVar.f57536a, gVar.f57537b);
                return;
            case 1:
                h hVar2 = this.f57526b;
                g gVar2 = this.f57527c;
                d0 d0Var = hVar2.f57545g;
                long j3 = gVar2.f57536a;
                d0Var.getClass();
                return;
            case 2:
                h hVar3 = this.f57526b;
                g gVar3 = this.f57527c;
                hVar3.f57545g.O(gVar3.f57536a, gVar3.f57537b);
                return;
            case 3:
                h hVar4 = this.f57526b;
                g gVar4 = this.f57527c;
                d0 d0Var2 = hVar4.f57545g;
                long j10 = gVar4.f57536a;
                d0Var2.getClass();
                return;
            default:
                h hVar5 = this.f57526b;
                g gVar5 = this.f57527c;
                d0 d0Var3 = hVar5.f57545g;
                long j11 = gVar5.f57536a;
                synchronized (((e0.g) d0Var3.f19612b).f10055f) {
                    file = (File) ((HashMap) ((e0.g) d0Var3.f19612b).f10056g).remove(Long.valueOf(j11));
                }
                if (file != null) {
                    ((Handler) ((e0.g) d0Var3.f19612b).d).post(new u0(d0Var3, j11, (me) d0Var3.f19611a, file, 0));
                    return;
                }
                return;
        }
    }

    public c(h hVar, g gVar, long j3, long j10, int i7) {
        this.f57525a = i7;
        this.f57526b = hVar;
        this.f57527c = gVar;
    }

    public c(h hVar, g gVar, Exception exc) {
        this.f57525a = 3;
        this.f57526b = hVar;
        this.f57527c = gVar;
    }
}
