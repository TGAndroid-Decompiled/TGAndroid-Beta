package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class zi0 implements View.OnClickListener {
    public final int f46283a;
    public final ej0 f46284b;

    public zi0(ej0 ej0Var, int i10) {
        this.f46283a = i10;
        this.f46284b = ej0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46283a) {
            case 0:
                ej0 ej0Var = this.f46284b;
                dj0 dj0Var = ej0Var.f38901q0;
                HashSet hashSet = ej0Var.f38889d0;
                if (hashSet.size() != 0 && dj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : ej0Var.f38894i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f22177id))) {
                            arrayList.add(Long.valueOf(user.f22177id));
                        }
                    }
                    dj0Var.a(arrayList);
                    ej0Var.dismiss();
                    return;
                }
                return;
            default:
                ej0 ej0Var2 = this.f46284b;
                ej0Var2.f38889d0.clear();
                ej0Var2.Y.d.b(true);
                ej0Var2.U(true, false);
                return;
        }
    }
}
