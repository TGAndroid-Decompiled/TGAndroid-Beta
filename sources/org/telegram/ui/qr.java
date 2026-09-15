package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class qr extends org.telegram.ui.Components.kl0 {
    public final Context f36933c;
    public final ur d;

    public qr(ur urVar, Context context) {
        this.d = urVar;
        this.f36933c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42675a;
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
        return this.d.f38103d1;
    }

    @Override
    public final int j(int i10) {
        ur urVar = this.d;
        if (i10 != urVar.f38151z0 && i10 != urVar.A0 && i10 != urVar.f38140v0 && i10 != urVar.f38136t0) {
            if ((i10 >= urVar.E0 && i10 < urVar.F0) || ((i10 >= urVar.X0 && i10 < urVar.Y0) || (i10 >= urVar.U0 && i10 < urVar.V0))) {
                return 0;
            }
            if (i10 != urVar.C0 && i10 != urVar.G0 && i10 != urVar.H0) {
                if (i10 != urVar.D0 && i10 != urVar.S && i10 != urVar.N0 && i10 != urVar.f38134s0 && i10 != urVar.f38126p0) {
                    if (i10 != urVar.f38098b1 && i10 != urVar.P0 && i10 != urVar.R0 && i10 != urVar.f38138u0 && i10 != urVar.f38149y0 && i10 != urVar.K0 && i10 != urVar.M0 && i10 != urVar.f38116j1 && i10 != urVar.f38124o0 && i10 != urVar.f38131r0) {
                        if (i10 == urVar.f38101c1) {
                            return 4;
                        }
                        if (i10 == urVar.B0) {
                            return 6;
                        }
                        if (i10 != urVar.f38109g0 && i10 != urVar.f38111h0 && i10 != urVar.m0 && i10 != urVar.f38113i0 && i10 != urVar.f38115j0 && i10 != urVar.T && i10 != urVar.f38104e0 && i10 != urVar.f38107f0 && i10 != urVar.f38119l0 && i10 != urVar.Q0) {
                            if (i10 != urVar.Z0 && i10 != urVar.T0 && i10 != urVar.W0 && i10 != urVar.f38110g1) {
                                if (i10 == urVar.O0) {
                                    return 9;
                                }
                                if (i10 == urVar.f38095a1) {
                                    return 10;
                                }
                                if (i10 == urVar.f38108f1) {
                                    return 11;
                                }
                                if (i10 != urVar.f38146x0 && i10 != urVar.J0 && i10 != urVar.L0) {
                                    if (urVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == urVar.U) {
                                        return 14;
                                    }
                                    if (i10 == urVar.S0) {
                                        return 15;
                                    }
                                    if (i10 != urVar.f38112h1 && i10 != urVar.f38114i1 && i10 != urVar.f38122n0) {
                                        if (i10 != urVar.f38128q0) {
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
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.Components.tv0 tv0Var;
        org.telegram.ui.Components.tv0 tv0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f36933c;
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
                if (urVar.f38105e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(i11, i12, this.f36933c, null, z10);
                a5Var.setDelegate(new pr(this, 0));
                tv0Var2 = a5Var;
                tv0Var = tv0Var2;
                break;
            case 1:
                tv0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
                tv0Var = new org.telegram.ui.Cells.x4(context);
                break;
            case 3:
                tv0Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                break;
            case 4:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
                if (urVar.v) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    tv0Var = e9Var;
                    break;
                } else if (urVar.f38142w) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    tv0Var = e9Var;
                    break;
                } else {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    tv0Var = e9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.f36933c, org.telegram.ui.ActionBar.i6.L6, 21, 11, false, null);
                l4Var.setHeight(43);
                tv0Var2 = l4Var;
                tv0Var = tv0Var2;
                break;
            case 6:
                tv0Var = new org.telegram.ui.Cells.ea(context);
                break;
            case 7:
            case 14:
                tv0Var = new org.telegram.ui.Cells.v8(context);
                break;
            case 8:
                e6Var = ((org.telegram.ui.ActionBar.n2) urVar).resourceProvider;
                View u3Var = new org.telegram.ui.Cells.u3(context, 26, e6Var);
                u3Var.setBackground(null);
                tv0Var = u3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.tv0 tv0Var3 = new org.telegram.ui.Components.tv0(context, null);
                tv0Var3.b(urVar.f38127p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                tv0Var3.setCallback(new pr(this, 1));
                tv0Var = tv0Var3;
                break;
            case 10:
                tv0Var = new org.telegram.ui.Cells.r4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(6);
                t00Var.f28018w = false;
                t00Var.setUseHeaderOffset(false);
                t00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.p0 p0Var = new s4.p0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = AndroidUtilities.dp(30.0f);
                t00Var.setLayoutParams(p0Var);
                tv0Var = t00Var;
                break;
            case 12:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(23, this.f36933c, urVar.getResourceProvider(), false, true);
                r8Var.v = 50;
                tv0Var = r8Var;
                break;
            case 13:
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, this.f36933c, urVar.getResourceProvider(), false);
                z1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.i6.V6, org.telegram.ui.ActionBar.i6.f18891g7, org.telegram.ui.ActionBar.i6.f18965k7);
                z1Var.setEnabled(true);
                tv0Var = z1Var;
                break;
            case 15:
                org.telegram.ui.Components.tv0 tv0Var4 = new org.telegram.ui.Components.tv0(context, null);
                Drawable[] drawableArr = {urVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), urVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), urVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), urVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), urVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = urVar.f38135s1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                tv0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                tv0Var4.setCallback(new pr(this, 2));
                tv0Var2 = tv0Var4;
                tv0Var = tv0Var2;
                break;
            case 16:
                tv0Var = new org.telegram.ui.Cells.w8(context, urVar.getResourceProvider());
                break;
            case 17:
                tv0Var = new org.telegram.ui.Cells.z7(context, urVar.getResourceProvider());
                break;
        }
        return new s4.c1(tv0Var);
    }
}
