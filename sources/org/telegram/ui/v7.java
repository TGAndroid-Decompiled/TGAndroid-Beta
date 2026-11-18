package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
public final class v7 implements fi.b9, org.telegram.messenger.lr {
    public final i8 f52698a;

    public v7(i8 i8Var) {
        this.f52698a = i8Var;
    }

    @Override
    public void d(boolean z10) {
        org.telegram.ui.ActionBar.s4 s4Var;
        org.telegram.ui.ActionBar.s4 s4Var2;
        org.telegram.ui.ActionBar.s4 s4Var3;
        org.telegram.ui.ActionBar.s4 s4Var4;
        i8 i8Var = this.f52698a;
        i8Var.finishFragment();
        s4Var = ((org.telegram.ui.ActionBar.h2) i8Var).parentLayout;
        if (s4Var != null) {
            s4Var2 = ((org.telegram.ui.ActionBar.h2) i8Var).parentLayout;
            if (s4Var2.getFragmentStack().size() >= 2) {
                s4Var3 = ((org.telegram.ui.ActionBar.h2) i8Var).parentLayout;
                List fragmentStack = s4Var3.getFragmentStack();
                s4Var4 = ((org.telegram.ui.ActionBar.h2) i8Var).parentLayout;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) fragmentStack.get(s4Var4.getFragmentStack().size() - 2);
                if (h2Var instanceof bn) {
                    ((bn) h2Var).j8(i8Var.Q, i8Var.R + 86400, z10);
                    return;
                }
                return;
            }
        }
        bn bnVar = i8Var.O;
        if (bnVar != null) {
            bnVar.j8(i8Var.Q, i8Var.R + 86400, z10);
        }
    }

    @Override
    public void e(long j3, int i7, fi.e3 e3Var) {
        i8 i8Var = this.f52698a;
        if (i8Var.f48579b == null) {
            e3Var.run();
        }
        i8Var.f48579b.post(e3Var);
    }

    @Override
    public boolean k(long j3, int i7, int i10, int i11, fi.c9 c9Var) {
        i8 i8Var = this.f52698a;
        if (i8Var.f48579b != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= i8Var.f48579b.getChildCount()) {
                    break;
                }
                View childAt = i8Var.f48579b.getChildAt(i12);
                if (childAt instanceof f8) {
                    f8 f8Var = (f8) childAt;
                    if (f8Var.f47561n == null) {
                        continue;
                    } else {
                        for (int i13 = 0; i13 < f8Var.f47561n.size(); i13++) {
                            ArrayList arrayList = ((g8) f8Var.f47561n.valueAt(i13)).f47922b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i10))) {
                                int keyAt = f8Var.f47561n.keyAt(i13);
                                i8Var.f48590i0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) f8Var.f47562r.get(keyAt);
                                if (imageReceiver != null) {
                                    c9Var.f11818c = imageReceiver;
                                    if (i8Var.f48591j0 == null) {
                                        i8Var.f48591j0 = new w0(this, 11);
                                    }
                                    c9Var.f11819e = i8Var.f48591j0;
                                    c9Var.f11816a = f8Var;
                                    c9Var.f11821g = i8Var.fragmentView;
                                    c9Var.h = org.telegram.messenger.g0.L(36.0f);
                                    c9Var.f11822i = i8Var.fragmentView.getBottom();
                                    c9Var.f11817b = null;
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
    public void b(boolean z10) {
    }
}
