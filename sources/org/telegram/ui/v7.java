package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
public final class v7 implements di.l9, org.telegram.messenger.qr {
    public final h8 f50595a;

    public v7(h8 h8Var) {
        this.f50595a = h8Var;
    }

    @Override
    public void e(long j3, int i7, di.l3 l3Var) {
        h8 h8Var = this.f50595a;
        if (h8Var.f46261b == null) {
            l3Var.run();
        }
        h8Var.f46261b.post(l3Var);
    }

    @Override
    public void k(boolean z9) {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.q4 q4Var3;
        org.telegram.ui.ActionBar.q4 q4Var4;
        h8 h8Var = this.f50595a;
        h8Var.finishFragment();
        q4Var = ((org.telegram.ui.ActionBar.f2) h8Var).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.f2) h8Var).parentLayout;
            if (q4Var2.getFragmentStack().size() >= 2) {
                q4Var3 = ((org.telegram.ui.ActionBar.f2) h8Var).parentLayout;
                List fragmentStack = q4Var3.getFragmentStack();
                q4Var4 = ((org.telegram.ui.ActionBar.f2) h8Var).parentLayout;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) fragmentStack.get(q4Var4.getFragmentStack().size() - 2);
                if (f2Var instanceof an) {
                    ((an) f2Var).h8(h8Var.P, h8Var.Q + 86400, z9);
                    return;
                }
                return;
            }
        }
        an anVar = h8Var.N;
        if (anVar != null) {
            anVar.h8(h8Var.P, h8Var.Q + 86400, z9);
        }
    }

    @Override
    public boolean o(long j3, int i7, int i10, int i11, di.m9 m9Var) {
        h8 h8Var = this.f50595a;
        if (h8Var.f46261b != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= h8Var.f46261b.getChildCount()) {
                    break;
                }
                View childAt = h8Var.f46261b.getChildAt(i12);
                if (childAt instanceof e8) {
                    e8 e8Var = (e8) childAt;
                    if (e8Var.f45232n == null) {
                        continue;
                    } else {
                        for (int i13 = 0; i13 < e8Var.f45232n.size(); i13++) {
                            ArrayList arrayList = ((f8) e8Var.f45232n.valueAt(i13)).f45517b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i10))) {
                                int keyAt = e8Var.f45232n.keyAt(i13);
                                h8Var.f46271h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) e8Var.f45233r.get(keyAt);
                                if (imageReceiver != null) {
                                    m9Var.f9364c = imageReceiver;
                                    if (h8Var.f46272i0 == null) {
                                        h8Var.f46272i0 = new w0(this, 11);
                                    }
                                    m9Var.f9365e = h8Var.f46272i0;
                                    m9Var.f9362a = e8Var;
                                    m9Var.f9367g = h8Var.fragmentView;
                                    m9Var.h = org.telegram.messenger.g0.L(36.0f);
                                    m9Var.f9368i = h8Var.fragmentView.getBottom();
                                    m9Var.f9363b = null;
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
