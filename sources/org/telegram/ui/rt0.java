package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class rt0 extends org.telegram.ui.Components.oj0 {
    public final Context f49571c;
    public final st0 d;

    public rt0(st0 st0Var, Context context) {
        this.d = st0Var;
        this.f49571c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f56955f;
        if (i7 != 0 && i7 != 2 && i7 != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.d.f49827e;
    }

    @Override
    public final int d(int i7) {
        st0 st0Var = this.d;
        if (i7 == st0Var.f49833x) {
            return 4;
        }
        if (i7 == st0Var.f49829n) {
            return 3;
        }
        if (i7 == st0Var.f49828f) {
            return 2;
        }
        if (i7 != st0Var.h && i7 != st0Var.f49832w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        String M0;
        String M02;
        st0 st0Var = this.d;
        int i10 = st0Var.D;
        int i11 = d1Var.f56955f;
        View view = d1Var.f56951a;
        boolean z9 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                        if (i7 == st0Var.f49829n) {
                            if (i10 == 1) {
                                n4Var.setText(org.telegram.messenger.hd.G(st0Var.getMessagesController().H0, "BlockedUsersCount", new Object[0]));
                                return;
                            } else {
                                n4Var.setText(org.telegram.messenger.hd.M0(2131746839, null));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                x4Var.a(org.telegram.ui.ActionBar.k6.f28184v6, org.telegram.ui.ActionBar.k6.f28165u6);
                if (i10 == 1) {
                    x4Var.b(2131232099, 5, org.telegram.messenger.hd.M0(2131753692, null), false);
                    return;
                } else {
                    org.telegram.messenger.hd.M0(2131746867, null);
                    throw null;
                }
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == st0Var.h) {
                if (i10 == 1) {
                    z8Var.setFixedSize(0);
                    z8Var.setText(org.telegram.messenger.hd.M0(2131753677, null));
                    return;
                }
                z8Var.setFixedSize(8);
                z8Var.setText(null);
                return;
            } else if (i7 == st0Var.f49832w) {
                z8Var.setFixedSize(12);
                z8Var.setText("");
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        if (i10 == 1) {
            long keyAt = st0Var.getMessagesController().G0.keyAt(i7 - st0Var.f49830r);
            a5Var.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC.User a22 = st0Var.getMessagesController().a2(Long.valueOf(keyAt));
                if (a22 != null) {
                    if (a22.bot) {
                        M02 = org.telegram.messenger.hd.M0(2131753156, null).substring(0, 1).toUpperCase() + org.telegram.messenger.hd.M0(2131753156, null).substring(1);
                    } else {
                        String str = a22.phone;
                        if (str != null && str.length() != 0) {
                            M02 = org.telegram.messenger.k5.i(new StringBuilder("+"), a22.phone, pf.b.c());
                        } else {
                            M02 = org.telegram.messenger.hd.M0(2131747831, null);
                        }
                    }
                    if (i7 != st0Var.f49831s - 1) {
                        z9 = true;
                    }
                    a5Var.c(a22, null, M02, z9);
                    return;
                }
                return;
            }
            TLRPC.Chat M03 = st0Var.getMessagesController().M0(Long.valueOf(-keyAt));
            if (M03 != null) {
                int i12 = M03.participants_count;
                if (i12 != 0) {
                    M0 = org.telegram.messenger.hd.G(i12, "Members", new Object[0]);
                } else if (M03.has_geo) {
                    M0 = org.telegram.messenger.hd.M0(2131748641, null);
                } else if (!org.telegram.messenger.t3.t0(M03)) {
                    M0 = org.telegram.messenger.hd.M0(2131748640, null);
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131748637, null);
                }
                if (i7 != st0Var.f49831s - 1) {
                    z9 = true;
                }
                a5Var.c(M03, null, M0, z9);
                return;
            }
            return;
        }
        throw null;
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.n4 n4Var;
        FrameLayout z8Var;
        if (i7 != 0) {
            Context context = this.f49571c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(this.f49571c, org.telegram.ui.ActionBar.k6.L6, 21, 11, false, null);
                        n4Var2.setHeight(43);
                        n4Var = n4Var2;
                    } else {
                        org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                        m8Var.k(org.telegram.messenger.hd.M0(2131747914, null), false);
                        m8Var.g(-1, org.telegram.ui.ActionBar.k6.f28070p7);
                        n4Var = m8Var;
                    }
                } else {
                    z8Var = new org.telegram.ui.Cells.x4(context);
                }
            } else {
                z8Var = new org.telegram.ui.Cells.z8(context);
            }
            n4Var = z8Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f49571c, 7, 6, true, null);
            a5Var.setDelegate(new li0(this, 9));
            n4Var = a5Var;
        }
        return new v4.d1(n4Var);
    }
}
