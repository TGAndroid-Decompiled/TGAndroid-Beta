package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class xi0 implements View.OnClickListener {
    public final int f43135a;
    public final cj0 f43136b;

    public xi0(cj0 cj0Var, int i10) {
        this.f43135a = i10;
        this.f43136b = cj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43135a) {
            case 0:
                cj0 cj0Var = this.f43136b;
                bj0 bj0Var = cj0Var.f35931q0;
                HashSet hashSet = cj0Var.f35919d0;
                if (hashSet.size() != 0 && bj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : cj0Var.f35924i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f20419id))) {
                            arrayList.add(Long.valueOf(user.f20419id));
                        }
                    }
                    bj0Var.a(arrayList);
                    cj0Var.dismiss();
                    return;
                }
                return;
            default:
                cj0 cj0Var2 = this.f43136b;
                cj0Var2.f35919d0.clear();
                cj0Var2.Y.d.b(true);
                cj0Var2.V(true, false);
                return;
        }
    }
}
