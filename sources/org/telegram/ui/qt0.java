package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class qt0 extends org.telegram.ui.Components.dk0 {
    public final Context f51536c;
    public final rt0 d;

    public qt0(rt0 rt0Var, Context context) {
        this.d = rt0Var;
        this.f51536c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 0 && i7 != 2 && i7 != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.d.f51886e;
    }

    @Override
    public final int d(int i7) {
        rt0 rt0Var = this.d;
        if (i7 == rt0Var.f51892x) {
            return 4;
        }
        if (i7 == rt0Var.f51888n) {
            return 3;
        }
        if (i7 == rt0Var.f51887f) {
            return 2;
        }
        if (i7 != rt0Var.h && i7 != rt0Var.f51891w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        String N0;
        String N02;
        rt0 rt0Var = this.d;
        int i10 = rt0Var.E;
        int i11 = f1Var.f59249f;
        View view = f1Var.f59245a;
        boolean z10 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                        if (i7 == rt0Var.f51888n) {
                            if (i10 == 1) {
                                o4Var.setText(org.telegram.messenger.gd.G(rt0Var.getMessagesController().I0, "BlockedUsersCount", new Object[0]));
                                return;
                            } else {
                                o4Var.setText(org.telegram.messenger.gd.N0(2131746646, null));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                y4Var.a(org.telegram.ui.ActionBar.n6.f29786v6, org.telegram.ui.ActionBar.n6.f29767u6);
                if (i10 == 1) {
                    y4Var.b(2131232104, 5, org.telegram.messenger.gd.N0(2131753689, null), false);
                    return;
                } else {
                    org.telegram.messenger.gd.N0(2131746674, null);
                    throw null;
                }
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == rt0Var.h) {
                if (i10 == 1) {
                    z8Var.setFixedSize(0);
                    z8Var.setText(org.telegram.messenger.gd.N0(2131753674, null));
                    return;
                }
                z8Var.setFixedSize(8);
                z8Var.setText(null);
                return;
            } else if (i7 == rt0Var.f51891w) {
                z8Var.setFixedSize(12);
                z8Var.setText("");
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        if (i10 == 1) {
            long keyAt = rt0Var.getMessagesController().H0.keyAt(i7 - rt0Var.f51889r);
            b5Var.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC.User c22 = rt0Var.getMessagesController().c2(Long.valueOf(keyAt));
                if (c22 != null) {
                    if (c22.bot) {
                        N02 = org.telegram.messenger.gd.N0(2131753153, null).substring(0, 1).toUpperCase() + org.telegram.messenger.gd.N0(2131753153, null).substring(1);
                    } else {
                        String str = c22.phone;
                        if (str != null && str.length() != 0) {
                            N02 = org.telegram.messenger.m10.h(new StringBuilder("+"), c22.phone, pf.b.c());
                        } else {
                            N02 = org.telegram.messenger.gd.N0(2131747638, null);
                        }
                    }
                    if (i7 != rt0Var.f51890s - 1) {
                        z10 = true;
                    }
                    b5Var.c(c22, null, N02, z10);
                    return;
                }
                return;
            }
            TLRPC.Chat O0 = rt0Var.getMessagesController().O0(Long.valueOf(-keyAt));
            if (O0 != null) {
                int i12 = O0.participants_count;
                if (i12 != 0) {
                    N0 = org.telegram.messenger.gd.G(i12, "Members", new Object[0]);
                } else if (O0.has_geo) {
                    N0 = org.telegram.messenger.gd.N0(2131748449, null);
                } else if (!org.telegram.messenger.v3.t0(O0)) {
                    N0 = org.telegram.messenger.gd.N0(2131748448, null);
                } else {
                    N0 = org.telegram.messenger.gd.N0(2131748445, null);
                }
                if (i7 != rt0Var.f51890s - 1) {
                    z10 = true;
                }
                b5Var.c(O0, null, N0, z10);
                return;
            }
            return;
        }
        throw null;
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.o4 o4Var;
        FrameLayout z8Var;
        if (i7 != 0) {
            Context context = this.f51536c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        org.telegram.ui.Cells.o4 o4Var2 = new org.telegram.ui.Cells.o4(this.f51536c, org.telegram.ui.ActionBar.n6.L6, 21, 11, false, null);
                        o4Var2.setHeight(43);
                        o4Var = o4Var2;
                    } else {
                        org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                        m8Var.k(org.telegram.messenger.gd.N0(2131747721, null), false);
                        m8Var.g(-1, org.telegram.ui.ActionBar.n6.f29672p7);
                        o4Var = m8Var;
                    }
                } else {
                    z8Var = new org.telegram.ui.Cells.y4(context);
                }
            } else {
                z8Var = new org.telegram.ui.Cells.z8(context);
            }
            o4Var = z8Var;
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(this.f51536c, 7, 6, true, null);
            b5Var.setDelegate(new oi0(this, 9));
            o4Var = b5Var;
        }
        return new v4.f1(o4Var);
    }
}
