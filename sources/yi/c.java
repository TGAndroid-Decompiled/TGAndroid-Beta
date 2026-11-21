package yi;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import org.telegram.messenger.ke;
import org.telegram.messenger.u0;
public final class c implements Runnable {
    public final int f61343a;
    public final j f61344b;
    public final h f61345c;

    public c(j jVar, h hVar, int i7) {
        this.f61343a = 4;
        this.f61344b = jVar;
        this.f61345c = hVar;
    }

    @Override
    public final void run() {
        File file;
        switch (this.f61343a) {
            case 0:
                j jVar = this.f61344b;
                h hVar = this.f61345c;
                jVar.f61363g.K0(hVar.f61354a, hVar.f61355b);
                return;
            case 1:
                j jVar2 = this.f61344b;
                h hVar2 = this.f61345c;
                k8.a aVar = jVar2.f61363g;
                long j3 = hVar2.f61354a;
                aVar.getClass();
                return;
            case 2:
                j jVar3 = this.f61344b;
                h hVar3 = this.f61345c;
                jVar3.f61363g.K0(hVar3.f61354a, hVar3.f61355b);
                return;
            case 3:
                j jVar4 = this.f61344b;
                h hVar4 = this.f61345c;
                k8.a aVar2 = jVar4.f61363g;
                long j10 = hVar4.f61354a;
                aVar2.getClass();
                return;
            default:
                j jVar5 = this.f61344b;
                h hVar5 = this.f61345c;
                k8.a aVar3 = jVar5.f61363g;
                long j11 = hVar5.f61354a;
                synchronized (((e0.g) aVar3.f18212c).f10235f) {
                    file = (File) ((HashMap) ((e0.g) aVar3.f18212c).f10236g).remove(Long.valueOf(j11));
                }
                if (file != null) {
                    ((Handler) ((e0.g) aVar3.f18212c).d).post(new u0(aVar3, j11, (ke) aVar3.f18211b, file, 0));
                    return;
                }
                return;
        }
    }

    public c(j jVar, h hVar, long j3, long j10, int i7) {
        this.f61343a = i7;
        this.f61344b = jVar;
        this.f61345c = hVar;
    }

    public c(j jVar, h hVar, Exception exc) {
        this.f61343a = 3;
        this.f61344b = jVar;
        this.f61345c = hVar;
    }
}
