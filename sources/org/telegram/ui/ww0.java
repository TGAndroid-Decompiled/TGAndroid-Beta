package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ww0 extends org.telegram.ui.Components.sj0 {
    public final Context f51623c;
    public final yw0 d;

    public ww0(yw0 yw0Var, Context context) {
        this.d = yw0Var;
        this.f51623c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int b10 = d1Var.b();
        yw0 yw0Var = this.d;
        if (b10 == yw0Var.G) {
            return yw0Var.f52428r;
        }
        if (d1Var.b() == yw0Var.Y) {
            return true;
        }
        switch (d1Var.f55544f) {
            case 0:
            case 2:
            case 5:
            case 6:
                return false;
            case 1:
            case 3:
            case 4:
                return yw0Var.f52428r;
            default:
                return true;
        }
    }

    @Override
    public final int b() {
        return this.d.f52420a0;
    }

    @Override
    public final int d(int i3) {
        yw0 yw0Var = this.d;
        if (i3 == yw0Var.f52431x || i3 == yw0Var.M || i3 == yw0Var.V || i3 == yw0Var.R) {
            return 0;
        }
        if (i3 != yw0Var.H && i3 != yw0Var.I && i3 != yw0Var.K && i3 != yw0Var.J && i3 != yw0Var.S && i3 != yw0Var.T && i3 != yw0Var.Y) {
            if (i3 != yw0Var.P && i3 != yw0Var.X && i3 != yw0Var.L && i3 != yw0Var.U) {
                if (i3 == yw0Var.W) {
                    return 3;
                }
                if (i3 != yw0Var.N && i3 != yw0Var.O) {
                    if (i3 == yw0Var.f52432y) {
                        return 5;
                    }
                    if (i3 != yw0Var.E && i3 != yw0Var.Z) {
                        if (i3 != yw0Var.F && i3 != yw0Var.G && i3 != yw0Var.Q) {
                            return 0;
                        }
                        return 7;
                    }
                    return 6;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int i14;
        TLObject M0;
        int i15;
        boolean z10;
        int i16;
        yw0 yw0Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = yw0Var.f52425e;
        long j10 = yw0Var.h;
        long j11 = yw0Var.f52426f;
        int i17 = d1Var.f55544f;
        View view = d1Var.f55540a;
        boolean z11 = true;
        boolean z12 = false;
        switch (i17) {
            case 0:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i3 == yw0Var.f52431x) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131750482, null));
                    return;
                } else if (i3 == yw0Var.M) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131746647, null));
                    return;
                } else if (i3 == yw0Var.V) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131747912, null));
                    return;
                } else if (i3 == yw0Var.R) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131743289, null));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                String v = org.telegram.messenger.us.v(j11, j10, false);
                i10 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i10).f22989d7;
                if (i3 == yw0Var.Y) {
                    v9Var.b(org.telegram.messenger.bd.M0(2131746114, null), false);
                    org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), org.telegram.ui.ActionBar.k6.f28122q7, e6Var);
                    return;
                }
                org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), org.telegram.ui.ActionBar.k6.G6, e6Var);
                if (i3 == yw0Var.H) {
                    String string = sharedPreferences.getString(t4.c.f("sound_", v), org.telegram.messenger.bd.M0(2131745290, null));
                    long j12 = sharedPreferences.getLong("sound_document_id_" + v, 0L);
                    if (j12 != 0) {
                        TLRPC.Document c2 = yw0Var.getMediaDataController().A0.c(j12);
                        if (c2 == null) {
                            string = org.telegram.messenger.bd.M0(2131751680, null);
                        } else {
                            string = ph0.g0(c2, c2.file_name_fixed);
                        }
                    } else if (string.equals("NoSound")) {
                        string = org.telegram.messenger.bd.M0(2131748159, null);
                    } else if (string.equals("Default")) {
                        string = org.telegram.messenger.bd.M0(2131745290, null);
                    }
                    v9Var.c(org.telegram.messenger.bd.M0(2131745293, null), string, false, true);
                    return;
                } else if (i3 == yw0Var.S) {
                    String string2 = sharedPreferences.getString(t4.c.f("ringtone_", v), org.telegram.messenger.bd.M0(2131751600, null));
                    if (string2.equals("NoSound")) {
                        string2 = org.telegram.messenger.bd.M0(2131748159, null);
                    }
                    v9Var.c(org.telegram.messenger.bd.M0(2131743251, null), string2, false, false);
                    return;
                } else if (i3 == yw0Var.I) {
                    int c10 = org.telegram.messenger.k5.c("vibrate_", v, sharedPreferences, 0);
                    if (c10 != 0 && c10 != 4) {
                        if (c10 == 1) {
                            String M02 = org.telegram.messenger.bd.M0(2131743624, null);
                            String M03 = org.telegram.messenger.bd.M0(2131745376, null);
                            if (yw0Var.J == -1 && yw0Var.K == -1) {
                                z11 = false;
                            }
                            v9Var.c(M02, M03, false, z11);
                            return;
                        } else if (c10 == 2) {
                            String M04 = org.telegram.messenger.bd.M0(2131743624, null);
                            String M05 = org.telegram.messenger.bd.M0(2131743622, null);
                            if (yw0Var.J == -1 && yw0Var.K == -1) {
                                z11 = false;
                            }
                            v9Var.c(M04, M05, false, z11);
                            return;
                        } else if (c10 == 3) {
                            String M06 = org.telegram.messenger.bd.M0(2131743624, null);
                            String M07 = org.telegram.messenger.bd.M0(2131748731, null);
                            if (yw0Var.J == -1 && yw0Var.K == -1) {
                                z11 = false;
                            }
                            v9Var.c(M06, M07, false, z11);
                            return;
                        } else {
                            return;
                        }
                    }
                    String M08 = org.telegram.messenger.bd.M0(2131743624, null);
                    String M09 = org.telegram.messenger.bd.M0(2131743623, null);
                    if (yw0Var.J == -1 && yw0Var.K == -1) {
                        z11 = false;
                    }
                    v9Var.c(M08, M09, false, z11);
                    return;
                } else if (i3 == yw0Var.K) {
                    int c11 = org.telegram.messenger.k5.c("priority_", v, sharedPreferences, 3);
                    if (c11 == 0) {
                        v9Var.c(org.telegram.messenger.bd.M0(2131747914, null), org.telegram.messenger.bd.M0(2131747891, null), false, false);
                        return;
                    } else if (c11 != 1 && c11 != 2) {
                        if (c11 == 3) {
                            v9Var.c(org.telegram.messenger.bd.M0(2131747914, null), org.telegram.messenger.bd.M0(2131747888, null), false, false);
                            return;
                        } else if (c11 == 4) {
                            v9Var.c(org.telegram.messenger.bd.M0(2131747914, null), org.telegram.messenger.bd.M0(2131747890, null), false, false);
                            return;
                        } else if (c11 == 5) {
                            v9Var.c(org.telegram.messenger.bd.M0(2131747914, null), org.telegram.messenger.bd.M0(2131747889, null), false, false);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        v9Var.c(org.telegram.messenger.bd.M0(2131747914, null), org.telegram.messenger.bd.M0(2131747887, null), false, false);
                        return;
                    }
                } else if (i3 == yw0Var.J) {
                    int c12 = org.telegram.messenger.k5.c("smart_max_count_", v, sharedPreferences, 2);
                    int c13 = org.telegram.messenger.k5.c("smart_delay_", v, sharedPreferences, 180);
                    if (c12 == 0) {
                        String M010 = org.telegram.messenger.bd.M0(2131745310, null);
                        String M011 = org.telegram.messenger.bd.M0(2131745309, null);
                        if (yw0Var.K == -1) {
                            z11 = false;
                        }
                        v9Var.c(M010, M011, false, z11);
                        return;
                    }
                    String G = org.telegram.messenger.bd.G(c13 / 60, "Minutes", new Object[0]);
                    String M012 = org.telegram.messenger.bd.M0(2131745310, null);
                    String a02 = org.telegram.messenger.bd.a0("SmartNotificationsInfo", null, 2131745308, Integer.valueOf(c12), G);
                    if (yw0Var.K == -1) {
                        z11 = false;
                    }
                    v9Var.c(M012, a02, false, z11);
                    return;
                } else if (i3 == yw0Var.T) {
                    int c14 = org.telegram.messenger.k5.c("calls_vibrate_", v, sharedPreferences, 0);
                    if (c14 != 0 && c14 != 4) {
                        if (c14 == 1) {
                            v9Var.c(org.telegram.messenger.bd.M0(2131743624, null), org.telegram.messenger.bd.M0(2131745376, null), false, true);
                            return;
                        } else if (c14 == 2) {
                            v9Var.c(org.telegram.messenger.bd.M0(2131743624, null), org.telegram.messenger.bd.M0(2131743622, null), false, true);
                            return;
                        } else if (c14 == 3) {
                            v9Var.c(org.telegram.messenger.bd.M0(2131743624, null), org.telegram.messenger.bd.M0(2131748731, null), false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    v9Var.c(org.telegram.messenger.bd.M0(2131743624, null), org.telegram.messenger.bd.M0(2131743623, null), false, true);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                y8Var.setFixedSize(0);
                if (i3 == yw0Var.P) {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131746646, null));
                    return;
                } else if (i3 == yw0Var.X) {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131747910, null));
                    return;
                } else if (i3 == yw0Var.L) {
                    if (yw0Var.K == -1) {
                        y8Var.setText("");
                        return;
                    } else {
                        y8Var.setText(org.telegram.messenger.bd.M0(2131746877, null));
                        return;
                    }
                } else if (i3 == yw0Var.U) {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131743254, null));
                    return;
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                String v10 = org.telegram.messenger.us.v(j11, j10, false);
                i11 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
                SharedPreferences sharedPreferences2 = org.telegram.messenger.hp.s1(i11).f22989d7;
                if (sharedPreferences2.contains("color_" + v10)) {
                    i12 = org.telegram.messenger.k5.c("color_", v10, sharedPreferences2, -16776961);
                } else if (org.telegram.messenger.m5.z(j11)) {
                    i12 = sharedPreferences2.getInt("GroupLed", -16776961);
                } else {
                    i12 = sharedPreferences2.getInt("MessagesLed", -16776961);
                }
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        if (org.telegram.ui.Cells.s8.f30354f[i18] == i12) {
                            i12 = org.telegram.ui.Cells.s8.f30353e[i18];
                        } else {
                            i18++;
                        }
                    }
                }
                s8Var.b(i12, org.telegram.messenger.bd.M0(2131747911, null), false);
                return;
            case 4:
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                i13 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
                SharedPreferences sharedPreferences3 = org.telegram.messenger.hp.s1(i13).f22989d7;
                int c15 = org.telegram.messenger.k5.c("popup_", org.telegram.messenger.us.v(j11, j10, false), sharedPreferences3, 0);
                if (c15 == 0) {
                    if (org.telegram.messenger.m5.z(j11)) {
                        str = "popupGroup";
                    } else {
                        str = "popupAll";
                    }
                    if (sharedPreferences3.getInt(str, 0) != 0) {
                        c15 = 1;
                    } else {
                        c15 = 2;
                    }
                }
                if (i3 == yw0Var.N) {
                    String M013 = org.telegram.messenger.bd.M0(2131747107, null);
                    if (c15 == 1) {
                        z12 = true;
                    }
                    h6Var.c(M013, z12, true);
                    h6Var.setTag(1);
                    return;
                } else if (i3 == yw0Var.O) {
                    String M014 = org.telegram.messenger.bd.M0(2131747108, null);
                    if (c15 != 2) {
                        z11 = false;
                    }
                    h6Var.c(M014, z11, false);
                    h6Var.setTag(2);
                    return;
                } else {
                    return;
                }
            case 5:
                org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) view;
                if (org.telegram.messenger.m5.E(j11)) {
                    i15 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
                    M0 = org.telegram.messenger.hp.s1(i15).a2(Long.valueOf(j11));
                } else {
                    i14 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
                    M0 = org.telegram.messenger.hp.s1(i14).M0(Long.valueOf(-j11));
                }
                oaVar.a(null, M0);
                return;
            case 6:
                org.telegram.ui.Cells.x6 x6Var = (org.telegram.ui.Cells.x6) view;
                if (i3 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i3 >= yw0Var.f52420a0 - 1) {
                    z11 = false;
                }
                if (x6Var.f30965c != z10 || x6Var.d != z11) {
                    x6Var.f30965c = z10;
                    x6Var.d = z11;
                    int i19 = x6Var.f30964b;
                    if (i19 == 0) {
                        x6Var.setBackground(null);
                        return;
                    } else {
                        x6Var.setBackgroundColor(i19);
                        return;
                    }
                }
                return;
            case 7:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                i16 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
                SharedPreferences sharedPreferences4 = org.telegram.messenger.hp.s1(i16).f22989d7;
                if (i3 == yw0Var.F) {
                    q8Var.f(org.telegram.messenger.bd.M0(2131747932, null), yw0Var.f52428r, true);
                    return;
                } else if (i3 == yw0Var.G) {
                    String v11 = org.telegram.messenger.us.v(j11, j10, false);
                    q8Var.f(org.telegram.messenger.bd.M0(2131748545, null), sharedPreferences4.getBoolean("content_preview_" + v11, true), true);
                    return;
                } else if (i3 == yw0Var.Q) {
                    String f10 = t4.c.f("stories_", org.telegram.messenger.us.v(j11, j10, false));
                    if (yw0Var.f52422b0 || (sharedPreferences4.contains("EnableAllStories") && sharedPreferences4.getBoolean("EnableAllStories", true))) {
                        z12 = true;
                    }
                    q8Var.f(org.telegram.messenger.bd.M0(2131744754, null), sharedPreferences4.getBoolean(f10, z12), true);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View n4Var;
        org.telegram.ui.ActionBar.e6 e6Var = this.d.f52425e;
        Context context = this.f51623c;
        switch (i3) {
            case 0:
                n4Var = new org.telegram.ui.Cells.n4(context, e6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, n4Var, e6Var);
                break;
            case 1:
                n4Var = new org.telegram.ui.Cells.v9(0, context, e6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, n4Var, e6Var);
                break;
            case 2:
                n4Var = new org.telegram.ui.Cells.y8(context, e6Var);
                break;
            case 3:
                n4Var = new org.telegram.ui.Cells.s8(context, e6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, n4Var, e6Var);
                break;
            case 4:
                n4Var = new org.telegram.ui.Cells.h6(context, e6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, n4Var, e6Var);
                break;
            case 5:
                n4Var = new org.telegram.ui.Cells.oa(context, e6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, n4Var, e6Var);
                break;
            case 6:
                n4Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                break;
            default:
                n4Var = new org.telegram.ui.Cells.q8(context, e6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, n4Var, e6Var);
                break;
        }
        return k2.p1.p(n4Var, n4Var, -1, -2);
    }

    @Override
    public final void y(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        View view = d1Var.f55540a;
        yw0 yw0Var = this.d;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 7) {
                                return;
                            }
                            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                            if (d1Var.b() == yw0Var.G) {
                                q8Var.e(null, yw0Var.f52428r);
                                return;
                            } else if (d1Var.b() == yw0Var.Q) {
                                q8Var.e(null, yw0Var.f52428r);
                                return;
                            } else {
                                q8Var.e(null, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.h6) view).b(null, yw0Var.f52428r);
                        return;
                    }
                    ((org.telegram.ui.Cells.s8) view).a(null, yw0Var.f52428r);
                    return;
                }
                ((org.telegram.ui.Cells.y8) view).c(null, yw0Var.f52428r);
                return;
            }
            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
            if (d1Var.b() == yw0Var.Y) {
                v9Var.a(null, true);
                return;
            } else {
                v9Var.a(null, yw0Var.f52428r);
                return;
            }
        }
        ((org.telegram.ui.Cells.n4) view).a(null, yw0Var.f52428r);
    }
}
