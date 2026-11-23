package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
public final class v7 implements fi.b9, org.telegram.messenger.mr {
    public final i8 f52745a;

    public v7(i8 i8Var) {
        this.f52745a = i8Var;
    }

    @Override
    public void d(boolean z10) {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.ActionBar.r4 r4Var3;
        org.telegram.ui.ActionBar.r4 r4Var4;
        i8 i8Var = this.f52745a;
        i8Var.finishFragment();
        r4Var = ((org.telegram.ui.ActionBar.g2) i8Var).parentLayout;
        if (r4Var != null) {
            r4Var2 = ((org.telegram.ui.ActionBar.g2) i8Var).parentLayout;
            if (r4Var2.getFragmentStack().size() >= 2) {
                r4Var3 = ((org.telegram.ui.ActionBar.g2) i8Var).parentLayout;
                List fragmentStack = r4Var3.getFragmentStack();
                r4Var4 = ((org.telegram.ui.ActionBar.g2) i8Var).parentLayout;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) fragmentStack.get(r4Var4.getFragmentStack().size() - 2);
                if (g2Var instanceof bn) {
                    ((bn) g2Var).j8(i8Var.Q, i8Var.R + 86400, z10);
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
        i8 i8Var = this.f52745a;
        if (i8Var.f48621b == null) {
            e3Var.run();
        }
        i8Var.f48621b.post(e3Var);
    }

    @Override
    public boolean k(long j3, int i7, int i10, int i11, fi.c9 c9Var) {
        i8 i8Var = this.f52745a;
        if (i8Var.f48621b != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= i8Var.f48621b.getChildCount()) {
                    break;
                }
                View childAt = i8Var.f48621b.getChildAt(i12);
                if (childAt instanceof f8) {
                    f8 f8Var = (f8) childAt;
                    if (f8Var.f47633n == null) {
                        continue;
                    } else {
                        for (int i13 = 0; i13 < f8Var.f47633n.size(); i13++) {
                            ArrayList arrayList = ((g8) f8Var.f47633n.valueAt(i13)).f47996b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i10))) {
                                int keyAt = f8Var.f47633n.keyAt(i13);
                                i8Var.f48632i0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) f8Var.f47634r.get(keyAt);
                                if (imageReceiver != null) {
                                    c9Var.f11861c = imageReceiver;
                                    if (i8Var.f48633j0 == null) {
                                        i8Var.f48633j0 = new w0(this, 11);
                                    }
                                    c9Var.f11862e = i8Var.f48633j0;
                                    c9Var.f11859a = f8Var;
                                    c9Var.f11864g = i8Var.fragmentView;
                                    c9Var.h = org.telegram.messenger.g0.L(36.0f);
                                    c9Var.f11865i = i8Var.fragmentView.getBottom();
                                    c9Var.f11860b = null;
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
