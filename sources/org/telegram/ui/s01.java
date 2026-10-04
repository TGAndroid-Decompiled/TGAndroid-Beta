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
public final class s01 extends org.telegram.ui.Components.yl0 {
    public final Context f40317c;
    public final HashMap d = new HashMap();
    public final ProfileActivity f40318e;

    public s01(ProfileActivity profileActivity, Context context) {
        this.f40318e = profileActivity;
        this.f40317c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        int b10 = c1Var.b();
        ProfileActivity profileActivity = this.f40318e;
        if (b10 == profileActivity.O2) {
            profileActivity.M2 = null;
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        ProfileActivity profileActivity = this.f40318e;
        if (profileActivity.f34244f3 != -1) {
            int b10 = c1Var.b();
            if (b10 != profileActivity.f34244f3 && b10 != profileActivity.T2 && b10 != profileActivity.f34258h3 && b10 != profileActivity.f34251g3 && b10 != profileActivity.V2 && b10 != profileActivity.W2 && b10 != profileActivity.f34380z3 && b10 != profileActivity.f34265i3 && b10 != profileActivity.j3 && b10 != profileActivity.f34317q3 && b10 != profileActivity.f34297n3 && b10 != profileActivity.f34278k3 && b10 != profileActivity.f34289m3 && b10 != profileActivity.f34324r3 && b10 != profileActivity.f34332s3 && b10 != profileActivity.f34353v3 && b10 != profileActivity.f34361w3 && b10 != profileActivity.f34368x3 && b10 != profileActivity.y3 && b10 != profileActivity.O2 && b10 != profileActivity.f34206a4 && b10 != profileActivity.f34222c4 && b10 != profileActivity.f34252g4 && b10 != profileActivity.f34245f4 && b10 != profileActivity.f34284l3 && b10 != profileActivity.U2 && b10 != profileActivity.Q2 && b10 != profileActivity.f34229d4 && b10 != profileActivity.f34237e4 && b10 != profileActivity.l4) {
                return false;
            }
        } else {
            View view = c1Var.f46524a;
            if (view instanceof org.telegram.ui.Cells.za) {
                Object currentObject = ((org.telegram.ui.Cells.za) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = c1Var.f46528f;
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
        return this.f40318e.N2;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.f40318e;
        if (i10 != profileActivity.D3 && i10 != profileActivity.f34340t4 && i10 != profileActivity.f34236e3 && i10 != profileActivity.S2 && i10 != profileActivity.f34311p3 && i10 != profileActivity.f34346u3 && i10 != profileActivity.f34298n4) {
            if (i10 != profileActivity.G3 && i10 != profileActivity.I3 && i10 != profileActivity.T2 && i10 != profileActivity.U2) {
                if (i10 != profileActivity.L3 && i10 != profileActivity.V2) {
                    if (i10 == profileActivity.H3) {
                        return 30;
                    }
                    if (i10 != profileActivity.J3 && i10 != profileActivity.K3 && i10 != profileActivity.W2) {
                        if (i10 != profileActivity.f34318q4 && i10 != profileActivity.f34325r4 && i10 != profileActivity.V3 && i10 != profileActivity.X3 && i10 != profileActivity.W3 && i10 != profileActivity.f34369x4 && i10 != profileActivity.f34375y4 && i10 != profileActivity.f34381z4 && i10 != profileActivity.A4 && i10 != profileActivity.G4 && i10 != profileActivity.f34362w4 && i10 != profileActivity.L4 && i10 != profileActivity.K4 && i10 != profileActivity.U3 && i10 != profileActivity.f34244f3 && i10 != profileActivity.f34258h3 && i10 != profileActivity.f34251g3 && i10 != profileActivity.f34265i3 && i10 != profileActivity.j3 && i10 != profileActivity.f34317q3 && i10 != profileActivity.f34297n3 && i10 != profileActivity.f34278k3 && i10 != profileActivity.f34289m3 && i10 != profileActivity.f34324r3 && i10 != profileActivity.f34332s3 && i10 != profileActivity.f34353v3 && i10 != profileActivity.f34361w3 && i10 != profileActivity.f34368x3 && i10 != profileActivity.y3 && i10 != profileActivity.O2 && i10 != profileActivity.f34206a4 && i10 != profileActivity.Z3 && i10 != profileActivity.f34284l3 && i10 != profileActivity.f34252g4 && i10 != profileActivity.f34245f4 && i10 != profileActivity.B4 && i10 != profileActivity.C4 && i10 != profileActivity.D4) {
                            i11 = profileActivity.botPermissionLocation;
                            if (i10 != i11) {
                                i12 = profileActivity.botPermissionBiometry;
                                if (i10 != i12) {
                                    i13 = profileActivity.botPermissionEmojiStatus;
                                    if (i10 != i13 && i10 != profileActivity.f34237e4) {
                                        if (i10 == profileActivity.M3) {
                                            return 5;
                                        }
                                        if (i10 == profileActivity.N3) {
                                            return 6;
                                        }
                                        if (i10 == profileActivity.Q3) {
                                            return 20;
                                        }
                                        if (i10 != profileActivity.M4 && i10 != profileActivity.H4 && i10 != profileActivity.f34290m4 && i10 != profileActivity.f34333s4 && i10 != profileActivity.f34228d3 && i10 != profileActivity.f34304o3 && i10 != profileActivity.f34339t3 && i10 != profileActivity.P2 && i10 != profileActivity.f34213b3 && i10 != profileActivity.X2 && i10 != profileActivity.f34259h4 && i10 != profileActivity.Y3 && i10 != profileActivity.R2 && i10 != profileActivity.Z2 && i10 != profileActivity.F4 && i10 != profileActivity.f34312p4 && i10 != profileActivity.E4 && i10 != profileActivity.f34279k4) {
                                            if (i10 >= profileActivity.f34347u4 && i10 < profileActivity.f34354v4) {
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
                                            if (i10 == profileActivity.f34380z3) {
                                                return 14;
                                            }
                                            if (i10 != profileActivity.f34221c3 && i10 != profileActivity.f34205a3 && i10 != profileActivity.Y2) {
                                                if (i10 == profileActivity.f34214b4) {
                                                    return 17;
                                                }
                                                if (i10 == profileActivity.f34222c4) {
                                                    return 18;
                                                }
                                                if (i10 == profileActivity.f34229d4) {
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
                                                if (i10 == profileActivity.f34266i4) {
                                                    return 25;
                                                }
                                                if (i10 != profileActivity.R3 && i10 != profileActivity.T3) {
                                                    if (i10 == profileActivity.f34272j4) {
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
        n01 zaVar;
        float f7;
        View p01Var;
        int i12 = 1;
        boolean z11 = false;
        Context context = this.f40317c;
        ProfileActivity profileActivity = this.f40318e;
        switch (i10) {
            case 1:
                org.telegram.ui.ActionBar.d6 d6Var = profileActivity.f34377z0;
                zaVar = new org.telegram.ui.Cells.m4(this.f40317c, org.telegram.ui.ActionBar.i6.L6, 18, 7, false, d6Var);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.d6 d6Var2 = profileActivity.f34377z0;
                if (i10 == 30) {
                    z11 = true;
                }
                if (i10 == 19) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m01 m01Var = new m01(this, this.f40317c, d6Var2, z11, z10);
                m01Var.setContentDescriptionValueFirst(true);
                zaVar = m01Var;
                break;
            case 3:
                n01 n01Var = new n01(this, context, profileActivity, profileActivity.f34377z0);
                profileActivity.N5 = n01Var;
                zaVar = n01Var;
                break;
            case 4:
                zaVar = new os(this, context, profileActivity.f34377z0);
                break;
            case 5:
                View d3Var = new org.telegram.ui.Cells.d3(context, profileActivity.f34377z0);
                d3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                zaVar = d3Var;
                break;
            case 6:
                zaVar = new o01(this, context, profileActivity.f34377z0);
                break;
            case 7:
                zaVar = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                if (profileActivity.f34362w4 == -1) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
                org.telegram.ui.ActionBar.d6 d6Var3 = profileActivity.f34377z0;
                zaVar = new org.telegram.ui.Cells.za(i11, 0, this.f40317c, d6Var3, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 10, profileActivity.f34377z0);
                e9Var.getTextView().setGravity(1);
                e9Var.getTextView().setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A6, profileActivity.f34377z0));
                e9Var.getTextView().setMovementMethod(null);
                e9Var.setText(AndroidUtilities.getBuildVersionInfo());
                e9Var.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                zaVar = e9Var;
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
                zaVar = t3Var;
                break;
            case 12:
                p01Var = new p01(this, context);
                p01Var.setBackground(new ColorDrawable(0));
                p01Var.setTag(-33024);
                zaVar = p01Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                p01Var = profileActivity.O;
                p01Var.setTag(-33024);
                zaVar = p01Var;
                break;
            case 15:
                zaVar = new r01(this, context, profileActivity.f34377z0);
                break;
            case 17:
                zaVar = new org.telegram.ui.Cells.e9(context, profileActivity.f34377z0);
                break;
            case 18:
            case 24:
                if (i10 == 18) {
                    i12 = 0;
                }
                View t1Var = new rg.t1(context, i12, profileActivity.f34377z0);
                t1Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20818d6, profileActivity.f34377z0));
                zaVar = t1Var;
                break;
            case 20:
                zaVar = new org.telegram.ui.Cells.w8(18, context, profileActivity.f34377z0, false);
                break;
            case 21:
                View k1Var = new hg.k1(context, profileActivity.f34377z0);
                k1Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20818d6, profileActivity.f34377z0));
                zaVar = k1Var;
                break;
            case 22:
                View q01Var = new q01(this, context, profileActivity.f34377z0);
                q01Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20818d6, profileActivity.f34377z0));
                zaVar = q01Var;
                break;
            case 23:
                zaVar = new org.telegram.ui.Cells.h6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                ci.d dVar = new ci.d(context, profileActivity.f34377z0, true);
                dVar.e();
                dVar.g(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new h01(this, 0));
                frameLayout.addView(dVar, w7.z5.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20818d6, profileActivity.f34377z0));
                zaVar = frameLayout;
                break;
            case 26:
                zaVar = new org.telegram.ui.Cells.e9(context, profileActivity.f34377z0);
                break;
            case 27:
                zaVar = new ei.j(context, profileActivity.f34377z0);
                break;
            case 28:
                p01Var = new org.telegram.ui.Components.nn(context, 22);
                p01Var.setTag(-33024);
                zaVar = p01Var;
                break;
            case 32:
                zaVar = new e11(profileActivity, context);
                break;
            case 33:
                zaVar = new gi.c(context, profileActivity.f34377z0);
                break;
        }
        if (i10 != 13) {
            zaVar.setLayoutParams(new s4.p0(-1, -2));
        }
        return new s4.c1(zaVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f46524a;
        ProfileActivity profileActivity = this.f40318e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.c9) {
            ((org.telegram.ui.Cells.c9) view).f21888a.setLoading(profileActivity.f34267i5);
            ((org.telegram.ui.Cells.c9) view).f21889b.setLoading(profileActivity.f34267i5);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        View view = c1Var.f46524a;
        ProfileActivity profileActivity = this.f40318e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
