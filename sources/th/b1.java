package th;

import java.util.ArrayList;
import org.telegram.ui.Components.ci0;
public final class b1 implements Runnable {
    public final int f48809a;
    public final d1 f48810b;

    public b1(d1 d1Var, int i10) {
        this.f48809a = i10;
        this.f48810b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f48809a) {
            case 0:
                d1 d1Var = this.f48810b;
                d1Var.invalidate();
                d1Var.b();
                return;
            default:
                ArrayList arrayList = this.f48810b.e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ci0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
