package yi;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import org.telegram.messenger.le;
import org.telegram.messenger.u0;
public final class c implements Runnable {
    public final int f61347a;
    public final j f61348b;
    public final h f61349c;

    public c(j jVar, h hVar, int i7) {
        this.f61347a = 4;
        this.f61348b = jVar;
        this.f61349c = hVar;
    }

    @Override
    public final void run() {
        File file;
        switch (this.f61347a) {
            case 0:
                j jVar = this.f61348b;
                h hVar = this.f61349c;
                jVar.f61367g.K0(hVar.f61358a, hVar.f61359b);
                return;
            case 1:
                j jVar2 = this.f61348b;
                h hVar2 = this.f61349c;
                k8.a aVar = jVar2.f61367g;
                long j3 = hVar2.f61358a;
                aVar.getClass();
                return;
            case 2:
                j jVar3 = this.f61348b;
                h hVar3 = this.f61349c;
                jVar3.f61367g.K0(hVar3.f61358a, hVar3.f61359b);
                return;
            case 3:
                j jVar4 = this.f61348b;
                h hVar4 = this.f61349c;
                k8.a aVar2 = jVar4.f61367g;
                long j10 = hVar4.f61358a;
                aVar2.getClass();
                return;
            default:
                j jVar5 = this.f61348b;
                h hVar5 = this.f61349c;
                k8.a aVar3 = jVar5.f61367g;
                long j11 = hVar5.f61358a;
                synchronized (((e0.g) aVar3.f18215c).f10238f) {
                    file = (File) ((HashMap) ((e0.g) aVar3.f18215c).f10239g).remove(Long.valueOf(j11));
                }
                if (file != null) {
                    ((Handler) ((e0.g) aVar3.f18215c).d).post(new u0(aVar3, j11, (le) aVar3.f18214b, file, 0));
                    return;
                }
                return;
        }
    }

    public c(j jVar, h hVar, long j3, long j10, int i7) {
        this.f61347a = i7;
        this.f61348b = jVar;
        this.f61349c = hVar;
    }

    public c(j jVar, h hVar, Exception exc) {
        this.f61347a = 3;
        this.f61348b = jVar;
        this.f61349c = hVar;
    }
}
