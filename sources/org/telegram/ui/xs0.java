package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class xs0 extends org.telegram.ui.Components.tk0 {
    public final Context f43453c;
    public final zs0 d;

    public xs0(zs0 zs0Var, Context context) {
        this.d = zs0Var;
        this.f43453c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        zs0 zs0Var = this.d;
        if (b10 != zs0Var.f44064i0 && b10 != zs0Var.f44078u0 && b10 != zs0Var.f44079v0) {
            if (zs0Var.I && b10 >= (i10 = zs0Var.f44069n0) && b10 < zs0Var.D + i10) {
                if (b10 - i10 < zs0Var.f44084y) {
                    return false;
                }
            } else if (b10 != zs0Var.f44070o0 && b10 != zs0Var.f44074r0 && b10 != zs0Var.f44076s0 && (zs0Var.N != 0 || b10 != zs0Var.f44077t0)) {
                return false;
            }
            return true;
        }
        return !zs0Var.I;
    }

    @Override
    public final int b() {
        return this.d.f44083x0;
    }

    @Override
    public final int d(int i10) {
        zs0 zs0Var = this.d;
        if (i10 != zs0Var.f44063h0 && i10 != zs0Var.m0 && i10 != zs0Var.f44072q0) {
            if (i10 == zs0Var.f44067l0) {
                return 1;
            }
            if (i10 != zs0Var.f44071p0 && i10 != zs0Var.f44081w0 && i10 != zs0Var.f44066k0) {
                if (i10 == zs0Var.f44070o0) {
                    return 3;
                }
                if (i10 == zs0Var.f44064i0) {
                    return 4;
                }
                if (i10 == zs0Var.f44065j0) {
                    return 7;
                }
                if (i10 != zs0Var.f44074r0 && i10 != zs0Var.f44076s0 && i10 != zs0Var.f44077t0 && i10 != zs0Var.f44078u0 && i10 != zs0Var.f44079v0) {
                    return 5;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        float f7;
        int i13;
        int i14;
        zs0 zs0Var = this.d;
        int i15 = zs0Var.N;
        boolean z10 = zs0Var.f44058d0;
        int i16 = c1Var.f47912f;
        View view = c1Var.f47909a;
        boolean z11 = true;
        if (i16 != 0) {
            boolean z12 = false;
            if (i16 != 6) {
                Context context = this.f43453c;
                if (i16 != 2) {
                    if (i16 == 3) {
                        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                        p8Var.g(-1, org.telegram.ui.ActionBar.t6.q6);
                        Drawable drawable = context.getResources().getDrawable(2131232556);
                        Drawable drawable2 = context.getResources().getDrawable(2131232557);
                        int i17 = org.telegram.ui.ActionBar.t6.N6;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.a7.y(p8Var, drawable, i17, null, mode);
                        org.telegram.ui.ActionBar.a7.y(p8Var, drawable2, org.telegram.ui.ActionBar.t6.f21060k7, null, mode);
                        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(drawable, drawable2);
                        if (z10) {
                            i14 = 2131744093;
                        } else {
                            i14 = 2131754471;
                        }
                        p8Var.p(org.telegram.messenger.dd.L0(i14, null), eqVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                b9Var.setFixedSize(0);
                org.telegram.ui.ActionBar.a7.a0(b9Var, context, 2131231231, org.telegram.ui.ActionBar.t6.f20893b7);
                if (i10 == zs0Var.f44066k0) {
                    b9Var.setText(org.telegram.messenger.dd.L0(2131754472, null));
                    return;
                } else if (i10 == zs0Var.f44081w0) {
                    b9Var.setFixedSize(12);
                    b9Var.setText(null);
                    return;
                } else {
                    int i18 = zs0Var.f44068n - zs0Var.D;
                    if (i18 <= 0) {
                        if (z10) {
                            i13 = 2131744133;
                        } else {
                            i13 = 2131754469;
                        }
                        b9Var.setText(org.telegram.messenger.dd.L0(i13, null));
                        return;
                    } else if (z10) {
                        b9Var.setText(org.telegram.messenger.dd.H(',', "TodoNewTaskInfo", i18));
                        return;
                    } else {
                        b9Var.setText(org.telegram.messenger.dd.a0("AddAnOptionInfo", null, 2131754470, org.telegram.messenger.dd.G(i18, "Option", new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            t8Var.setEnabled(!zs0Var.I);
            Switch checkBox = t8Var.getCheckBox();
            if (!zs0Var.I) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            checkBox.setAlpha(f7);
            if (i10 == zs0Var.f44078u0) {
                t8Var.f(org.telegram.messenger.dd.L0(2131744118, null), zs0Var.H, true);
                t8Var.e(null, true);
                return;
            } else if (i10 == zs0Var.f44079v0) {
                t8Var.f(org.telegram.messenger.dd.L0(2131744117, null), zs0Var.J, false);
                t8Var.e(null, true);
                return;
            } else if (i10 == zs0Var.f44074r0) {
                String L0 = org.telegram.messenger.dd.L0(2131747193, null);
                boolean z13 = zs0Var.G;
                if (zs0Var.f44076s0 != -1 || zs0Var.f44077t0 != -1) {
                    z12 = true;
                }
                t8Var.f(L0, z13, z12);
                t8Var.e(null, true);
                return;
            } else if (i10 == zs0Var.f44076s0) {
                String L02 = org.telegram.messenger.dd.L0(2131747181, null);
                boolean z14 = zs0Var.K;
                if (zs0Var.f44077t0 != -1) {
                    z12 = true;
                }
                t8Var.f(L02, z14, z12);
                t8Var.e(null, true);
                return;
            } else if (i10 == zs0Var.f44077t0) {
                t8Var.f(org.telegram.messenger.dd.L0(2131747179, null), zs0Var.L, false);
                if (i15 != 0) {
                    z11 = false;
                }
                t8Var.e(null, z11);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
        if (i10 == zs0Var.f44063h0) {
            if (z10) {
                if (zs0Var.f44086z0 != null) {
                    i12 = 2131744099;
                } else {
                    i12 = 2131744079;
                }
            } else {
                i12 = 2131747180;
            }
            p4Var.setText(org.telegram.messenger.dd.L0(i12, null));
        } else if (i10 == zs0Var.m0) {
            if (i15 == 1) {
                p4Var.setText(org.telegram.messenger.dd.L0(2131746462, null));
                return;
            }
            if (z10) {
                i11 = 2131744097;
            } else {
                i11 = 2131754246;
            }
            p4Var.setText(org.telegram.messenger.dd.L0(i11, null));
        } else if (i10 == zs0Var.f44072q0) {
            p4Var.setText(org.telegram.messenger.dd.L0(2131745512, null));
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        ws0 ws0Var;
        zs0 zs0Var = this.d;
        boolean z10 = zs0Var.f44057c0;
        if (i10 != 0) {
            Context context = this.f43453c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    ws0 ws0Var2 = new ws0(this, context, z10 ? 1 : 0, new e50(zs0Var, 22));
                                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, ws0Var2, null);
                                    ws0Var2.b(new ag.u2(this, ws0Var2, false, 9));
                                    ws0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = ws0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new xd(3, this, ws0Var2));
                                    textView.setOnKeyListener(new og(ws0Var2, 2));
                                    ws0Var = ws0Var2;
                                } else {
                                    vs0 vs0Var = new vs0(this, context, z10 ? 1 : 0);
                                    vs0Var.c();
                                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, vs0Var, null);
                                    vs0Var.b(new ag.u2(this, vs0Var, false, 8));
                                    ws0Var = vs0Var;
                                }
                            } else {
                                View t8Var = new org.telegram.ui.Cells.t8(context);
                                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, t8Var, null);
                                ws0Var = t8Var;
                            }
                        } else {
                            us0 us0Var = new us0(this, context, z10 ? 1 : 0);
                            us0Var.c();
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, us0Var, null);
                            us0Var.b(new ag.u2(this, us0Var, false, 7));
                            ws0Var = us0Var;
                        }
                    } else {
                        View p8Var = new org.telegram.ui.Cells.p8(context);
                        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, p8Var, null);
                        ws0Var = p8Var;
                    }
                } else {
                    ws0Var = new org.telegram.ui.Cells.b9(context);
                }
            } else {
                ws0Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
            }
        } else {
            View p4Var = new org.telegram.ui.Cells.p4(this.f43453c, org.telegram.ui.ActionBar.t6.L6, 21, 15, false, null);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, p4Var, null);
            ws0Var = p4Var;
        }
        return sc.e.o(ws0Var, ws0Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        zs0 zs0Var = this.d;
        boolean z11 = zs0Var.f44058d0;
        int i13 = c1Var.f47912f;
        View view = c1Var.f47909a;
        float f7 = 0.6f;
        CharSequence charSequence = "";
        float f10 = 1.0f;
        if (i13 == 4) {
            org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
            e6Var.setTag(1);
            ih.b bVar = e6Var.d;
            CharSequence charSequence2 = zs0Var.E;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z11) {
                i12 = 2131744078;
            } else {
                i12 = 2131746463;
            }
            e6Var.n(charSequence, org.telegram.messenger.dd.L0(i12, null), false);
            e6Var.setTag(null);
            e6Var.setEnabled(!zs0Var.I);
            bVar.setEnabled(true ^ zs0Var.I);
            int i14 = org.telegram.ui.ActionBar.t6.G6;
            if (!zs0Var.I) {
                f7 = 1.0f;
            }
            org.telegram.ui.ActionBar.a7.W(bVar, org.telegram.ui.ActionBar.a7.L(f7, i14), zs0Var.getResourceProvider());
            zs0.h0(zs0Var, view, c1Var.b());
        } else if (i13 == 5) {
            int b10 = c1Var.b();
            org.telegram.ui.Cells.e6 e6Var2 = (org.telegram.ui.Cells.e6) view;
            e6Var2.setTag(1);
            ih.b bVar2 = e6Var2.d;
            int i15 = b10 - zs0Var.f44069n0;
            if (zs0Var.I && i15 < zs0Var.f44084y) {
                z10 = false;
            } else {
                z10 = true;
            }
            bVar2.setEnabled(z10);
            int i16 = org.telegram.ui.ActionBar.t6.G6;
            if (z10) {
                f7 = 1.0f;
            }
            org.telegram.ui.ActionBar.a7.W(bVar2, org.telegram.ui.ActionBar.a7.L(f7, i16), zs0Var.getResourceProvider());
            CharSequence charSequence3 = zs0Var.f44080w[i15];
            if (z11) {
                i10 = 2131744080;
            } else {
                i10 = 2131747790;
            }
            e6Var2.n(charSequence3, org.telegram.messenger.dd.L0(i10, null), true);
            e6Var2.setTag(null);
            ImageView imageView = e6Var2.f21862f;
            if (imageView != null) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
            }
            ImageView imageView2 = e6Var2.h;
            if (imageView2 != null) {
                if (!z10) {
                    f10 = 0.45f;
                }
                imageView2.setAlpha(f10);
            }
            if (!zs0Var.f44061f0 && zs0Var.f44062g0 == b10) {
                EditTextBoldCursor textView = e6Var2.getTextView();
                textView.requestFocus();
                org.telegram.messenger.i0.J3(textView);
                zs0Var.f44061f0 = false;
                zs0Var.f44062g0 = -1;
            }
            zs0.h0(zs0Var, view, b10);
        } else if (i13 == 7) {
            org.telegram.ui.Cells.e6 e6Var3 = (org.telegram.ui.Cells.e6) view;
            e6Var3.setTag(1);
            CharSequence charSequence4 = zs0Var.F;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            e6Var3.n(charSequence, org.telegram.messenger.dd.L0(2131754474, null), false);
            e6Var3.setTag(null);
            zs0.h0(zs0Var, view, c1Var.b());
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.e6) c1Var.f47909a).getTextView();
            if (textView.isFocused()) {
                zs0 zs0Var = this.d;
                if (zs0Var.f44057c0) {
                    org.telegram.ui.Components.tx0 tx0Var = zs0Var.Q;
                    if (tx0Var != null) {
                        tx0Var.f();
                    }
                    zs0Var.p0(true);
                }
                zs0Var.f44055b0 = null;
                textView.clearFocus();
                org.telegram.messenger.i0.v1(textView);
            }
        }
    }
}
