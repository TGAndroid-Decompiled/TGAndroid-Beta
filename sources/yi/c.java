package yi;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import org.telegram.messenger.le;
import org.telegram.messenger.u0;
public final class c implements Runnable {
    public final int f61312a;
    public final j f61313b;
    public final h f61314c;

    public c(j jVar, h hVar, int i7) {
        this.f61312a = 4;
        this.f61313b = jVar;
        this.f61314c = hVar;
    }

    @Override
    public final void run() {
        File file;
        switch (this.f61312a) {
            case 0:
                j jVar = this.f61313b;
                h hVar = this.f61314c;
                jVar.f61332g.K0(hVar.f61323a, hVar.f61324b);
                return;
            case 1:
                j jVar2 = this.f61313b;
                h hVar2 = this.f61314c;
                k8.a aVar = jVar2.f61332g;
                long j3 = hVar2.f61323a;
                aVar.getClass();
                return;
            case 2:
                j jVar3 = this.f61313b;
                h hVar3 = this.f61314c;
                jVar3.f61332g.K0(hVar3.f61323a, hVar3.f61324b);
                return;
            case 3:
                j jVar4 = this.f61313b;
                h hVar4 = this.f61314c;
                k8.a aVar2 = jVar4.f61332g;
                long j10 = hVar4.f61323a;
                aVar2.getClass();
                return;
            default:
                j jVar5 = this.f61313b;
                h hVar5 = this.f61314c;
                k8.a aVar3 = jVar5.f61332g;
                long j11 = hVar5.f61323a;
                synchronized (((e0.g) aVar3.f18178c).f10201f) {
                    file = (File) ((HashMap) ((e0.g) aVar3.f18178c).f10202g).remove(Long.valueOf(j11));
                }
                if (file != null) {
                    ((Handler) ((e0.g) aVar3.f18178c).d).post(new u0(aVar3, j11, (le) aVar3.f18177b, file, 0));
                    return;
                }
                return;
        }
    }

    public c(j jVar, h hVar, long j3, long j10, int i7) {
        this.f61312a = i7;
        this.f61313b = jVar;
        this.f61314c = hVar;
    }

    public c(j jVar, h hVar, Exception exc) {
        this.f61312a = 3;
        this.f61313b = jVar;
        this.f61314c = hVar;
    }
}
