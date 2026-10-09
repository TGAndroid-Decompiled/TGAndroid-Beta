package yh;

import java.util.ArrayList;
import org.telegram.ui.Components.ck0;
public final class v3 implements Runnable {
    public final int f53307a;
    public final w3 f53308b;

    public v3(w3 w3Var, int i10) {
        this.f53307a = i10;
        this.f53308b = w3Var;
    }

    @Override
    public final void run() {
        switch (this.f53307a) {
            case 0:
                w3 w3Var = this.f53308b;
                w3Var.f53335r = false;
                w3Var.invalidate();
                w3Var.a();
                w3Var.c();
                return;
            case 1:
                this.f53308b.invalidate();
                return;
            default:
                w3 w3Var2 = this.f53308b;
                w3Var2.setMessageCell(null);
                ArrayList arrayList = w3Var2.J;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ck0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
