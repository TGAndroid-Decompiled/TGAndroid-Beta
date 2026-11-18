package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
public final class s40 implements View.OnKeyListener {
    public final int f51882a;
    public boolean f51883b;
    public final org.telegram.ui.ActionBar.h2 f51884c;

    public s40(int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        this.f51882a = i7;
        this.f51884c = h2Var;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        int i10 = this.f51882a;
        org.telegram.ui.ActionBar.h2 h2Var = this.f51884c;
        boolean z10 = true;
        switch (i10) {
            case 0:
                z40 z40Var = (z40) h2Var;
                if (i7 == 67) {
                    if (keyEvent.getAction() == 0) {
                        if (z40Var.f54365f.f33845r.length() != 0) {
                            z10 = false;
                        }
                        this.f51883b = z10;
                    } else if (keyEvent.getAction() == 1 && this.f51883b && !z40Var.f54359b0.isEmpty()) {
                        z40Var.h.c((org.telegram.ui.Components.m20) i5.c.h(1, z40Var.f54359b0));
                        z40Var.x0();
                        z40Var.p0();
                        return true;
                    }
                }
                return false;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) h2Var;
                ArrayList arrayList = usersSelectActivity.Q;
                if (i7 == 67) {
                    if (keyEvent.getAction() == 0) {
                        if (usersSelectActivity.f43896c.length() != 0) {
                            z10 = false;
                        }
                        this.f51883b = z10;
                    } else if (keyEvent.getAction() == 1 && this.f51883b && !arrayList.isEmpty()) {
                        org.telegram.ui.Components.m20 m20Var = (org.telegram.ui.Components.m20) i5.c.h(1, arrayList);
                        usersSelectActivity.f43895b.b(m20Var);
                        if (usersSelectActivity.f43904y == 2) {
                            if (m20Var.getUid() == -9223372036854775800L) {
                                usersSelectActivity.L &= -2;
                            } else if (m20Var.getUid() == -9223372036854775799L) {
                                usersSelectActivity.L &= -3;
                            } else if (m20Var.getUid() == Long.MIN_VALUE) {
                                usersSelectActivity.L &= -5;
                            } else if (m20Var.getUid() == -9223372036854775807L) {
                                usersSelectActivity.L &= -9;
                            }
                        } else if (m20Var.getUid() == Long.MIN_VALUE) {
                            int i11 = org.telegram.messenger.mp.I8;
                            usersSelectActivity.L &= -2;
                        } else if (m20Var.getUid() == -9223372036854775807L) {
                            int i12 = org.telegram.messenger.mp.I8;
                            usersSelectActivity.L &= -3;
                        } else if (m20Var.getUid() == -9223372036854775806L) {
                            int i13 = org.telegram.messenger.mp.I8;
                            usersSelectActivity.L &= -5;
                        } else if (m20Var.getUid() == -9223372036854775805L) {
                            int i14 = org.telegram.messenger.mp.I8;
                            usersSelectActivity.L &= -9;
                        } else if (m20Var.getUid() == -9223372036854775804L) {
                            int i15 = org.telegram.messenger.mp.I8;
                            usersSelectActivity.L &= -17;
                        } else if (m20Var.getUid() == -9223372036854775803L) {
                            int i16 = org.telegram.messenger.mp.I8;
                            usersSelectActivity.L &= -33;
                        } else if (m20Var.getUid() == -9223372036854775802L) {
                            int i17 = org.telegram.messenger.mp.I8;
                            usersSelectActivity.L &= -65;
                        } else if (m20Var.getUid() == -9223372036854775801L) {
                            int i18 = org.telegram.messenger.mp.I8;
                            usersSelectActivity.L &= -129;
                        }
                        usersSelectActivity.d0();
                        usersSelectActivity.b0();
                        return true;
                    }
                }
                return false;
        }
    }
}
