package yh;

import java.util.ArrayList;
import org.telegram.ui.Components.ij0;
public final class a4 implements Runnable {
    public final int f47203a;
    public final b4 f47204b;

    public a4(b4 b4Var, int i10) {
        this.f47203a = i10;
        this.f47204b = b4Var;
    }

    @Override
    public final void run() {
        switch (this.f47203a) {
            case 0:
                b4 b4Var = this.f47204b;
                b4Var.f47231r = false;
                b4Var.invalidate();
                b4Var.a();
                b4Var.c();
                return;
            case 1:
                this.f47204b.invalidate();
                return;
            default:
                b4 b4Var2 = this.f47204b;
                b4Var2.setMessageCell(null);
                ArrayList arrayList = b4Var2.J;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ij0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
