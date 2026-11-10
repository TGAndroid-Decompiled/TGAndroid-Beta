package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class ut0 extends org.telegram.ui.Components.oj0 {
    public final Context f50567c;
    public final vt0 d;

    public ut0(vt0 vt0Var, Context context) {
        this.d = vt0Var;
        this.f50567c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57056f;
        if (i7 != 0 && i7 != 2 && i7 != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.d.f50791e;
    }

    @Override
    public final int d(int i7) {
        vt0 vt0Var = this.d;
        if (i7 == vt0Var.f50797x) {
            return 4;
        }
        if (i7 == vt0Var.f50793n) {
            return 3;
        }
        if (i7 == vt0Var.f50792f) {
            return 2;
        }
        if (i7 != vt0Var.h && i7 != vt0Var.f50796w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        String M0;
        String M02;
        vt0 vt0Var = this.d;
        int i10 = vt0Var.D;
        int i11 = d1Var.f57056f;
        View view = d1Var.f57052a;
        boolean z9 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                        if (i7 == vt0Var.f50793n) {
                            if (i10 == 1) {
                                n4Var.setText(org.telegram.messenger.id.G(vt0Var.getMessagesController().H0, "BlockedUsersCount", new Object[0]));
                                return;
                            } else {
                                n4Var.setText(org.telegram.messenger.id.M0(2131746840, null));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                x4Var.a(org.telegram.ui.ActionBar.m6.f28225v6, org.telegram.ui.ActionBar.m6.f28206u6);
                if (i10 == 1) {
                    x4Var.b(2131232099, 5, org.telegram.messenger.id.M0(2131753692, null), false);
                    return;
                } else {
                    org.telegram.messenger.id.M0(2131746868, null);
                    throw null;
                }
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == vt0Var.h) {
                if (i10 == 1) {
                    z8Var.setFixedSize(0);
                    z8Var.setText(org.telegram.messenger.id.M0(2131753677, null));
                    return;
                }
                z8Var.setFixedSize(8);
                z8Var.setText(null);
                return;
            } else if (i7 == vt0Var.f50796w) {
                z8Var.setFixedSize(12);
                z8Var.setText("");
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        if (i10 == 1) {
            long keyAt = vt0Var.getMessagesController().G0.keyAt(i7 - vt0Var.f50794r);
            a5Var.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC.User a22 = vt0Var.getMessagesController().a2(Long.valueOf(keyAt));
                if (a22 != null) {
                    if (a22.bot) {
                        M02 = org.telegram.messenger.id.M0(2131753156, null).substring(0, 1).toUpperCase() + org.telegram.messenger.id.M0(2131753156, null).substring(1);
                    } else {
                        String str = a22.phone;
                        if (str != null && str.length() != 0) {
                            M02 = org.telegram.messenger.k5.i(new StringBuilder("+"), a22.phone, pf.b.c());
                        } else {
                            M02 = org.telegram.messenger.id.M0(2131747832, null);
                        }
                    }
                    if (i7 != vt0Var.f50795s - 1) {
                        z9 = true;
                    }
                    a5Var.c(a22, null, M02, z9);
                    return;
                }
                return;
            }
            TLRPC.Chat M03 = vt0Var.getMessagesController().M0(Long.valueOf(-keyAt));
            if (M03 != null) {
                int i12 = M03.participants_count;
                if (i12 != 0) {
                    M0 = org.telegram.messenger.id.G(i12, "Members", new Object[0]);
                } else if (M03.has_geo) {
                    M0 = org.telegram.messenger.id.M0(2131748642, null);
                } else if (!org.telegram.messenger.t3.t0(M03)) {
                    M0 = org.telegram.messenger.id.M0(2131748641, null);
                } else {
                    M0 = org.telegram.messenger.id.M0(2131748638, null);
                }
                if (i7 != vt0Var.f50795s - 1) {
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
            Context context = this.f50567c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(this.f50567c, org.telegram.ui.ActionBar.m6.L6, 21, 11, false, null);
                        n4Var2.setHeight(43);
                        n4Var = n4Var2;
                    } else {
                        org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                        m8Var.k(org.telegram.messenger.id.M0(2131747915, null), false);
                        m8Var.g(-1, org.telegram.ui.ActionBar.m6.f28111p7);
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
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f50567c, 7, 6, true, null);
            a5Var.setDelegate(new oi0(this, 9));
            n4Var = a5Var;
        }
        return new v4.d1(n4Var);
    }
}
