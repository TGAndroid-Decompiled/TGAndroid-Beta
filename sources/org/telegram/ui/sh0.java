package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class sh0 implements View.OnClickListener {
    public final int f41374a;
    public final uh0 f41375b;

    public sh0(uh0 uh0Var, int i10) {
        this.f41374a = i10;
        this.f41375b = uh0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41374a) {
            case 0:
                uh0 uh0Var = this.f41375b;
                th0 th0Var = uh0Var.f41951i2;
                HashSet hashSet = uh0Var.V1;
                if (hashSet.size() != 0 && th0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : uh0Var.a2.values()) {
                        if (hashSet.contains(Long.valueOf(user.f19943id))) {
                            arrayList.add(Long.valueOf(user.f19943id));
                        }
                    }
                    th0Var.a(arrayList);
                    uh0Var.dismiss();
                    return;
                }
                return;
            default:
                uh0 uh0Var2 = this.f41375b;
                uh0Var2.V1.clear();
                uh0Var2.Q1.d.b(true);
                uh0Var2.g1(true, false);
                return;
        }
    }
}
