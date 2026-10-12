package zh;

import java.util.ArrayList;
import org.telegram.ui.Components.yj0;
public final class u3 implements Runnable {
    public final int f51215a;
    public final v3 f51216b;

    public u3(v3 v3Var, int i10) {
        this.f51215a = i10;
        this.f51216b = v3Var;
    }

    @Override
    public final void run() {
        switch (this.f51215a) {
            case 0:
                v3 v3Var = this.f51216b;
                v3Var.f51241r = false;
                v3Var.invalidate();
                v3Var.a();
                v3Var.c();
                return;
            case 1:
                this.f51216b.invalidate();
                return;
            default:
                v3 v3Var2 = this.f51216b;
                v3Var2.setMessageCell(null);
                ArrayList arrayList = v3Var2.J;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((yj0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
