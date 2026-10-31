package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class uh0 implements View.OnClickListener {
    public final int f42145a;
    public final wh0 f42146b;

    public uh0(wh0 wh0Var, int i10) {
        this.f42145a = i10;
        this.f42146b = wh0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42145a) {
            case 0:
                wh0 wh0Var = this.f42146b;
                vh0 vh0Var = wh0Var.f43313i2;
                HashSet hashSet = wh0Var.V1;
                if (hashSet.size() != 0 && vh0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : wh0Var.a2.values()) {
                        if (hashSet.contains(Long.valueOf(user.f19942id))) {
                            arrayList.add(Long.valueOf(user.f19942id));
                        }
                    }
                    vh0Var.a(arrayList);
                    wh0Var.dismiss();
                    return;
                }
                return;
            default:
                wh0 wh0Var2 = this.f42146b;
                wh0Var2.V1.clear();
                wh0Var2.Q1.d.b(true);
                wh0Var2.g1(true, false);
                return;
        }
    }
}
