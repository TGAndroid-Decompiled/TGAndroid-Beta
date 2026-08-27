package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

public final class xi0 implements View.OnClickListener {

    public final int f44472a;

    public final dj0 f44473b;

    public xi0(dj0 dj0Var, int i10) {
        this.f44472a = i10;
        this.f44473b = dj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44472a) {
            case 0:
                dj0 dj0Var = this.f44473b;
                cj0 cj0Var = dj0Var.m0;
                HashSet hashSet = dj0Var.Z;
                if (hashSet.size() != 0 && cj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : dj0Var.f37421e0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f22527id))) {
                            arrayList.add(Long.valueOf(user.f22527id));
                        }
                    }
                    cj0Var.a(arrayList);
                    dj0Var.dismiss();
                    break;
                }
                break;
            default:
                dj0 dj0Var2 = this.f44473b;
                dj0Var2.Z.clear();
                dj0Var2.U.d.b(true);
                dj0Var2.U(true, false);
                break;
        }
    }
}
