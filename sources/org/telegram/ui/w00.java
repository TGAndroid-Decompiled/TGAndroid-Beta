package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
public final class w00 implements org.telegram.ui.Components.sj0, r0.m, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.l0 {
    public final int f52930a;
    public final f40 f52931b;

    public w00(f40 f40Var, int i7) {
        this.f52930a = i7;
        this.f52931b = f40Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        int keyboardHeight;
        r0.i1 i1Var = l1Var.f56303a;
        i0.b f10 = i1Var.f(647);
        i0.b f11 = i1Var.f(8);
        f40 f40Var = this.f52931b;
        k20 k20Var = f40Var.C1;
        if (!k20Var.O && !k20Var.f42537e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = k20Var.getKeyboardHeight();
        }
        int max = Math.max(f11.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = f40Var.f47473a4.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f10.d;
        }
        if (k20Var.getEmojiView() != null) {
            k20Var.getEmojiView().setBottomInset(f10.d);
        }
        if (f40Var.R4) {
            ViewGroup viewGroup = f40Var.f30176b;
            int i7 = f40Var.f30211u0;
            viewGroup.setPadding(i7, 0, i7, 0);
        } else {
            ViewGroup viewGroup2 = f40Var.f30176b;
            int i10 = f40Var.f30211u0;
            viewGroup2.setPadding(f10.f15917a + i10, f10.f15918b, i10 + f10.f15919c, f10.d);
        }
        f40Var.f30176b.requestLayout();
        if (max == 0 && !k20Var.O && !k20Var.f42537e && !k20Var.P) {
            k20Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.xi0 xi0Var = f40Var.F1;
            if (xi0Var == null) {
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                xi0Var = null;
                if (Q != null) {
                    org.telegram.ui.Components.xi0 xi0Var2 = new org.telegram.ui.Components.xi0(1, f40Var.f30173a, f40Var.getContext(), Q, f40Var.J0);
                    f40Var.F1 = xi0Var2;
                    xi0Var2.setDelegate(new j30(f40Var));
                    f40Var.f30176b.addView(f40Var.F1, c8.ma.e(-2, 52, 81));
                    f40Var.F1.p(null, null, false);
                    f40Var.B1.bringToFront();
                    f40Var.A1.bringToFront();
                    xi0Var = f40Var.F1;
                }
            }
            f40Var.F1 = xi0Var;
        }
        k20Var.L(f11.d, false);
        f40Var.B3.j(l1Var);
        return r0.l1.f56302b;
    }

    @Override
    public boolean c(int i7, View view) {
        switch (this.f52930a) {
            case 0:
                f40 f40Var = this.f52931b;
                if (f40Var.M1(view)) {
                    try {
                        f40Var.L1.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                f40 f40Var2 = this.f52931b;
                if (!f40Var2.v1()) {
                    if (view instanceof org.telegram.ui.Components.voip.r) {
                        return f40Var2.M1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.g4) {
                        f40Var2.P1();
                        org.telegram.ui.Components.rh0 rh0Var = ((org.telegram.ui.Cells.g4) view).f30690f;
                        if (rh0Var.isEnabled()) {
                            rh0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void g(int i7) {
        this.f52931b.J1.getActionBarMenuOnItemClick().b(i7);
    }

    @Override
    public void j(KeyEvent keyEvent) {
        f40 f40Var;
        h30 h30Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h30Var = (f40Var = this.f52931b).f47489e5) != null && h30Var.isShowing()) {
            f40Var.f47489e5.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        ArrayList arrayList;
        v4.f1 K;
        f40 f40Var = this.f52931b;
        x10 x10Var = f40Var.f47515l4;
        b20 b20Var = f40Var.Z3;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) f40Var.V2.f26962p.get(iArr[i7]);
            if (groupCallParticipant != null) {
                if (!b20Var.f41109b) {
                    if (f40Var.f47522n2) {
                        arrayList = f40Var.f47575y2;
                    } else {
                        arrayList = f40Var.V2.f26954g;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = f40Var.L1.K(indexOf + f40Var.K1.d)) != null) {
                        View view = K.f59165a;
                        if (view instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) view).setAmplitude(fArr[i7] * 15.0f);
                            if (view == f40Var.W4 && !f40Var.f47511k4) {
                                f40Var.f30176b.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i10 = 0; i10 < x10Var.getChildCount(); i10++) {
                        org.telegram.ui.Components.u10 u10Var = (org.telegram.ui.Components.u10) x10Var.getChildAt(i10);
                        if (org.telegram.messenger.gj.B1(u10Var.getParticipant().peer) == org.telegram.messenger.gj.B1(groupCallParticipant.peer)) {
                            u10Var.setAmplitude(fArr[i7] * 15.0f);
                        }
                    }
                }
                b20Var.k(groupCallParticipant, fArr[i7] * 15.0f);
            }
        }
    }
}
