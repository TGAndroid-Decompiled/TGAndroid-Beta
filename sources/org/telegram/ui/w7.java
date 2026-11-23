package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
public final class w7 implements fi.b9, org.telegram.messenger.lr {
    public final j8 f53183a;

    public w7(j8 j8Var) {
        this.f53183a = j8Var;
    }

    @Override
    public void d(long j3, int i7, fi.e3 e3Var) {
        j8 j8Var = this.f53183a;
        if (j8Var.f49015b == null) {
            e3Var.run();
        }
        j8Var.f49015b.post(e3Var);
    }

    @Override
    public boolean l(long j3, int i7, int i10, int i11, fi.c9 c9Var) {
        j8 j8Var = this.f53183a;
        if (j8Var.f49015b != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= j8Var.f49015b.getChildCount()) {
                    break;
                }
                View childAt = j8Var.f49015b.getChildAt(i12);
                if (childAt instanceof g8) {
                    g8 g8Var = (g8) childAt;
                    if (g8Var.f48163n == null) {
                        continue;
                    } else {
                        for (int i13 = 0; i13 < g8Var.f48163n.size(); i13++) {
                            ArrayList arrayList = ((h8) g8Var.f48163n.valueAt(i13)).f48470b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i10))) {
                                int keyAt = g8Var.f48163n.keyAt(i13);
                                j8Var.f49026i0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) g8Var.f48164r.get(keyAt);
                                if (imageReceiver != null) {
                                    c9Var.f11823c = imageReceiver;
                                    if (j8Var.f49027j0 == null) {
                                        j8Var.f49027j0 = new w0(this, 11);
                                    }
                                    c9Var.f11824e = j8Var.f49027j0;
                                    c9Var.f11821a = g8Var;
                                    c9Var.f11826g = j8Var.fragmentView;
                                    c9Var.h = org.telegram.messenger.g0.L(36.0f);
                                    c9Var.f11827i = j8Var.fragmentView.getBottom();
                                    c9Var.f11822b = null;
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
    public void q(boolean z10) {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.ActionBar.r4 r4Var3;
        org.telegram.ui.ActionBar.r4 r4Var4;
        j8 j8Var = this.f53183a;
        j8Var.finishFragment();
        r4Var = ((org.telegram.ui.ActionBar.g2) j8Var).parentLayout;
        if (r4Var != null) {
            r4Var2 = ((org.telegram.ui.ActionBar.g2) j8Var).parentLayout;
            if (r4Var2.getFragmentStack().size() >= 2) {
                r4Var3 = ((org.telegram.ui.ActionBar.g2) j8Var).parentLayout;
                List fragmentStack = r4Var3.getFragmentStack();
                r4Var4 = ((org.telegram.ui.ActionBar.g2) j8Var).parentLayout;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) fragmentStack.get(r4Var4.getFragmentStack().size() - 2);
                if (g2Var instanceof bn) {
                    ((bn) g2Var).j8(j8Var.Q, j8Var.R + 86400, z10);
                    return;
                }
                return;
            }
        }
        bn bnVar = j8Var.O;
        if (bnVar != null) {
            bnVar.j8(j8Var.Q, j8Var.R + 86400, z10);
        }
    }

    @Override
    public void c(boolean z10) {
    }
}
