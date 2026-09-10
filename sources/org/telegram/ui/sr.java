package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class sr extends org.telegram.ui.Components.ul0 {
    public final Context f36744c;
    public final wr d;

    public sr(wr wrVar, Context context) {
        this.d = wrVar;
        this.f36744c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f41610a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sr.D(s4.c1):boolean");
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
        return this.d.f38327d1;
    }

    @Override
    public final int j(int i10) {
        wr wrVar = this.d;
        if (i10 != wrVar.f38375z0 && i10 != wrVar.A0 && i10 != wrVar.f38364v0 && i10 != wrVar.f38360t0) {
            if ((i10 >= wrVar.E0 && i10 < wrVar.F0) || ((i10 >= wrVar.X0 && i10 < wrVar.Y0) || (i10 >= wrVar.U0 && i10 < wrVar.V0))) {
                return 0;
            }
            if (i10 != wrVar.C0 && i10 != wrVar.G0 && i10 != wrVar.H0) {
                if (i10 != wrVar.D0 && i10 != wrVar.S && i10 != wrVar.N0 && i10 != wrVar.f38358s0 && i10 != wrVar.f38350p0) {
                    if (i10 != wrVar.f38322b1 && i10 != wrVar.P0 && i10 != wrVar.R0 && i10 != wrVar.f38362u0 && i10 != wrVar.f38373y0 && i10 != wrVar.K0 && i10 != wrVar.M0 && i10 != wrVar.f38340j1 && i10 != wrVar.f38348o0 && i10 != wrVar.f38355r0) {
                        if (i10 == wrVar.f38325c1) {
                            return 4;
                        }
                        if (i10 == wrVar.B0) {
                            return 6;
                        }
                        if (i10 != wrVar.f38333g0 && i10 != wrVar.f38335h0 && i10 != wrVar.m0 && i10 != wrVar.f38337i0 && i10 != wrVar.f38339j0 && i10 != wrVar.T && i10 != wrVar.f38328e0 && i10 != wrVar.f38331f0 && i10 != wrVar.f38343l0 && i10 != wrVar.Q0) {
                            if (i10 != wrVar.Z0 && i10 != wrVar.T0 && i10 != wrVar.W0 && i10 != wrVar.f38334g1) {
                                if (i10 == wrVar.O0) {
                                    return 9;
                                }
                                if (i10 == wrVar.f38319a1) {
                                    return 10;
                                }
                                if (i10 == wrVar.f38332f1) {
                                    return 11;
                                }
                                if (i10 != wrVar.f38370x0 && i10 != wrVar.J0 && i10 != wrVar.L0) {
                                    if (wrVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == wrVar.U) {
                                        return 14;
                                    }
                                    if (i10 == wrVar.S0) {
                                        return 15;
                                    }
                                    if (i10 != wrVar.f38336h1 && i10 != wrVar.f38338i1 && i10 != wrVar.f38346n0) {
                                        if (i10 != wrVar.f38352q0) {
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
    public final void v(s4.c1 r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sr.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.Components.ew0 ew0Var;
        org.telegram.ui.Components.ew0 ew0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f36744c;
        wr wrVar = this.d;
        switch (i10) {
            case 0:
                int i14 = wrVar.O;
                if (i14 != 0 && i14 != 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                }
                i12 = (i14 == 0 || i14 == 3) ? 6 : 6;
                if (wrVar.f38329e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(i11, i12, this.f36744c, null, z10);
                b5Var.setDelegate(new rr(this, 0));
                ew0Var2 = b5Var;
                ew0Var = ew0Var2;
                break;
            case 1:
                ew0Var = new org.telegram.ui.Cells.f9(context);
                break;
            case 2:
                ew0Var = new org.telegram.ui.Cells.y4(context);
                break;
            case 3:
                ew0Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                break;
            case 4:
                org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
                if (wrVar.v) {
                    f9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    ew0Var = f9Var;
                    break;
                } else if (wrVar.f38366w) {
                    f9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    ew0Var = f9Var;
                    break;
                } else {
                    f9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    ew0Var = f9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f36744c, org.telegram.ui.ActionBar.j6.L6, 21, 11, false, null);
                m4Var.setHeight(43);
                ew0Var2 = m4Var;
                ew0Var = ew0Var2;
                break;
            case 6:
                ew0Var = new org.telegram.ui.Cells.ga(context);
                break;
            case 7:
            case 14:
                ew0Var = new org.telegram.ui.Cells.w8(context);
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.p2) wrVar).resourceProvider;
                View u3Var = new org.telegram.ui.Cells.u3(context, 26, f6Var);
                u3Var.setBackground(null);
                ew0Var = u3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.ew0 ew0Var3 = new org.telegram.ui.Components.ew0(context, null);
                ew0Var3.b(wrVar.f38351p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                ew0Var3.setCallback(new rr(this, 1));
                ew0Var = ew0Var3;
                break;
            case 10:
                ew0Var = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, null);
                a10Var.setIsSingleCell(true);
                a10Var.setViewType(6);
                a10Var.f21345w = false;
                a10Var.setUseHeaderOffset(false);
                a10Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.p0 p0Var = new s4.p0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = AndroidUtilities.dp(30.0f);
                a10Var.setLayoutParams(p0Var);
                ew0Var = a10Var;
                break;
            case 12:
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(23, this.f36744c, wrVar.getResourceProvider(), false, true);
                s8Var.v = 50;
                ew0Var = s8Var;
                break;
            case 13:
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, this.f36744c, wrVar.getResourceProvider(), false);
                z1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.f17983g7, org.telegram.ui.ActionBar.j6.f18056k7);
                z1Var.setEnabled(true);
                ew0Var = z1Var;
                break;
            case 15:
                org.telegram.ui.Components.ew0 ew0Var4 = new org.telegram.ui.Components.ew0(context, null);
                Drawable[] drawableArr = {wrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), wrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), wrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), wrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), wrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = wrVar.f38359s1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                ew0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                ew0Var4.setCallback(new rr(this, 2));
                ew0Var2 = ew0Var4;
                ew0Var = ew0Var2;
                break;
            case 16:
                ew0Var = new org.telegram.ui.Cells.x8(context, wrVar.getResourceProvider());
                break;
            case 17:
                ew0Var = new org.telegram.ui.Cells.a8(context, wrVar.getResourceProvider());
                break;
        }
        return new s4.c1(ew0Var);
    }
}
