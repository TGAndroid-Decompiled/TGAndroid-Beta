package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class vi0 implements View.OnClickListener {
    public final int f43498a;
    public final bj0 f43499b;

    public vi0(bj0 bj0Var, int i9) {
        this.f43498a = i9;
        this.f43499b = bj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43498a) {
            case 0:
                bj0 bj0Var = this.f43499b;
                aj0 aj0Var = bj0Var.m0;
                HashSet hashSet = bj0Var.Z;
                if (hashSet.size() != 0 && aj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : bj0Var.f36883e0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f22527id))) {
                            arrayList.add(Long.valueOf(user.f22527id));
                        }
                    }
                    aj0Var.a(arrayList);
                    bj0Var.dismiss();
                    return;
                }
                return;
            default:
                bj0 bj0Var2 = this.f43499b;
                bj0Var2.Z.clear();
                bj0Var2.U.d.b(true);
                bj0Var2.T(true, false);
                return;
        }
    }
}
