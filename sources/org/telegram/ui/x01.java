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
public final class x01 extends org.telegram.ui.Components.qm0 {
    public final Context f43949c;
    public final HashMap d = new HashMap();
    public final ProfileActivity f43950e;

    public x01(ProfileActivity profileActivity, Context context) {
        this.f43950e = profileActivity;
        this.f43949c = context;
    }

    @Override
    public final void A(s4.d1 d1Var) {
        int b10 = d1Var.b();
        ProfileActivity profileActivity = this.f43950e;
        if (b10 == profileActivity.O2) {
            profileActivity.M2 = null;
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        ProfileActivity profileActivity = this.f43950e;
        if (profileActivity.f34315f3 != -1) {
            int b10 = d1Var.b();
            if (b10 != profileActivity.f34315f3 && b10 != profileActivity.T2 && b10 != profileActivity.f34329h3 && b10 != profileActivity.f34322g3 && b10 != profileActivity.V2 && b10 != profileActivity.W2 && b10 != profileActivity.f34451z3 && b10 != profileActivity.f34336i3 && b10 != profileActivity.j3 && b10 != profileActivity.f34388q3 && b10 != profileActivity.f34368n3 && b10 != profileActivity.f34349k3 && b10 != profileActivity.f34360m3 && b10 != profileActivity.f34395r3 && b10 != profileActivity.f34403s3 && b10 != profileActivity.f34424v3 && b10 != profileActivity.f34432w3 && b10 != profileActivity.f34439x3 && b10 != profileActivity.y3 && b10 != profileActivity.O2 && b10 != profileActivity.f34277a4 && b10 != profileActivity.f34293c4 && b10 != profileActivity.f34323g4 && b10 != profileActivity.f34316f4 && b10 != profileActivity.f34355l3 && b10 != profileActivity.U2 && b10 != profileActivity.Q2 && b10 != profileActivity.f34300d4 && b10 != profileActivity.f34308e4 && b10 != profileActivity.l4) {
                return false;
            }
        } else {
            View view = d1Var.f47782a;
            if (view instanceof org.telegram.ui.Cells.xa) {
                Object currentObject = ((org.telegram.ui.Cells.xa) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = d1Var.f47786f;
            if (i10 == 1 || i10 == 5 || i10 == 7 || i10 == 11 || i10 == 31 || i10 == 28 || i10 == 12 || i10 == 13 || i10 == 9 || i10 == 10 || i10 == 25 || i10 == 32) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.CharSequence E(java.lang.String r7, java.util.ArrayList r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x01.E(java.lang.String, java.util.ArrayList, java.lang.String):java.lang.CharSequence");
    }

    @Override
    public final int h() {
        return this.f43950e.N2;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.f43950e;
        if (i10 != profileActivity.D3 && i10 != profileActivity.f34411t4 && i10 != profileActivity.f34307e3 && i10 != profileActivity.S2 && i10 != profileActivity.f34382p3 && i10 != profileActivity.f34417u3 && i10 != profileActivity.f34369n4) {
            if (i10 != profileActivity.G3 && i10 != profileActivity.I3 && i10 != profileActivity.T2 && i10 != profileActivity.U2) {
                if (i10 != profileActivity.L3 && i10 != profileActivity.V2) {
                    if (i10 == profileActivity.H3) {
                        return 30;
                    }
                    if (i10 != profileActivity.J3 && i10 != profileActivity.K3 && i10 != profileActivity.W2) {
                        if (i10 != profileActivity.f34389q4 && i10 != profileActivity.f34396r4 && i10 != profileActivity.V3 && i10 != profileActivity.X3 && i10 != profileActivity.W3 && i10 != profileActivity.f34440x4 && i10 != profileActivity.f34446y4 && i10 != profileActivity.f34452z4 && i10 != profileActivity.A4 && i10 != profileActivity.G4 && i10 != profileActivity.f34433w4 && i10 != profileActivity.L4 && i10 != profileActivity.K4 && i10 != profileActivity.U3 && i10 != profileActivity.f34315f3 && i10 != profileActivity.f34329h3 && i10 != profileActivity.f34322g3 && i10 != profileActivity.f34336i3 && i10 != profileActivity.j3 && i10 != profileActivity.f34388q3 && i10 != profileActivity.f34368n3 && i10 != profileActivity.f34349k3 && i10 != profileActivity.f34360m3 && i10 != profileActivity.f34395r3 && i10 != profileActivity.f34403s3 && i10 != profileActivity.f34424v3 && i10 != profileActivity.f34432w3 && i10 != profileActivity.f34439x3 && i10 != profileActivity.y3 && i10 != profileActivity.O2 && i10 != profileActivity.f34277a4 && i10 != profileActivity.Z3 && i10 != profileActivity.f34355l3 && i10 != profileActivity.f34323g4 && i10 != profileActivity.f34316f4 && i10 != profileActivity.B4 && i10 != profileActivity.C4 && i10 != profileActivity.D4) {
                            i11 = profileActivity.botPermissionLocation;
                            if (i10 != i11) {
                                i12 = profileActivity.botPermissionBiometry;
                                if (i10 != i12) {
                                    i13 = profileActivity.botPermissionEmojiStatus;
                                    if (i10 != i13 && i10 != profileActivity.f34308e4) {
                                        if (i10 == profileActivity.M3) {
                                            return 5;
                                        }
                                        if (i10 == profileActivity.N3) {
                                            return 6;
                                        }
                                        if (i10 == profileActivity.Q3) {
                                            return 20;
                                        }
                                        if (i10 != profileActivity.M4 && i10 != profileActivity.H4 && i10 != profileActivity.f34361m4 && i10 != profileActivity.f34404s4 && i10 != profileActivity.f34299d3 && i10 != profileActivity.f34375o3 && i10 != profileActivity.f34410t3 && i10 != profileActivity.P2 && i10 != profileActivity.f34284b3 && i10 != profileActivity.X2 && i10 != profileActivity.f34330h4 && i10 != profileActivity.Y3 && i10 != profileActivity.R2 && i10 != profileActivity.Z2 && i10 != profileActivity.F4 && i10 != profileActivity.f34383p4 && i10 != profileActivity.E4 && i10 != profileActivity.f34350k4) {
                                            if (i10 >= profileActivity.f34418u4 && i10 < profileActivity.f34425v4) {
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
                                            if (i10 == profileActivity.f34451z3) {
                                                return 14;
                                            }
                                            if (i10 != profileActivity.f34292c3 && i10 != profileActivity.f34276a3 && i10 != profileActivity.Y2) {
                                                if (i10 == profileActivity.f34285b4) {
                                                    return 17;
                                                }
                                                if (i10 == profileActivity.f34293c4) {
                                                    return 18;
                                                }
                                                if (i10 == profileActivity.f34300d4) {
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
                                                if (i10 == profileActivity.f34337i4) {
                                                    return 25;
                                                }
                                                if (i10 != profileActivity.R3 && i10 != profileActivity.T3) {
                                                    if (i10 == profileActivity.f34343j4) {
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
    public final void v(s4.d1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x01.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        s01 xaVar;
        float f7;
        View u01Var;
        int i12 = 1;
        boolean z12 = false;
        Context context = this.f43949c;
        ProfileActivity profileActivity = this.f43950e;
        switch (i10) {
            case 1:
                xaVar = new org.telegram.ui.Cells.m4(this.f43949c, org.telegram.ui.ActionBar.h6.L6, 18, 7, false, profileActivity.f34448z0);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.d6 d6Var = profileActivity.f34448z0;
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
                r01 r01Var = new r01(this, this.f43949c, d6Var, z12, z11);
                r01Var.setContentDescriptionValueFirst(true);
                xaVar = r01Var;
                break;
            case 3:
                s01 s01Var = new s01(this, context, profileActivity, profileActivity.f34448z0);
                profileActivity.N5 = s01Var;
                xaVar = s01Var;
                break;
            case 4:
                xaVar = new ns(this, context, profileActivity.f34448z0);
                break;
            case 5:
                View d3Var = new org.telegram.ui.Cells.d3(context, profileActivity.f34448z0);
                d3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                xaVar = d3Var;
                break;
            case 6:
                xaVar = new t01(this, context, profileActivity.f34448z0);
                break;
            case 7:
                xaVar = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                if (profileActivity.f34433w4 == -1) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
                xaVar = new org.telegram.ui.Cells.xa(i11, 0, this.f43949c, profileActivity.f34448z0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 10, profileActivity.f34448z0);
                e9Var.getTextView().setGravity(1);
                e9Var.getTextView().setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A6, profileActivity.f34448z0));
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
                u01Var = new u01(this, context);
                u01Var.setBackground(new ColorDrawable(0));
                u01Var.setTag(-33024);
                xaVar = u01Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                u01Var = profileActivity.O;
                u01Var.setTag(-33024);
                xaVar = u01Var;
                break;
            case 15:
                xaVar = new w01(this, context, profileActivity.f34448z0);
                break;
            case 17:
                xaVar = new org.telegram.ui.Cells.e9(context, profileActivity.f34448z0);
                break;
            case 18:
            case 24:
                if (i10 == 18) {
                    i12 = 0;
                }
                View r1Var = new rg.r1(context, i12, profileActivity.f34448z0);
                r1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20822d6, profileActivity.f34448z0));
                xaVar = r1Var;
                break;
            case 20:
                xaVar = new org.telegram.ui.Cells.w8(18, context, profileActivity.f34448z0, false);
                break;
            case 21:
                View k1Var = new hg.k1(context, profileActivity.f34448z0);
                k1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20822d6, profileActivity.f34448z0));
                xaVar = k1Var;
                break;
            case 22:
                View v01Var = new v01(this, context, profileActivity.f34448z0);
                v01Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20822d6, profileActivity.f34448z0));
                xaVar = v01Var;
                break;
            case 23:
                xaVar = new org.telegram.ui.Cells.h6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                ci.d dVar = new ci.d(context, profileActivity.f34448z0, true);
                dVar.e();
                dVar.g(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new m01(this, 0));
                frameLayout.addView(dVar, w7.x5.a(48.0f, 18.0f, 14.0f, 18.0f, 14.0f, -1, 119));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20822d6, profileActivity.f34448z0));
                xaVar = frameLayout;
                break;
            case 26:
                xaVar = new org.telegram.ui.Cells.e9(context, profileActivity.f34448z0);
                break;
            case 27:
                xaVar = new ei.i(context, profileActivity.f34448z0);
                break;
            case 28:
                u01Var = new org.telegram.ui.Components.ao(context, 22);
                u01Var.setTag(-33024);
                xaVar = u01Var;
                break;
            case 32:
                xaVar = new j11(profileActivity, context);
                break;
            case 33:
                xaVar = new gi.c(context, profileActivity.f34448z0);
                break;
        }
        if (i10 != 13) {
            xaVar.setLayoutParams(new s4.q0(-1, -2));
        }
        return new s4.d1(xaVar);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        View view = d1Var.f47782a;
        ProfileActivity profileActivity = this.f43950e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.c9) {
            ((org.telegram.ui.Cells.c9) view).f21959a.setLoading(profileActivity.f34338i5);
            ((org.telegram.ui.Cells.c9) view).f21960b.setLoading(profileActivity.f34338i5);
        }
    }

    @Override
    public final void z(s4.d1 d1Var) {
        View view = d1Var.f47782a;
        ProfileActivity profileActivity = this.f43950e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
