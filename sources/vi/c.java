package vi;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import m4.d0;
import org.telegram.messenger.me;
import org.telegram.messenger.u0;
public final class c implements Runnable {
    public final int f57537a;
    public final h f57538b;
    public final g f57539c;

    public c(h hVar, g gVar, int i7) {
        this.f57537a = 4;
        this.f57538b = hVar;
        this.f57539c = gVar;
    }

    @Override
    public final void run() {
        File file;
        switch (this.f57537a) {
            case 0:
                h hVar = this.f57538b;
                g gVar = this.f57539c;
                hVar.f57557g.O(gVar.f57548a, gVar.f57549b);
                return;
            case 1:
                h hVar2 = this.f57538b;
                g gVar2 = this.f57539c;
                d0 d0Var = hVar2.f57557g;
                long j3 = gVar2.f57548a;
                d0Var.getClass();
                return;
            case 2:
                h hVar3 = this.f57538b;
                g gVar3 = this.f57539c;
                hVar3.f57557g.O(gVar3.f57548a, gVar3.f57549b);
                return;
            case 3:
                h hVar4 = this.f57538b;
                g gVar4 = this.f57539c;
                d0 d0Var2 = hVar4.f57557g;
                long j10 = gVar4.f57548a;
                d0Var2.getClass();
                return;
            default:
                h hVar5 = this.f57538b;
                g gVar5 = this.f57539c;
                d0 d0Var3 = hVar5.f57557g;
                long j11 = gVar5.f57548a;
                synchronized (((e0.g) d0Var3.f19617b).f10060f) {
                    file = (File) ((HashMap) ((e0.g) d0Var3.f19617b).f10061g).remove(Long.valueOf(j11));
                }
                if (file != null) {
                    ((Handler) ((e0.g) d0Var3.f19617b).d).post(new u0(d0Var3, j11, (me) d0Var3.f19616a, file, 0));
                    return;
                }
                return;
        }
    }

    public c(h hVar, g gVar, long j3, long j10, int i7) {
        this.f57537a = i7;
        this.f57538b = hVar;
        this.f57539c = gVar;
    }

    public c(h hVar, g gVar, Exception exc) {
        this.f57537a = 3;
        this.f57538b = hVar;
        this.f57539c = gVar;
    }
}
