package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
public final class v7 implements di.m9, org.telegram.messenger.qr {
    public final h8 f50641a;

    public v7(h8 h8Var) {
        this.f50641a = h8Var;
    }

    @Override
    public void e(long j3, int i7, di.l3 l3Var) {
        h8 h8Var = this.f50641a;
        if (h8Var.f46246b == null) {
            l3Var.run();
        }
        h8Var.f46246b.post(l3Var);
    }

    @Override
    public void k(boolean z9) {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.ActionBar.r4 r4Var3;
        org.telegram.ui.ActionBar.r4 r4Var4;
        h8 h8Var = this.f50641a;
        h8Var.finishFragment();
        r4Var = ((org.telegram.ui.ActionBar.f2) h8Var).parentLayout;
        if (r4Var != null) {
            r4Var2 = ((org.telegram.ui.ActionBar.f2) h8Var).parentLayout;
            if (r4Var2.getFragmentStack().size() >= 2) {
                r4Var3 = ((org.telegram.ui.ActionBar.f2) h8Var).parentLayout;
                List fragmentStack = r4Var3.getFragmentStack();
                r4Var4 = ((org.telegram.ui.ActionBar.f2) h8Var).parentLayout;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) fragmentStack.get(r4Var4.getFragmentStack().size() - 2);
                if (f2Var instanceof cn) {
                    ((cn) f2Var).i8(h8Var.P, h8Var.Q + 86400, z9);
                    return;
                }
                return;
            }
        }
        cn cnVar = h8Var.N;
        if (cnVar != null) {
            cnVar.i8(h8Var.P, h8Var.Q + 86400, z9);
        }
    }

    @Override
    public boolean o(long j3, int i7, int i10, int i11, di.n9 n9Var) {
        h8 h8Var = this.f50641a;
        if (h8Var.f46246b != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= h8Var.f46246b.getChildCount()) {
                    break;
                }
                View childAt = h8Var.f46246b.getChildAt(i12);
                if (childAt instanceof e8) {
                    e8 e8Var = (e8) childAt;
                    if (e8Var.f45196n == null) {
                        continue;
                    } else {
                        for (int i13 = 0; i13 < e8Var.f45196n.size(); i13++) {
                            ArrayList arrayList = ((f8) e8Var.f45196n.valueAt(i13)).f45639b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i10))) {
                                int keyAt = e8Var.f45196n.keyAt(i13);
                                h8Var.f46256h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) e8Var.f45197r.get(keyAt);
                                if (imageReceiver != null) {
                                    n9Var.f9410c = imageReceiver;
                                    if (h8Var.f46257i0 == null) {
                                        h8Var.f46257i0 = new w0(this, 11);
                                    }
                                    n9Var.f9411e = h8Var.f46257i0;
                                    n9Var.f9408a = e8Var;
                                    n9Var.f9413g = h8Var.fragmentView;
                                    n9Var.h = org.telegram.messenger.g0.L(36.0f);
                                    n9Var.f9414i = h8Var.fragmentView.getBottom();
                                    n9Var.f9409b = null;
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
    public void b(boolean z9) {
    }
}
