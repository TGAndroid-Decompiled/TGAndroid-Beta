package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
public final class r00 implements org.telegram.ui.Components.dj0, r0.m, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.m0 {
    public final int f49323a;
    public final c40 f49324b;

    public r00(c40 c40Var, int i7) {
        this.f49323a = i7;
        this.f49324b = c40Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int keyboardHeight;
        r0.h1 h1Var = k1Var.f54084a;
        i0.b f10 = h1Var.f(647);
        i0.b f11 = h1Var.f(8);
        c40 c40Var = this.f49324b;
        h20 h20Var = c40Var.f44627y1;
        if (!h20Var.N && !h20Var.f35416e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = h20Var.getKeyboardHeight();
        }
        int max = Math.max(f11.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = c40Var.S3.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f10.d;
        }
        if (h20Var.getEmojiView() != null) {
            h20Var.getEmojiView().setBottomInset(f10.d);
        }
        if (c40Var.J4) {
            ViewGroup viewGroup = c40Var.f28615b;
            int i7 = c40Var.f28645t0;
            viewGroup.setPadding(i7, 0, i7, 0);
        } else {
            ViewGroup viewGroup2 = c40Var.f28615b;
            int i10 = c40Var.f28645t0;
            viewGroup2.setPadding(f10.f15117a + i10, f10.f15118b, i10 + f10.f15119c, f10.d);
        }
        c40Var.f28615b.requestLayout();
        if (max == 0 && !h20Var.N && !h20Var.f35416e && !h20Var.O) {
            h20Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.ii0 ii0Var = c40Var.B1;
            if (ii0Var == null) {
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                ii0Var = null;
                if (Q != null) {
                    org.telegram.ui.Components.ii0 ii0Var2 = new org.telegram.ui.Components.ii0(1, c40Var.f28612a, c40Var.getContext(), Q, c40Var.I0);
                    c40Var.B1 = ii0Var2;
                    ii0Var2.setDelegate(new g30(c40Var));
                    c40Var.f28615b.addView(c40Var.B1, c8.ha.e(-2, 52, 81));
                    c40Var.B1.p(null, null, false);
                    c40Var.f44623x1.bringToFront();
                    c40Var.f44619w1.bringToFront();
                    ii0Var = c40Var.B1;
                }
            }
            c40Var.B1 = ii0Var;
        }
        h20Var.K(f11.d, false);
        c40Var.f44608t3.j(k1Var);
        return r0.k1.f54083b;
    }

    @Override
    public boolean c(int i7, View view) {
        switch (this.f49323a) {
            case 0:
                c40 c40Var = this.f49324b;
                if (c40Var.L1(view)) {
                    try {
                        c40Var.H1.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                c40 c40Var2 = this.f49324b;
                if (!c40Var2.u1()) {
                    if (view instanceof org.telegram.ui.Components.voip.r) {
                        return c40Var2.L1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        c40Var2.O1();
                        org.telegram.ui.Components.ch0 ch0Var = ((org.telegram.ui.Cells.f4) view).f29106f;
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
        this.f49324b.F1.getActionBarMenuOnItemClick().b(i7);
    }

    @Override
    public void j(KeyEvent keyEvent) {
        c40 c40Var;
        e30 e30Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (e30Var = (c40Var = this.f49324b).W4) != null && e30Var.isShowing()) {
            c40Var.W4.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        ArrayList arrayList;
        v4.d1 K;
        c40 c40Var = this.f49324b;
        v10 v10Var = c40Var.f44538d4;
        z10 z10Var = c40Var.R3;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) c40Var.R2.f25213p.get(iArr[i7]);
            if (groupCallParticipant != null) {
                if (!z10Var.f39240b) {
                    if (c40Var.f44562j2) {
                        arrayList = c40Var.f44612u2;
                    } else {
                        arrayList = c40Var.R2.f25205g;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = c40Var.H1.K(indexOf + c40Var.G1.d)) != null) {
                        View view = K.f56927a;
                        if (view instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) view).setAmplitude(fArr[i7] * 15.0f);
                            if (view == c40Var.O4 && !c40Var.f44535c4) {
                                c40Var.f28615b.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i10 = 0; i10 < v10Var.getChildCount(); i10++) {
                        org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) v10Var.getChildAt(i10);
                        if (org.telegram.messenger.ij.C1(g10Var.getParticipant().peer) == org.telegram.messenger.ij.C1(groupCallParticipant.peer)) {
                            g10Var.setAmplitude(fArr[i7] * 15.0f);
                        }
                    }
                }
                z10Var.k(groupCallParticipant, fArr[i7] * 15.0f);
            }
        }
    }
}
