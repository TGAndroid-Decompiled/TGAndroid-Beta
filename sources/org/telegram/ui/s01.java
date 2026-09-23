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
public final class s01 extends org.telegram.ui.Components.ll0 {
    public final Context f37096c;
    public final HashMap d = new HashMap();
    public final ProfileActivity e;

    public s01(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.f37096c = context;
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
        if (profileActivity.f31250f3 != -1) {
            int b10 = c1Var.b();
            if (b10 != profileActivity.f31250f3 && b10 != profileActivity.T2 && b10 != profileActivity.f31264h3 && b10 != profileActivity.f31257g3 && b10 != profileActivity.V2 && b10 != profileActivity.W2 && b10 != profileActivity.f31386z3 && b10 != profileActivity.f31271i3 && b10 != profileActivity.j3 && b10 != profileActivity.f31323q3 && b10 != profileActivity.f31303n3 && b10 != profileActivity.f31284k3 && b10 != profileActivity.f31295m3 && b10 != profileActivity.f31330r3 && b10 != profileActivity.f31338s3 && b10 != profileActivity.f31359v3 && b10 != profileActivity.f31367w3 && b10 != profileActivity.f31374x3 && b10 != profileActivity.y3 && b10 != profileActivity.O2 && b10 != profileActivity.f31213a4 && b10 != profileActivity.f31229c4 && b10 != profileActivity.f31258g4 && b10 != profileActivity.f31251f4 && b10 != profileActivity.f31290l3 && b10 != profileActivity.U2 && b10 != profileActivity.Q2 && b10 != profileActivity.f31236d4 && b10 != profileActivity.f31243e4 && b10 != profileActivity.l4) {
                return false;
            }
        } else {
            View view = c1Var.f42627a;
            if (view instanceof org.telegram.ui.Cells.bb) {
                Object currentObject = ((org.telegram.ui.Cells.bb) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = c1Var.f42630f;
            if (i10 == 1 || i10 == 5 || i10 == 7 || i10 == 11 || i10 == 31 || i10 == 28 || i10 == 12 || i10 == 13 || i10 == 9 || i10 == 10 || i10 == 25 || i10 == 32) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.CharSequence E(java.lang.String r7, java.util.ArrayList r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s01.E(java.lang.String, java.util.ArrayList, java.lang.String):java.lang.CharSequence");
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
        if (i10 != profileActivity.D3 && i10 != profileActivity.f31346t4 && i10 != profileActivity.f31242e3 && i10 != profileActivity.S2 && i10 != profileActivity.f31317p3 && i10 != profileActivity.f31352u3 && i10 != profileActivity.f31304n4) {
            if (i10 != profileActivity.G3 && i10 != profileActivity.I3 && i10 != profileActivity.T2 && i10 != profileActivity.U2) {
                if (i10 != profileActivity.L3 && i10 != profileActivity.V2) {
                    if (i10 == profileActivity.H3) {
                        return 30;
                    }
                    if (i10 != profileActivity.J3 && i10 != profileActivity.K3 && i10 != profileActivity.W2) {
                        if (i10 != profileActivity.f31324q4 && i10 != profileActivity.f31331r4 && i10 != profileActivity.V3 && i10 != profileActivity.X3 && i10 != profileActivity.W3 && i10 != profileActivity.f31375x4 && i10 != profileActivity.f31381y4 && i10 != profileActivity.f31387z4 && i10 != profileActivity.A4 && i10 != profileActivity.G4 && i10 != profileActivity.f31368w4 && i10 != profileActivity.L4 && i10 != profileActivity.K4 && i10 != profileActivity.U3 && i10 != profileActivity.f31250f3 && i10 != profileActivity.f31264h3 && i10 != profileActivity.f31257g3 && i10 != profileActivity.f31271i3 && i10 != profileActivity.j3 && i10 != profileActivity.f31323q3 && i10 != profileActivity.f31303n3 && i10 != profileActivity.f31284k3 && i10 != profileActivity.f31295m3 && i10 != profileActivity.f31330r3 && i10 != profileActivity.f31338s3 && i10 != profileActivity.f31359v3 && i10 != profileActivity.f31367w3 && i10 != profileActivity.f31374x3 && i10 != profileActivity.y3 && i10 != profileActivity.O2 && i10 != profileActivity.f31213a4 && i10 != profileActivity.Z3 && i10 != profileActivity.f31290l3 && i10 != profileActivity.f31258g4 && i10 != profileActivity.f31251f4 && i10 != profileActivity.B4 && i10 != profileActivity.C4 && i10 != profileActivity.D4) {
                            i11 = profileActivity.botPermissionLocation;
                            if (i10 != i11) {
                                i12 = profileActivity.botPermissionBiometry;
                                if (i10 != i12) {
                                    i13 = profileActivity.botPermissionEmojiStatus;
                                    if (i10 != i13 && i10 != profileActivity.f31243e4) {
                                        if (i10 == profileActivity.M3) {
                                            return 5;
                                        }
                                        if (i10 == profileActivity.N3) {
                                            return 6;
                                        }
                                        if (i10 == profileActivity.Q3) {
                                            return 20;
                                        }
                                        if (i10 != profileActivity.M4 && i10 != profileActivity.H4 && i10 != profileActivity.f31296m4 && i10 != profileActivity.f31339s4 && i10 != profileActivity.f31235d3 && i10 != profileActivity.f31310o3 && i10 != profileActivity.f31345t3 && i10 != profileActivity.P2 && i10 != profileActivity.f31220b3 && i10 != profileActivity.X2 && i10 != profileActivity.f31265h4 && i10 != profileActivity.Y3 && i10 != profileActivity.R2 && i10 != profileActivity.Z2 && i10 != profileActivity.F4 && i10 != profileActivity.f31318p4 && i10 != profileActivity.E4 && i10 != profileActivity.f31285k4) {
                                            if (i10 >= profileActivity.f31353u4 && i10 < profileActivity.f31360v4) {
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
                                            if (i10 == profileActivity.f31386z3) {
                                                return 14;
                                            }
                                            if (i10 != profileActivity.f31228c3 && i10 != profileActivity.f31212a3 && i10 != profileActivity.Y2) {
                                                if (i10 == profileActivity.f31221b4) {
                                                    return 17;
                                                }
                                                if (i10 == profileActivity.f31229c4) {
                                                    return 18;
                                                }
                                                if (i10 == profileActivity.f31236d4) {
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
                                                if (i10 == profileActivity.f31272i4) {
                                                    return 25;
                                                }
                                                if (i10 != profileActivity.R3 && i10 != profileActivity.T3) {
                                                    if (i10 == profileActivity.f31278j4) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s01.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        n01 bbVar;
        float f7;
        View p01Var;
        int i12 = 1;
        boolean z11 = false;
        Context context = this.f37096c;
        ProfileActivity profileActivity = this.e;
        switch (i10) {
            case 1:
                org.telegram.ui.ActionBar.d6 d6Var = profileActivity.f31383z0;
                bbVar = new org.telegram.ui.Cells.m4(this.f37096c, org.telegram.ui.ActionBar.h6.L6, 18, 7, false, d6Var);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.d6 d6Var2 = profileActivity.f31383z0;
                if (i10 == 30) {
                    z11 = true;
                }
                if (i10 == 19) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m01 m01Var = new m01(this, this.f37096c, d6Var2, z11, z10);
                m01Var.setContentDescriptionValueFirst(true);
                bbVar = m01Var;
                break;
            case 3:
                n01 n01Var = new n01(this, context, profileActivity, profileActivity.f31383z0);
                profileActivity.N5 = n01Var;
                bbVar = n01Var;
                break;
            case 4:
                bbVar = new ls(this, context, profileActivity.f31383z0);
                break;
            case 5:
                View c3Var = new org.telegram.ui.Cells.c3(context, profileActivity.f31383z0);
                c3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                bbVar = c3Var;
                break;
            case 6:
                bbVar = new o01(this, context, profileActivity.f31383z0);
                break;
            case 7:
                bbVar = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                break;
            case 8:
                if (profileActivity.f31368w4 == -1) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
                org.telegram.ui.ActionBar.d6 d6Var3 = profileActivity.f31383z0;
                bbVar = new org.telegram.ui.Cells.bb(i11, 0, this.f37096c, d6Var3, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context, 10, profileActivity.f31383z0);
                f9Var.getTextView().setGravity(1);
                f9Var.getTextView().setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A6, profileActivity.f31383z0));
                f9Var.getTextView().setMovementMethod(null);
                f9Var.setText(AndroidUtilities.getBuildVersionInfo());
                f9Var.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                bbVar = f9Var;
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
                bbVar = t3Var;
                break;
            case 12:
                p01Var = new p01(this, context);
                p01Var.setBackground(new ColorDrawable(0));
                p01Var.setTag(-33024);
                bbVar = p01Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                p01Var = profileActivity.O;
                p01Var.setTag(-33024);
                bbVar = p01Var;
                break;
            case 15:
                bbVar = new r01(this, context, profileActivity.f31383z0);
                break;
            case 17:
                bbVar = new org.telegram.ui.Cells.f9(context, profileActivity.f31383z0);
                break;
            case 18:
            case 24:
                if (i10 == 18) {
                    i12 = 0;
                }
                View q1Var = new rg.q1(context, i12, profileActivity.f31383z0);
                q1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, profileActivity.f31383z0));
                bbVar = q1Var;
                break;
            case 20:
                bbVar = new org.telegram.ui.Cells.x8(18, context, profileActivity.f31383z0, false);
                break;
            case 21:
                View l1Var = new hg.l1(context, profileActivity.f31383z0);
                l1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, profileActivity.f31383z0));
                bbVar = l1Var;
                break;
            case 22:
                View q01Var = new q01(this, context, profileActivity.f31383z0);
                q01Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, profileActivity.f31383z0));
                bbVar = q01Var;
                break;
            case 23:
                bbVar = new org.telegram.ui.Cells.h6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                ci.d dVar = new ci.d(context, profileActivity.f31383z0, true);
                dVar.e();
                dVar.g(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new h01(this, 0));
                frameLayout.addView(dVar, w7.x5.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, profileActivity.f31383z0));
                bbVar = frameLayout;
                break;
            case 26:
                bbVar = new org.telegram.ui.Cells.f9(context, profileActivity.f31383z0);
                break;
            case 27:
                bbVar = new ei.i(context, profileActivity.f31383z0);
                break;
            case 28:
                p01Var = new org.telegram.ui.Components.ln(context, 22);
                p01Var.setTag(-33024);
                bbVar = p01Var;
                break;
            case 32:
                bbVar = new e11(profileActivity, context);
                break;
            case 33:
                bbVar = new gi.c(context, profileActivity.f31383z0);
                break;
        }
        if (i10 != 13) {
            bbVar.setLayoutParams(new s4.p0(-1, -2));
        }
        return new s4.c1(bbVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f42627a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.d9) {
            ((org.telegram.ui.Cells.d9) view).f19880a.setLoading(profileActivity.f31273i5);
            ((org.telegram.ui.Cells.d9) view).f19881b.setLoading(profileActivity.f31273i5);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        View view = c1Var.f42627a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
