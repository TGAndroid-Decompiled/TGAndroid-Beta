package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class wx0 extends org.telegram.ui.Components.tk0 {
    public final Context f43181c;
    public final HashMap d = new HashMap();
    public final ProfileActivity e;

    public wx0(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.f43181c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        int b10 = c1Var.b();
        ProfileActivity profileActivity = this.e;
        if (b10 == profileActivity.N2) {
            profileActivity.L2 = null;
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.f33812e3 != -1) {
            int b10 = c1Var.b();
            if (b10 != profileActivity.f33812e3 && b10 != profileActivity.S2 && b10 != profileActivity.f33827g3 && b10 != profileActivity.f33820f3 && b10 != profileActivity.U2 && b10 != profileActivity.V2 && b10 != profileActivity.y3 && b10 != profileActivity.f33834h3 && b10 != profileActivity.f33841i3 && b10 != profileActivity.f33888p3 && b10 != profileActivity.f33866m3 && b10 != profileActivity.f33848j3 && b10 != profileActivity.f33861l3 && b10 != profileActivity.f33894q3 && b10 != profileActivity.f33901r3 && b10 != profileActivity.f33923u3 && b10 != profileActivity.f33930v3 && b10 != profileActivity.f33938w3 && b10 != profileActivity.f33946x3 && b10 != profileActivity.N2 && b10 != profileActivity.Z3 && b10 != profileActivity.f33791b4 && b10 != profileActivity.f33821f4 && b10 != profileActivity.f33813e4 && b10 != profileActivity.f33855k3 && b10 != profileActivity.T2 && b10 != profileActivity.P2 && b10 != profileActivity.f33799c4 && b10 != profileActivity.f33806d4 && b10 != profileActivity.f33856k4) {
                return false;
            }
        } else {
            View view = c1Var.f47909a;
            if (view instanceof org.telegram.ui.Cells.pa) {
                Object currentObject = ((org.telegram.ui.Cells.pa) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && org.telegram.messenger.i20.B((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = c1Var.f47912f;
            if (i10 == 1 || i10 == 5 || i10 == 7 || i10 == 11 || i10 == 31 || i10 == 28 || i10 == 12 || i10 == 13 || i10 == 9 || i10 == 10 || i10 == 25 || i10 == 32) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.CharSequence E(java.lang.String r7, java.util.ArrayList r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wx0.E(java.lang.String, java.util.ArrayList, java.lang.String):java.lang.CharSequence");
    }

    @Override
    public final int b() {
        return this.e.M2;
    }

    @Override
    public final int d(int i10) {
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.e;
        if (i10 != profileActivity.C3 && i10 != profileActivity.f33910s4 && i10 != profileActivity.f33805d3 && i10 != profileActivity.R2 && i10 != profileActivity.f33881o3 && i10 != profileActivity.f33916t3 && i10 != profileActivity.f33867m4) {
            if (i10 != profileActivity.F3 && i10 != profileActivity.H3 && i10 != profileActivity.S2 && i10 != profileActivity.T2) {
                if (i10 != profileActivity.K3 && i10 != profileActivity.U2) {
                    if (i10 == profileActivity.G3) {
                        return 30;
                    }
                    if (i10 != profileActivity.I3 && i10 != profileActivity.J3 && i10 != profileActivity.V2) {
                        if (i10 != profileActivity.f33889p4 && i10 != profileActivity.f33895q4 && i10 != profileActivity.U3 && i10 != profileActivity.W3 && i10 != profileActivity.V3 && i10 != profileActivity.f33939w4 && i10 != profileActivity.f33947x4 && i10 != profileActivity.f33954y4 && i10 != profileActivity.f33961z4 && i10 != profileActivity.F4 && i10 != profileActivity.f33931v4 && i10 != profileActivity.L4 && i10 != profileActivity.K4 && i10 != profileActivity.T3 && i10 != profileActivity.f33812e3 && i10 != profileActivity.f33827g3 && i10 != profileActivity.f33820f3 && i10 != profileActivity.f33834h3 && i10 != profileActivity.f33841i3 && i10 != profileActivity.f33888p3 && i10 != profileActivity.f33866m3 && i10 != profileActivity.f33848j3 && i10 != profileActivity.f33861l3 && i10 != profileActivity.f33894q3 && i10 != profileActivity.f33901r3 && i10 != profileActivity.f33923u3 && i10 != profileActivity.f33930v3 && i10 != profileActivity.f33938w3 && i10 != profileActivity.f33946x3 && i10 != profileActivity.N2 && i10 != profileActivity.Z3 && i10 != profileActivity.Y3 && i10 != profileActivity.f33855k3 && i10 != profileActivity.f33821f4 && i10 != profileActivity.f33813e4 && i10 != profileActivity.A4 && i10 != profileActivity.B4 && i10 != profileActivity.C4) {
                            i11 = profileActivity.botPermissionLocation;
                            if (i10 != i11) {
                                i12 = profileActivity.botPermissionBiometry;
                                if (i10 != i12) {
                                    i13 = profileActivity.botPermissionEmojiStatus;
                                    if (i10 != i13 && i10 != profileActivity.f33806d4) {
                                        if (i10 == profileActivity.L3) {
                                            return 5;
                                        }
                                        if (i10 == profileActivity.M3) {
                                            return 6;
                                        }
                                        if (i10 == profileActivity.P3) {
                                            return 20;
                                        }
                                        if (i10 != profileActivity.M4 && i10 != profileActivity.G4 && i10 != profileActivity.l4 && i10 != profileActivity.f33902r4 && i10 != profileActivity.f33798c3 && i10 != profileActivity.f33874n3 && i10 != profileActivity.f33909s3 && i10 != profileActivity.O2 && i10 != profileActivity.f33782a3 && i10 != profileActivity.W2 && i10 != profileActivity.f33828g4 && i10 != profileActivity.X3 && i10 != profileActivity.Q2 && i10 != profileActivity.Y2 && i10 != profileActivity.E4 && i10 != profileActivity.f33882o4 && i10 != profileActivity.D4 && i10 != profileActivity.f33849j4) {
                                            if (i10 >= profileActivity.f33917t4 && i10 < profileActivity.f33924u4) {
                                                return 8;
                                            }
                                            if (i10 == profileActivity.f33960z3) {
                                                return 11;
                                            }
                                            if (i10 == profileActivity.A3) {
                                                return 31;
                                            }
                                            if (i10 == profileActivity.B3) {
                                                return 12;
                                            }
                                            if (i10 == profileActivity.J4) {
                                                return 13;
                                            }
                                            if (i10 == profileActivity.y3) {
                                                return 14;
                                            }
                                            if (i10 != profileActivity.f33790b3 && i10 != profileActivity.Z2 && i10 != profileActivity.X2) {
                                                if (i10 == profileActivity.f33783a4) {
                                                    return 17;
                                                }
                                                if (i10 == profileActivity.f33791b4) {
                                                    return 18;
                                                }
                                                if (i10 == profileActivity.f33799c4) {
                                                    return 24;
                                                }
                                                if (i10 == profileActivity.O3) {
                                                    return 21;
                                                }
                                                if (i10 == profileActivity.N3) {
                                                    return 22;
                                                }
                                                if (i10 == profileActivity.P2) {
                                                    return 23;
                                                }
                                                if (i10 == profileActivity.f33835h4) {
                                                    return 25;
                                                }
                                                if (i10 != profileActivity.Q3 && i10 != profileActivity.S3) {
                                                    if (i10 == profileActivity.f33842i4) {
                                                        return 32;
                                                    }
                                                    if (i10 == profileActivity.f33856k4) {
                                                        return 33;
                                                    }
                                                    if (i10 == profileActivity.R3) {
                                                        return 27;
                                                    }
                                                    if (i10 != profileActivity.D3 && i10 != profileActivity.E3) {
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
    public final void t(s4.c1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wx0.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        rx0 paVar;
        float f7;
        View x3Var;
        View tx0Var;
        int i12 = 1;
        boolean z12 = false;
        Context context = this.f43181c;
        ProfileActivity profileActivity = this.e;
        switch (i10) {
            case 1:
                paVar = new org.telegram.ui.Cells.p4(this.f43181c, org.telegram.ui.ActionBar.t6.L6, 18, 7, false, profileActivity.f33957z0);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.p6 p6Var = profileActivity.f33957z0;
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
                qx0 qx0Var = new qx0(this, this.f43181c, p6Var, z12, z11);
                qx0Var.setContentDescriptionValueFirst(true);
                paVar = qx0Var;
                break;
            case 3:
                rx0 rx0Var = new rx0(this, context, profileActivity, profileActivity.f33957z0);
                profileActivity.f33808d6 = rx0Var;
                paVar = rx0Var;
                break;
            case 4:
                paVar = new ls(this, context, profileActivity.f33957z0);
                break;
            case 5:
                View g3Var = new org.telegram.ui.Cells.g3(context, profileActivity.f33957z0);
                g3Var.setPadding(org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(4.0f), 0, 0);
                paVar = g3Var;
                break;
            case 6:
                paVar = new sx0(this, context, profileActivity.f33957z0);
                break;
            case 7:
                paVar = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                if (profileActivity.f33931v4 == -1) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
                paVar = new org.telegram.ui.Cells.pa(i11, 0, this.f43181c, profileActivity.f33957z0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(10, context, profileActivity.f33957z0);
                b9Var.getTextView().setGravity(1);
                org.telegram.ui.ActionBar.a7.V(b9Var.getTextView(), org.telegram.ui.ActionBar.t6.A6, profileActivity.f33957z0);
                b9Var.getTextView().setMovementMethod(null);
                b9Var.setText(org.telegram.messenger.i0.D0());
                b9Var.getTextView().setPadding(0, org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f));
                paVar = b9Var;
                break;
            case 11:
            case 31:
                if (i10 == 31) {
                    f7 = 12.0f;
                } else {
                    f7 = 6.0f;
                }
                x3Var = new org.telegram.ui.Cells.x3(context, org.telegram.messenger.i0.L(f7), 2);
                x3Var.setTag(-33024);
                paVar = x3Var;
                break;
            case 12:
                tx0Var = new tx0(this, context);
                tx0Var.setBackground(new ColorDrawable(0));
                tx0Var.setTag(-33024);
                paVar = tx0Var;
                break;
            case 13:
                if (profileActivity.N.getParent() != null) {
                    ((ViewGroup) profileActivity.N.getParent()).removeView(profileActivity.N);
                }
                tx0Var = profileActivity.N;
                tx0Var.setTag(-33024);
                paVar = tx0Var;
                break;
            case 15:
                paVar = new vx0(this, context, profileActivity.f33957z0);
                break;
            case 17:
                paVar = new org.telegram.ui.Cells.b9(context, profileActivity.f33957z0);
                break;
            case 18:
            case 24:
                if (i10 == 18) {
                    i12 = 0;
                }
                View b2Var = new kg.b2(i12, context, profileActivity.f33957z0);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, b2Var, profileActivity.f33957z0);
                paVar = b2Var;
                break;
            case 20:
                paVar = new org.telegram.ui.Cells.t8(18, context, profileActivity.f33957z0, false);
                break;
            case 21:
                View l2Var = new ag.l2(context, profileActivity.f33957z0);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, l2Var, profileActivity.f33957z0);
                paVar = l2Var;
                break;
            case 22:
                View ux0Var = new ux0(this, context, profileActivity.f33957z0);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, ux0Var, profileActivity.f33957z0);
                paVar = ux0Var;
                break;
            case 23:
                paVar = new org.telegram.ui.Cells.j6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                vh.d dVar = new vh.d(context, profileActivity.f33957z0, true);
                dVar.f();
                dVar.i(org.telegram.messenger.dd.L0(2131746723, null), false, true);
                dVar.setOnClickListener(new kx0(this, 0));
                frameLayout.addView(dVar, w7.b6.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, frameLayout, profileActivity.f33957z0);
                paVar = frameLayout;
                break;
            case 26:
                paVar = new org.telegram.ui.Cells.b9(context, profileActivity.f33957z0);
                break;
            case 27:
                paVar = new xh.f(context, profileActivity.f33957z0);
                break;
            case 28:
                x3Var = new org.telegram.ui.Components.bn(context, 18);
                x3Var.setTag(-33024);
                paVar = x3Var;
                break;
            case 32:
                paVar = new iy0(profileActivity, context);
                break;
            case 33:
                paVar = new zh.c(context, profileActivity.f33957z0);
                break;
        }
        if (i10 != 13) {
            paVar.setLayoutParams(new s4.o0(-1, -2));
        }
        return new s4.c1(paVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f47909a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.N) {
            profileActivity.P = true;
        }
        if (view instanceof org.telegram.ui.Cells.z8) {
            ((org.telegram.ui.Cells.z8) view).f23649a.setLoading(profileActivity.f33843i5);
            ((org.telegram.ui.Cells.z8) view).f23650b.setLoading(profileActivity.f33843i5);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        View view = c1Var.f47909a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.N) {
            profileActivity.P = false;
        }
    }
}
