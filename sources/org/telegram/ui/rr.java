package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class rr extends org.telegram.ui.Components.kl0 {
    public final Context f40251c;
    public final vr d;

    public rr(vr vrVar, Context context) {
        this.d = vrVar;
        this.f40251c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f45766a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rr.D(s4.c1):boolean");
    }

    public final TLObject E(int i10) {
        vr vrVar = this.d;
        int i11 = vrVar.E0;
        if (i10 >= i11 && i10 < vrVar.F0) {
            return (TLObject) vrVar.F.get(i10 - i11);
        }
        int i12 = vrVar.U0;
        if (i10 >= i12 && i10 < vrVar.V0) {
            return (TLObject) vrVar.H.get(i10 - i12);
        }
        int i13 = vrVar.X0;
        if (i10 >= i13 && i10 < vrVar.Y0) {
            return (TLObject) vrVar.G.get(i10 - i13);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.d.f41666d1;
    }

    @Override
    public final int j(int i10) {
        vr vrVar = this.d;
        if (i10 != vrVar.f41715z0 && i10 != vrVar.A0 && i10 != vrVar.f41704v0 && i10 != vrVar.f41700t0) {
            if ((i10 >= vrVar.E0 && i10 < vrVar.F0) || ((i10 >= vrVar.X0 && i10 < vrVar.Y0) || (i10 >= vrVar.U0 && i10 < vrVar.V0))) {
                return 0;
            }
            if (i10 != vrVar.C0 && i10 != vrVar.G0 && i10 != vrVar.H0) {
                if (i10 != vrVar.D0 && i10 != vrVar.S && i10 != vrVar.N0 && i10 != vrVar.f41698s0 && i10 != vrVar.f41690p0) {
                    if (i10 != vrVar.f41661b1 && i10 != vrVar.P0 && i10 != vrVar.R0 && i10 != vrVar.f41702u0 && i10 != vrVar.f41713y0 && i10 != vrVar.K0 && i10 != vrVar.M0 && i10 != vrVar.f41680j1 && i10 != vrVar.f41688o0 && i10 != vrVar.f41695r0) {
                        if (i10 == vrVar.f41664c1) {
                            return 4;
                        }
                        if (i10 == vrVar.B0) {
                            return 6;
                        }
                        if (i10 != vrVar.f41673g0 && i10 != vrVar.f41675h0 && i10 != vrVar.m0 && i10 != vrVar.f41677i0 && i10 != vrVar.f41679j0 && i10 != vrVar.T && i10 != vrVar.f41668e0 && i10 != vrVar.f41671f0 && i10 != vrVar.f41683l0 && i10 != vrVar.Q0) {
                            if (i10 != vrVar.Z0 && i10 != vrVar.T0 && i10 != vrVar.W0 && i10 != vrVar.f41674g1) {
                                if (i10 == vrVar.O0) {
                                    return 9;
                                }
                                if (i10 == vrVar.f41658a1) {
                                    return 10;
                                }
                                if (i10 == vrVar.f41672f1) {
                                    return 11;
                                }
                                if (i10 != vrVar.f41710x0 && i10 != vrVar.J0 && i10 != vrVar.L0) {
                                    if (vrVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == vrVar.U) {
                                        return 14;
                                    }
                                    if (i10 == vrVar.S0) {
                                        return 15;
                                    }
                                    if (i10 != vrVar.f41676h1 && i10 != vrVar.f41678i1 && i10 != vrVar.f41686n0) {
                                        if (i10 != vrVar.f41692q0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rr.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.Components.sv0 sv0Var;
        org.telegram.ui.Components.sv0 sv0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f40251c;
        vr vrVar = this.d;
        switch (i10) {
            case 0:
                int i14 = vrVar.O;
                if (i14 != 0 && i14 != 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                }
                i12 = (i14 == 0 || i14 == 3) ? 6 : 6;
                if (vrVar.f41669e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(i11, i12, this.f40251c, null, z10);
                a5Var.setDelegate(new qr(this, 0));
                sv0Var2 = a5Var;
                sv0Var = sv0Var2;
                break;
            case 1:
                sv0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
                sv0Var = new org.telegram.ui.Cells.x4(context);
                break;
            case 3:
                sv0Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                break;
            case 4:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
                if (vrVar.v) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    sv0Var = e9Var;
                    break;
                } else if (vrVar.f41706w) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    sv0Var = e9Var;
                    break;
                } else {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    sv0Var = e9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.f40251c, org.telegram.ui.ActionBar.j6.L6, 21, 11, false, null);
                l4Var.setHeight(43);
                sv0Var2 = l4Var;
                sv0Var = sv0Var2;
                break;
            case 6:
                sv0Var = new org.telegram.ui.Cells.ea(context);
                break;
            case 7:
            case 14:
                sv0Var = new org.telegram.ui.Cells.v8(context);
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.n2) vrVar).resourceProvider;
                View u3Var = new org.telegram.ui.Cells.u3(context, 26, f6Var);
                u3Var.setBackground(null);
                sv0Var = u3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.sv0 sv0Var3 = new org.telegram.ui.Components.sv0(context, null);
                sv0Var3.b(vrVar.f41691p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                sv0Var3.setCallback(new qr(this, 1));
                sv0Var = sv0Var3;
                break;
            case 10:
                sv0Var = new org.telegram.ui.Cells.r4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(6);
                t00Var.f30492w = false;
                t00Var.setUseHeaderOffset(false);
                t00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.p0 p0Var = new s4.p0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = AndroidUtilities.dp(30.0f);
                t00Var.setLayoutParams(p0Var);
                sv0Var = t00Var;
                break;
            case 12:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(23, this.f40251c, vrVar.getResourceProvider(), false, true);
                r8Var.v = 50;
                sv0Var = r8Var;
                break;
            case 13:
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, this.f40251c, vrVar.getResourceProvider(), false);
                z1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.f20746g7, org.telegram.ui.ActionBar.j6.f20819k7);
                z1Var.setEnabled(true);
                sv0Var = z1Var;
                break;
            case 15:
                org.telegram.ui.Components.sv0 sv0Var4 = new org.telegram.ui.Components.sv0(context, null);
                Drawable[] drawableArr = {vrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), vrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), vrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), vrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), vrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = vrVar.f41699s1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                sv0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                sv0Var4.setCallback(new qr(this, 2));
                sv0Var2 = sv0Var4;
                sv0Var = sv0Var2;
                break;
            case 16:
                sv0Var = new org.telegram.ui.Cells.w8(context, vrVar.getResourceProvider());
                break;
            case 17:
                sv0Var = new org.telegram.ui.Cells.z7(context, vrVar.getResourceProvider());
                break;
        }
        return new s4.c1(sv0Var);
    }
}
