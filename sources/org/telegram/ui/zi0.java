package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class zi0 implements View.OnClickListener {
    public final int f44114a;
    public final ej0 f44115b;

    public zi0(ej0 ej0Var, int i10) {
        this.f44114a = i10;
        this.f44115b = ej0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44114a) {
            case 0:
                ej0 ej0Var = this.f44115b;
                dj0 dj0Var = ej0Var.f36937q0;
                HashSet hashSet = ej0Var.f36925d0;
                if (hashSet.size() != 0 && dj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : ej0Var.f36930i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f20491id))) {
                            arrayList.add(Long.valueOf(user.f20491id));
                        }
                    }
                    dj0Var.a(arrayList);
                    ej0Var.dismiss();
                    return;
                }
                return;
            default:
                ej0 ej0Var2 = this.f44115b;
                ej0Var2.f36925d0.clear();
                ej0Var2.Y.d.b(true);
                ej0Var2.U(true, false);
                return;
        }
    }
}
