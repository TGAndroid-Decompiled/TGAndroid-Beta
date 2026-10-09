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
public final class y01 extends org.telegram.ui.Components.pm0 {
    public final Context f44188c;
    public final HashMap d = new HashMap();
    public final ProfileActivity f44189e;

    public y01(ProfileActivity profileActivity, Context context) {
        this.f44189e = profileActivity;
        this.f44188c = context;
    }

    @Override
    public final void A(s4.d1 d1Var) {
        int b10 = d1Var.b();
        ProfileActivity profileActivity = this.f44189e;
        if (b10 == profileActivity.O2) {
            profileActivity.M2 = null;
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        ProfileActivity profileActivity = this.f44189e;
        if (profileActivity.f34253f3 != -1) {
            int b10 = d1Var.b();
            if (b10 != profileActivity.f34253f3 && b10 != profileActivity.T2 && b10 != profileActivity.f34267h3 && b10 != profileActivity.f34260g3 && b10 != profileActivity.V2 && b10 != profileActivity.W2 && b10 != profileActivity.f34389z3 && b10 != profileActivity.f34274i3 && b10 != profileActivity.j3 && b10 != profileActivity.f34326q3 && b10 != profileActivity.f34306n3 && b10 != profileActivity.f34287k3 && b10 != profileActivity.f34298m3 && b10 != profileActivity.f34333r3 && b10 != profileActivity.f34341s3 && b10 != profileActivity.f34362v3 && b10 != profileActivity.f34370w3 && b10 != profileActivity.f34377x3 && b10 != profileActivity.y3 && b10 != profileActivity.O2 && b10 != profileActivity.f34215a4 && b10 != profileActivity.f34231c4 && b10 != profileActivity.f34261g4 && b10 != profileActivity.f34254f4 && b10 != profileActivity.f34293l3 && b10 != profileActivity.U2 && b10 != profileActivity.Q2 && b10 != profileActivity.f34238d4 && b10 != profileActivity.f34246e4 && b10 != profileActivity.l4) {
                return false;
            }
        } else {
            View view = d1Var.f47656a;
            if (view instanceof org.telegram.ui.Cells.xa) {
                Object currentObject = ((org.telegram.ui.Cells.xa) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = d1Var.f47660f;
            if (i10 == 1 || i10 == 5 || i10 == 7 || i10 == 11 || i10 == 31 || i10 == 28 || i10 == 12 || i10 == 13 || i10 == 9 || i10 == 10 || i10 == 25 || i10 == 32) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.CharSequence E(java.lang.String r7, java.util.ArrayList r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y01.E(java.lang.String, java.util.ArrayList, java.lang.String):java.lang.CharSequence");
    }

    @Override
    public final int h() {
        return this.f44189e.N2;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.f44189e;
        if (i10 != profileActivity.D3 && i10 != profileActivity.f34349t4 && i10 != profileActivity.f34245e3 && i10 != profileActivity.S2 && i10 != profileActivity.f34320p3 && i10 != profileActivity.f34355u3 && i10 != profileActivity.f34307n4) {
            if (i10 != profileActivity.G3 && i10 != profileActivity.I3 && i10 != profileActivity.T2 && i10 != profileActivity.U2) {
                if (i10 != profileActivity.L3 && i10 != profileActivity.V2) {
                    if (i10 == profileActivity.H3) {
                        return 30;
                    }
                    if (i10 != profileActivity.J3 && i10 != profileActivity.K3 && i10 != profileActivity.W2) {
                        if (i10 != profileActivity.f34327q4 && i10 != profileActivity.f34334r4 && i10 != profileActivity.V3 && i10 != profileActivity.X3 && i10 != profileActivity.W3 && i10 != profileActivity.f34378x4 && i10 != profileActivity.f34384y4 && i10 != profileActivity.f34390z4 && i10 != profileActivity.A4 && i10 != profileActivity.G4 && i10 != profileActivity.f34371w4 && i10 != profileActivity.L4 && i10 != profileActivity.K4 && i10 != profileActivity.U3 && i10 != profileActivity.f34253f3 && i10 != profileActivity.f34267h3 && i10 != profileActivity.f34260g3 && i10 != profileActivity.f34274i3 && i10 != profileActivity.j3 && i10 != profileActivity.f34326q3 && i10 != profileActivity.f34306n3 && i10 != profileActivity.f34287k3 && i10 != profileActivity.f34298m3 && i10 != profileActivity.f34333r3 && i10 != profileActivity.f34341s3 && i10 != profileActivity.f34362v3 && i10 != profileActivity.f34370w3 && i10 != profileActivity.f34377x3 && i10 != profileActivity.y3 && i10 != profileActivity.O2 && i10 != profileActivity.f34215a4 && i10 != profileActivity.Z3 && i10 != profileActivity.f34293l3 && i10 != profileActivity.f34261g4 && i10 != profileActivity.f34254f4 && i10 != profileActivity.B4 && i10 != profileActivity.C4 && i10 != profileActivity.D4) {
                            i11 = profileActivity.botPermissionLocation;
                            if (i10 != i11) {
                                i12 = profileActivity.botPermissionBiometry;
                                if (i10 != i12) {
                                    i13 = profileActivity.botPermissionEmojiStatus;
                                    if (i10 != i13 && i10 != profileActivity.f34246e4) {
                                        if (i10 == profileActivity.M3) {
                                            return 5;
                                        }
                                        if (i10 == profileActivity.N3) {
                                            return 6;
                                        }
                                        if (i10 == profileActivity.Q3) {
                                            return 20;
                                        }
                                        if (i10 != profileActivity.M4 && i10 != profileActivity.H4 && i10 != profileActivity.f34299m4 && i10 != profileActivity.f34342s4 && i10 != profileActivity.f34237d3 && i10 != profileActivity.f34313o3 && i10 != profileActivity.f34348t3 && i10 != profileActivity.P2 && i10 != profileActivity.f34222b3 && i10 != profileActivity.X2 && i10 != profileActivity.f34268h4 && i10 != profileActivity.Y3 && i10 != profileActivity.R2 && i10 != profileActivity.Z2 && i10 != profileActivity.F4 && i10 != profileActivity.f34321p4 && i10 != profileActivity.E4 && i10 != profileActivity.f34288k4) {
                                            if (i10 >= profileActivity.f34356u4 && i10 < profileActivity.f34363v4) {
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
                                            if (i10 == profileActivity.f34389z3) {
                                                return 14;
                                            }
                                            if (i10 != profileActivity.f34230c3 && i10 != profileActivity.f34214a3 && i10 != profileActivity.Y2) {
                                                if (i10 == profileActivity.f34223b4) {
                                                    return 17;
                                                }
                                                if (i10 == profileActivity.f34231c4) {
                                                    return 18;
                                                }
                                                if (i10 == profileActivity.f34238d4) {
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
                                                if (i10 == profileActivity.f34275i4) {
                                                    return 25;
                                                }
                                                if (i10 != profileActivity.R3 && i10 != profileActivity.T3) {
                                                    if (i10 == profileActivity.f34281j4) {
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
    public final void v(s4.d1 r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y01.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        t01 xaVar;
        float f7;
        View v01Var;
        int i12 = 1;
        boolean z12 = false;
        Context context = this.f44188c;
        ProfileActivity profileActivity = this.f44189e;
        switch (i10) {
            case 1:
                xaVar = new org.telegram.ui.Cells.m4(this.f44188c, org.telegram.ui.ActionBar.i6.L6, 18, 7, false, profileActivity.f34386z0);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.e6 e6Var = profileActivity.f34386z0;
                if (i10 == 30) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (i10 == 19) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                s01 s01Var = new s01(this, this.f44188c, e6Var, z12, z11);
                s01Var.setContentDescriptionValueFirst(true);
                xaVar = s01Var;
                break;
            case 3:
                t01 t01Var = new t01(this, context, profileActivity, profileActivity.f34386z0);
                profileActivity.N5 = t01Var;
                xaVar = t01Var;
                break;
            case 4:
                xaVar = new os(this, context, profileActivity.f34386z0);
                break;
            case 5:
                View d3Var = new org.telegram.ui.Cells.d3(context, profileActivity.f34386z0);
                d3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                xaVar = d3Var;
                break;
            case 6:
                xaVar = new u01(this, context, profileActivity.f34386z0);
                break;
            case 7:
                xaVar = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                if (profileActivity.f34371w4 == -1) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
                xaVar = new org.telegram.ui.Cells.xa(i11, 0, this.f44188c, profileActivity.f34386z0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 10, profileActivity.f34386z0);
                e9Var.getTextView().setGravity(1);
                e9Var.getTextView().setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A6, profileActivity.f34386z0));
                e9Var.getTextView().setMovementMethod(null);
                e9Var.setText(AndroidUtilities.getBuildVersionInfo());
                e9Var.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                xaVar = e9Var;
                break;
            case 11:
            case 31:
                if (i10 == 31) {
                    f7 = 12.0f;
                } else {
                    f7 = 6.0f;
                }
                View t3Var = new org.telegram.ui.Cells.t3(context, AndroidUtilities.dp(f7), 2);
                t3Var.setTag(-33024);
                xaVar = t3Var;
                break;
            case 12:
                v01Var = new v01(this, context);
                v01Var.setBackground(new ColorDrawable(0));
                v01Var.setTag(-33024);
                xaVar = v01Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                v01Var = profileActivity.O;
                v01Var.setTag(-33024);
                xaVar = v01Var;
                break;
            case 15:
                xaVar = new x01(this, context, profileActivity.f34386z0);
                break;
            case 17:
                xaVar = new org.telegram.ui.Cells.e9(context, profileActivity.f34386z0);
                break;
            case 18:
            case 24:
                if (i10 == 18) {
                    i12 = 0;
                }
                View r1Var = new rg.r1(context, i12, profileActivity.f34386z0);
                r1Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, profileActivity.f34386z0));
                xaVar = r1Var;
                break;
            case 20:
                xaVar = new org.telegram.ui.Cells.w8(18, context, profileActivity.f34386z0, false);
                break;
            case 21:
                View k1Var = new hg.k1(context, profileActivity.f34386z0);
                k1Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, profileActivity.f34386z0));
                xaVar = k1Var;
                break;
            case 22:
                View w01Var = new w01(this, context, profileActivity.f34386z0);
                w01Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, profileActivity.f34386z0));
                xaVar = w01Var;
                break;
            case 23:
                xaVar = new org.telegram.ui.Cells.h6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                ci.d dVar = new ci.d(context, profileActivity.f34386z0, true);
                dVar.e();
                dVar.g(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new n01(this, 0));
                frameLayout.addView(dVar, w7.x5.a(48.0f, 18.0f, 14.0f, 18.0f, 14.0f, -1, 119));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, profileActivity.f34386z0));
                xaVar = frameLayout;
                break;
            case 26:
                xaVar = new org.telegram.ui.Cells.e9(context, profileActivity.f34386z0);
                break;
            case 27:
                xaVar = new ei.i(context, profileActivity.f34386z0);
                break;
            case 28:
                v01Var = new org.telegram.ui.Components.ao(context, 22);
                v01Var.setTag(-33024);
                xaVar = v01Var;
                break;
            case 32:
                xaVar = new k11(profileActivity, context);
                break;
            case 33:
                xaVar = new gi.c(context, profileActivity.f34386z0);
                break;
        }
        if (i10 != 13) {
            xaVar.setLayoutParams(new s4.q0(-1, -2));
        }
        return new s4.d1(xaVar);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        View view = d1Var.f47656a;
        ProfileActivity profileActivity = this.f44189e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.c9) {
            ((org.telegram.ui.Cells.c9) view).f21931a.setLoading(profileActivity.f34276i5);
            ((org.telegram.ui.Cells.c9) view).f21932b.setLoading(profileActivity.f34276i5);
        }
    }

    @Override
    public final void z(s4.d1 d1Var) {
        View view = d1Var.f47656a;
        ProfileActivity profileActivity = this.f44189e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
