package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class qq extends org.telegram.ui.Components.ul0 {
    public final Context f36118c;
    public boolean d;
    public final rq e;

    public qq(rq rqVar, Context context) {
        this.e = rqVar;
        if (rqVar.f36441y == 2) {
            C(true);
        }
        this.f36118c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        TLRPC.Chat chat;
        int i10 = c1Var.f41613f;
        rq rqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = rqVar.P;
        int i11 = rqVar.f36441y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = rqVar.N;
        if (!rqVar.f36437w.creator || ((i11 != 0 && (i11 != 2 || !rqVar.K)) || i10 != 4 || c1Var.b() != rqVar.f36416e0)) {
            if (rqVar.I) {
                if ((i11 == 0 || i11 == 2) && i10 == 4) {
                    int b10 = c1Var.b();
                    if (b10 == rqVar.W) {
                        if (!tL_chatAdminRights.add_admins && ((chat = rqVar.f36437w) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i11 != 2 || rqVar.K) {
                        if (b10 == rqVar.X) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !rqVar.E) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == rqVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == rqVar.Z) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == rqVar.f36407a0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == rqVar.f36410b0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == rqVar.f36413c0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == rqVar.K0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == rqVar.f36415d0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == rqVar.f36416e0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == rqVar.f36418f0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == rqVar.f36419g0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == rqVar.f36420h0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == rqVar.f36421i0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == rqVar.m0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == rqVar.U0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == rqVar.V0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == rqVar.W0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == rqVar.f36426n0) {
                                    return tL_chatAdminRights.manage_linked_peers;
                                }
                            }
                        }
                    } else {
                        return false;
                    }
                }
                if (i10 == 3 || i10 == 1 || i10 == 5 || i10 == 8 || i10 == 11) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.V;
    }

    @Override
    public final long i(int i10) {
        rq rqVar = this.e;
        if (rqVar.f36441y == 2) {
            if (i10 == rqVar.W) {
                return 1L;
            }
            if (i10 == rqVar.X) {
                return 2L;
            }
            if (i10 == rqVar.Y) {
                return 3L;
            }
            if (i10 == rqVar.f36410b0) {
                return 4L;
            }
            if (i10 == rqVar.f36413c0) {
                return 5L;
            }
            if (i10 == rqVar.f36415d0) {
                return 6L;
            }
            if (i10 == rqVar.f36416e0) {
                return 7L;
            }
            if (i10 == rqVar.f36418f0) {
                return 8L;
            }
            if (i10 == rqVar.f36419g0) {
                return 9L;
            }
            if (i10 == rqVar.f36420h0) {
                return 10L;
            }
            if (i10 == rqVar.f36427o0) {
                return 11L;
            }
            if (i10 == rqVar.f36428p0) {
                return 12L;
            }
            if (i10 == rqVar.f36429q0) {
                return 13L;
            }
            if (i10 == rqVar.f36431r0) {
                return 14L;
            }
            if (i10 == rqVar.f36433s0) {
                return 15L;
            }
            if (i10 == rqVar.f36434t0) {
                return 16L;
            }
            if (i10 == rqVar.f36435u0) {
                return 17L;
            }
            if (i10 == rqVar.f36436v0) {
                return 18L;
            }
            if (i10 == rqVar.f36438w0) {
                return 19L;
            }
            if (i10 == rqVar.f36442y0) {
                return 20L;
            }
            if (i10 == rqVar.B0) {
                return 21L;
            }
            if (i10 == rqVar.H0) {
                return 22L;
            }
            if (i10 == rqVar.I0) {
                return 23L;
            }
            if (i10 == rqVar.J0) {
                return 24L;
            }
            if (i10 == rqVar.K0) {
                return 25L;
            }
            if (i10 == rqVar.L0) {
                return 26L;
            }
            if (i10 == rqVar.M0) {
                return 27L;
            }
            if (i10 == rqVar.f36440x0) {
                return 28L;
            }
            if (i10 == rqVar.m0) {
                return 29L;
            }
            if (i10 == rqVar.C0) {
                return 30L;
            }
            if (i10 == rqVar.E0) {
                return 31L;
            }
            if (i10 == rqVar.D0) {
                return 32L;
            }
            if (i10 == rqVar.F0) {
                return 33L;
            }
            if (i10 == rqVar.G0) {
                return 34L;
            }
            if (i10 == rqVar.f36443z0) {
                return 35L;
            }
            if (i10 == rqVar.N0) {
                return 36L;
            }
            if (i10 == rqVar.P0) {
                return 37L;
            }
            if (i10 == rqVar.Q0) {
                return 38L;
            }
            if (i10 == rqVar.R0) {
                return 39L;
            }
            if (i10 == rqVar.S0) {
                return 40L;
            }
            if (i10 == rqVar.U0) {
                return 41L;
            }
            if (i10 == rqVar.V0) {
                return 42L;
            }
            if (i10 == rqVar.W0) {
                return 43L;
            }
            if (i10 == rqVar.Z) {
                return 44L;
            }
            if (i10 == rqVar.f36421i0) {
                return 45L;
            }
            if (i10 == rqVar.f36422j0) {
                return 46L;
            }
            if (i10 == rqVar.f36423k0) {
                return 47L;
            }
            if (i10 == rqVar.f36424l0) {
                return 48L;
            }
            if (i10 == rqVar.f36426n0) {
                return 49L;
            }
            if (i10 == rqVar.f36407a0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        rq rqVar = this.e;
        if (i10 != rqVar.H0 && i10 != rqVar.J0 && i10 != rqVar.I0 && i10 != rqVar.B0 && i10 != rqVar.C0 && i10 != rqVar.E0 && i10 != rqVar.D0 && i10 != rqVar.G0 && i10 != rqVar.F0 && i10 != rqVar.f36422j0 && i10 != rqVar.P0 && i10 != rqVar.Q0 && i10 != rqVar.R0 && i10 != rqVar.U0 && i10 != rqVar.V0 && i10 != rqVar.W0) {
            if (i10 != rqVar.f36443z0 && i10 != rqVar.N0 && i10 != rqVar.S0) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != 1 && i10 != rqVar.f36427o0 && i10 != rqVar.f36429q0 && i10 != rqVar.L0 && i10 != rqVar.f36433s0) {
                    if (i10 != 2 && i10 != rqVar.f36435u0) {
                        if (i10 != rqVar.X && i10 != rqVar.Y && i10 != rqVar.Z && i10 != rqVar.f36410b0 && i10 != rqVar.f36413c0 && i10 != rqVar.f36415d0 && i10 != rqVar.f36418f0 && i10 != rqVar.f36419g0 && i10 != rqVar.f36420h0 && i10 != rqVar.f36421i0 && i10 != rqVar.f36442y0 && i10 != rqVar.f36416e0 && i10 != rqVar.K0 && i10 != rqVar.W && i10 != rqVar.m0 && i10 != rqVar.f36423k0 && i10 != rqVar.f36426n0 && i10 != rqVar.f36407a0) {
                            if (i10 == rqVar.f36431r0 || i10 == rqVar.f36438w0 || i10 == rqVar.f36424l0) {
                                return 1;
                            }
                            if (i10 == rqVar.M0) {
                                return 6;
                            }
                            if (i10 == rqVar.f36436v0) {
                                return 11;
                            }
                            if (i10 != rqVar.f36440x0) {
                                return 2;
                            }
                            return 8;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 5;
            }
            return 9;
        }
        return 10;
    }

    @Override
    public final void v(s4.c1 r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qq.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.Cells.z1 z1Var;
        org.telegram.ui.Cells.e6 e6Var;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.f36118c;
        rq rqVar = this.e;
        switch (i10) {
            case 0:
                View abVar = new org.telegram.ui.Cells.ab(context, null);
                abVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                e6Var = abVar;
                break;
            case 1:
                e6Var = new org.telegram.ui.Cells.f9(context);
                break;
            case 2:
            default:
                View gaVar = new org.telegram.ui.Cells.ga(context);
                gaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                e6Var = gaVar;
                break;
            case 3:
                View m4Var = new org.telegram.ui.Cells.m4(this.f36118c, org.telegram.ui.ActionBar.j6.L6, 21, 15, true, null);
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                z1Var = m4Var;
                e6Var = z1Var;
                break;
            case 4:
            case 9:
                View w8Var = new org.telegram.ui.Cells.w8(context);
                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                e6Var = w8Var;
                break;
            case 5:
                e6Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                break;
            case 6:
                View d9Var = new org.telegram.ui.Cells.d9(context, null, false);
                d9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                e6Var = d9Var;
                break;
            case 7:
                org.telegram.ui.Cells.e6 e6Var2 = new org.telegram.ui.Cells.e6(context, 0, null, null);
                e6Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                e6Var2.c(new m0(this, 4));
                e6Var = e6Var2;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                rqVar.d = frameLayout;
                int i13 = org.telegram.ui.ActionBar.j6.f17872a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                rqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, false, false);
                rqVar.f36417f = o6Var;
                o6Var.setTypeface(AndroidUtilities.bold());
                rqVar.f36417f.setTextColor(-1);
                rqVar.f36417f.setTextSize(AndroidUtilities.dp(14.0f));
                rqVar.f36417f.setGravity(17);
                org.telegram.ui.Components.o6 o6Var2 = rqVar.f36417f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.em.l(R.string.AddBotButton, " ", sb2);
                if (rqVar.K) {
                    i11 = R.string.AddBotButtonAsAdmin;
                } else {
                    i11 = R.string.AddBotButtonAsMember;
                }
                sb2.append(LocaleController.getString(i11));
                o6Var2.setText(sb2.toString());
                rqVar.e.addView(rqVar.f36417f, w7.a6.e(-2, -2, 17));
                rqVar.e.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                rqVar.e.setOnClickListener(new a(this, 15));
                rqVar.d.addView(rqVar.e, w7.a6.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                rqVar.d.setLayoutParams(new s4.p0(-1, -2));
                View view = new View(context);
                view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                rqVar.d.setClipChildren(false);
                rqVar.d.setClipToPadding(false);
                rqVar.d.addView(view, w7.a6.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                e6Var = rqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, this.f36118c, rqVar.getResourceProvider(), false);
                z1Var2.setPad(1);
                z1Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.f17983g7, org.telegram.ui.ActionBar.j6.f18056k7);
                z1Var2.setEnabled(true);
                z1Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                z1Var = z1Var2;
                e6Var = z1Var;
                break;
            case 11:
                i12 = ((org.telegram.ui.ActionBar.p2) rqVar).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.p2) rqVar).resourceProvider;
                e6Var = new org.telegram.ui.Components.n01(i12, -rqVar.f36432s, this.f36118c, f6Var);
                break;
        }
        return new s4.c1(e6Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int b10 = c1Var.b();
        rq rqVar = this.e;
        if (b10 == rqVar.f36435u0) {
            rq.f0(rqVar, c1Var.f41610a);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int b10 = c1Var.b();
        rq rqVar = this.e;
        if (b10 == rqVar.f36436v0 && rqVar.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(rqVar.getParentActivity().getCurrentFocus());
        }
    }
}
