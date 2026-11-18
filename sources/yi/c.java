package yi;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import org.telegram.messenger.ke;
import org.telegram.messenger.u0;
public final class c implements Runnable {
    public final int f61302a;
    public final j f61303b;
    public final h f61304c;

    public c(j jVar, h hVar, int i7) {
        this.f61302a = 4;
        this.f61303b = jVar;
        this.f61304c = hVar;
    }

    @Override
    public final void run() {
        File file;
        switch (this.f61302a) {
            case 0:
                j jVar = this.f61303b;
                h hVar = this.f61304c;
                jVar.f61322g.K0(hVar.f61313a, hVar.f61314b);
                return;
            case 1:
                j jVar2 = this.f61303b;
                h hVar2 = this.f61304c;
                k8.a aVar = jVar2.f61322g;
                long j3 = hVar2.f61313a;
                aVar.getClass();
                return;
            case 2:
                j jVar3 = this.f61303b;
                h hVar3 = this.f61304c;
                jVar3.f61322g.K0(hVar3.f61313a, hVar3.f61314b);
                return;
            case 3:
                j jVar4 = this.f61303b;
                h hVar4 = this.f61304c;
                k8.a aVar2 = jVar4.f61322g;
                long j10 = hVar4.f61313a;
                aVar2.getClass();
                return;
            default:
                j jVar5 = this.f61303b;
                h hVar5 = this.f61304c;
                k8.a aVar3 = jVar5.f61322g;
                long j11 = hVar5.f61313a;
                synchronized (((e0.g) aVar3.f18181c).f10206f) {
                    file = (File) ((HashMap) ((e0.g) aVar3.f18181c).f10207g).remove(Long.valueOf(j11));
                }
                if (file != null) {
                    ((Handler) ((e0.g) aVar3.f18181c).d).post(new u0(aVar3, j11, (ke) aVar3.f18180b, file, 0));
                    return;
                }
                return;
        }
    }

    public c(j jVar, h hVar, long j3, long j10, int i7) {
        this.f61302a = i7;
        this.f61303b = jVar;
        this.f61304c = hVar;
    }

    public c(j jVar, h hVar, Exception exc) {
        this.f61302a = 3;
        this.f61303b = jVar;
        this.f61304c = hVar;
    }
}
