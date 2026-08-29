package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ui0 implements View.OnClickListener {
    public final int f43273a;
    public final zi0 f43274b;

    public ui0(zi0 zi0Var, int i10) {
        this.f43273a = i10;
        this.f43274b = zi0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43273a) {
            case 0:
                zi0 zi0Var = this.f43274b;
                yi0 yi0Var = zi0Var.m0;
                HashSet hashSet = zi0Var.Z;
                if (hashSet.size() != 0 && yi0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : zi0Var.f45241e0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f22539id))) {
                            arrayList.add(Long.valueOf(user.f22539id));
                        }
                    }
                    yi0Var.a(arrayList);
                    zi0Var.dismiss();
                    return;
                }
                return;
            default:
                zi0 zi0Var2 = this.f43274b;
                zi0Var2.Z.clear();
                zi0Var2.U.d.b(true);
                zi0Var2.U(true, false);
                return;
        }
    }
}
