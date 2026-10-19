package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class vi0 implements View.OnClickListener {
    public final int f42264a;
    public final aj0 f42265b;

    public vi0(aj0 aj0Var, int i10) {
        this.f42264a = i10;
        this.f42265b = aj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42264a) {
            case 0:
                aj0 aj0Var = this.f42265b;
                zi0 zi0Var = aj0Var.f35386q0;
                HashSet hashSet = aj0Var.f35374d0;
                if (hashSet.size() != 0 && zi0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : aj0Var.f35379i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f20422id))) {
                            arrayList.add(Long.valueOf(user.f20422id));
                        }
                    }
                    zi0Var.a(arrayList);
                    aj0Var.dismiss();
                    return;
                }
                return;
            default:
                aj0 aj0Var2 = this.f42265b;
                aj0Var2.f35374d0.clear();
                aj0Var2.Y.d.b(true);
                aj0Var2.V(true, false);
                return;
        }
    }
}
