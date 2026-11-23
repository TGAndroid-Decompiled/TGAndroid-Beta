package yi;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import jb.m;
import org.telegram.messenger.ke;
import org.telegram.messenger.u0;
public final class c implements Runnable {
    public final int f61431a;
    public final j f61432b;
    public final h f61433c;

    public c(j jVar, h hVar, int i7) {
        this.f61431a = 4;
        this.f61432b = jVar;
        this.f61433c = hVar;
    }

    @Override
    public final void run() {
        File file;
        switch (this.f61431a) {
            case 0:
                j jVar = this.f61432b;
                h hVar = this.f61433c;
                jVar.f61451g.B0(hVar.f61442a, hVar.f61443b);
                return;
            case 1:
                j jVar2 = this.f61432b;
                h hVar2 = this.f61433c;
                m mVar = jVar2.f61451g;
                long j3 = hVar2.f61442a;
                mVar.getClass();
                return;
            case 2:
                j jVar3 = this.f61432b;
                h hVar3 = this.f61433c;
                jVar3.f61451g.B0(hVar3.f61442a, hVar3.f61443b);
                return;
            case 3:
                j jVar4 = this.f61432b;
                h hVar4 = this.f61433c;
                m mVar2 = jVar4.f61451g;
                long j10 = hVar4.f61442a;
                mVar2.getClass();
                return;
            default:
                j jVar5 = this.f61432b;
                h hVar5 = this.f61433c;
                m mVar3 = jVar5.f61451g;
                long j11 = hVar5.f61442a;
                synchronized (((e0.g) mVar3.f17465c).f10199f) {
                    file = (File) ((HashMap) ((e0.g) mVar3.f17465c).f10200g).remove(Long.valueOf(j11));
                }
                if (file != null) {
                    ((Handler) ((e0.g) mVar3.f17465c).d).post(new u0(mVar3, j11, (ke) mVar3.f17464b, file, 0));
                    return;
                }
                return;
        }
    }

    public c(j jVar, h hVar, long j3, long j10, int i7) {
        this.f61431a = i7;
        this.f61432b = jVar;
        this.f61433c = hVar;
    }

    public c(j jVar, h hVar, Exception exc) {
        this.f61431a = 3;
        this.f61432b = jVar;
        this.f61433c = hVar;
    }
}
