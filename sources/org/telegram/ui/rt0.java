package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class rt0 extends org.telegram.ui.Components.dk0 {
    public final Context f51766c;
    public final st0 d;

    public rt0(st0 st0Var, Context context) {
        this.d = st0Var;
        this.f51766c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59169f;
        if (i7 != 0 && i7 != 2 && i7 != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.d.f52129e;
    }

    @Override
    public final int d(int i7) {
        st0 st0Var = this.d;
        if (i7 == st0Var.f52135x) {
            return 4;
        }
        if (i7 == st0Var.f52131n) {
            return 3;
        }
        if (i7 == st0Var.f52130f) {
            return 2;
        }
        if (i7 != st0Var.h && i7 != st0Var.f52134w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        String N0;
        String N02;
        st0 st0Var = this.d;
        int i10 = st0Var.E;
        int i11 = f1Var.f59169f;
        View view = f1Var.f59165a;
        boolean z10 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                        if (i7 == st0Var.f52131n) {
                            if (i10 == 1) {
                                o4Var.setText(org.telegram.messenger.hd.G(st0Var.getMessagesController().I0, "BlockedUsersCount", new Object[0]));
                                return;
                            } else {
                                o4Var.setText(org.telegram.messenger.hd.N0(2131746646, null));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                y4Var.a(org.telegram.ui.ActionBar.m6.f29716v6, org.telegram.ui.ActionBar.m6.f29697u6);
                if (i10 == 1) {
                    y4Var.b(2131232101, 5, org.telegram.messenger.hd.N0(2131753689, null), false);
                    return;
                } else {
                    org.telegram.messenger.hd.N0(2131746674, null);
                    throw null;
                }
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i7 == st0Var.h) {
                if (i10 == 1) {
                    a9Var.setFixedSize(0);
                    a9Var.setText(org.telegram.messenger.hd.N0(2131753674, null));
                    return;
                }
                a9Var.setFixedSize(8);
                a9Var.setText(null);
                return;
            } else if (i7 == st0Var.f52134w) {
                a9Var.setFixedSize(12);
                a9Var.setText("");
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        if (i10 == 1) {
            long keyAt = st0Var.getMessagesController().H0.keyAt(i7 - st0Var.f52132r);
            b5Var.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC.User c22 = st0Var.getMessagesController().c2(Long.valueOf(keyAt));
                if (c22 != null) {
                    if (c22.bot) {
                        N02 = org.telegram.messenger.hd.N0(2131753153, null).substring(0, 1).toUpperCase() + org.telegram.messenger.hd.N0(2131753153, null).substring(1);
                    } else {
                        String str = c22.phone;
                        if (str != null && str.length() != 0) {
                            N02 = org.telegram.messenger.o10.h(new StringBuilder("+"), c22.phone, pf.b.c());
                        } else {
                            N02 = org.telegram.messenger.hd.N0(2131747638, null);
                        }
                    }
                    if (i7 != st0Var.f52133s - 1) {
                        z10 = true;
                    }
                    b5Var.c(c22, null, N02, z10);
                    return;
                }
                return;
            }
            TLRPC.Chat O0 = st0Var.getMessagesController().O0(Long.valueOf(-keyAt));
            if (O0 != null) {
                int i12 = O0.participants_count;
                if (i12 != 0) {
                    N0 = org.telegram.messenger.hd.G(i12, "Members", new Object[0]);
                } else if (O0.has_geo) {
                    N0 = org.telegram.messenger.hd.N0(2131748449, null);
                } else if (!org.telegram.messenger.v3.t0(O0)) {
                    N0 = org.telegram.messenger.hd.N0(2131748448, null);
                } else {
                    N0 = org.telegram.messenger.hd.N0(2131748445, null);
                }
                if (i7 != st0Var.f52133s - 1) {
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
        FrameLayout a9Var;
        if (i7 != 0) {
            Context context = this.f51766c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        org.telegram.ui.Cells.o4 o4Var2 = new org.telegram.ui.Cells.o4(this.f51766c, org.telegram.ui.ActionBar.m6.L6, 21, 11, false, null);
                        o4Var2.setHeight(43);
                        o4Var = o4Var2;
                    } else {
                        org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(viewGroup.getContext());
                        n8Var.k(org.telegram.messenger.hd.N0(2131747721, null), false);
                        n8Var.g(-1, org.telegram.ui.ActionBar.m6.f29602p7);
                        o4Var = n8Var;
                    }
                } else {
                    a9Var = new org.telegram.ui.Cells.y4(context);
                }
            } else {
                a9Var = new org.telegram.ui.Cells.a9(context);
            }
            o4Var = a9Var;
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(this.f51766c, 7, 6, true, null);
            b5Var.setDelegate(new qi0(this, 9));
            o4Var = b5Var;
        }
        return new v4.f1(o4Var);
    }
}
