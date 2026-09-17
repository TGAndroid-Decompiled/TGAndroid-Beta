package zh;

import java.util.ArrayList;
import org.telegram.ui.Components.xi0;
public final class z3 implements Runnable {
    public final int f52944a;
    public final a4 f52945b;

    public z3(a4 a4Var, int i10) {
        this.f52944a = i10;
        this.f52945b = a4Var;
    }

    @Override
    public final void run() {
        switch (this.f52944a) {
            case 0:
                a4 a4Var = this.f52945b;
                a4Var.f51716r = false;
                a4Var.invalidate();
                a4Var.a();
                a4Var.c();
                return;
            case 1:
                this.f52945b.invalidate();
                return;
            default:
                a4 a4Var2 = this.f52945b;
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
