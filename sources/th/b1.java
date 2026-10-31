package th;

import java.util.ArrayList;
import org.telegram.ui.Components.bi0;
public final class b1 implements Runnable {
    public final int f48795a;
    public final d1 f48796b;

    public b1(d1 d1Var, int i10) {
        this.f48795a = i10;
        this.f48796b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f48795a) {
            case 0:
                d1 d1Var = this.f48796b;
                d1Var.invalidate();
                d1Var.b();
                return;
            default:
                ArrayList arrayList = this.f48796b.e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((bi0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
