package zh;

import java.util.ArrayList;
import org.telegram.ui.Components.xi0;
public final class z3 implements Runnable {
    public final int f52913a;
    public final a4 f52914b;

    public z3(a4 a4Var, int i10) {
        this.f52913a = i10;
        this.f52914b = a4Var;
    }

    @Override
    public final void run() {
        switch (this.f52913a) {
            case 0:
                a4 a4Var = this.f52914b;
                a4Var.f51685r = false;
                a4Var.invalidate();
                a4Var.a();
                a4Var.c();
                return;
            case 1:
                this.f52914b.invalidate();
                return;
            default:
                a4 a4Var2 = this.f52914b;
                a4Var2.setMessageCell(null);
                ArrayList arrayList = a4Var2.J;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((xi0) obj).A(true);
                }
                arrayList.clear();
                return;
        }
    }
}
