package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class xi0 implements View.OnClickListener {
    public final int f45779a;
    public final cj0 f45780b;

    public xi0(cj0 cj0Var, int i10) {
        this.f45779a = i10;
        this.f45780b = cj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45779a) {
            case 0:
                cj0 cj0Var = this.f45780b;
                bj0 bj0Var = cj0Var.f38490q0;
                HashSet hashSet = cj0Var.f38478d0;
                if (hashSet.size() != 0 && bj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : cj0Var.f38483i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f22176id))) {
                            arrayList.add(Long.valueOf(user.f22176id));
                        }
                    }
                    bj0Var.a(arrayList);
                    cj0Var.dismiss();
                    return;
                }
                return;
            default:
                cj0 cj0Var2 = this.f45780b;
                cj0Var2.f38478d0.clear();
                cj0Var2.Y.d.b(true);
                cj0Var2.U(true, false);
                return;
        }
    }
}
