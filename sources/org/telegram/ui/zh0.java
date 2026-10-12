package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zh0 extends org.telegram.ui.Components.vm0 {
    public final Context f44846c;
    public final ai0 d;

    public zh0(ai0 ai0Var, Context context) {
        this.d = ai0Var;
        this.f44846c = context;
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47889a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int b10 = d1Var.b();
        ai0 ai0Var = this.d;
        if (ai0Var.Q != b10 && ai0Var.f35841x != b10) {
            if (b10 < ai0Var.f35842y || b10 >= ai0Var.E) {
                if ((b10 < ai0Var.H || b10 >= ai0Var.I) && b10 != ai0Var.N) {
                    if (b10 >= ai0Var.U && b10 < ai0Var.V) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.X;
    }

    @Override
    public final int j(int i10) {
        ai0 ai0Var = this.d;
        if (i10 == ai0Var.f35835r) {
            return 0;
        }
        if (i10 == ai0Var.f35837s || i10 == ai0Var.L || i10 == ai0Var.S || i10 == ai0Var.P) {
            return 1;
        }
        if (i10 == ai0Var.v) {
            return 2;
        }
        if (i10 == ai0Var.f35841x) {
            return 3;
        }
        if (i10 != ai0Var.f35840w && i10 != ai0Var.J && i10 != ai0Var.M && i10 != ai0Var.R && i10 != ai0Var.T) {
            if (i10 < ai0Var.f35842y || i10 >= ai0Var.E) {
                if (i10 >= ai0Var.H && i10 < ai0Var.I) {
                    return 5;
                }
                if (i10 == ai0Var.F) {
                    return 6;
                }
                if (i10 == ai0Var.K) {
                    return 7;
                }
                if (i10 == ai0Var.N) {
                    return 8;
                }
                if (i10 == ai0Var.O) {
                    return 9;
                }
                if (i10 != ai0Var.Q) {
                    if (i10 < ai0Var.U || i10 >= ai0Var.V) {
                        if (i10 != ai0Var.G) {
                            return 1;
                        }
                        return 11;
                    }
                    return 10;
                }
                return 10;
            }
            return 5;
        }
        return 4;
    }

    @Override
    public final void v(s4.d1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zh0.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.ba0 ba0Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i11;
        ai0 ai0Var = this.d;
        Context context = this.f44846c;
        switch (i10) {
            case 1:
                ba0Var = new org.telegram.ui.Cells.m4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.ba0 ba0Var2 = new org.telegram.ui.Components.ba0(this.f44846c, ai0Var, null, true, ai0Var.h);
                ba0Var2.setPermanent(true);
                ba0Var2.setDelegate(new yh0(this, ba0Var2));
                ba0Var = ba0Var2;
                break;
            case 3:
                c6Var = ((org.telegram.ui.ActionBar.m2) ai0Var).resourceProvider;
                ba0Var = new org.telegram.ui.Cells.g2(context, 64, c6Var);
                break;
            case 4:
                ba0Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 5:
                ba0Var = new xh0(ai0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context, null);
                m10Var.setIsSingleCell(true);
                m10Var.setViewType(9);
                m10Var.f28355w = false;
                ba0Var = m10Var;
                break;
            case 7:
                ba0Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
                caVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                caVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20780p7, false));
                ba0Var = caVar;
                break;
            case 9:
                ba0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 10:
                ba0Var = new org.telegram.ui.Cells.b5(8, 6, this.f44846c, null, false);
                break;
            case 11:
                c6Var2 = ((org.telegram.ui.ActionBar.m2) ai0Var).resourceProvider;
                ba0Var = new org.telegram.ui.Cells.e9(context, c6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new sh0(context), w7.w5.a(-2.0f, 0.0f, 10.0f, 0.0f, 0.0f, -2, 49));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20618g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (ai0Var.h) {
                    i11 = R.string.PrimaryLinkHelpChannel;
                } else {
                    i11 = R.string.PrimaryLinkHelp;
                }
                textView.setText(LocaleController.getString(i11));
                frameLayout.addView(textView, w7.w5.a(-2.0f, 52.0f, 143.0f, 52.0f, 18.0f, -1, 51));
                frameLayout.setTag(-33024);
                ba0Var = frameLayout;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(ba0Var, ba0Var, -1, -2);
    }
}
