package yh;

import java.util.ArrayList;
import org.telegram.ui.Components.jj0;
public final class a4 implements Runnable {
    public final int f47202a;
    public final b4 f47203b;

    public a4(b4 b4Var, int i10) {
        this.f47202a = i10;
        this.f47203b = b4Var;
    }

    @Override
    public final void run() {
        switch (this.f47202a) {
            case 0:
                b4 b4Var = this.f47203b;
                b4Var.f47230r = false;
                b4Var.invalidate();
                b4Var.a();
                b4Var.c();
                return;
            case 1:
                this.f47203b.invalidate();
                return;
            default:
                b4 b4Var2 = this.f47203b;
                b4Var2.setMessageCell(null);
                ArrayList arrayList = b4Var2.J;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((jj0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
