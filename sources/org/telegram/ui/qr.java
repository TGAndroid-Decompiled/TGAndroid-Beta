package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class qr extends org.telegram.ui.Components.ll0 {
    public final Context f37011c;
    public final ur d;

    public qr(ur urVar, Context context) {
        this.d = urVar;
        this.f37011c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42697a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qr.D(s4.c1):boolean");
    }

    public final TLObject E(int i10) {
        ur urVar = this.d;
        int i11 = urVar.E0;
        if (i10 >= i11 && i10 < urVar.F0) {
            return (TLObject) urVar.F.get(i10 - i11);
        }
        int i12 = urVar.U0;
        if (i10 >= i12 && i10 < urVar.V0) {
            return (TLObject) urVar.H.get(i10 - i12);
        }
        int i13 = urVar.X0;
        if (i10 >= i13 && i10 < urVar.Y0) {
            return (TLObject) urVar.G.get(i10 - i13);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.d.f38127d1;
    }

    @Override
    public final int j(int i10) {
        ur urVar = this.d;
        if (i10 != urVar.f38175z0 && i10 != urVar.A0 && i10 != urVar.f38164v0 && i10 != urVar.f38160t0) {
            if ((i10 >= urVar.E0 && i10 < urVar.F0) || ((i10 >= urVar.X0 && i10 < urVar.Y0) || (i10 >= urVar.U0 && i10 < urVar.V0))) {
                return 0;
            }
            if (i10 != urVar.C0 && i10 != urVar.G0 && i10 != urVar.H0) {
                if (i10 != urVar.D0 && i10 != urVar.S && i10 != urVar.N0 && i10 != urVar.f38158s0 && i10 != urVar.f38150p0) {
                    if (i10 != urVar.f38122b1 && i10 != urVar.P0 && i10 != urVar.R0 && i10 != urVar.f38162u0 && i10 != urVar.f38173y0 && i10 != urVar.K0 && i10 != urVar.M0 && i10 != urVar.f38140j1 && i10 != urVar.f38148o0 && i10 != urVar.f38155r0) {
                        if (i10 == urVar.f38125c1) {
                            return 4;
                        }
                        if (i10 == urVar.B0) {
                            return 6;
                        }
                        if (i10 != urVar.f38133g0 && i10 != urVar.f38135h0 && i10 != urVar.m0 && i10 != urVar.f38137i0 && i10 != urVar.f38139j0 && i10 != urVar.T && i10 != urVar.f38128e0 && i10 != urVar.f38131f0 && i10 != urVar.f38143l0 && i10 != urVar.Q0) {
                            if (i10 != urVar.Z0 && i10 != urVar.T0 && i10 != urVar.W0 && i10 != urVar.f38134g1) {
                                if (i10 == urVar.O0) {
                                    return 9;
                                }
                                if (i10 == urVar.f38119a1) {
                                    return 10;
                                }
                                if (i10 == urVar.f38132f1) {
                                    return 11;
                                }
                                if (i10 != urVar.f38170x0 && i10 != urVar.J0 && i10 != urVar.L0) {
                                    if (urVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == urVar.U) {
                                        return 14;
                                    }
                                    if (i10 == urVar.S0) {
                                        return 15;
                                    }
                                    if (i10 != urVar.f38136h1 && i10 != urVar.f38138i1 && i10 != urVar.f38146n0) {
                                        if (i10 != urVar.f38152q0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qr.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.Components.uv0 uv0Var;
        org.telegram.ui.Components.uv0 uv0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f37011c;
        ur urVar = this.d;
        switch (i10) {
            case 0:
                int i14 = urVar.O;
                if (i14 != 0 && i14 != 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                }
                i12 = (i14 == 0 || i14 == 3) ? 6 : 6;
                if (urVar.f38129e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(i11, i12, this.f37011c, null, z10);
                a5Var.setDelegate(new pr(this, 0));
                uv0Var2 = a5Var;
                uv0Var = uv0Var2;
                break;
            case 1:
                uv0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
                uv0Var = new org.telegram.ui.Cells.x4(context);
                break;
            case 3:
                uv0Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                break;
            case 4:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
                if (urVar.v) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    uv0Var = e9Var;
                    break;
                } else if (urVar.f38166w) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    uv0Var = e9Var;
                    break;
                } else {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    uv0Var = e9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.f37011c, org.telegram.ui.ActionBar.j6.L6, 21, 11, false, null);
                l4Var.setHeight(43);
                uv0Var2 = l4Var;
                uv0Var = uv0Var2;
                break;
            case 6:
                uv0Var = new org.telegram.ui.Cells.ea(context);
                break;
            case 7:
            case 14:
                uv0Var = new org.telegram.ui.Cells.v8(context);
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.o2) urVar).resourceProvider;
                View u3Var = new org.telegram.ui.Cells.u3(context, 26, f6Var);
                u3Var.setBackground(null);
                uv0Var = u3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.uv0 uv0Var3 = new org.telegram.ui.Components.uv0(context, null);
                uv0Var3.b(urVar.f38151p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                uv0Var3.setCallback(new pr(this, 1));
                uv0Var = uv0Var3;
                break;
            case 10:
                uv0Var = new org.telegram.ui.Cells.r4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(6);
                t00Var.f27976w = false;
                t00Var.setUseHeaderOffset(false);
                t00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.p0 p0Var = new s4.p0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = AndroidUtilities.dp(30.0f);
                t00Var.setLayoutParams(p0Var);
                uv0Var = t00Var;
                break;
            case 12:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(23, this.f37011c, urVar.getResourceProvider(), false, true);
                r8Var.v = 50;
                uv0Var = r8Var;
                break;
            case 13:
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, this.f37011c, urVar.getResourceProvider(), false);
                z1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.f18917g7, org.telegram.ui.ActionBar.j6.f18991k7);
                z1Var.setEnabled(true);
                uv0Var = z1Var;
                break;
            case 15:
                org.telegram.ui.Components.uv0 uv0Var4 = new org.telegram.ui.Components.uv0(context, null);
                Drawable[] drawableArr = {urVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), urVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), urVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), urVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), urVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = urVar.f38159s1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                uv0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                uv0Var4.setCallback(new pr(this, 2));
                uv0Var2 = uv0Var4;
                uv0Var = uv0Var2;
                break;
            case 16:
                uv0Var = new org.telegram.ui.Cells.w8(context, urVar.getResourceProvider());
                break;
            case 17:
                uv0Var = new org.telegram.ui.Cells.z7(context, urVar.getResourceProvider());
                break;
        }
        return new s4.c1(uv0Var);
    }
}
