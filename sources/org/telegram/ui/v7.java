package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
public final class v7 implements th.k7, org.telegram.messenger.as {
    public final h8 f42427a;

    public v7(h8 h8Var) {
        this.f42427a = h8Var;
    }

    @Override
    public void d(long j10, int i10, th.i2 i2Var) {
        h8 h8Var = this.f42427a;
        if (h8Var.f37725b == null) {
            i2Var.run();
        }
        h8Var.f37725b.post(i2Var);
    }

    @Override
    public void i(boolean z10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        org.telegram.ui.ActionBar.z4 z4Var3;
        org.telegram.ui.ActionBar.z4 z4Var4;
        h8 h8Var = this.f42427a;
        h8Var.finishFragment();
        z4Var = ((org.telegram.ui.ActionBar.k2) h8Var).parentLayout;
        if (z4Var != null) {
            z4Var2 = ((org.telegram.ui.ActionBar.k2) h8Var).parentLayout;
            if (z4Var2.getFragmentStack().size() >= 2) {
                z4Var3 = ((org.telegram.ui.ActionBar.k2) h8Var).parentLayout;
                List fragmentStack = z4Var3.getFragmentStack();
                z4Var4 = ((org.telegram.ui.ActionBar.k2) h8Var).parentLayout;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) fragmentStack.get(z4Var4.getFragmentStack().size() - 2);
                if (k2Var instanceof un) {
                    ((un) k2Var).e8(h8Var.P, h8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        un unVar = h8Var.N;
        if (unVar != null) {
            unVar.e8(h8Var.P, h8Var.Q + 86400, z10);
        }
    }

    @Override
    public boolean v(long j10, int i10, int i11, int i12, th.l7 l7Var) {
        h8 h8Var = this.f42427a;
        if (h8Var.f37725b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= h8Var.f37725b.getChildCount()) {
                    break;
                }
                View childAt = h8Var.f37725b.getChildAt(i13);
                if (childAt instanceof e8) {
                    e8 e8Var = (e8) childAt;
                    if (e8Var.f36770n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < e8Var.f36770n.size(); i14++) {
                            ArrayList arrayList = ((f8) e8Var.f36770n.valueAt(i14)).f37036b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = e8Var.f36770n.keyAt(i14);
                                h8Var.f37734h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) e8Var.f36771r.get(keyAt);
                                if (imageReceiver != null) {
                                    l7Var.f49199c = imageReceiver;
                                    if (h8Var.f37735i0 == null) {
                                        h8Var.f37735i0 = new y0(this, 11);
                                    }
                                    l7Var.e = h8Var.f37735i0;
                                    l7Var.f49197a = e8Var;
                                    l7Var.f49201g = h8Var.fragmentView;
                                    l7Var.h = org.telegram.messenger.i0.L(36.0f);
                                    l7Var.f49202i = h8Var.fragmentView.getBottom();
                                    l7Var.f49198b = null;
                                    return true;
                                }
                            }
                        }
                        continue;
                    }
                }
                i13++;
            }
        }
        return false;
    }

    @Override
    public void c(boolean z10) {
    }
}
