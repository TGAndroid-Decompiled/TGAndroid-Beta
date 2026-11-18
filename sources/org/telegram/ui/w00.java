package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
public final class w00 implements org.telegram.ui.Components.qj0, r0.m, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.f1, org.telegram.ui.ActionBar.m0 {
    public final int f52885a;
    public final f40 f52886b;

    public w00(f40 f40Var, int i7) {
        this.f52885a = i7;
        this.f52886b = f40Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        int keyboardHeight;
        r0.i1 i1Var = l1Var.f56258a;
        i0.b f10 = i1Var.f(647);
        i0.b f11 = i1Var.f(8);
        f40 f40Var = this.f52886b;
        k20 k20Var = f40Var.C1;
        if (!k20Var.O && !k20Var.f41789e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = k20Var.getKeyboardHeight();
        }
        int max = Math.max(f11.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = f40Var.f47401a4.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f10.d;
        }
        if (k20Var.getEmojiView() != null) {
            k20Var.getEmojiView().setBottomInset(f10.d);
        }
        if (f40Var.R4) {
            ViewGroup viewGroup = f40Var.f30190b;
            int i7 = f40Var.f30225u0;
            viewGroup.setPadding(i7, 0, i7, 0);
        } else {
            ViewGroup viewGroup2 = f40Var.f30190b;
            int i10 = f40Var.f30225u0;
            viewGroup2.setPadding(f10.f15889a + i10, f10.f15890b, i10 + f10.f15891c, f10.d);
        }
        f40Var.f30190b.requestLayout();
        if (max == 0 && !k20Var.O && !k20Var.f41789e && !k20Var.P) {
            k20Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.vi0 vi0Var = f40Var.F1;
            if (vi0Var == null) {
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                vi0Var = null;
                if (Q != null) {
                    org.telegram.ui.Components.vi0 vi0Var2 = new org.telegram.ui.Components.vi0(1, f40Var.f30187a, f40Var.getContext(), Q, f40Var.J0);
                    f40Var.F1 = vi0Var2;
                    vi0Var2.setDelegate(new j30(f40Var));
                    f40Var.f30190b.addView(f40Var.F1, c8.ma.e(-2, 52, 81));
                    f40Var.F1.p(null, null, false);
                    f40Var.B1.bringToFront();
                    f40Var.A1.bringToFront();
                    vi0Var = f40Var.F1;
                }
            }
            f40Var.F1 = vi0Var;
        }
        k20Var.L(f11.d, false);
        f40Var.B3.j(l1Var);
        return r0.l1.f56257b;
    }

    @Override
    public boolean c(int i7, View view) {
        switch (this.f52885a) {
            case 0:
                f40 f40Var = this.f52886b;
                if (f40Var.M1(view)) {
                    try {
                        f40Var.L1.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                f40 f40Var2 = this.f52886b;
                if (!f40Var2.v1()) {
                    if (view instanceof org.telegram.ui.Components.voip.r) {
                        return f40Var2.M1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.g4) {
                        f40Var2.P1();
                        org.telegram.ui.Components.ph0 ph0Var = ((org.telegram.ui.Cells.g4) view).f30659f;
                        if (ph0Var.isEnabled()) {
                            ph0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void g(int i7) {
        this.f52886b.J1.getActionBarMenuOnItemClick().b(i7);
    }

    @Override
    public void j(KeyEvent keyEvent) {
        f40 f40Var;
        h30 h30Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h30Var = (f40Var = this.f52886b).f47417e5) != null && h30Var.isShowing()) {
            f40Var.f47417e5.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        ArrayList arrayList;
        v4.f1 K;
        f40 f40Var = this.f52886b;
        x10 x10Var = f40Var.f47443l4;
        b20 b20Var = f40Var.Z3;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) f40Var.V2.f26947p.get(iArr[i7]);
            if (groupCallParticipant != null) {
                if (!b20Var.f40973b) {
                    if (f40Var.f47450n2) {
                        arrayList = f40Var.f47503y2;
                    } else {
                        arrayList = f40Var.V2.f26939g;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = f40Var.L1.K(indexOf + f40Var.K1.d)) != null) {
                        View view = K.f59123a;
                        if (view instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) view).setAmplitude(fArr[i7] * 15.0f);
                            if (view == f40Var.W4 && !f40Var.f47439k4) {
                                f40Var.f30190b.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i10 = 0; i10 < x10Var.getChildCount(); i10++) {
                        org.telegram.ui.Components.r10 r10Var = (org.telegram.ui.Components.r10) x10Var.getChildAt(i10);
                        if (org.telegram.messenger.fj.B1(r10Var.getParticipant().peer) == org.telegram.messenger.fj.B1(groupCallParticipant.peer)) {
                            r10Var.setAmplitude(fArr[i7] * 15.0f);
                        }
                    }
                }
                b20Var.k(groupCallParticipant, fArr[i7] * 15.0f);
            }
        }
    }
}
