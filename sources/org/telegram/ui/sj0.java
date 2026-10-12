package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class sj0 implements View.OnClickListener {
    public final int f40158a;
    public final xj0 f40159b;

    public sj0(xj0 xj0Var, int i10) {
        this.f40158a = i10;
        this.f40159b = xj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40158a) {
            case 0:
                xj0 xj0Var = this.f40159b;
                wj0 wj0Var = xj0Var.f41885q0;
                HashSet hashSet = xj0Var.f41873d0;
                if (hashSet.size() != 0 && wj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : xj0Var.f41878i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f19363id))) {
                            arrayList.add(Long.valueOf(user.f19363id));
                        }
                    }
                    wj0Var.a(arrayList);
                    xj0Var.dismiss();
                    return;
                }
                return;
            default:
                xj0 xj0Var2 = this.f40159b;
                xj0Var2.f41873d0.clear();
                xj0Var2.Y.d.b(true);
                xj0Var2.V(true, false);
                return;
        }
    }
}
