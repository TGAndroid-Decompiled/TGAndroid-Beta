package yh;

import java.util.ArrayList;
import org.telegram.ui.Components.xi0;
public final class c4 implements Runnable {
    public final int f46985a;
    public final d4 f46986b;

    public c4(d4 d4Var, int i10) {
        this.f46985a = i10;
        this.f46986b = d4Var;
    }

    @Override
    public final void run() {
        switch (this.f46985a) {
            case 0:
                d4 d4Var = this.f46986b;
                d4Var.f47013r = false;
                d4Var.invalidate();
                d4Var.a();
                d4Var.c();
                return;
            case 1:
                this.f46986b.invalidate();
                return;
            default:
                d4 d4Var2 = this.f46986b;
                d4Var2.setMessageCell(null);
                ArrayList arrayList = d4Var2.J;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((xi0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
