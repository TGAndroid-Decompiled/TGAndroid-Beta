package rh;

import java.util.ArrayList;
import org.telegram.ui.Components.bi0;
public final class h4 implements Runnable {
    public final int f47000a;
    public final i4 f47001b;

    public h4(i4 i4Var, int i10) {
        this.f47000a = i10;
        this.f47001b = i4Var;
    }

    @Override
    public final void run() {
        switch (this.f47000a) {
            case 0:
                i4 i4Var = this.f47001b;
                i4Var.f47090r = false;
                i4Var.invalidate();
                i4Var.a();
                i4Var.c();
                return;
            case 1:
                this.f47001b.invalidate();
                return;
            default:
                i4 i4Var2 = this.f47001b;
                i4Var2.setMessageCell(null);
                ArrayList arrayList = i4Var2.J;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((bi0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
