package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
public final class u00 implements org.telegram.ui.Components.dj0, r0.m, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.m0 {
    public final int f50377a;
    public final f40 f50378b;

    public u00(f40 f40Var, int i7) {
        this.f50377a = i7;
        this.f50378b = f40Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int keyboardHeight;
        r0.h1 h1Var = k1Var.f54213a;
        i0.b f10 = h1Var.f(647);
        i0.b f11 = h1Var.f(8);
        f40 f40Var = this.f50378b;
        k20 k20Var = f40Var.B1;
        if (!k20Var.N && !k20Var.f35436e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = k20Var.getKeyboardHeight();
        }
        int max = Math.max(f11.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = f40Var.V3.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f10.d;
        }
        if (k20Var.getEmojiView() != null) {
            k20Var.getEmojiView().setBottomInset(f10.d);
        }
        if (f40Var.M4) {
            ViewGroup viewGroup = f40Var.f28672b;
            int i7 = f40Var.f28705t0;
            viewGroup.setPadding(i7, 0, i7, 0);
        } else {
            ViewGroup viewGroup2 = f40Var.f28672b;
            int i10 = f40Var.f28705t0;
            viewGroup2.setPadding(f10.f15122a + i10, f10.f15123b, i10 + f10.f15124c, f10.d);
        }
        f40Var.f28672b.requestLayout();
        if (max == 0 && !k20Var.N && !k20Var.f35436e && !k20Var.O) {
            k20Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.ii0 ii0Var = f40Var.E1;
            if (ii0Var == null) {
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                ii0Var = null;
                if (Q != null) {
                    org.telegram.ui.Components.ii0 ii0Var2 = new org.telegram.ui.Components.ii0(1, f40Var.f28669a, f40Var.getContext(), Q, f40Var.I0);
                    f40Var.E1 = ii0Var2;
                    ii0Var2.setDelegate(new j30(f40Var));
                    f40Var.f28672b.addView(f40Var.E1, c8.ha.e(-2, 52, 81));
                    f40Var.E1.p(null, null, false);
                    f40Var.A1.bringToFront();
                    f40Var.f45610z1.bringToFront();
                    ii0Var = f40Var.E1;
                }
            }
            f40Var.E1 = ii0Var;
        }
        k20Var.K(f11.d, false);
        f40Var.f45599w3.j(k1Var);
        return r0.k1.f54212b;
    }

    @Override
    public boolean c(int i7, View view) {
        switch (this.f50377a) {
            case 0:
                f40 f40Var = this.f50378b;
                if (f40Var.L1(view)) {
                    try {
                        f40Var.K1.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                f40 f40Var2 = this.f50378b;
                if (!f40Var2.u1()) {
                    if (view instanceof org.telegram.ui.Components.voip.r) {
                        return f40Var2.L1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        f40Var2.O1();
                        org.telegram.ui.Components.ch0 ch0Var = ((org.telegram.ui.Cells.f4) view).f29125f;
                        if (ch0Var.isEnabled()) {
                            ch0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void i(int i7) {
        this.f50378b.I1.getActionBarMenuOnItemClick().b(i7);
    }

    @Override
    public void j(KeyEvent keyEvent) {
        f40 f40Var;
        h30 h30Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h30Var = (f40Var = this.f50378b).Z4) != null && h30Var.isShowing()) {
            f40Var.Z4.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        ArrayList arrayList;
        v4.d1 K;
        f40 f40Var = this.f50378b;
        y10 y10Var = f40Var.f45529g4;
        c20 c20Var = f40Var.U3;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) f40Var.U2.f25238p.get(iArr[i7]);
            if (groupCallParticipant != null) {
                if (!c20Var.f39302b) {
                    if (f40Var.f45551m2) {
                        arrayList = f40Var.f45603x2;
                    } else {
                        arrayList = f40Var.U2.f25230g;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = f40Var.K1.K(indexOf + f40Var.J1.d)) != null) {
                        View view = K.f57052a;
                        if (view instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) view).setAmplitude(fArr[i7] * 15.0f);
                            if (view == f40Var.R4 && !f40Var.f45525f4) {
                                f40Var.f28672b.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i10 = 0; i10 < y10Var.getChildCount(); i10++) {
                        org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) y10Var.getChildAt(i10);
                        if (org.telegram.messenger.ij.B1(g10Var.getParticipant().peer) == org.telegram.messenger.ij.B1(groupCallParticipant.peer)) {
                            g10Var.setAmplitude(fArr[i7] * 15.0f);
                        }
                    }
                }
                c20Var.k(groupCallParticipant, fArr[i7] * 15.0f);
            }
        }
    }
}
