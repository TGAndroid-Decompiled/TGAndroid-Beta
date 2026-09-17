package yh;

import java.util.ArrayList;
import org.telegram.ui.Components.yi0;
public final class d4 implements Runnable {
    public final int f47099a;
    public final e4 f47100b;

    public d4(e4 e4Var, int i10) {
        this.f47099a = i10;
        this.f47100b = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f47099a) {
            case 0:
                e4 e4Var = this.f47100b;
                e4Var.f47136r = false;
                e4Var.invalidate();
                e4Var.a();
                e4Var.c();
                return;
            case 1:
                this.f47100b.invalidate();
                return;
            default:
                e4 e4Var2 = this.f47100b;
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
