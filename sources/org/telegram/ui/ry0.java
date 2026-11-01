package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ry0 extends org.telegram.ui.Components.tk0 {
    public final Context f41173c;
    public final ty0 d;

    public ry0(ty0 ty0Var, Context context) {
        this.d = ty0Var;
        this.f41173c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        ty0 ty0Var = this.d;
        if (b10 == ty0Var.F) {
            return ty0Var.f41748r;
        }
        if (c1Var.b() == ty0Var.X) {
            return true;
        }
        switch (c1Var.f47912f) {
            case 0:
            case 2:
            case 5:
            case 6:
                return false;
            case 1:
            case 3:
            case 4:
                return ty0Var.f41748r;
            default:
                return true;
        }
    }

    @Override
    public final int b() {
        return this.d.Z;
    }

    @Override
    public final int d(int i10) {
        ty0 ty0Var = this.d;
        if (i10 == ty0Var.f41751x || i10 == ty0Var.L || i10 == ty0Var.U || i10 == ty0Var.Q) {
            return 0;
        }
        if (i10 != ty0Var.G && i10 != ty0Var.H && i10 != ty0Var.J && i10 != ty0Var.I && i10 != ty0Var.R && i10 != ty0Var.S && i10 != ty0Var.X) {
            if (i10 != ty0Var.O && i10 != ty0Var.W && i10 != ty0Var.K && i10 != ty0Var.T) {
                if (i10 == ty0Var.V) {
                    return 3;
                }
                if (i10 != ty0Var.M && i10 != ty0Var.N) {
                    if (i10 == ty0Var.f41752y) {
                        return 5;
                    }
                    if (i10 != ty0Var.D && i10 != ty0Var.Y) {
                        if (i10 != ty0Var.E && i10 != ty0Var.F && i10 != ty0Var.P) {
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
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        int i15;
        TLObject L0;
        int i16;
        boolean z10;
        int i17;
        ty0 ty0Var = this.d;
        org.telegram.ui.ActionBar.p6 p6Var = ty0Var.e;
        long j10 = ty0Var.h;
        long j11 = ty0Var.f41746f;
        int i18 = c1Var.f47912f;
        View view = c1Var.f47909a;
        boolean z11 = true;
        boolean z12 = false;
        switch (i18) {
            case 0:
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                if (i10 == ty0Var.f41751x) {
                    p4Var.setText(org.telegram.messenger.dd.L0(2131750483, null));
                    return;
                } else if (i10 == ty0Var.L) {
                    p4Var.setText(org.telegram.messenger.dd.L0(2131746654, null));
                    return;
                } else if (i10 == ty0Var.U) {
                    p4Var.setText(org.telegram.messenger.dd.L0(2131747920, null));
                    return;
                } else if (i10 == ty0Var.Q) {
                    p4Var.setText(org.telegram.messenger.dd.L0(2131743305, null));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                String v = org.telegram.messenger.pt.v(j11, j10, false);
                i11 = ((org.telegram.ui.ActionBar.k2) ty0Var).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(i11).e7;
                if (i10 == ty0Var.X) {
                    x9Var.b(org.telegram.messenger.dd.L0(2131746121, null), false);
                    org.telegram.ui.ActionBar.a7.V(x9Var.getTextView(), org.telegram.ui.ActionBar.t6.f21171q7, p6Var);
                    return;
                }
                org.telegram.ui.ActionBar.a7.V(x9Var.getTextView(), org.telegram.ui.ActionBar.t6.G6, p6Var);
                if (i10 == ty0Var.G) {
                    String string = sharedPreferences.getString(sc.e.h("sound_", v), org.telegram.messenger.dd.L0(2131745298, null));
                    long j12 = sharedPreferences.getLong("sound_document_id_" + v, 0L);
                    if (j12 != 0) {
                        TLRPC.Document c10 = ty0Var.getMediaDataController().f18691z0.c(j12);
                        if (c10 == null) {
                            string = org.telegram.messenger.dd.L0(2131751680, null);
                        } else {
                            string = wi0.g0(c10, c10.file_name_fixed);
                        }
                    } else if (string.equals("NoSound")) {
                        string = org.telegram.messenger.dd.L0(2131748167, null);
                    } else if (string.equals("Default")) {
                        string = org.telegram.messenger.dd.L0(2131745298, null);
                    }
                    x9Var.c(org.telegram.messenger.dd.L0(2131745301, null), string, false, true);
                    return;
                } else if (i10 == ty0Var.R) {
                    String string2 = sharedPreferences.getString(sc.e.h("ringtone_", v), org.telegram.messenger.dd.L0(2131751600, null));
                    if (string2.equals("NoSound")) {
                        string2 = org.telegram.messenger.dd.L0(2131748167, null);
                    }
                    x9Var.c(org.telegram.messenger.dd.L0(2131743267, null), string2, false, false);
                    return;
                } else if (i10 == ty0Var.H) {
                    int c11 = org.telegram.messenger.m5.c("vibrate_", v, sharedPreferences, 0);
                    if (c11 != 0 && c11 != 4) {
                        if (c11 == 1) {
                            String L02 = org.telegram.messenger.dd.L0(2131743640, null);
                            String L03 = org.telegram.messenger.dd.L0(2131745384, null);
                            if (ty0Var.I == -1 && ty0Var.J == -1) {
                                z11 = false;
                            }
                            x9Var.c(L02, L03, false, z11);
                            return;
                        } else if (c11 == 2) {
                            String L04 = org.telegram.messenger.dd.L0(2131743640, null);
                            String L05 = org.telegram.messenger.dd.L0(2131743638, null);
                            if (ty0Var.I == -1 && ty0Var.J == -1) {
                                z11 = false;
                            }
                            x9Var.c(L04, L05, false, z11);
                            return;
                        } else if (c11 == 3) {
                            String L06 = org.telegram.messenger.dd.L0(2131743640, null);
                            String L07 = org.telegram.messenger.dd.L0(2131748734, null);
                            if (ty0Var.I == -1 && ty0Var.J == -1) {
                                z11 = false;
                            }
                            x9Var.c(L06, L07, false, z11);
                            return;
                        } else {
                            return;
                        }
                    }
                    String L08 = org.telegram.messenger.dd.L0(2131743640, null);
                    String L09 = org.telegram.messenger.dd.L0(2131743639, null);
                    if (ty0Var.I == -1 && ty0Var.J == -1) {
                        z11 = false;
                    }
                    x9Var.c(L08, L09, false, z11);
                    return;
                } else if (i10 == ty0Var.J) {
                    int c12 = org.telegram.messenger.m5.c("priority_", v, sharedPreferences, 3);
                    if (c12 == 0) {
                        x9Var.c(org.telegram.messenger.dd.L0(2131747922, null), org.telegram.messenger.dd.L0(2131747899, null), false, false);
                        return;
                    } else if (c12 != 1 && c12 != 2) {
                        if (c12 == 3) {
                            x9Var.c(org.telegram.messenger.dd.L0(2131747922, null), org.telegram.messenger.dd.L0(2131747896, null), false, false);
                            return;
                        } else if (c12 == 4) {
                            x9Var.c(org.telegram.messenger.dd.L0(2131747922, null), org.telegram.messenger.dd.L0(2131747898, null), false, false);
                            return;
                        } else if (c12 == 5) {
                            x9Var.c(org.telegram.messenger.dd.L0(2131747922, null), org.telegram.messenger.dd.L0(2131747897, null), false, false);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        x9Var.c(org.telegram.messenger.dd.L0(2131747922, null), org.telegram.messenger.dd.L0(2131747895, null), false, false);
                        return;
                    }
                } else if (i10 == ty0Var.I) {
                    int c13 = org.telegram.messenger.m5.c("smart_max_count_", v, sharedPreferences, 2);
                    int c14 = org.telegram.messenger.m5.c("smart_delay_", v, sharedPreferences, 180);
                    if (c13 == 0) {
                        String L010 = org.telegram.messenger.dd.L0(2131745318, null);
                        String L011 = org.telegram.messenger.dd.L0(2131745317, null);
                        if (ty0Var.J == -1) {
                            z11 = false;
                        }
                        x9Var.c(L010, L011, false, z11);
                        return;
                    }
                    String G = org.telegram.messenger.dd.G(c14 / 60, "Minutes", new Object[0]);
                    String L012 = org.telegram.messenger.dd.L0(2131745318, null);
                    String a02 = org.telegram.messenger.dd.a0("SmartNotificationsInfo", null, 2131745316, Integer.valueOf(c13), G);
                    if (ty0Var.J == -1) {
                        z11 = false;
                    }
                    x9Var.c(L012, a02, false, z11);
                    return;
                } else if (i10 == ty0Var.S) {
                    int c15 = org.telegram.messenger.m5.c("calls_vibrate_", v, sharedPreferences, 0);
                    if (c15 != 0 && c15 != 4) {
                        if (c15 == 1) {
                            x9Var.c(org.telegram.messenger.dd.L0(2131743640, null), org.telegram.messenger.dd.L0(2131745384, null), false, true);
                            return;
                        } else if (c15 == 2) {
                            x9Var.c(org.telegram.messenger.dd.L0(2131743640, null), org.telegram.messenger.dd.L0(2131743638, null), false, true);
                            return;
                        } else if (c15 == 3) {
                            x9Var.c(org.telegram.messenger.dd.L0(2131743640, null), org.telegram.messenger.dd.L0(2131748734, null), false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    x9Var.c(org.telegram.messenger.dd.L0(2131743640, null), org.telegram.messenger.dd.L0(2131743639, null), false, true);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                b9Var.setFixedSize(0);
                if (i10 == ty0Var.O) {
                    b9Var.setText(org.telegram.messenger.dd.L0(2131746653, null));
                    return;
                } else if (i10 == ty0Var.W) {
                    b9Var.setText(org.telegram.messenger.dd.L0(2131747918, null));
                    return;
                } else if (i10 == ty0Var.K) {
                    if (ty0Var.J == -1) {
                        b9Var.setText("");
                        return;
                    } else {
                        b9Var.setText(org.telegram.messenger.dd.L0(2131746884, null));
                        return;
                    }
                } else if (i10 == ty0Var.T) {
                    b9Var.setText(org.telegram.messenger.dd.L0(2131743270, null));
                    return;
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                String v10 = org.telegram.messenger.pt.v(j11, j10, false);
                i12 = ((org.telegram.ui.ActionBar.k2) ty0Var).currentAccount;
                SharedPreferences sharedPreferences2 = org.telegram.messenger.wp.r1(i12).e7;
                if (sharedPreferences2.contains("color_" + v10)) {
                    i13 = org.telegram.messenger.m5.c("color_", v10, sharedPreferences2, -16776961);
                } else if (org.telegram.messenger.o5.z(j11)) {
                    i13 = sharedPreferences2.getInt("GroupLed", -16776961);
                } else {
                    i13 = sharedPreferences2.getInt("MessagesLed", -16776961);
                }
                int i19 = 0;
                while (true) {
                    if (i19 < 9) {
                        if (org.telegram.ui.Cells.v8.f23331f[i19] == i13) {
                            i13 = org.telegram.ui.Cells.v8.e[i19];
                        } else {
                            i19++;
                        }
                    }
                }
                v8Var.b(i13, org.telegram.messenger.dd.L0(2131747919, null), false);
                return;
            case 4:
                org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
                i14 = ((org.telegram.ui.ActionBar.k2) ty0Var).currentAccount;
                SharedPreferences sharedPreferences3 = org.telegram.messenger.wp.r1(i14).e7;
                int c16 = org.telegram.messenger.m5.c("popup_", org.telegram.messenger.pt.v(j11, j10, false), sharedPreferences3, 0);
                if (c16 == 0) {
                    if (org.telegram.messenger.o5.z(j11)) {
                        str = "popupGroup";
                    } else {
                        str = "popupAll";
                    }
                    if (sharedPreferences3.getInt(str, 0) != 0) {
                        c16 = 1;
                    } else {
                        c16 = 2;
                    }
                }
                if (i10 == ty0Var.M) {
                    String L013 = org.telegram.messenger.dd.L0(2131747114, null);
                    if (c16 == 1) {
                        z12 = true;
                    }
                    m6Var.c(L013, z12, true);
                    m6Var.setTag(1);
                    return;
                } else if (i10 == ty0Var.N) {
                    String L014 = org.telegram.messenger.dd.L0(2131747115, null);
                    if (c16 != 2) {
                        z11 = false;
                    }
                    m6Var.c(L014, z11, false);
                    m6Var.setTag(2);
                    return;
                } else {
                    return;
                }
            case 5:
                org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) view;
                if (org.telegram.messenger.o5.E(j11)) {
                    i16 = ((org.telegram.ui.ActionBar.k2) ty0Var).currentAccount;
                    L0 = org.telegram.messenger.wp.r1(i16).Z1(Long.valueOf(j11));
                } else {
                    i15 = ((org.telegram.ui.ActionBar.k2) ty0Var).currentAccount;
                    L0 = org.telegram.messenger.wp.r1(i15).L0(Long.valueOf(-j11));
                }
                oaVar.a(null, L0);
                return;
            case 6:
                org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) view;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 >= ty0Var.Z - 1) {
                    z11 = false;
                }
                if (c7Var.f21796c != z10 || c7Var.d != z11) {
                    c7Var.f21796c = z10;
                    c7Var.d = z11;
                    int i20 = c7Var.f21795b;
                    if (i20 == 0) {
                        c7Var.setBackground(null);
                        return;
                    } else {
                        c7Var.setBackgroundColor(i20);
                        return;
                    }
                }
                return;
            case 7:
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                i17 = ((org.telegram.ui.ActionBar.k2) ty0Var).currentAccount;
                SharedPreferences sharedPreferences4 = org.telegram.messenger.wp.r1(i17).e7;
                if (i10 == ty0Var.E) {
                    t8Var.f(org.telegram.messenger.dd.L0(2131747940, null), ty0Var.f41748r, true);
                    return;
                } else if (i10 == ty0Var.F) {
                    String v11 = org.telegram.messenger.pt.v(j11, j10, false);
                    t8Var.f(org.telegram.messenger.dd.L0(2131748552, null), sharedPreferences4.getBoolean("content_preview_" + v11, true), true);
                    return;
                } else if (i10 == ty0Var.P) {
                    String h = sc.e.h("stories_", org.telegram.messenger.pt.v(j11, j10, false));
                    if (ty0Var.f41742a0 || (sharedPreferences4.contains("EnableAllStories") && sharedPreferences4.getBoolean("EnableAllStories", true))) {
                        z12 = true;
                    }
                    t8Var.f(org.telegram.messenger.dd.L0(2131744762, null), sharedPreferences4.getBoolean(h, z12), true);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View p4Var;
        org.telegram.ui.ActionBar.p6 p6Var = this.d.e;
        Context context = this.f41173c;
        switch (i10) {
            case 0:
                p4Var = new org.telegram.ui.Cells.p4(context, p6Var);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, p4Var, p6Var);
                break;
            case 1:
                p4Var = new org.telegram.ui.Cells.x9(0, context, p6Var);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, p4Var, p6Var);
                break;
            case 2:
                p4Var = new org.telegram.ui.Cells.b9(context, p6Var);
                break;
            case 3:
                p4Var = new org.telegram.ui.Cells.v8(context, p6Var);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, p4Var, p6Var);
                break;
            case 4:
                p4Var = new org.telegram.ui.Cells.m6(context, p6Var);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, p4Var, p6Var);
                break;
            case 5:
                p4Var = new org.telegram.ui.Cells.oa(context, p6Var);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, p4Var, p6Var);
                break;
            case 6:
                p4Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            default:
                p4Var = new org.telegram.ui.Cells.t8(context, p6Var);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, p4Var, p6Var);
                break;
        }
        return sc.e.o(p4Var, p4Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
        View view = c1Var.f47909a;
        ty0 ty0Var = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 7) {
                                return;
                            }
                            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                            if (c1Var.b() == ty0Var.F) {
                                t8Var.e(null, ty0Var.f41748r);
                                return;
                            } else if (c1Var.b() == ty0Var.P) {
                                t8Var.e(null, ty0Var.f41748r);
                                return;
                            } else {
                                t8Var.e(null, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.m6) view).b(null, ty0Var.f41748r);
                        return;
                    }
                    ((org.telegram.ui.Cells.v8) view).a(null, ty0Var.f41748r);
                    return;
                }
                ((org.telegram.ui.Cells.b9) view).c(null, ty0Var.f41748r);
                return;
            }
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            if (c1Var.b() == ty0Var.X) {
                x9Var.a(null, true);
                return;
            } else {
                x9Var.a(null, ty0Var.f41748r);
                return;
            }
        }
        ((org.telegram.ui.Cells.p4) view).a(null, ty0Var.f41748r);
    }
}
