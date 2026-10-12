package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class ur extends org.telegram.ui.Components.lm0 {
    public final Context f40789c;
    public final yr d;

    public ur(yr yrVar, Context context) {
        this.d = yrVar;
        this.f40789c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f44838a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ur.D(s4.b1):boolean");
    }

    public final TLObject E(int i10) {
        yr yrVar = this.d;
        int i11 = yrVar.E0;
        if (i10 >= i11 && i10 < yrVar.F0) {
            return (TLObject) yrVar.F.get(i10 - i11);
        }
        int i12 = yrVar.U0;
        if (i10 >= i12 && i10 < yrVar.V0) {
            return (TLObject) yrVar.H.get(i10 - i12);
        }
        int i13 = yrVar.X0;
        if (i10 >= i13 && i10 < yrVar.Y0) {
            return (TLObject) yrVar.G.get(i10 - i13);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.d.f42222d1;
    }

    @Override
    public final int j(int i10) {
        yr yrVar = this.d;
        if (i10 != yrVar.f42270z0 && i10 != yrVar.A0 && i10 != yrVar.f42259v0 && i10 != yrVar.f42255t0) {
            if ((i10 >= yrVar.E0 && i10 < yrVar.F0) || ((i10 >= yrVar.X0 && i10 < yrVar.Y0) || (i10 >= yrVar.U0 && i10 < yrVar.V0))) {
                return 0;
            }
            if (i10 != yrVar.C0 && i10 != yrVar.G0 && i10 != yrVar.H0) {
                if (i10 != yrVar.D0 && i10 != yrVar.S && i10 != yrVar.N0 && i10 != yrVar.f42253s0 && i10 != yrVar.f42245p0) {
                    if (i10 != yrVar.f42217b1 && i10 != yrVar.P0 && i10 != yrVar.R0 && i10 != yrVar.f42257u0 && i10 != yrVar.f42268y0 && i10 != yrVar.K0 && i10 != yrVar.M0 && i10 != yrVar.f42235j1 && i10 != yrVar.f42243o0 && i10 != yrVar.f42250r0) {
                        if (i10 == yrVar.f42220c1) {
                            return 4;
                        }
                        if (i10 == yrVar.B0) {
                            return 6;
                        }
                        if (i10 != yrVar.f42228g0 && i10 != yrVar.f42230h0 && i10 != yrVar.m0 && i10 != yrVar.f42232i0 && i10 != yrVar.f42234j0 && i10 != yrVar.T && i10 != yrVar.f42223e0 && i10 != yrVar.f42226f0 && i10 != yrVar.f42238l0 && i10 != yrVar.Q0) {
                            if (i10 != yrVar.Z0 && i10 != yrVar.T0 && i10 != yrVar.W0 && i10 != yrVar.f42229g1) {
                                if (i10 == yrVar.O0) {
                                    return 9;
                                }
                                if (i10 == yrVar.f42214a1) {
                                    return 10;
                                }
                                if (i10 == yrVar.f42227f1) {
                                    return 11;
                                }
                                if (i10 != yrVar.f42265x0 && i10 != yrVar.J0 && i10 != yrVar.L0) {
                                    if (yrVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == yrVar.U) {
                                        return 14;
                                    }
                                    if (i10 == yrVar.S0) {
                                        return 15;
                                    }
                                    if (i10 != yrVar.f42231h1 && i10 != yrVar.f42233i1 && i10 != yrVar.f42241n0) {
                                        if (i10 != yrVar.f42247q0) {
                                            return 0;
                                        }
                                        return 17;
                                    }
                                    return 16;
                                }
                                return 12;
                            }
                            return 8;
                        }
                        return 7;
                    }
                    return 1;
                }
                return 5;
            }
            return 3;
        }
        return 2;
    }

    @Override
    public final void v(s4.b1 r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ur.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.Components.sw0 sw0Var;
        org.telegram.ui.Components.sw0 sw0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f40789c;
        yr yrVar = this.d;
        switch (i10) {
            case 0:
                int i14 = yrVar.O;
                if (i14 != 0 && i14 != 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                }
                if (i14 == 0 || i14 == 3) {
                    i12 = 6;
                }
                if (yrVar.f42224e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(i11, i12, this.f40789c, null, z10);
                b5Var.setDelegate(new tr(this, 0));
                sw0Var2 = b5Var;
                sw0Var = sw0Var2;
                break;
            case 1:
                sw0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
                sw0Var = new org.telegram.ui.Cells.y4(context);
                break;
            case 3:
                sw0Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.d0) null);
                break;
            case 4:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
                if (yrVar.v) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    sw0Var = e9Var;
                    break;
                } else if (yrVar.f42261w) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    sw0Var = e9Var;
                    break;
                } else {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    sw0Var = e9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f40789c, org.telegram.ui.ActionBar.g6.L6, 21, 11, false, null);
                m4Var.setHeight(43);
                sw0Var2 = m4Var;
                sw0Var = sw0Var2;
                break;
            case 6:
                sw0Var = new org.telegram.ui.Cells.ca(context);
                break;
            case 7:
            case 14:
                sw0Var = new org.telegram.ui.Cells.v8(context);
                break;
            case 8:
                c6Var = ((org.telegram.ui.ActionBar.m2) yrVar).resourceProvider;
                View v3Var = new org.telegram.ui.Cells.v3(context, 26, c6Var);
                v3Var.setBackground(null);
                sw0Var = v3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.sw0 sw0Var3 = new org.telegram.ui.Components.sw0(context, null);
                sw0Var3.b(yrVar.f42246p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                sw0Var3.setCallback(new tr(this, 1));
                sw0Var = sw0Var3;
                break;
            case 10:
                sw0Var = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null);
                f10Var.setIsSingleCell(true);
                f10Var.setViewType(6);
                f10Var.f24856w = false;
                f10Var.setUseHeaderOffset(false);
                f10Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.o0 o0Var = new s4.o0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) o0Var).topMargin = AndroidUtilities.dp(30.0f);
                f10Var.setLayoutParams(o0Var);
                sw0Var = f10Var;
                break;
            case 12:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(23, this.f40789c, yrVar.getResourceProvider(), false, true);
                r8Var.v = 50;
                sw0Var = r8Var;
                break;
            case 13:
                org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(4, 21, this.f40789c, yrVar.getResourceProvider(), false);
                a2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.g6.V6, org.telegram.ui.ActionBar.g6.f19955g7, org.telegram.ui.ActionBar.g6.f20029k7);
                a2Var.setEnabled(true);
                sw0Var = a2Var;
                break;
            case 15:
                org.telegram.ui.Components.sw0 sw0Var4 = new org.telegram.ui.Components.sw0(context, null);
                Drawable[] drawableArr = {yrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), yrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), yrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), yrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), yrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = yrVar.f42254s1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                sw0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                sw0Var4.setCallback(new tr(this, 2));
                sw0Var2 = sw0Var4;
                sw0Var = sw0Var2;
                break;
            case 16:
                sw0Var = new org.telegram.ui.Cells.w8(context, yrVar.getResourceProvider());
                break;
            case 17:
                sw0Var = new org.telegram.ui.Cells.z7(context, yrVar.getResourceProvider());
                break;
        }
        return new s4.b1(sw0Var);
    }
}
