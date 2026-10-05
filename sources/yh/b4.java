package yh;

import java.util.ArrayList;
import org.telegram.ui.Components.kj0;
public final class b4 implements Runnable {
    public final int f51147a;
    public final c4 f51148b;

    public b4(c4 c4Var, int i10) {
        this.f51147a = i10;
        this.f51148b = c4Var;
    }

    @Override
    public final void run() {
        switch (this.f51147a) {
            case 0:
                c4 c4Var = this.f51148b;
                c4Var.f51189r = false;
                c4Var.invalidate();
                c4Var.a();
                c4Var.c();
                return;
            case 1:
                this.f51148b.invalidate();
                return;
            default:
                c4 c4Var2 = this.f51148b;
                c4Var2.setMessageCell(null);
                ArrayList arrayList = c4Var2.J;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((kj0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
