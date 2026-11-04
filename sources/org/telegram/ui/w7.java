package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
public final class w7 implements ei.n9, org.telegram.messenger.ir {
    public final i8 f50725a;

    public w7(i8 i8Var) {
        this.f50725a = i8Var;
    }

    @Override
    public boolean j(long j10, int i3, int i10, int i11, ei.o9 o9Var) {
        i8 i8Var = this.f50725a;
        if (i8Var.f46165b != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= i8Var.f46165b.getChildCount()) {
                    break;
                }
                View childAt = i8Var.f46165b.getChildAt(i12);
                if (childAt instanceof f8) {
                    f8 f8Var = (f8) childAt;
                    if (f8Var.f45180n == null) {
                        continue;
                    } else {
                        for (int i13 = 0; i13 < f8Var.f45180n.size(); i13++) {
                            ArrayList arrayList = ((g8) f8Var.f45180n.valueAt(i13)).f45589b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i10))) {
                                int keyAt = f8Var.f45180n.keyAt(i13);
                                i8Var.f46176i0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) f8Var.f45181r.get(keyAt);
                                if (imageReceiver != null) {
                                    o9Var.f10728c = imageReceiver;
                                    if (i8Var.f46177j0 == null) {
                                        i8Var.f46177j0 = new x0(this, 11);
                                    }
                                    o9Var.f10729e = i8Var.f46177j0;
                                    o9Var.f10726a = f8Var;
                                    o9Var.f10731g = i8Var.fragmentView;
                                    o9Var.h = org.telegram.messenger.g0.L(36.0f);
                                    o9Var.f10732i = i8Var.fragmentView.getBottom();
                                    o9Var.f10727b = null;
                                    return true;
                                }
                            }
                        }
                        continue;
                    }
                }
                i12++;
            }
        }
        return false;
    }

    @Override
    public void o(boolean z10) {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.q4 q4Var3;
        org.telegram.ui.ActionBar.q4 q4Var4;
        i8 i8Var = this.f50725a;
        i8Var.finishFragment();
        q4Var = ((org.telegram.ui.ActionBar.d2) i8Var).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.d2) i8Var).parentLayout;
            if (q4Var2.getFragmentStack().size() >= 2) {
                q4Var3 = ((org.telegram.ui.ActionBar.d2) i8Var).parentLayout;
                List fragmentStack = q4Var3.getFragmentStack();
                q4Var4 = ((org.telegram.ui.ActionBar.d2) i8Var).parentLayout;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) fragmentStack.get(q4Var4.getFragmentStack().size() - 2);
                if (d2Var instanceof wm) {
                    ((wm) d2Var).h8(i8Var.Q, i8Var.R + 86400, z10);
                    return;
                }
                return;
            }
        }
        wm wmVar = i8Var.O;
        if (wmVar != null) {
            wmVar.h8(i8Var.Q, i8Var.R + 86400, z10);
        }
    }

    @Override
    public void r(long j10, int i3, ei.o3 o3Var) {
        i8 i8Var = this.f50725a;
        if (i8Var.f46165b == null) {
            o3Var.run();
        }
        i8Var.f46165b.post(o3Var);
    }

    @Override
    public void c(boolean z10) {
    }
}
