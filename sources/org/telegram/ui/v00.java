package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
public final class v00 implements org.telegram.ui.Components.sj0, r0.m, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.l0 {
    public final int f52770a;
    public final e40 f52771b;

    public v00(e40 e40Var, int i7) {
        this.f52770a = i7;
        this.f52771b = e40Var;
    }

    @Override
    public boolean b(int i7, View view) {
        switch (this.f52770a) {
            case 0:
                e40 e40Var = this.f52771b;
                if (e40Var.M1(view)) {
                    try {
                        e40Var.L1.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                e40 e40Var2 = this.f52771b;
                if (!e40Var2.v1()) {
                    if (view instanceof org.telegram.ui.Components.voip.s) {
                        return e40Var2.M1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.g4) {
                        e40Var2.P1();
                        org.telegram.ui.Components.qh0 qh0Var = ((org.telegram.ui.Cells.g4) view).f30745f;
                        if (qh0Var.isEnabled()) {
                            qh0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void h(int i7) {
        this.f52771b.J1.getActionBarMenuOnItemClick().b(i7);
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        int keyboardHeight;
        r0.i1 i1Var = l1Var.f56381a;
        i0.b f10 = i1Var.f(647);
        i0.b f11 = i1Var.f(8);
        e40 e40Var = this.f52771b;
        j20 j20Var = e40Var.C1;
        if (!j20Var.O && !j20Var.f41722e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = j20Var.getKeyboardHeight();
        }
        int max = Math.max(f11.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = e40Var.f47323a4.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f10.d;
        }
        if (j20Var.getEmojiView() != null) {
            j20Var.getEmojiView().setBottomInset(f10.d);
        }
        if (e40Var.R4) {
            ViewGroup viewGroup = e40Var.f30226b;
            int i7 = e40Var.f30261u0;
            viewGroup.setPadding(i7, 0, i7, 0);
        } else {
            ViewGroup viewGroup2 = e40Var.f30226b;
            int i10 = e40Var.f30261u0;
            viewGroup2.setPadding(f10.f15978a + i10, f10.f15979b, i10 + f10.f15980c, f10.d);
        }
        e40Var.f30226b.requestLayout();
        if (max == 0 && !j20Var.O && !j20Var.f41722e && !j20Var.P) {
            j20Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.xi0 xi0Var = e40Var.F1;
            if (xi0Var == null) {
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                xi0Var = null;
                if (Q != null) {
                    org.telegram.ui.Components.xi0 xi0Var2 = new org.telegram.ui.Components.xi0(1, e40Var.f30223a, e40Var.getContext(), Q, e40Var.J0);
                    e40Var.F1 = xi0Var2;
                    xi0Var2.setDelegate(new i30(e40Var));
                    e40Var.f30226b.addView(e40Var.F1, c8.na.e(-2, 52, 81));
                    e40Var.F1.p(null, null, false);
                    e40Var.B1.bringToFront();
                    e40Var.A1.bringToFront();
                    xi0Var = e40Var.F1;
                }
            }
            e40Var.F1 = xi0Var;
        }
        j20Var.L(f11.d, false);
        e40Var.B3.j(l1Var);
        return r0.l1.f56380b;
    }

    @Override
    public void m(KeyEvent keyEvent) {
        e40 e40Var;
        g30 g30Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g30Var = (e40Var = this.f52771b).f47339e5) != null && g30Var.isShowing()) {
            e40Var.f47339e5.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        ArrayList arrayList;
        v4.f1 K;
        e40 e40Var = this.f52771b;
        w10 w10Var = e40Var.f47365l4;
        a20 a20Var = e40Var.Z3;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) e40Var.V2.f27046p.get(iArr[i7]);
            if (groupCallParticipant != null) {
                if (!a20Var.f41003b) {
                    if (e40Var.f47372n2) {
                        arrayList = e40Var.f47425y2;
                    } else {
                        arrayList = e40Var.V2.f27038g;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = e40Var.L1.K(indexOf + e40Var.K1.d)) != null) {
                        View view = K.f59245a;
                        if (view instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) view).setAmplitude(fArr[i7] * 15.0f);
                            if (view == e40Var.W4 && !e40Var.f47361k4) {
                                e40Var.f30226b.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i10 = 0; i10 < w10Var.getChildCount(); i10++) {
                        org.telegram.ui.Components.s10 s10Var = (org.telegram.ui.Components.s10) w10Var.getChildAt(i10);
                        if (org.telegram.messenger.fj.B1(s10Var.getParticipant().peer) == org.telegram.messenger.fj.B1(groupCallParticipant.peer)) {
                            s10Var.setAmplitude(fArr[i7] * 15.0f);
                        }
                    }
                }
                a20Var.k(groupCallParticipant, fArr[i7] * 15.0f);
            }
        }
    }
}
