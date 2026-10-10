package yh;

import java.util.ArrayList;
import org.telegram.ui.Components.dk0;
public final class v3 implements Runnable {
    public final int f53353a;
    public final w3 f53354b;

    public v3(w3 w3Var, int i10) {
        this.f53353a = i10;
        this.f53354b = w3Var;
    }

    @Override
    public final void run() {
        switch (this.f53353a) {
            case 0:
                w3 w3Var = this.f53354b;
                w3Var.f53381r = false;
                w3Var.invalidate();
                w3Var.a();
                w3Var.c();
                return;
            case 1:
                this.f53354b.invalidate();
                return;
            default:
                w3 w3Var2 = this.f53354b;
                w3Var2.setMessageCell(null);
                ArrayList arrayList = w3Var2.J;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((dk0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
