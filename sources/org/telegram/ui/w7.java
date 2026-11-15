package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
public final class w7 implements fi.e9, org.telegram.messenger.nr {
    public final i8 f52479a;

    public w7(i8 i8Var) {
        this.f52479a = i8Var;
    }

    @Override
    public void d(long j3, int i7, fi.g3 g3Var) {
        i8 i8Var = this.f52479a;
        if (i8Var.f47930b == null) {
            g3Var.run();
        }
        i8Var.f47930b.post(g3Var);
    }

    @Override
    public void j(boolean z10) {
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        org.telegram.ui.ActionBar.o4 o4Var3;
        org.telegram.ui.ActionBar.o4 o4Var4;
        i8 i8Var = this.f52479a;
        i8Var.finishFragment();
        o4Var = ((org.telegram.ui.ActionBar.e2) i8Var).parentLayout;
        if (o4Var != null) {
            o4Var2 = ((org.telegram.ui.ActionBar.e2) i8Var).parentLayout;
            if (o4Var2.getFragmentStack().size() >= 2) {
                o4Var3 = ((org.telegram.ui.ActionBar.e2) i8Var).parentLayout;
                List fragmentStack = o4Var3.getFragmentStack();
                o4Var4 = ((org.telegram.ui.ActionBar.e2) i8Var).parentLayout;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) fragmentStack.get(o4Var4.getFragmentStack().size() - 2);
                if (e2Var instanceof an) {
                    ((an) e2Var).j8(i8Var.Q, i8Var.R + 86400, z10);
                    return;
                }
                return;
            }
        }
        an anVar = i8Var.O;
        if (anVar != null) {
            anVar.j8(i8Var.Q, i8Var.R + 86400, z10);
        }
    }

    @Override
    public boolean l(long j3, int i7, int i10, int i11, fi.f9 f9Var) {
        i8 i8Var = this.f52479a;
        if (i8Var.f47930b != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= i8Var.f47930b.getChildCount()) {
                    break;
                }
                View childAt = i8Var.f47930b.getChildAt(i12);
                if (childAt instanceof f8) {
                    f8 f8Var = (f8) childAt;
                    if (f8Var.f47037n == null) {
                        continue;
                    } else {
                        for (int i13 = 0; i13 < f8Var.f47037n.size(); i13++) {
                            ArrayList arrayList = ((g8) f8Var.f47037n.valueAt(i13)).f47362b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i10))) {
                                int keyAt = f8Var.f47037n.keyAt(i13);
                                i8Var.f47941i0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) f8Var.f47038r.get(keyAt);
                                if (imageReceiver != null) {
                                    f9Var.f11712c = imageReceiver;
                                    if (i8Var.f47942j0 == null) {
                                        i8Var.f47942j0 = new w0(this, 11);
                                    }
                                    f9Var.f11713e = i8Var.f47942j0;
                                    f9Var.f11710a = f8Var;
                                    f9Var.f11715g = i8Var.fragmentView;
                                    f9Var.h = org.telegram.messenger.g0.L(36.0f);
                                    f9Var.f11716i = i8Var.fragmentView.getBottom();
                                    f9Var.f11711b = null;
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
    public void c(boolean z10) {
    }
}
