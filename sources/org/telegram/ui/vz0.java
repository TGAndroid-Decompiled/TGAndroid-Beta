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
public final class vz0 extends org.telegram.ui.Components.il0 {
    public final Context f43802c;
    public final HashMap d = new HashMap();
    public final ProfileActivity f43803e;

    public vz0(ProfileActivity profileActivity, Context context) {
        this.f43803e = profileActivity;
        this.f43802c = context;
    }

    @Override
    public final void A(f2.n1 n1Var) {
        int b10 = n1Var.b();
        ProfileActivity profileActivity = this.f43803e;
        if (b10 == profileActivity.K2) {
            profileActivity.I2 = null;
        }
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        ProfileActivity profileActivity = this.f43803e;
        if (profileActivity.f35995b3 != -1) {
            int b10 = n1Var.b();
            if (b10 != profileActivity.f35995b3 && b10 != profileActivity.P2 && b10 != profileActivity.f36008d3 && b10 != profileActivity.c3 && b10 != profileActivity.R2 && b10 != profileActivity.S2 && b10 != profileActivity.f36132v3 && b10 != profileActivity.f36016e3 && b10 != profileActivity.f36024f3 && b10 != profileActivity.f36071m3 && b10 != profileActivity.f36052j3 && b10 != profileActivity.f36031g3 && b10 != profileActivity.f36045i3 && b10 != profileActivity.f36079n3 && b10 != profileActivity.f36086o3 && b10 != profileActivity.f36107r3 && b10 != profileActivity.f36114s3 && b10 != profileActivity.f36120t3 && b10 != profileActivity.f36126u3 && b10 != profileActivity.K2 && b10 != profileActivity.W3 && b10 != profileActivity.Y3 && b10 != profileActivity.f36003c4 && b10 != profileActivity.f35996b4 && b10 != profileActivity.f36038h3 && b10 != profileActivity.Q2 && b10 != profileActivity.M2 && b10 != profileActivity.Z3 && b10 != profileActivity.f35988a4 && b10 != profileActivity.f36039h4) {
                return false;
            }
        } else {
            View view = n1Var.f6432a;
            if (view instanceof org.telegram.ui.Cells.sa) {
                Object currentObject = ((org.telegram.ui.Cells.sa) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = n1Var.f6436f;
            if (i10 == 1 || i10 == 5 || i10 == 7 || i10 == 11 || i10 == 31 || i10 == 28 || i10 == 12 || i10 == 13 || i10 == 9 || i10 == 10 || i10 == 25 || i10 == 32) {
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
        return this.f43803e.J2;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.f43803e;
        if (i10 != profileActivity.f36158z3 && i10 != profileActivity.f36094p4 && i10 != profileActivity.f35987a3 && i10 != profileActivity.O2 && i10 != profileActivity.f36065l3 && i10 != profileActivity.f36100q3 && i10 != profileActivity.f36053j4) {
            if (i10 != profileActivity.C3 && i10 != profileActivity.E3 && i10 != profileActivity.P2 && i10 != profileActivity.Q2) {
                if (i10 != profileActivity.H3 && i10 != profileActivity.R2) {
                    if (i10 == profileActivity.D3) {
                        return 30;
                    }
                    if (i10 != profileActivity.F3 && i10 != profileActivity.G3 && i10 != profileActivity.S2) {
                        if (i10 != profileActivity.f36072m4 && i10 != profileActivity.f36080n4 && i10 != profileActivity.R3 && i10 != profileActivity.T3 && i10 != profileActivity.S3 && i10 != profileActivity.f36121t4 && i10 != profileActivity.f36127u4 && i10 != profileActivity.f36133v4 && i10 != profileActivity.f36140w4 && i10 != profileActivity.C4 && i10 != profileActivity.f36115s4 && i10 != profileActivity.H4 && i10 != profileActivity.G4 && i10 != profileActivity.Q3 && i10 != profileActivity.f35995b3 && i10 != profileActivity.f36008d3 && i10 != profileActivity.c3 && i10 != profileActivity.f36016e3 && i10 != profileActivity.f36024f3 && i10 != profileActivity.f36071m3 && i10 != profileActivity.f36052j3 && i10 != profileActivity.f36031g3 && i10 != profileActivity.f36045i3 && i10 != profileActivity.f36079n3 && i10 != profileActivity.f36086o3 && i10 != profileActivity.f36107r3 && i10 != profileActivity.f36114s3 && i10 != profileActivity.f36120t3 && i10 != profileActivity.f36126u3 && i10 != profileActivity.K2 && i10 != profileActivity.W3 && i10 != profileActivity.V3 && i10 != profileActivity.f36038h3 && i10 != profileActivity.f36003c4 && i10 != profileActivity.f35996b4 && i10 != profileActivity.x4 && i10 != profileActivity.f36153y4 && i10 != profileActivity.f36159z4) {
                            i11 = profileActivity.botPermissionLocation;
                            if (i10 != i11) {
                                i12 = profileActivity.botPermissionBiometry;
                                if (i10 != i12) {
                                    i13 = profileActivity.botPermissionEmojiStatus;
                                    if (i10 != i13 && i10 != profileActivity.f35988a4) {
                                        if (i10 == profileActivity.I3) {
                                            return 5;
                                        }
                                        if (i10 == profileActivity.J3) {
                                            return 6;
                                        }
                                        if (i10 == profileActivity.M3) {
                                            return 20;
                                        }
                                        if (i10 != profileActivity.I4 && i10 != profileActivity.D4 && i10 != profileActivity.f36046i4 && i10 != profileActivity.f36087o4 && i10 != profileActivity.Z2 && i10 != profileActivity.f36059k3 && i10 != profileActivity.f36093p3 && i10 != profileActivity.L2 && i10 != profileActivity.X2 && i10 != profileActivity.T2 && i10 != profileActivity.f36009d4 && i10 != profileActivity.U3 && i10 != profileActivity.N2 && i10 != profileActivity.V2 && i10 != profileActivity.B4 && i10 != profileActivity.f36066l4 && i10 != profileActivity.A4 && i10 != profileActivity.f36032g4) {
                                            if (i10 >= profileActivity.f36101q4 && i10 < profileActivity.f36108r4) {
                                                return 8;
                                            }
                                            if (i10 == profileActivity.f36139w3) {
                                                return 11;
                                            }
                                            if (i10 == profileActivity.f36146x3) {
                                                return 31;
                                            }
                                            if (i10 == profileActivity.f36152y3) {
                                                return 12;
                                            }
                                            if (i10 == profileActivity.F4) {
                                                return 13;
                                            }
                                            if (i10 == profileActivity.f36132v3) {
                                                return 14;
                                            }
                                            if (i10 != profileActivity.Y2 && i10 != profileActivity.W2 && i10 != profileActivity.U2) {
                                                if (i10 == profileActivity.X3) {
                                                    return 17;
                                                }
                                                if (i10 == profileActivity.Y3) {
                                                    return 18;
                                                }
                                                if (i10 == profileActivity.Z3) {
                                                    return 24;
                                                }
                                                if (i10 == profileActivity.L3) {
                                                    return 21;
                                                }
                                                if (i10 == profileActivity.K3) {
                                                    return 22;
                                                }
                                                if (i10 == profileActivity.M2) {
                                                    return 23;
                                                }
                                                if (i10 == profileActivity.f36017e4) {
                                                    return 25;
                                                }
                                                if (i10 != profileActivity.N3 && i10 != profileActivity.P3) {
                                                    if (i10 == profileActivity.f36025f4) {
                                                        return 32;
                                                    }
                                                    if (i10 == profileActivity.f36039h4) {
                                                        return 33;
                                                    }
                                                    if (i10 == profileActivity.O3) {
                                                        return 27;
                                                    }
                                                    if (i10 != profileActivity.A3 && i10 != profileActivity.B3) {
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
    public final void v(f2.n1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vz0.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        qz0 saVar;
        float f9;
        View sz0Var;
        int i12 = 1;
        boolean z11 = false;
        Context context = this.f43802c;
        ProfileActivity profileActivity = this.f43803e;
        switch (i10) {
            case 1:
                org.telegram.ui.ActionBar.c6 c6Var = profileActivity.f36129v0;
                saVar = new org.telegram.ui.Cells.k4(this.f43802c, org.telegram.ui.ActionBar.g6.L6, 18, 7, false, c6Var);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.c6 c6Var2 = profileActivity.f36129v0;
                if (i10 == 30) {
                    z11 = true;
                }
                if (i10 == 19) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pz0 pz0Var = new pz0(this, this.f43802c, c6Var2, z11, z10);
                pz0Var.setContentDescriptionValueFirst(true);
                saVar = pz0Var;
                break;
            case 3:
                qz0 qz0Var = new qz0(this, context, profileActivity, profileActivity.f36129v0);
                profileActivity.J5 = qz0Var;
                saVar = qz0Var;
                break;
            case 4:
                saVar = new fs(this, context, profileActivity.f36129v0);
                break;
            case 5:
                View a3Var = new org.telegram.ui.Cells.a3(context, profileActivity.f36129v0);
                a3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                saVar = a3Var;
                break;
            case 6:
                saVar = new rz0(this, context, profileActivity.f36129v0);
                break;
            case 7:
                saVar = new org.telegram.ui.Cells.x6(context, (b) null);
                break;
            case 8:
                if (profileActivity.f36115s4 == -1) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
                org.telegram.ui.ActionBar.c6 c6Var3 = profileActivity.f36129v0;
                saVar = new org.telegram.ui.Cells.sa(i11, 0, this.f43802c, c6Var3, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, 10, profileActivity.f36129v0);
                y8Var.getTextView().setGravity(1);
                y8Var.getTextView().setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, profileActivity.f36129v0));
                y8Var.getTextView().setMovementMethod(null);
                y8Var.setText(AndroidUtilities.getBuildVersionInfo());
                y8Var.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                saVar = y8Var;
                break;
            case 11:
            case 31:
                if (i10 == 31) {
                    f9 = 12.0f;
                } else {
                    f9 = 6.0f;
                }
                View q3Var = new org.telegram.ui.Cells.q3(context, AndroidUtilities.dp(f9), 2);
                q3Var.setTag(-33024);
                saVar = q3Var;
                break;
            case 12:
                sz0Var = new sz0(this, context);
                sz0Var.setBackground(new ColorDrawable(0));
                sz0Var.setTag(-33024);
                saVar = sz0Var;
                break;
            case 13:
                if (profileActivity.K.getParent() != null) {
                    ((ViewGroup) profileActivity.K.getParent()).removeView(profileActivity.K);
                }
                sz0Var = profileActivity.K;
                sz0Var.setTag(-33024);
                saVar = sz0Var;
                break;
            case 15:
                saVar = new uz0(this, context, profileActivity.f36129v0);
                break;
            case 17:
                saVar = new org.telegram.ui.Cells.y8(context, profileActivity.f36129v0);
                break;
            case 18:
            case 24:
                if (i10 == 18) {
                    i12 = 0;
                }
                View n2Var = new cg.n2(context, i12, profileActivity.f36129v0);
                n2Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, profileActivity.f36129v0));
                saVar = n2Var;
                break;
            case 20:
                saVar = new org.telegram.ui.Cells.q8(18, context, profileActivity.f36129v0, false);
                break;
            case 21:
                View b1Var = new sf.b1(context, profileActivity.f36129v0);
                b1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, profileActivity.f36129v0));
                saVar = b1Var;
                break;
            case 22:
                View tz0Var = new tz0(this, context, profileActivity.f36129v0);
                tz0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, profileActivity.f36129v0));
                saVar = tz0Var;
                break;
            case 23:
                saVar = new org.telegram.ui.Cells.e6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                nh.d dVar = new nh.d(context, profileActivity.f36129v0, true);
                dVar.e();
                dVar.g(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new kz0(this, 0));
                frameLayout.addView(dVar, i7.f6.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, profileActivity.f36129v0));
                saVar = frameLayout;
                break;
            case 26:
                saVar = new org.telegram.ui.Cells.y8(context, profileActivity.f36129v0);
                break;
            case 27:
                saVar = new ph.g(context, profileActivity.f36129v0);
                break;
            case 28:
                sz0Var = new org.telegram.ui.Components.fn(context, 20);
                sz0Var.setTag(-33024);
                saVar = sz0Var;
                break;
            case 32:
                saVar = new i01(profileActivity, context);
                break;
            case 33:
                saVar = new rh.b(context, profileActivity.f36129v0);
                break;
        }
        if (i10 != 13) {
            saVar.setLayoutParams(new f2.x0(-1, -2));
        }
        return new f2.n1(saVar);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        View view = n1Var.f6432a;
        ProfileActivity profileActivity = this.f43803e;
        if (view == profileActivity.K) {
            profileActivity.M = true;
        }
        if (view instanceof org.telegram.ui.Cells.w8) {
            ((org.telegram.ui.Cells.w8) view).f25875a.setLoading(profileActivity.f36018e5);
            ((org.telegram.ui.Cells.w8) view).f25876b.setLoading(profileActivity.f36018e5);
        }
    }

    @Override
    public final void z(f2.n1 n1Var) {
        View view = n1Var.f6432a;
        ProfileActivity profileActivity = this.f43803e;
        if (view == profileActivity.K) {
            profileActivity.M = false;
        }
    }
}
