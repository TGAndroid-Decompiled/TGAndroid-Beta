package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class wi0 implements View.OnClickListener {
    public final int f42881a;
    public final bj0 f42882b;

    public wi0(bj0 bj0Var, int i10) {
        this.f42881a = i10;
        this.f42882b = bj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42881a) {
            case 0:
                bj0 bj0Var = this.f42882b;
                aj0 aj0Var = bj0Var.f35655q0;
                HashSet hashSet = bj0Var.f35643d0;
                if (hashSet.size() != 0 && aj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : bj0Var.f35648i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f20420id))) {
                            arrayList.add(Long.valueOf(user.f20420id));
                        }
                    }
                    aj0Var.a(arrayList);
                    bj0Var.dismiss();
                    return;
                }
                return;
            default:
                bj0 bj0Var2 = this.f42882b;
                bj0Var2.f35643d0.clear();
                bj0Var2.Y.d.b(true);
                bj0Var2.V(true, false);
                return;
        }
    }
}
