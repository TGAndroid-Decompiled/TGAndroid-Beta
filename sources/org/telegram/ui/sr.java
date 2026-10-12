package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class sr extends org.telegram.ui.Components.vm0 {
    public final Context f41983c;
    public final wr d;

    public sr(wr wrVar, Context context) {
        this.d = wrVar;
        this.f41983c = context;
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47897a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.d1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sr.D(s4.d1):boolean");
    }

    public final TLObject E(int i10) {
        wr wrVar = this.d;
        int i11 = wrVar.E0;
        if (i10 >= i11 && i10 < wrVar.F0) {
            return (TLObject) wrVar.F.get(i10 - i11);
        }
        int i12 = wrVar.U0;
        if (i10 >= i12 && i10 < wrVar.V0) {
            return (TLObject) wrVar.H.get(i10 - i12);
        }
        int i13 = wrVar.X0;
        if (i10 >= i13 && i10 < wrVar.Y0) {
            return (TLObject) wrVar.G.get(i10 - i13);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.d.f43623d1;
    }

    @Override
    public final int j(int i10) {
        wr wrVar = this.d;
        if (i10 != wrVar.f43672z0 && i10 != wrVar.A0 && i10 != wrVar.f43661v0 && i10 != wrVar.f43657t0) {
            if ((i10 >= wrVar.E0 && i10 < wrVar.F0) || ((i10 >= wrVar.X0 && i10 < wrVar.Y0) || (i10 >= wrVar.U0 && i10 < wrVar.V0))) {
                return 0;
            }
            if (i10 != wrVar.C0 && i10 != wrVar.G0 && i10 != wrVar.H0) {
                if (i10 != wrVar.D0 && i10 != wrVar.S && i10 != wrVar.N0 && i10 != wrVar.f43655s0 && i10 != wrVar.f43647p0) {
                    if (i10 != wrVar.f43618b1 && i10 != wrVar.P0 && i10 != wrVar.R0 && i10 != wrVar.f43659u0 && i10 != wrVar.f43670y0 && i10 != wrVar.K0 && i10 != wrVar.M0 && i10 != wrVar.f43637j1 && i10 != wrVar.f43645o0 && i10 != wrVar.f43652r0) {
                        if (i10 == wrVar.f43621c1) {
                            return 4;
                        }
                        if (i10 == wrVar.B0) {
                            return 6;
                        }
                        if (i10 != wrVar.f43630g0 && i10 != wrVar.f43632h0 && i10 != wrVar.m0 && i10 != wrVar.f43634i0 && i10 != wrVar.f43636j0 && i10 != wrVar.T && i10 != wrVar.f43625e0 && i10 != wrVar.f43628f0 && i10 != wrVar.f43640l0 && i10 != wrVar.Q0) {
                            if (i10 != wrVar.Z0 && i10 != wrVar.T0 && i10 != wrVar.W0 && i10 != wrVar.f43631g1) {
                                if (i10 == wrVar.O0) {
                                    return 9;
                                }
                                if (i10 == wrVar.f43615a1) {
                                    return 10;
                                }
                                if (i10 == wrVar.f43629f1) {
                                    return 11;
                                }
                                if (i10 != wrVar.f43667x0 && i10 != wrVar.J0 && i10 != wrVar.L0) {
                                    if (wrVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == wrVar.U) {
                                        return 14;
                                    }
                                    if (i10 == wrVar.S0) {
                                        return 15;
                                    }
                                    if (i10 != wrVar.f43633h1 && i10 != wrVar.f43635i1 && i10 != wrVar.f43643n0) {
                                        if (i10 != wrVar.f43649q0) {
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
    public final void v(s4.d1 r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sr.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.Components.cx0 cx0Var;
        org.telegram.ui.Components.cx0 cx0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f41983c;
        wr wrVar = this.d;
        switch (i10) {
            case 0:
                int i14 = wrVar.O;
                if (i14 != 0 && i14 != 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                }
                if (i14 == 0 || i14 == 3) {
                    i12 = 6;
                }
                if (wrVar.f43626e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(i11, i12, this.f41983c, null, z10);
                b5Var.setDelegate(new rr(this, 0));
                cx0Var2 = b5Var;
                cx0Var = cx0Var2;
                break;
            case 1:
                cx0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
                cx0Var = new org.telegram.ui.Cells.y4(context);
                break;
            case 3:
                cx0Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
                if (wrVar.v) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    cx0Var = e9Var;
                    break;
                } else if (wrVar.f43663w) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    cx0Var = e9Var;
                    break;
                } else {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    cx0Var = e9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f41983c, org.telegram.ui.ActionBar.h6.L6, 21, 11, false, null);
                m4Var.setHeight(43);
                cx0Var2 = m4Var;
                cx0Var = cx0Var2;
                break;
            case 6:
                cx0Var = new org.telegram.ui.Cells.ca(context);
                break;
            case 7:
            case 14:
                cx0Var = new org.telegram.ui.Cells.v8(context);
                break;
            case 8:
                c6Var = ((org.telegram.ui.ActionBar.m2) wrVar).resourceProvider;
                View v3Var = new org.telegram.ui.Cells.v3(context, 26, c6Var);
                v3Var.setBackground(null);
                cx0Var = v3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.cx0 cx0Var3 = new org.telegram.ui.Components.cx0(context, null);
                cx0Var3.b(wrVar.f43648p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                cx0Var3.setCallback(new rr(this, 1));
                cx0Var = cx0Var3;
                break;
            case 10:
                cx0Var = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context, null);
                m10Var.setIsSingleCell(true);
                m10Var.setViewType(6);
                m10Var.f28350w = false;
                m10Var.setUseHeaderOffset(false);
                m10Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.q0 q0Var = new s4.q0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) q0Var).topMargin = AndroidUtilities.dp(30.0f);
                m10Var.setLayoutParams(q0Var);
                cx0Var = m10Var;
                break;
            case 12:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(23, this.f41983c, wrVar.getResourceProvider(), false, true);
                r8Var.v = 50;
                cx0Var = r8Var;
                break;
            case 13:
                org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(4, 21, this.f41983c, wrVar.getResourceProvider(), false);
                a2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.f20617g7, org.telegram.ui.ActionBar.h6.f20689k7);
                a2Var.setEnabled(true);
                cx0Var = a2Var;
                break;
            case 15:
                org.telegram.ui.Components.cx0 cx0Var4 = new org.telegram.ui.Components.cx0(context, null);
                Drawable[] drawableArr = {wrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), wrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), wrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), wrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), wrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = wrVar.f43656s1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                cx0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                cx0Var4.setCallback(new rr(this, 2));
                cx0Var2 = cx0Var4;
                cx0Var = cx0Var2;
                break;
            case 16:
                cx0Var = new org.telegram.ui.Cells.w8(context, wrVar.getResourceProvider());
                break;
            case 17:
                cx0Var = new org.telegram.ui.Cells.z7(context, wrVar.getResourceProvider());
                break;
        }
        return new s4.d1(cx0Var);
    }
}
