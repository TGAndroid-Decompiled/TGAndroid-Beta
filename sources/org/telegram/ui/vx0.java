package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.qq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.rc1;
import org.telegram.ui.vx0;
public final class vx0 extends org.telegram.ui.Cells.b7 {
    public final wx0 h;

    public vx0(wx0 wx0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.h = wx0Var;
        this.f21735f = org.telegram.messenger.e20.f15506s0;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f21732a = textView;
        sc.e.t(textView, 1, 15.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (org.telegram.messenger.dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.L6, p6Var);
        if (org.telegram.messenger.dd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView, w7.b6.t(-1, -2, i11 | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, p6Var);
        this.f21733b = p80Var;
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        p80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.J6, p6Var);
        org.telegram.ui.ActionBar.a7.D(p80Var, org.telegram.ui.ActionBar.t6.K6, p6Var);
        p80Var.setMovementMethod(new org.telegram.messenger.e0(false));
        if (org.telegram.messenger.dd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        p80Var.setGravity(i12);
        if (org.telegram.messenger.dd.X) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(p80Var, w7.b6.t(-2, -2, i13, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.b6.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i16 = 0; i16 < 2; i16++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 8.0f));
            w7.e6.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.messenger.m5.m(textView2, org.telegram.ui.ActionBar.t6.Gi, p6Var, 1, 14.0f);
            if (i16 == 0) {
                i14 = 0;
            } else {
                i14 = 4;
            }
            if (i16 == 0) {
                i15 = 4;
            } else {
                i15 = 0;
            }
            linearLayout.addView(textView2, w7.b6.m(0.5f, 0, 44, i14, i15, 0));
            if (i16 == 0) {
                this.f21734c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final vx0 f21680b;

                    {
                        this.f21680b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                vx0 vx0Var = this.f21680b;
                                org.telegram.messenger.i0.g3(new qq(vx0Var, vx0Var.e, 19));
                                return;
                            default:
                                vx0 vx0Var2 = this.f21680b;
                                int i17 = vx0Var2.e;
                                ProfileActivity profileActivity = vx0Var2.h.e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.f(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new rc1(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final vx0 f21680b;

                    {
                        this.f21680b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                vx0 vx0Var = this.f21680b;
                                org.telegram.messenger.i0.g3(new qq(vx0Var, vx0Var.e, 19));
                                return;
                            default:
                                vx0 vx0Var2 = this.f21680b;
                                int i17 = vx0Var2.e;
                                ProfileActivity profileActivity = vx0Var2.h.e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.f(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new rc1(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}
