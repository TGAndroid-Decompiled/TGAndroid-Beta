package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class z01 extends org.telegram.ui.Components.ul0 {
    public final Context f40058c;
    public final HashMap d = new HashMap();
    public final ProfileActivity e;

    public z01(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.f40058c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        int b10 = c1Var.b();
        ProfileActivity profileActivity = this.e;
        if (b10 == profileActivity.O2) {
            profileActivity.M2 = null;
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.f31563f3 != -1) {
            int b10 = c1Var.b();
            if (b10 != profileActivity.f31563f3 && b10 != profileActivity.T2 && b10 != profileActivity.f31577h3 && b10 != profileActivity.f31570g3 && b10 != profileActivity.V2 && b10 != profileActivity.W2 && b10 != profileActivity.f31699z3 && b10 != profileActivity.f31584i3 && b10 != profileActivity.j3 && b10 != profileActivity.f31636q3 && b10 != profileActivity.f31616n3 && b10 != profileActivity.f31597k3 && b10 != profileActivity.f31608m3 && b10 != profileActivity.f31643r3 && b10 != profileActivity.f31651s3 && b10 != profileActivity.f31672v3 && b10 != profileActivity.f31680w3 && b10 != profileActivity.f31687x3 && b10 != profileActivity.y3 && b10 != profileActivity.O2 && b10 != profileActivity.f31526a4 && b10 != profileActivity.f31542c4 && b10 != profileActivity.f31571g4 && b10 != profileActivity.f31564f4 && b10 != profileActivity.f31603l3 && b10 != profileActivity.U2 && b10 != profileActivity.Q2 && b10 != profileActivity.f31549d4 && b10 != profileActivity.f31556e4 && b10 != profileActivity.l4) {
                return false;
            }
        } else {
            View view = c1Var.f42974a;
            if (view instanceof org.telegram.ui.Cells.ab) {
                Object currentObject = ((org.telegram.ui.Cells.ab) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = c1Var.f42977f;
            if (i10 == 1 || i10 == 5 || i10 == 7 || i10 == 11 || i10 == 31 || i10 == 28 || i10 == 12 || i10 == 13 || i10 == 9 || i10 == 10 || i10 == 25 || i10 == 32) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.CharSequence E(java.lang.String r7, java.util.ArrayList r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z01.E(java.lang.String, java.util.ArrayList, java.lang.String):java.lang.CharSequence");
    }

    @Override
    public final int h() {
        return this.e.N2;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.e;
        if (i10 != profileActivity.D3 && i10 != profileActivity.f31659t4 && i10 != profileActivity.f31555e3 && i10 != profileActivity.S2 && i10 != profileActivity.f31630p3 && i10 != profileActivity.f31665u3 && i10 != profileActivity.f31617n4) {
            if (i10 != profileActivity.G3 && i10 != profileActivity.I3 && i10 != profileActivity.T2 && i10 != profileActivity.U2) {
                if (i10 != profileActivity.L3 && i10 != profileActivity.V2) {
                    if (i10 == profileActivity.H3) {
                        return 30;
                    }
                    if (i10 != profileActivity.J3 && i10 != profileActivity.K3 && i10 != profileActivity.W2) {
                        if (i10 != profileActivity.f31637q4 && i10 != profileActivity.f31644r4 && i10 != profileActivity.V3 && i10 != profileActivity.X3 && i10 != profileActivity.W3 && i10 != profileActivity.f31688x4 && i10 != profileActivity.f31694y4 && i10 != profileActivity.f31700z4 && i10 != profileActivity.A4 && i10 != profileActivity.G4 && i10 != profileActivity.f31681w4 && i10 != profileActivity.L4 && i10 != profileActivity.K4 && i10 != profileActivity.U3 && i10 != profileActivity.f31563f3 && i10 != profileActivity.f31577h3 && i10 != profileActivity.f31570g3 && i10 != profileActivity.f31584i3 && i10 != profileActivity.j3 && i10 != profileActivity.f31636q3 && i10 != profileActivity.f31616n3 && i10 != profileActivity.f31597k3 && i10 != profileActivity.f31608m3 && i10 != profileActivity.f31643r3 && i10 != profileActivity.f31651s3 && i10 != profileActivity.f31672v3 && i10 != profileActivity.f31680w3 && i10 != profileActivity.f31687x3 && i10 != profileActivity.y3 && i10 != profileActivity.O2 && i10 != profileActivity.f31526a4 && i10 != profileActivity.Z3 && i10 != profileActivity.f31603l3 && i10 != profileActivity.f31571g4 && i10 != profileActivity.f31564f4 && i10 != profileActivity.B4 && i10 != profileActivity.C4 && i10 != profileActivity.D4) {
                            i11 = profileActivity.botPermissionLocation;
                            if (i10 != i11) {
                                i12 = profileActivity.botPermissionBiometry;
                                if (i10 != i12) {
                                    i13 = profileActivity.botPermissionEmojiStatus;
                                    if (i10 != i13 && i10 != profileActivity.f31556e4) {
                                        if (i10 == profileActivity.M3) {
                                            return 5;
                                        }
                                        if (i10 == profileActivity.N3) {
                                            return 6;
                                        }
                                        if (i10 == profileActivity.Q3) {
                                            return 20;
                                        }
                                        if (i10 != profileActivity.M4 && i10 != profileActivity.H4 && i10 != profileActivity.f31609m4 && i10 != profileActivity.f31652s4 && i10 != profileActivity.f31548d3 && i10 != profileActivity.f31623o3 && i10 != profileActivity.f31658t3 && i10 != profileActivity.P2 && i10 != profileActivity.f31533b3 && i10 != profileActivity.X2 && i10 != profileActivity.f31578h4 && i10 != profileActivity.Y3 && i10 != profileActivity.R2 && i10 != profileActivity.Z2 && i10 != profileActivity.F4 && i10 != profileActivity.f31631p4 && i10 != profileActivity.E4 && i10 != profileActivity.f31598k4) {
                                            if (i10 >= profileActivity.f31666u4 && i10 < profileActivity.f31673v4) {
                                                return 8;
                                            }
                                            if (i10 == profileActivity.A3) {
                                                return 11;
                                            }
                                            if (i10 == profileActivity.B3) {
                                                return 31;
                                            }
                                            if (i10 == profileActivity.C3) {
                                                return 12;
                                            }
                                            if (i10 == profileActivity.J4) {
                                                return 13;
                                            }
                                            if (i10 == profileActivity.f31699z3) {
                                                return 14;
                                            }
                                            if (i10 != profileActivity.f31541c3 && i10 != profileActivity.f31525a3 && i10 != profileActivity.Y2) {
                                                if (i10 == profileActivity.f31534b4) {
                                                    return 17;
                                                }
                                                if (i10 == profileActivity.f31542c4) {
                                                    return 18;
                                                }
                                                if (i10 == profileActivity.f31549d4) {
                                                    return 24;
                                                }
                                                if (i10 == profileActivity.P3) {
                                                    return 21;
                                                }
                                                if (i10 == profileActivity.O3) {
                                                    return 22;
                                                }
                                                if (i10 == profileActivity.Q2) {
                                                    return 23;
                                                }
                                                if (i10 == profileActivity.f31585i4) {
                                                    return 25;
                                                }
                                                if (i10 != profileActivity.R3 && i10 != profileActivity.T3) {
                                                    if (i10 == profileActivity.f31591j4) {
                                                        return 32;
                                                    }
                                                    if (i10 == profileActivity.l4) {
                                                        return 33;
                                                    }
                                                    if (i10 == profileActivity.S3) {
                                                        return 27;
                                                    }
                                                    if (i10 != profileActivity.E3 && i10 != profileActivity.F3) {
                                                        return 0;
                                                    }
                                                    return 28;
                                                }
                                                return 26;
                                            }
                                            return 15;
                                        }
                                        return 7;
                                    }
                                    return 4;
                                }
                                return 4;
                            }
                            return 4;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 19;
            }
            return 2;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z01.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        u01 abVar;
        float f7;
        View w01Var;
        int i12 = 1;
        boolean z11 = false;
        Context context = this.f40058c;
        ProfileActivity profileActivity = this.e;
        switch (i10) {
            case 1:
                org.telegram.ui.ActionBar.f6 f6Var = profileActivity.f31696z0;
                abVar = new org.telegram.ui.Cells.n4(this.f40058c, org.telegram.ui.ActionBar.j6.L6, 18, 7, false, f6Var);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.f6 f6Var2 = profileActivity.f31696z0;
                if (i10 == 30) {
                    z11 = true;
                }
                if (i10 == 19) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t01 t01Var = new t01(this, this.f40058c, f6Var2, z11, z10);
                t01Var.setContentDescriptionValueFirst(true);
                abVar = t01Var;
                break;
            case 3:
                u01 u01Var = new u01(this, context, profileActivity, profileActivity.f31696z0);
                profileActivity.N5 = u01Var;
                abVar = u01Var;
                break;
            case 4:
                abVar = new qs(this, context, profileActivity.f31696z0);
                break;
            case 5:
                View d3Var = new org.telegram.ui.Cells.d3(context, profileActivity.f31696z0);
                d3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                abVar = d3Var;
                break;
            case 6:
                abVar = new v01(this, context, profileActivity.f31696z0);
                break;
            case 7:
                abVar = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                if (profileActivity.f31681w4 == -1) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
                org.telegram.ui.ActionBar.f6 f6Var3 = profileActivity.f31696z0;
                abVar = new org.telegram.ui.Cells.ab(i11, 0, this.f40058c, f6Var3, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context, 10, profileActivity.f31696z0);
                f9Var.getTextView().setGravity(1);
                f9Var.getTextView().setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, profileActivity.f31696z0));
                f9Var.getTextView().setMovementMethod(null);
                f9Var.setText(AndroidUtilities.getBuildVersionInfo());
                f9Var.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                abVar = f9Var;
                break;
            case 11:
            case 31:
                if (i10 == 31) {
                    f7 = 12.0f;
                } else {
                    f7 = 6.0f;
                }
                View u3Var = new org.telegram.ui.Cells.u3(context, AndroidUtilities.dp(f7), 2);
                u3Var.setTag(-33024);
                abVar = u3Var;
                break;
            case 12:
                w01Var = new w01(this, context);
                w01Var.setBackground(new ColorDrawable(0));
                w01Var.setTag(-33024);
                abVar = w01Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                w01Var = profileActivity.O;
                w01Var.setTag(-33024);
                abVar = w01Var;
                break;
            case 15:
                abVar = new y01(this, context, profileActivity.f31696z0);
                break;
            case 17:
                abVar = new org.telegram.ui.Cells.f9(context, profileActivity.f31696z0);
                break;
            case 18:
            case 24:
                if (i10 == 18) {
                    i12 = 0;
                }
                View r1Var = new rg.r1(context, i12, profileActivity.f31696z0);
                r1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19094d6, profileActivity.f31696z0));
                abVar = r1Var;
                break;
            case 20:
                abVar = new org.telegram.ui.Cells.x8(18, context, profileActivity.f31696z0, false);
                break;
            case 21:
                View k1Var = new hg.k1(context, profileActivity.f31696z0);
                k1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19094d6, profileActivity.f31696z0));
                abVar = k1Var;
                break;
            case 22:
                View x01Var = new x01(this, context, profileActivity.f31696z0);
                x01Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19094d6, profileActivity.f31696z0));
                abVar = x01Var;
                break;
            case 23:
                abVar = new org.telegram.ui.Cells.i6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                ci.d dVar = new ci.d(context, profileActivity.f31696z0, true);
                dVar.e();
                dVar.g(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new o01(this, 0));
                frameLayout.addView(dVar, w7.y5.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19094d6, profileActivity.f31696z0));
                abVar = frameLayout;
                break;
            case 26:
                abVar = new org.telegram.ui.Cells.f9(context, profileActivity.f31696z0);
                break;
            case 27:
                abVar = new ei.i(context, profileActivity.f31696z0);
                break;
            case 28:
                w01Var = new org.telegram.ui.Components.kn(context, 22);
                w01Var.setTag(-33024);
                abVar = w01Var;
                break;
            case 32:
                abVar = new l11(profileActivity, context);
                break;
            case 33:
                abVar = new gi.c(context, profileActivity.f31696z0);
                break;
        }
        if (i10 != 13) {
            abVar.setLayoutParams(new s4.p0(-1, -2));
        }
        return new s4.c1(abVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f42974a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.d9) {
            ((org.telegram.ui.Cells.d9) view).f20140a.setLoading(profileActivity.f31586i5);
            ((org.telegram.ui.Cells.d9) view).f20141b.setLoading(profileActivity.f31586i5);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        View view = c1Var.f42974a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
