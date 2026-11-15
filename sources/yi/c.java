package yi;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import org.telegram.messenger.le;
import org.telegram.messenger.u0;
public final class c implements Runnable {
    public final int f60734a;
    public final j f60735b;
    public final i f60736c;

    public c(j jVar, i iVar, int i7) {
        this.f60734a = 4;
        this.f60735b = jVar;
        this.f60736c = iVar;
    }

    @Override
    public final void run() {
        File file;
        switch (this.f60734a) {
            case 0:
                j jVar = this.f60735b;
                i iVar = this.f60736c;
                jVar.f60757g.P0(iVar.f60748a, iVar.f60749b);
                return;
            case 1:
                j jVar2 = this.f60735b;
                i iVar2 = this.f60736c;
                k8.a aVar = jVar2.f60757g;
                long j3 = iVar2.f60748a;
                aVar.getClass();
                return;
            case 2:
                j jVar3 = this.f60735b;
                i iVar3 = this.f60736c;
                jVar3.f60757g.P0(iVar3.f60748a, iVar3.f60749b);
                return;
            case 3:
                j jVar4 = this.f60735b;
                i iVar4 = this.f60736c;
                k8.a aVar2 = jVar4.f60757g;
                long j10 = iVar4.f60748a;
                aVar2.getClass();
                return;
            default:
                j jVar5 = this.f60735b;
                i iVar5 = this.f60736c;
                k8.a aVar3 = jVar5.f60757g;
                long j11 = iVar5.f60748a;
                synchronized (((e0.g) aVar3.f17789c).f9891f) {
                    file = (File) ((HashMap) ((e0.g) aVar3.f17789c).f9892g).remove(Long.valueOf(j11));
                }
                if (file != null) {
                    ((Handler) ((e0.g) aVar3.f17789c).d).post(new u0(aVar3, j11, (le) aVar3.f17788b, file, 0));
                    return;
                }
                return;
        }
    }

    public c(j jVar, i iVar, long j3, long j10, int i7) {
        this.f60734a = i7;
        this.f60735b = jVar;
        this.f60736c = iVar;
    }

    public c(j jVar, i iVar, Exception exc) {
        this.f60734a = 3;
        this.f60735b = jVar;
        this.f60736c = iVar;
    }
}
