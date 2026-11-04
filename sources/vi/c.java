package vi;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import m2.t;
import org.telegram.messenger.ge;
import org.telegram.messenger.u0;
public final class c implements Runnable {
    public final int f56963a;
    public final j f56964b;
    public final i f56965c;

    public c(j jVar, i iVar, int i3) {
        this.f56963a = 4;
        this.f56964b = jVar;
        this.f56965c = iVar;
    }

    @Override
    public final void run() {
        File file;
        switch (this.f56963a) {
            case 0:
                j jVar = this.f56964b;
                i iVar = this.f56965c;
                jVar.f56986g.C0(iVar.f56977a, iVar.f56978b);
                return;
            case 1:
                j jVar2 = this.f56964b;
                i iVar2 = this.f56965c;
                t tVar = jVar2.f56986g;
                long j10 = iVar2.f56977a;
                tVar.getClass();
                return;
            case 2:
                j jVar3 = this.f56964b;
                i iVar3 = this.f56965c;
                jVar3.f56986g.C0(iVar3.f56977a, iVar3.f56978b);
                return;
            case 3:
                j jVar4 = this.f56964b;
                i iVar4 = this.f56965c;
                t tVar2 = jVar4.f56986g;
                long j11 = iVar4.f56977a;
                tVar2.getClass();
                return;
            default:
                j jVar5 = this.f56964b;
                i iVar5 = this.f56965c;
                t tVar3 = jVar5.f56986g;
                long j12 = iVar5.f56977a;
                synchronized (((e0.g) tVar3.f19007c).f9237f) {
                    file = (File) ((HashMap) ((e0.g) tVar3.f19007c).f9238g).remove(Long.valueOf(j12));
                }
                if (file != null) {
                    ((Handler) ((e0.g) tVar3.f19007c).d).post(new u0(tVar3, j12, (ge) tVar3.f19006b, file, 0));
                    return;
                }
                return;
        }
    }

    public c(j jVar, i iVar, long j10, long j11, int i3) {
        this.f56963a = i3;
        this.f56964b = jVar;
        this.f56965c = iVar;
    }

    public c(j jVar, i iVar, Exception exc) {
        this.f56963a = 3;
        this.f56964b = jVar;
        this.f56965c = iVar;
    }
}
