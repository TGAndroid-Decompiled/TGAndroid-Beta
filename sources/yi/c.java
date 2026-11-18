package yi;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import org.telegram.messenger.ke;
import org.telegram.messenger.u0;
public final class c implements Runnable {
    public final int f61301a;
    public final j f61302b;
    public final h f61303c;

    public c(j jVar, h hVar, int i7) {
        this.f61301a = 4;
        this.f61302b = jVar;
        this.f61303c = hVar;
    }

    @Override
    public final void run() {
        File file;
        switch (this.f61301a) {
            case 0:
                j jVar = this.f61302b;
                h hVar = this.f61303c;
                jVar.f61321g.K0(hVar.f61312a, hVar.f61313b);
                return;
            case 1:
                j jVar2 = this.f61302b;
                h hVar2 = this.f61303c;
                k8.a aVar = jVar2.f61321g;
                long j3 = hVar2.f61312a;
                aVar.getClass();
                return;
            case 2:
                j jVar3 = this.f61302b;
                h hVar3 = this.f61303c;
                jVar3.f61321g.K0(hVar3.f61312a, hVar3.f61313b);
                return;
            case 3:
                j jVar4 = this.f61302b;
                h hVar4 = this.f61303c;
                k8.a aVar2 = jVar4.f61321g;
                long j10 = hVar4.f61312a;
                aVar2.getClass();
                return;
            default:
                j jVar5 = this.f61302b;
                h hVar5 = this.f61303c;
                k8.a aVar3 = jVar5.f61321g;
                long j11 = hVar5.f61312a;
                synchronized (((e0.g) aVar3.f18184c).f10209f) {
                    file = (File) ((HashMap) ((e0.g) aVar3.f18184c).f10210g).remove(Long.valueOf(j11));
                }
                if (file != null) {
                    ((Handler) ((e0.g) aVar3.f18184c).d).post(new u0(aVar3, j11, (ke) aVar3.f18183b, file, 0));
                    return;
                }
                return;
        }
    }

    public c(j jVar, h hVar, long j3, long j10, int i7) {
        this.f61301a = i7;
        this.f61302b = jVar;
        this.f61303c = hVar;
    }

    public c(j jVar, h hVar, Exception exc) {
        this.f61301a = 3;
        this.f61302b = jVar;
        this.f61303c = hVar;
    }
}
