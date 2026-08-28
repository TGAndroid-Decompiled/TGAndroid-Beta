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
public final class vz0 extends org.telegram.ui.Components.vk0 {
    public final Context f43615c;
    public final HashMap d = new HashMap();
    public final ProfileActivity f43616e;

    public vz0(ProfileActivity profileActivity, Context context) {
        this.f43616e = profileActivity;
        this.f43615c = context;
    }

    @Override
    public final void A(f2.q1 q1Var) {
        int b10 = q1Var.b();
        ProfileActivity profileActivity = this.f43616e;
        if (b10 == profileActivity.K2) {
            profileActivity.I2 = null;
        }
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        ProfileActivity profileActivity = this.f43616e;
        if (profileActivity.f35928b3 != -1) {
            int b10 = q1Var.b();
            if (b10 != profileActivity.f35928b3 && b10 != profileActivity.P2 && b10 != profileActivity.f35943d3 && b10 != profileActivity.f35936c3 && b10 != profileActivity.R2 && b10 != profileActivity.S2 && b10 != profileActivity.f36067v3 && b10 != profileActivity.f35951e3 && b10 != profileActivity.f35959f3 && b10 != profileActivity.f36006m3 && b10 != profileActivity.f35987j3 && b10 != profileActivity.f35966g3 && b10 != profileActivity.f35980i3 && b10 != profileActivity.f36014n3 && b10 != profileActivity.f36021o3 && b10 != profileActivity.f36041r3 && b10 != profileActivity.f36049s3 && b10 != profileActivity.f36055t3 && b10 != profileActivity.f36061u3 && b10 != profileActivity.K2 && b10 != profileActivity.W3 && b10 != profileActivity.Y3 && b10 != profileActivity.f35937c4 && b10 != profileActivity.f35929b4 && b10 != profileActivity.f35973h3 && b10 != profileActivity.Q2 && b10 != profileActivity.M2 && b10 != profileActivity.Z3 && b10 != profileActivity.f35921a4 && b10 != profileActivity.f35974h4) {
                return false;
            }
        } else {
            View view = q1Var.f5501a;
            if (view instanceof org.telegram.ui.Cells.va) {
                Object currentObject = ((org.telegram.ui.Cells.va) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i9 = q1Var.f5505f;
            if (i9 == 1 || i9 == 5 || i9 == 7 || i9 == 11 || i9 == 31 || i9 == 28 || i9 == 12 || i9 == 13 || i9 == 9 || i9 == 10 || i9 == 25 || i9 == 32) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.CharSequence E(java.lang.String r7, java.util.ArrayList r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vz0.E(java.lang.String, java.util.ArrayList, java.lang.String):java.lang.CharSequence");
    }

    @Override
    public final int h() {
        return this.f43616e.J2;
    }

    @Override
    public final int j(int i9) {
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.f43616e;
        if (i9 != profileActivity.f36093z3 && i9 != profileActivity.f36028p4 && i9 != profileActivity.a3 && i9 != profileActivity.O2 && i9 != profileActivity.f36000l3 && i9 != profileActivity.f36033q3 && i9 != profileActivity.f35988j4) {
            if (i9 != profileActivity.C3 && i9 != profileActivity.E3 && i9 != profileActivity.P2 && i9 != profileActivity.Q2) {
                if (i9 != profileActivity.H3 && i9 != profileActivity.R2) {
                    if (i9 == profileActivity.D3) {
                        return 30;
                    }
                    if (i9 != profileActivity.F3 && i9 != profileActivity.G3 && i9 != profileActivity.S2) {
                        if (i9 != profileActivity.f36007m4 && i9 != profileActivity.f36015n4 && i9 != profileActivity.R3 && i9 != profileActivity.T3 && i9 != profileActivity.S3 && i9 != profileActivity.f36056t4 && i9 != profileActivity.f36062u4 && i9 != profileActivity.v4 && i9 != profileActivity.f36074w4 && i9 != profileActivity.C4 && i9 != profileActivity.f36050s4 && i9 != profileActivity.H4 && i9 != profileActivity.G4 && i9 != profileActivity.Q3 && i9 != profileActivity.f35928b3 && i9 != profileActivity.f35943d3 && i9 != profileActivity.f35936c3 && i9 != profileActivity.f35951e3 && i9 != profileActivity.f35959f3 && i9 != profileActivity.f36006m3 && i9 != profileActivity.f35987j3 && i9 != profileActivity.f35966g3 && i9 != profileActivity.f35980i3 && i9 != profileActivity.f36014n3 && i9 != profileActivity.f36021o3 && i9 != profileActivity.f36041r3 && i9 != profileActivity.f36049s3 && i9 != profileActivity.f36055t3 && i9 != profileActivity.f36061u3 && i9 != profileActivity.K2 && i9 != profileActivity.W3 && i9 != profileActivity.V3 && i9 != profileActivity.f35973h3 && i9 != profileActivity.f35937c4 && i9 != profileActivity.f35929b4 && i9 != profileActivity.f36081x4 && i9 != profileActivity.f36088y4 && i9 != profileActivity.f36094z4) {
                            i10 = profileActivity.botPermissionLocation;
                            if (i9 != i10) {
                                i11 = profileActivity.botPermissionBiometry;
                                if (i9 != i11) {
                                    i12 = profileActivity.botPermissionEmojiStatus;
                                    if (i9 != i12 && i9 != profileActivity.f35921a4) {
                                        if (i9 == profileActivity.I3) {
                                            return 5;
                                        }
                                        if (i9 == profileActivity.J3) {
                                            return 6;
                                        }
                                        if (i9 == profileActivity.M3) {
                                            return 20;
                                        }
                                        if (i9 != profileActivity.I4 && i9 != profileActivity.D4 && i9 != profileActivity.f35981i4 && i9 != profileActivity.f36022o4 && i9 != profileActivity.Z2 && i9 != profileActivity.f35994k3 && i9 != profileActivity.f36027p3 && i9 != profileActivity.L2 && i9 != profileActivity.X2 && i9 != profileActivity.T2 && i9 != profileActivity.f35944d4 && i9 != profileActivity.U3 && i9 != profileActivity.N2 && i9 != profileActivity.V2 && i9 != profileActivity.B4 && i9 != profileActivity.f36001l4 && i9 != profileActivity.A4 && i9 != profileActivity.f35967g4) {
                                            if (i9 >= profileActivity.f36034q4 && i9 < profileActivity.f36042r4) {
                                                return 8;
                                            }
                                            if (i9 == profileActivity.f36073w3) {
                                                return 11;
                                            }
                                            if (i9 == profileActivity.f36080x3) {
                                                return 31;
                                            }
                                            if (i9 == profileActivity.f36087y3) {
                                                return 12;
                                            }
                                            if (i9 == profileActivity.F4) {
                                                return 13;
                                            }
                                            if (i9 == profileActivity.f36067v3) {
                                                return 14;
                                            }
                                            if (i9 != profileActivity.Y2 && i9 != profileActivity.W2 && i9 != profileActivity.U2) {
                                                if (i9 == profileActivity.X3) {
                                                    return 17;
                                                }
                                                if (i9 == profileActivity.Y3) {
                                                    return 18;
                                                }
                                                if (i9 == profileActivity.Z3) {
                                                    return 24;
                                                }
                                                if (i9 == profileActivity.L3) {
                                                    return 21;
                                                }
                                                if (i9 == profileActivity.K3) {
                                                    return 22;
                                                }
                                                if (i9 == profileActivity.M2) {
                                                    return 23;
                                                }
                                                if (i9 == profileActivity.f35952e4) {
                                                    return 25;
                                                }
                                                if (i9 != profileActivity.N3 && i9 != profileActivity.P3) {
                                                    if (i9 == profileActivity.f35960f4) {
                                                        return 32;
                                                    }
                                                    if (i9 == profileActivity.f35974h4) {
                                                        return 33;
                                                    }
                                                    if (i9 == profileActivity.O3) {
                                                        return 27;
                                                    }
                                                    if (i9 != profileActivity.A3 && i9 != profileActivity.B3) {
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
    public final void v(f2.q1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vz0.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        boolean z10;
        int i10;
        qz0 vaVar;
        float f10;
        View sz0Var;
        int i11 = 1;
        boolean z11 = false;
        Context context = this.f43615c;
        ProfileActivity profileActivity = this.f43616e;
        switch (i9) {
            case 1:
                org.telegram.ui.ActionBar.b6 b6Var = profileActivity.f36064v0;
                vaVar = new org.telegram.ui.Cells.m4(this.f43615c, org.telegram.ui.ActionBar.f6.L6, 18, 7, false, b6Var);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.b6 b6Var2 = profileActivity.f36064v0;
                if (i9 == 30) {
                    z11 = true;
                }
                if (i9 == 19) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pz0 pz0Var = new pz0(this, this.f43615c, b6Var2, z11, z10);
                pz0Var.setContentDescriptionValueFirst(true);
                vaVar = pz0Var;
                break;
            case 3:
                qz0 qz0Var = new qz0(this, context, profileActivity, profileActivity.f36064v0);
                profileActivity.J5 = qz0Var;
                vaVar = qz0Var;
                break;
            case 4:
                vaVar = new gs(this, context, profileActivity.f36064v0);
                break;
            case 5:
                View c3Var = new org.telegram.ui.Cells.c3(context, profileActivity.f36064v0);
                c3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                vaVar = c3Var;
                break;
            case 6:
                vaVar = new rz0(this, context, profileActivity.f36064v0);
                break;
            case 7:
                vaVar = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                break;
            case 8:
                if (profileActivity.f36050s4 == -1) {
                    i10 = 9;
                } else {
                    i10 = 6;
                }
                org.telegram.ui.ActionBar.b6 b6Var3 = profileActivity.f36064v0;
                vaVar = new org.telegram.ui.Cells.va(i10, 0, this.f43615c, b6Var3, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context, 10, profileActivity.f36064v0);
                b9Var.getTextView().setGravity(1);
                b9Var.getTextView().setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, profileActivity.f36064v0));
                b9Var.getTextView().setMovementMethod(null);
                b9Var.setText(AndroidUtilities.getBuildVersionInfo());
                b9Var.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                vaVar = b9Var;
                break;
            case 11:
            case 31:
                if (i9 == 31) {
                    f10 = 12.0f;
                } else {
                    f10 = 6.0f;
                }
                View t3Var = new org.telegram.ui.Cells.t3(context, AndroidUtilities.dp(f10), 2);
                t3Var.setTag(-33024);
                vaVar = t3Var;
                break;
            case 12:
                sz0Var = new sz0(this, context);
                sz0Var.setBackground(new ColorDrawable(0));
                sz0Var.setTag(-33024);
                vaVar = sz0Var;
                break;
            case 13:
                if (profileActivity.K.getParent() != null) {
                    ((ViewGroup) profileActivity.K.getParent()).removeView(profileActivity.K);
                }
                sz0Var = profileActivity.K;
                sz0Var.setTag(-33024);
                vaVar = sz0Var;
                break;
            case 15:
                vaVar = new uz0(this, context, profileActivity.f36064v0);
                break;
            case 17:
                vaVar = new org.telegram.ui.Cells.b9(context, profileActivity.f36064v0);
                break;
            case 18:
            case 24:
                if (i9 == 18) {
                    i11 = 0;
                }
                View r1Var = new zf.r1(context, i11, profileActivity.f36064v0);
                r1Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, profileActivity.f36064v0));
                vaVar = r1Var;
                break;
            case 20:
                vaVar = new org.telegram.ui.Cells.t8(18, context, profileActivity.f36064v0, false);
                break;
            case 21:
                View c1Var = new pf.c1(context, profileActivity.f36064v0);
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, profileActivity.f36064v0));
                vaVar = c1Var;
                break;
            case 22:
                View tz0Var = new tz0(this, context, profileActivity.f36064v0);
                tz0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, profileActivity.f36064v0));
                vaVar = tz0Var;
                break;
            case 23:
                vaVar = new org.telegram.ui.Cells.g6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                kh.d dVar = new kh.d(context, profileActivity.f36064v0, true);
                dVar.e();
                dVar.g(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new kz0(this, 0));
                frameLayout.addView(dVar, g7.e6.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, profileActivity.f36064v0));
                vaVar = frameLayout;
                break;
            case 26:
                vaVar = new org.telegram.ui.Cells.b9(context, profileActivity.f36064v0);
                break;
            case 27:
                vaVar = new mh.i(context, profileActivity.f36064v0);
                break;
            case 28:
                sz0Var = new org.telegram.ui.Components.an(context, 23);
                sz0Var.setTag(-33024);
                vaVar = sz0Var;
                break;
            case 32:
                vaVar = new h01(profileActivity, context);
                break;
            case 33:
                vaVar = new oh.b(context, profileActivity.f36064v0);
                break;
        }
        if (i9 != 13) {
            vaVar.setLayoutParams(new f2.a1(-1, -2));
        }
        return new f2.q1(vaVar);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        ProfileActivity profileActivity = this.f43616e;
        if (view == profileActivity.K) {
            profileActivity.M = true;
        }
        if (view instanceof org.telegram.ui.Cells.z8) {
            ((org.telegram.ui.Cells.z8) view).f26035a.setLoading(profileActivity.f35953e5);
            ((org.telegram.ui.Cells.z8) view).f26036b.setLoading(profileActivity.f35953e5);
        }
    }

    @Override
    public final void z(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        ProfileActivity profileActivity = this.f43616e;
        if (view == profileActivity.K) {
            profileActivity.M = false;
        }
    }
}
