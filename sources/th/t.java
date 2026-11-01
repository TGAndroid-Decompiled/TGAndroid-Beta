package th;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.dx0;
public final class t implements Runnable {
    public final int f49465a;
    public final j0 f49466b;

    public t(j0 j0Var, int i10) {
        this.f49465a = i10;
        this.f49466b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f49465a) {
            case 0:
                this.f49466b.b();
                return;
            default:
                j0 j0Var = this.f49466b;
                ArrayList arrayList = j0Var.f49106s;
                t tVar = j0Var.E;
                if (tVar != null) {
                    org.telegram.messenger.i0.r(tVar);
                    j0Var.E = null;
                }
                int currentTime = ConnectionsManager.getInstance(j0Var.N).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    i0 i0Var = (i0) arrayList.get(size);
                    ArrayList arrayList2 = i0Var.f49068f;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            h0 h0Var = (h0) obj;
                            long j10 = h0Var.f49024g;
                            if (j10 <= 0 || currentTime - h0Var.d > o.b(i0Var.f49065a, (int) j10, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new dx0(j0Var, 19));
                j0Var.f49104n.O(true);
                j0Var.u(true);
                j0Var.m();
                return;
        }
    }
}
