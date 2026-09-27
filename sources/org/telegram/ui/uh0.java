package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uh0 extends org.telegram.ui.Components.xl0 {
    public final Context f38258c;
    public final vh0 d;

    public uh0(vh0 vh0Var, Context context) {
        this.d = vh0Var;
        this.f38258c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f43005a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        vh0 vh0Var = this.d;
        if (vh0Var.Q != b10 && vh0Var.f38609x != b10) {
            if (b10 < vh0Var.f38610y || b10 >= vh0Var.E) {
                if ((b10 < vh0Var.H || b10 >= vh0Var.I) && b10 != vh0Var.N) {
                    if (b10 >= vh0Var.U && b10 < vh0Var.V) {
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
        vh0 vh0Var = this.d;
        if (i10 == vh0Var.f38603r) {
            return 0;
        }
        if (i10 == vh0Var.f38605s || i10 == vh0Var.L || i10 == vh0Var.S || i10 == vh0Var.P) {
            return 1;
        }
        if (i10 == vh0Var.v) {
            return 2;
        }
        if (i10 == vh0Var.f38609x) {
            return 3;
        }
        if (i10 != vh0Var.f38608w && i10 != vh0Var.J && i10 != vh0Var.M && i10 != vh0Var.R && i10 != vh0Var.T) {
            if (i10 < vh0Var.f38610y || i10 >= vh0Var.E) {
                if (i10 >= vh0Var.H && i10 < vh0Var.I) {
                    return 5;
                }
                if (i10 == vh0Var.F) {
                    return 6;
                }
                if (i10 == vh0Var.K) {
                    return 7;
                }
                if (i10 == vh0Var.N) {
                    return 8;
                }
                if (i10 == vh0Var.O) {
                    return 9;
                }
                if (i10 != vh0Var.Q) {
                    if (i10 < vh0Var.U || i10 >= vh0Var.V) {
                        if (i10 != vh0Var.G) {
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
    public final void v(s4.c1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uh0.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.i90 i90Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i11;
        vh0 vh0Var = this.d;
        Context context = this.f38258c;
        switch (i10) {
            case 1:
                i90Var = new org.telegram.ui.Cells.m4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.i90 i90Var2 = new org.telegram.ui.Components.i90(this.f38258c, vh0Var, null, true, vh0Var.h);
                i90Var2.setPermanent(true);
                i90Var2.setDelegate(new th0(this, i90Var2));
                i90Var = i90Var2;
                break;
            case 3:
                e6Var = ((org.telegram.ui.ActionBar.o2) vh0Var).resourceProvider;
                i90Var = new org.telegram.ui.Cells.g2(context, 64, e6Var);
                break;
            case 4:
                i90Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 5:
                i90Var = new sh0(vh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(context, null);
                v00Var.setIsSingleCell(true);
                v00Var.setViewType(9);
                v00Var.f28982w = false;
                i90Var = v00Var;
                break;
            case 7:
                i90Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
                eaVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                eaVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19278p7, false));
                i90Var = eaVar;
                break;
            case 9:
                i90Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 10:
                i90Var = new org.telegram.ui.Cells.b5(8, 6, this.f38258c, null, false);
                break;
            case 11:
                e6Var2 = ((org.telegram.ui.ActionBar.o2) vh0Var).resourceProvider;
                i90Var = new org.telegram.ui.Cells.e9(context, e6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new nh0(context), w7.y5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19114g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (vh0Var.h) {
                    i11 = R.string.PrimaryLinkHelpChannel;
                } else {
                    i11 = R.string.PrimaryLinkHelp;
                }
                textView.setText(LocaleController.getString(i11));
                frameLayout.addView(textView, w7.y5.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                frameLayout.setTag(-33024);
                i90Var = frameLayout;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(i90Var, i90Var, -1, -2);
    }
}
