package vi;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import m4.d0;
import org.telegram.messenger.me;
import org.telegram.messenger.u0;
public final class c implements Runnable {
    public final int f57409a;
    public final h f57410b;
    public final g f57411c;

    public c(h hVar, g gVar, int i7) {
        this.f57409a = 4;
        this.f57410b = hVar;
        this.f57411c = gVar;
    }

    @Override
    public final void run() {
        File file;
        switch (this.f57409a) {
            case 0:
                h hVar = this.f57410b;
                g gVar = this.f57411c;
                hVar.f57429g.O(gVar.f57420a, gVar.f57421b);
                return;
            case 1:
                h hVar2 = this.f57410b;
                g gVar2 = this.f57411c;
                d0 d0Var = hVar2.f57429g;
                long j3 = gVar2.f57420a;
                d0Var.getClass();
                return;
            case 2:
                h hVar3 = this.f57410b;
                g gVar3 = this.f57411c;
                hVar3.f57429g.O(gVar3.f57420a, gVar3.f57421b);
                return;
            case 3:
                h hVar4 = this.f57410b;
                g gVar4 = this.f57411c;
                d0 d0Var2 = hVar4.f57429g;
                long j10 = gVar4.f57420a;
                d0Var2.getClass();
                return;
            default:
                h hVar5 = this.f57410b;
                g gVar5 = this.f57411c;
                d0 d0Var3 = hVar5.f57429g;
                long j11 = gVar5.f57420a;
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
        this.f57409a = i7;
        this.f57410b = hVar;
        this.f57411c = gVar;
    }

    public c(h hVar, g gVar, Exception exc) {
        this.f57409a = 3;
        this.f57410b = hVar;
        this.f57411c = gVar;
    }
}
