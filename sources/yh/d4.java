package yh;

import java.util.ArrayList;
import org.telegram.ui.Components.yi0;
public final class d4 implements Runnable {
    public final int f47104a;
    public final e4 f47105b;

    public d4(e4 e4Var, int i10) {
        this.f47104a = i10;
        this.f47105b = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f47104a) {
            case 0:
                e4 e4Var = this.f47105b;
                e4Var.f47141r = false;
                e4Var.invalidate();
                e4Var.a();
                e4Var.c();
                return;
            case 1:
                this.f47105b.invalidate();
                return;
            default:
                e4 e4Var2 = this.f47105b;
                e4Var2.setMessageCell(null);
                ArrayList arrayList = e4Var2.J;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((yi0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
