package zh;

import java.util.ArrayList;
import org.telegram.ui.Components.hj0;
public final class c1 implements Runnable {
    public final int f48318a;
    public final e1 f48319b;

    public c1(e1 e1Var, int i10) {
        this.f48318a = i10;
        this.f48319b = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f48318a) {
            case 0:
                e1 e1Var = this.f48319b;
                e1Var.invalidate();
                e1Var.b();
                return;
            default:
                ArrayList arrayList = this.f48319b.e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((hj0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
