package yh;

import java.util.ArrayList;
import org.telegram.ui.Components.yi0;
public final class b4 implements Runnable {
    public final int f46921a;
    public final c4 f46922b;

    public b4(c4 c4Var, int i10) {
        this.f46921a = i10;
        this.f46922b = c4Var;
    }

    @Override
    public final void run() {
        switch (this.f46921a) {
            case 0:
                c4 c4Var = this.f46922b;
                c4Var.f46949r = false;
                c4Var.invalidate();
                c4Var.a();
                c4Var.c();
                return;
            case 1:
                this.f46922b.invalidate();
                return;
            default:
                c4 c4Var2 = this.f46922b;
                c4Var2.setMessageCell(null);
                ArrayList arrayList = c4Var2.J;
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
