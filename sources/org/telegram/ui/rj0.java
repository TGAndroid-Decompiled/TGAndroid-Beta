package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class rj0 implements View.OnClickListener {
    public final int f39532a;
    public final wj0 f39533b;

    public rj0(wj0 wj0Var, int i10) {
        this.f39532a = i10;
        this.f39533b = wj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39532a) {
            case 0:
                wj0 wj0Var = this.f39533b;
                vj0 vj0Var = wj0Var.f41315q0;
                HashSet hashSet = wj0Var.f41303d0;
                if (hashSet.size() != 0 && vj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : wj0Var.f41308i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f19063id))) {
                            arrayList.add(Long.valueOf(user.f19063id));
                        }
                    }
                    vj0Var.a(arrayList);
                    wj0Var.dismiss();
                    return;
                }
                return;
            default:
                wj0 wj0Var2 = this.f39533b;
                wj0Var2.f41303d0.clear();
                wj0Var2.Y.d.b(true);
                wj0Var2.V(true, false);
                return;
        }
    }
}
