package zh;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class t implements Runnable {
    public final int f48876a;
    public final m0 f48877b;

    public t(m0 m0Var, int i10) {
        this.f48876a = i10;
        this.f48877b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f48876a) {
            case 0:
                this.f48877b.b();
                return;
            default:
                m0 m0Var = this.f48877b;
                ArrayList arrayList = m0Var.f48674s;
                t tVar = m0Var.E;
                if (tVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(tVar);
                    m0Var.E = null;
                }
                int currentTime = ConnectionsManager.getInstance(m0Var.N).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    l0 l0Var = (l0) arrayList.get(size);
                    ArrayList arrayList2 = l0Var.f48634f;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            k0 k0Var = (k0) obj;
                            long j3 = k0Var.f48579g;
                            if (j3 <= 0 || currentTime - k0Var.d > o.b(l0Var.f48631a, (int) j3, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new sg.p(m0Var, 21));
                m0Var.f48672n.N(true);
                m0Var.u(true);
                m0Var.m();
                return;
        }
    }
}
