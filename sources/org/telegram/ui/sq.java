package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class sq extends org.telegram.ui.Components.lm0 {
    public final Context f40192c;
    public boolean d;
    public final tq e;

    public sq(tq tqVar, Context context) {
        this.e = tqVar;
        if (tqVar.f40468y == 2) {
            C(true);
        }
        this.f40192c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        TLRPC.Chat chat;
        int i10 = b1Var.f44841f;
        tq tqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = tqVar.P;
        int i11 = tqVar.f40468y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = tqVar.N;
        if (!tqVar.f40464w.creator || ((i11 != 0 && (i11 != 2 || !tqVar.K)) || i10 != 4 || b1Var.b() != tqVar.f40443e0)) {
            if (tqVar.I) {
                if ((i11 == 0 || i11 == 2) && i10 == 4) {
                    int b10 = b1Var.b();
                    if (b10 == tqVar.W) {
                        if (!tL_chatAdminRights.add_admins && ((chat = tqVar.f40464w) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i11 != 2 || tqVar.K) {
                        if (b10 == tqVar.X) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !tqVar.E) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == tqVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == tqVar.Z) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == tqVar.f40434a0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == tqVar.f40437b0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == tqVar.f40440c0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == tqVar.K0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == tqVar.f40442d0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == tqVar.f40443e0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == tqVar.f40445f0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == tqVar.f40446g0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == tqVar.f40447h0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == tqVar.f40448i0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == tqVar.m0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == tqVar.U0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == tqVar.V0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == tqVar.W0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == tqVar.f40453n0) {
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
        tq tqVar = this.e;
        if (tqVar.f40468y == 2) {
            if (i10 == tqVar.W) {
                return 1L;
            }
            if (i10 == tqVar.X) {
                return 2L;
            }
            if (i10 == tqVar.Y) {
                return 3L;
            }
            if (i10 == tqVar.f40437b0) {
                return 4L;
            }
            if (i10 == tqVar.f40440c0) {
                return 5L;
            }
            if (i10 == tqVar.f40442d0) {
                return 6L;
            }
            if (i10 == tqVar.f40443e0) {
                return 7L;
            }
            if (i10 == tqVar.f40445f0) {
                return 8L;
            }
            if (i10 == tqVar.f40446g0) {
                return 9L;
            }
            if (i10 == tqVar.f40447h0) {
                return 10L;
            }
            if (i10 == tqVar.f40454o0) {
                return 11L;
            }
            if (i10 == tqVar.f40455p0) {
                return 12L;
            }
            if (i10 == tqVar.f40456q0) {
                return 13L;
            }
            if (i10 == tqVar.f40458r0) {
                return 14L;
            }
            if (i10 == tqVar.f40460s0) {
                return 15L;
            }
            if (i10 == tqVar.f40461t0) {
                return 16L;
            }
            if (i10 == tqVar.f40462u0) {
                return 17L;
            }
            if (i10 == tqVar.f40463v0) {
                return 18L;
            }
            if (i10 == tqVar.f40465w0) {
                return 19L;
            }
            if (i10 == tqVar.f40469y0) {
                return 20L;
            }
            if (i10 == tqVar.B0) {
                return 21L;
            }
            if (i10 == tqVar.H0) {
                return 22L;
            }
            if (i10 == tqVar.I0) {
                return 23L;
            }
            if (i10 == tqVar.J0) {
                return 24L;
            }
            if (i10 == tqVar.K0) {
                return 25L;
            }
            if (i10 == tqVar.L0) {
                return 26L;
            }
            if (i10 == tqVar.M0) {
                return 27L;
            }
            if (i10 == tqVar.f40467x0) {
                return 28L;
            }
            if (i10 == tqVar.m0) {
                return 29L;
            }
            if (i10 == tqVar.C0) {
                return 30L;
            }
            if (i10 == tqVar.E0) {
                return 31L;
            }
            if (i10 == tqVar.D0) {
                return 32L;
            }
            if (i10 == tqVar.F0) {
                return 33L;
            }
            if (i10 == tqVar.G0) {
                return 34L;
            }
            if (i10 == tqVar.f40470z0) {
                return 35L;
            }
            if (i10 == tqVar.N0) {
                return 36L;
            }
            if (i10 == tqVar.P0) {
                return 37L;
            }
            if (i10 == tqVar.Q0) {
                return 38L;
            }
            if (i10 == tqVar.R0) {
                return 39L;
            }
            if (i10 == tqVar.S0) {
                return 40L;
            }
            if (i10 == tqVar.U0) {
                return 41L;
            }
            if (i10 == tqVar.V0) {
                return 42L;
            }
            if (i10 == tqVar.W0) {
                return 43L;
            }
            if (i10 == tqVar.Z) {
                return 44L;
            }
            if (i10 == tqVar.f40448i0) {
                return 45L;
            }
            if (i10 == tqVar.f40449j0) {
                return 46L;
            }
            if (i10 == tqVar.f40450k0) {
                return 47L;
            }
            if (i10 == tqVar.f40451l0) {
                return 48L;
            }
            if (i10 == tqVar.f40453n0) {
                return 49L;
            }
            if (i10 == tqVar.f40434a0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        tq tqVar = this.e;
        if (i10 != tqVar.H0 && i10 != tqVar.J0 && i10 != tqVar.I0 && i10 != tqVar.B0 && i10 != tqVar.C0 && i10 != tqVar.E0 && i10 != tqVar.D0 && i10 != tqVar.G0 && i10 != tqVar.F0 && i10 != tqVar.f40449j0 && i10 != tqVar.P0 && i10 != tqVar.Q0 && i10 != tqVar.R0 && i10 != tqVar.U0 && i10 != tqVar.V0 && i10 != tqVar.W0) {
            if (i10 != tqVar.f40470z0 && i10 != tqVar.N0 && i10 != tqVar.S0) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != 1 && i10 != tqVar.f40454o0 && i10 != tqVar.f40456q0 && i10 != tqVar.L0 && i10 != tqVar.f40460s0) {
                    if (i10 != 2 && i10 != tqVar.f40462u0) {
                        if (i10 != tqVar.X && i10 != tqVar.Y && i10 != tqVar.Z && i10 != tqVar.f40437b0 && i10 != tqVar.f40440c0 && i10 != tqVar.f40442d0 && i10 != tqVar.f40445f0 && i10 != tqVar.f40446g0 && i10 != tqVar.f40447h0 && i10 != tqVar.f40448i0 && i10 != tqVar.f40469y0 && i10 != tqVar.f40443e0 && i10 != tqVar.K0 && i10 != tqVar.W && i10 != tqVar.m0 && i10 != tqVar.f40450k0 && i10 != tqVar.f40453n0 && i10 != tqVar.f40434a0) {
                            if (i10 == tqVar.f40458r0 || i10 == tqVar.f40465w0 || i10 == tqVar.f40451l0) {
                                return 1;
                            }
                            if (i10 == tqVar.M0) {
                                return 6;
                            }
                            if (i10 == tqVar.f40463v0) {
                                return 11;
                            }
                            if (i10 != tqVar.f40467x0) {
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
    public final void v(s4.b1 r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sq.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.Cells.a2 a2Var;
        org.telegram.ui.Cells.d6 d6Var;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = this.f40192c;
        tq tqVar = this.e;
        switch (i10) {
            case 0:
                View waVar = new org.telegram.ui.Cells.wa(context, null);
                waVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                d6Var = waVar;
                break;
            case 1:
                d6Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
            default:
                View caVar = new org.telegram.ui.Cells.ca(context);
                caVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                d6Var = caVar;
                break;
            case 3:
                View m4Var = new org.telegram.ui.Cells.m4(this.f40192c, org.telegram.ui.ActionBar.g6.L6, 21, 15, true, null);
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                a2Var = m4Var;
                d6Var = a2Var;
                break;
            case 4:
            case 9:
                View v8Var = new org.telegram.ui.Cells.v8(context);
                v8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                d6Var = v8Var;
                break;
            case 5:
                d6Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.d0) null);
                break;
            case 6:
                View c9Var = new org.telegram.ui.Cells.c9(context, null, false);
                c9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                d6Var = c9Var;
                break;
            case 7:
                org.telegram.ui.Cells.d6 d6Var2 = new org.telegram.ui.Cells.d6(context, 0, null, null);
                d6Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                d6Var2.b(new n0(this, 4));
                d6Var = d6Var2;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                tqVar.d = frameLayout;
                int i13 = org.telegram.ui.ActionBar.g6.f19843a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
                tqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, true, false, false);
                tqVar.f40444f = s6Var;
                s6Var.setTypeface(AndroidUtilities.bold());
                tqVar.f40444f.setTextColor(-1);
                tqVar.f40444f.setTextSize(AndroidUtilities.dp(14.0f));
                tqVar.f40444f.setGravity(17);
                org.telegram.ui.Components.s6 s6Var2 = tqVar.f40444f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.d0.n(R.string.AddBotButton, " ", sb2);
                if (tqVar.K) {
                    i11 = R.string.AddBotButtonAsAdmin;
                } else {
                    i11 = R.string.AddBotButtonAsMember;
                }
                sb2.append(LocaleController.getString(i11));
                s6Var2.setText(sb2.toString());
                tqVar.e.addView(tqVar.f40444f, w7.a6.e(-2, -2, 17));
                tqVar.e.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                tqVar.e.setOnClickListener(new a(this, 14));
                tqVar.d.addView(tqVar.e, w7.a6.a(48.0f, 14.0f, 28.0f, 14.0f, 14.0f, -1, 119));
                tqVar.d.setLayoutParams(new s4.o0(-1, -2));
                View view = new View(context);
                view.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
                tqVar.d.setClipChildren(false);
                tqVar.d.setClipToPadding(false);
                tqVar.d.addView(view, w7.a6.a(800.0f, 0.0f, 0.0f, 0.0f, -800.0f, -1, 87));
                d6Var = tqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, this.f40192c, tqVar.getResourceProvider(), false);
                a2Var2.setPad(1);
                a2Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.g6.V6, org.telegram.ui.ActionBar.g6.f19955g7, org.telegram.ui.ActionBar.g6.f20029k7);
                a2Var2.setEnabled(true);
                a2Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                a2Var = a2Var2;
                d6Var = a2Var;
                break;
            case 11:
                i12 = ((org.telegram.ui.ActionBar.m2) tqVar).currentAccount;
                c6Var = ((org.telegram.ui.ActionBar.m2) tqVar).resourceProvider;
                d6Var = new org.telegram.ui.Components.z01(i12, -tqVar.f40459s, this.f40192c, c6Var);
                break;
        }
        return new s4.b1(d6Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int b10 = b1Var.b();
        tq tqVar = this.e;
        if (b10 == tqVar.f40462u0) {
            tq.f0(tqVar, b1Var.f44838a);
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        int b10 = b1Var.b();
        tq tqVar = this.e;
        if (b10 == tqVar.f40463v0 && tqVar.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(tqVar.getParentActivity().getCurrentFocus());
        }
    }
}
