package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class yi0 implements View.OnClickListener {
    public final int f43439a;
    public final dj0 f43440b;

    public yi0(dj0 dj0Var, int i10) {
        this.f43439a = i10;
        this.f43440b = dj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43439a) {
            case 0:
                dj0 dj0Var = this.f43440b;
                cj0 cj0Var = dj0Var.f36246q0;
                HashSet hashSet = dj0Var.f36234d0;
                if (hashSet.size() != 0 && cj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : dj0Var.f36239i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f20426id))) {
                            arrayList.add(Long.valueOf(user.f20426id));
                        }
                    }
                    cj0Var.a(arrayList);
                    dj0Var.dismiss();
                    return;
                }
                return;
            default:
                dj0 dj0Var2 = this.f43440b;
                dj0Var2.f36234d0.clear();
                dj0Var2.Y.d.b(true);
                dj0Var2.V(true, false);
                return;
        }
    }
}
