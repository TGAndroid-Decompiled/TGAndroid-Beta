package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class yu0 extends org.telegram.ui.Components.tk0 {
    public final Context f43726c;
    public final zu0 d;

    public yu0(zu0 zu0Var, Context context) {
        this.d = zu0Var;
        this.f43726c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
        if (i10 != 0 && i10 != 2 && i10 != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.d.e;
    }

    @Override
    public final int d(int i10) {
        zu0 zu0Var = this.d;
        if (i10 == zu0Var.f44102x) {
            return 4;
        }
        if (i10 == zu0Var.f44098n) {
            return 3;
        }
        if (i10 == zu0Var.f44097f) {
            return 2;
        }
        if (i10 != zu0Var.h && i10 != zu0Var.f44101w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        String L0;
        String L02;
        zu0 zu0Var = this.d;
        int i11 = zu0Var.D;
        int i12 = c1Var.f47912f;
        View view = c1Var.f47909a;
        boolean z10 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                        if (i10 == zu0Var.f44098n) {
                            if (i11 == 1) {
                                p4Var.setText(org.telegram.messenger.dd.G(zu0Var.getMessagesController().H0, "BlockedUsersCount", new Object[0]));
                                return;
                            } else {
                                p4Var.setText(org.telegram.messenger.dd.L0(2131746855, null));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                b5Var.a(org.telegram.ui.ActionBar.t6.f21260v6, org.telegram.ui.ActionBar.t6.f21243u6);
                if (i11 == 1) {
                    b5Var.b(2131232098, 5, org.telegram.messenger.dd.L0(2131753692, null), false);
                    return;
                } else {
                    org.telegram.messenger.dd.L0(2131746883, null);
                    throw null;
                }
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i10 == zu0Var.h) {
                if (i11 == 1) {
                    b9Var.setFixedSize(0);
                    b9Var.setText(org.telegram.messenger.dd.L0(2131753677, null));
                    return;
                }
                b9Var.setFixedSize(8);
                b9Var.setText(null);
                return;
            } else if (i10 == zu0Var.f44101w) {
                b9Var.setFixedSize(12);
                b9Var.setText("");
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) view;
        if (i11 == 1) {
            long keyAt = zu0Var.getMessagesController().G0.keyAt(i10 - zu0Var.f44099r);
            e5Var.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC.User Z1 = zu0Var.getMessagesController().Z1(Long.valueOf(keyAt));
                if (Z1 != null) {
                    if (Z1.bot) {
                        L02 = org.telegram.messenger.dd.L0(2131753156, null).substring(0, 1).toUpperCase() + org.telegram.messenger.dd.L0(2131753156, null).substring(1);
                    } else {
                        String str = Z1.phone;
                        if (str != null && str.length() != 0) {
                            L02 = org.telegram.messenger.m5.h(new StringBuilder("+"), Z1.phone, af.b.c());
                        } else {
                            L02 = org.telegram.messenger.dd.L0(2131747848, null);
                        }
                    }
                    if (i10 != zu0Var.f44100s - 1) {
                        z10 = true;
                    }
                    e5Var.c(Z1, null, L02, z10);
                    return;
                }
                return;
            }
            TLRPC.Chat L03 = zu0Var.getMessagesController().L0(Long.valueOf(-keyAt));
            if (L03 != null) {
                int i13 = L03.participants_count;
                if (i13 != 0) {
                    L0 = org.telegram.messenger.dd.G(i13, "Members", new Object[0]);
                } else if (L03.has_geo) {
                    L0 = org.telegram.messenger.dd.L0(2131748657, null);
                } else if (!org.telegram.messenger.w3.t0(L03)) {
                    L0 = org.telegram.messenger.dd.L0(2131748656, null);
                } else {
                    L0 = org.telegram.messenger.dd.L0(2131748653, null);
                }
                if (i10 != zu0Var.f44100s - 1) {
                    z10 = true;
                }
                e5Var.c(L03, null, L0, z10);
                return;
            }
            return;
        }
        throw null;
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.p4 p4Var;
        FrameLayout b9Var;
        if (i10 != 0) {
            Context context = this.f43726c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        org.telegram.ui.Cells.p4 p4Var2 = new org.telegram.ui.Cells.p4(this.f43726c, org.telegram.ui.ActionBar.t6.L6, 21, 11, false, null);
                        p4Var2.setHeight(43);
                        p4Var = p4Var2;
                    } else {
                        org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                        p8Var.k(org.telegram.messenger.dd.L0(2131747931, null), false);
                        p8Var.g(-1, org.telegram.ui.ActionBar.t6.f21154p7);
                        p4Var = p8Var;
                    }
                } else {
                    b9Var = new org.telegram.ui.Cells.b5(context);
                }
            } else {
                b9Var = new org.telegram.ui.Cells.b9(context);
            }
            p4Var = b9Var;
        } else {
            org.telegram.ui.Cells.e5 e5Var = new org.telegram.ui.Cells.e5(7, 6, this.f43726c, null, true);
            e5Var.setDelegate(new rj0(this, 10));
            p4Var = e5Var;
        }
        return new s4.c1(p4Var);
    }
}
