package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class qr0 extends org.telegram.ui.Components.oj0 {
    public final Context f49143c;
    public final sr0 d;

    public qr0(sr0 sr0Var, Context context) {
        this.d = sr0Var;
        this.f49143c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7;
        int b10 = d1Var.b();
        sr0 sr0Var = this.d;
        if (b10 != sr0Var.f49932i0 && b10 != sr0Var.f49946u0 && b10 != sr0Var.f49947v0) {
            if (sr0Var.I && b10 >= (i7 = sr0Var.f49937n0) && b10 < sr0Var.D + i7) {
                if (b10 - i7 < sr0Var.f49952y) {
                    return false;
                }
            } else if (b10 != sr0Var.f49938o0 && b10 != sr0Var.f49942r0 && b10 != sr0Var.f49944s0 && (sr0Var.N != 0 || b10 != sr0Var.f49945t0)) {
                return false;
            }
            return true;
        }
        return !sr0Var.I;
    }

    @Override
    public final int b() {
        return this.d.f49951x0;
    }

    @Override
    public final int d(int i7) {
        sr0 sr0Var = this.d;
        if (i7 != sr0Var.f49931h0 && i7 != sr0Var.m0 && i7 != sr0Var.f49940q0) {
            if (i7 == sr0Var.f49935l0) {
                return 1;
            }
            if (i7 != sr0Var.f49939p0 && i7 != sr0Var.f49949w0 && i7 != sr0Var.f49934k0) {
                if (i7 == sr0Var.f49938o0) {
                    return 3;
                }
                if (i7 == sr0Var.f49932i0) {
                    return 4;
                }
                if (i7 == sr0Var.f49933j0) {
                    return 7;
                }
                if (i7 != sr0Var.f49942r0 && i7 != sr0Var.f49944s0 && i7 != sr0Var.f49945t0 && i7 != sr0Var.f49946u0 && i7 != sr0Var.f49947v0) {
                    return 5;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        int i11;
        float f10;
        int i12;
        int i13;
        sr0 sr0Var = this.d;
        int i14 = sr0Var.N;
        boolean z9 = sr0Var.f49925d0;
        int i15 = d1Var.f57056f;
        View view = d1Var.f57052a;
        boolean z10 = true;
        if (i15 != 0) {
            boolean z11 = false;
            if (i15 != 6) {
                Context context = this.f49143c;
                if (i15 != 2) {
                    if (i15 == 3) {
                        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                        m8Var.g(-1, org.telegram.ui.ActionBar.m6.f28130q6);
                        Drawable drawable = context.getResources().getDrawable(2131232559);
                        Drawable drawable2 = context.getResources().getDrawable(2131232560);
                        int i16 = org.telegram.ui.ActionBar.m6.N6;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.t6.x(m8Var, drawable, i16, null, mode);
                        org.telegram.ui.ActionBar.t6.x(m8Var, drawable2, org.telegram.ui.ActionBar.m6.f28020k7, null, mode);
                        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(drawable, drawable2);
                        if (z9) {
                            i13 = 2131744068;
                        } else {
                            i13 = 2131754471;
                        }
                        m8Var.p(org.telegram.messenger.id.M0(i13, null), xpVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.setFixedSize(0);
                org.telegram.ui.ActionBar.t6.Z(z8Var, context, 2131231230, org.telegram.ui.ActionBar.m6.f27854b7);
                if (i7 == sr0Var.f49934k0) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131754472, null));
                    return;
                } else if (i7 == sr0Var.f49949w0) {
                    z8Var.setFixedSize(12);
                    z8Var.setText(null);
                    return;
                } else {
                    int i17 = sr0Var.f49936n - sr0Var.D;
                    if (i17 <= 0) {
                        if (z9) {
                            i12 = 2131744108;
                        } else {
                            i12 = 2131754469;
                        }
                        z8Var.setText(org.telegram.messenger.id.M0(i12, null));
                        return;
                    } else if (z9) {
                        z8Var.setText(org.telegram.messenger.id.H(',', "TodoNewTaskInfo", i17));
                        return;
                    } else {
                        z8Var.setText(org.telegram.messenger.id.a0("AddAnOptionInfo", null, 2131754470, org.telegram.messenger.id.G(i17, "Option", new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.setEnabled(!sr0Var.I);
            Switch checkBox = r8Var.getCheckBox();
            if (!sr0Var.I) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            checkBox.setAlpha(f10);
            if (i7 == sr0Var.f49946u0) {
                r8Var.f(org.telegram.messenger.id.M0(2131744093, null), sr0Var.H, true);
                r8Var.e(null, true);
                return;
            } else if (i7 == sr0Var.f49947v0) {
                r8Var.f(org.telegram.messenger.id.M0(2131744092, null), sr0Var.J, false);
                r8Var.e(null, true);
                return;
            } else if (i7 == sr0Var.f49942r0) {
                String M0 = org.telegram.messenger.id.M0(2131747178, null);
                boolean z12 = sr0Var.G;
                if (sr0Var.f49944s0 != -1 || sr0Var.f49945t0 != -1) {
                    z11 = true;
                }
                r8Var.f(M0, z12, z11);
                r8Var.e(null, true);
                return;
            } else if (i7 == sr0Var.f49944s0) {
                String M02 = org.telegram.messenger.id.M0(2131747166, null);
                boolean z13 = sr0Var.K;
                if (sr0Var.f49945t0 != -1) {
                    z11 = true;
                }
                r8Var.f(M02, z13, z11);
                r8Var.e(null, true);
                return;
            } else if (i7 == sr0Var.f49945t0) {
                r8Var.f(org.telegram.messenger.id.M0(2131747164, null), sr0Var.L, false);
                if (i14 != 0) {
                    z10 = false;
                }
                r8Var.e(null, z10);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
        if (i7 == sr0Var.f49931h0) {
            if (z9) {
                if (sr0Var.f49954z0 != null) {
                    i11 = 2131744074;
                } else {
                    i11 = 2131744054;
                }
            } else {
                i11 = 2131747165;
            }
            n4Var.setText(org.telegram.messenger.id.M0(i11, null));
        } else if (i7 == sr0Var.m0) {
            if (i14 == 1) {
                n4Var.setText(org.telegram.messenger.id.M0(2131746447, null));
                return;
            }
            if (z9) {
                i10 = 2131744072;
            } else {
                i10 = 2131754246;
            }
            n4Var.setText(org.telegram.messenger.id.M0(i10, null));
        } else if (i7 == sr0Var.f49940q0) {
            n4Var.setText(org.telegram.messenger.id.M0(2131745495, null));
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        pr0 pr0Var;
        sr0 sr0Var = this.d;
        boolean z9 = sr0Var.f49924c0;
        if (i7 != 0) {
            Context context = this.f49143c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    pr0 pr0Var2 = new pr0(this, context, z9 ? 1 : 0, new j40(sr0Var, 22));
                                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, pr0Var2, null);
                                    pr0Var2.b(new fi.h7(9, this, pr0Var2));
                                    pr0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = pr0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new nd(3, this, pr0Var2));
                                    textView.setOnKeyListener(new wf(pr0Var2, 2));
                                    pr0Var = pr0Var2;
                                } else {
                                    or0 or0Var = new or0(this, context, z9 ? 1 : 0);
                                    or0Var.c();
                                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, or0Var, null);
                                    or0Var.b(new fi.h7(8, this, or0Var));
                                    pr0Var = or0Var;
                                }
                            } else {
                                View r8Var = new org.telegram.ui.Cells.r8(context);
                                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, r8Var, null);
                                pr0Var = r8Var;
                            }
                        } else {
                            nr0 nr0Var = new nr0(this, context, z9 ? 1 : 0);
                            nr0Var.c();
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, nr0Var, null);
                            nr0Var.b(new fi.h7(7, this, nr0Var));
                            pr0Var = nr0Var;
                        }
                    } else {
                        View m8Var = new org.telegram.ui.Cells.m8(context);
                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, m8Var, null);
                        pr0Var = m8Var;
                    }
                } else {
                    pr0Var = new org.telegram.ui.Cells.z8(context);
                }
            } else {
                pr0Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
            }
        } else {
            View n4Var = new org.telegram.ui.Cells.n4(this.f49143c, org.telegram.ui.ActionBar.m6.L6, 21, 15, false, null);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, n4Var, null);
            pr0Var = n4Var;
        }
        return jg.g.r(pr0Var, pr0Var, -1, -2);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        boolean z9;
        int i7;
        int i10;
        int i11;
        sr0 sr0Var = this.d;
        boolean z10 = sr0Var.f49925d0;
        int i12 = d1Var.f57056f;
        View view = d1Var.f57052a;
        float f10 = 0.6f;
        CharSequence charSequence = "";
        float f11 = 1.0f;
        if (i12 == 4) {
            org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
            a6Var.setTag(1);
            org.telegram.ui.Cells.z5 z5Var = a6Var.d;
            CharSequence charSequence2 = sr0Var.E;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z10) {
                i11 = 2131744053;
            } else {
                i11 = 2131746448;
            }
            a6Var.n(charSequence, org.telegram.messenger.id.M0(i11, null), false);
            a6Var.setTag(null);
            a6Var.setEnabled(!sr0Var.I);
            z5Var.setEnabled(true ^ sr0Var.I);
            int i13 = org.telegram.ui.ActionBar.m6.G6;
            if (!sr0Var.I) {
                f10 = 1.0f;
            }
            org.telegram.ui.ActionBar.t6.V(z5Var, org.telegram.ui.ActionBar.t6.K(f10, i13), sr0Var.getResourceProvider());
            sr0.h0(sr0Var, view, d1Var.b());
        } else if (i12 == 5) {
            int b10 = d1Var.b();
            org.telegram.ui.Cells.a6 a6Var2 = (org.telegram.ui.Cells.a6) view;
            a6Var2.setTag(1);
            org.telegram.ui.Cells.z5 z5Var2 = a6Var2.d;
            int i14 = b10 - sr0Var.f49937n0;
            if (sr0Var.I && i14 < sr0Var.f49952y) {
                z9 = false;
            } else {
                z9 = true;
            }
            z5Var2.setEnabled(z9);
            int i15 = org.telegram.ui.ActionBar.m6.G6;
            if (z9) {
                f10 = 1.0f;
            }
            org.telegram.ui.ActionBar.t6.V(z5Var2, org.telegram.ui.ActionBar.t6.K(f10, i15), sr0Var.getResourceProvider());
            CharSequence charSequence3 = sr0Var.f49948w[i14];
            if (z10) {
                i7 = 2131744055;
            } else {
                i7 = 2131747774;
            }
            a6Var2.n(charSequence3, org.telegram.messenger.id.M0(i7, null), true);
            a6Var2.setTag(null);
            ImageView imageView = a6Var2.f28907f;
            if (imageView != null) {
                if (z9) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                imageView.setVisibility(i10);
            }
            ImageView imageView2 = a6Var2.h;
            if (imageView2 != null) {
                if (!z9) {
                    f11 = 0.45f;
                }
                imageView2.setAlpha(f11);
            }
            if (!sr0Var.f49929f0 && sr0Var.f49930g0 == b10) {
                EditTextBoldCursor textView = a6Var2.getTextView();
                textView.requestFocus();
                org.telegram.messenger.g0.K3(textView);
                sr0Var.f49929f0 = false;
                sr0Var.f49930g0 = -1;
            }
            sr0.h0(sr0Var, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.a6 a6Var3 = (org.telegram.ui.Cells.a6) view;
            a6Var3.setTag(1);
            CharSequence charSequence4 = sr0Var.F;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            a6Var3.n(charSequence, org.telegram.messenger.id.M0(2131754474, null), false);
            a6Var3.setTag(null);
            sr0.h0(sr0Var, view, d1Var.b());
        }
    }

    @Override
    public final void z(v4.d1 d1Var) {
        int i7 = d1Var.f57056f;
        if (i7 == 4 || i7 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.a6) d1Var.f57052a).getTextView();
            if (textView.isFocused()) {
                sr0 sr0Var = this.d;
                if (sr0Var.f49924c0) {
                    org.telegram.ui.Components.ow0 ow0Var = sr0Var.Q;
                    if (ow0Var != null) {
                        ow0Var.f();
                    }
                    sr0Var.p0(true);
                }
                sr0Var.f49922b0 = null;
                textView.clearFocus();
                org.telegram.messenger.g0.v1(textView);
            }
        }
    }
}
