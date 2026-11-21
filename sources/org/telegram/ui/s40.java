package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
public final class s40 implements View.OnKeyListener {
    public final int f51922a;
    public boolean f51923b;
    public final org.telegram.ui.ActionBar.g2 f51924c;

    public s40(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f51922a = i7;
        this.f51924c = g2Var;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        int i10 = this.f51922a;
        org.telegram.ui.ActionBar.g2 g2Var = this.f51924c;
        boolean z10 = true;
        switch (i10) {
            case 0:
                z40 z40Var = (z40) g2Var;
                if (i7 == 67) {
                    if (keyEvent.getAction() == 0) {
                        if (z40Var.f54409f.f34647r.length() != 0) {
                            z10 = false;
                        }
                        this.f51923b = z10;
                    } else if (keyEvent.getAction() == 1 && this.f51923b && !z40Var.f54403b0.isEmpty()) {
                        z40Var.h.c((org.telegram.ui.Components.p20) i5.c.h(1, z40Var.f54403b0));
                        z40Var.x0();
                        z40Var.p0();
                        return true;
                    }
                }
                return false;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) g2Var;
                ArrayList arrayList = usersSelectActivity.Q;
                if (i7 == 67) {
                    if (keyEvent.getAction() == 0) {
                        if (usersSelectActivity.f43937c.length() != 0) {
                            z10 = false;
                        }
                        this.f51923b = z10;
                    } else if (keyEvent.getAction() == 1 && this.f51923b && !arrayList.isEmpty()) {
                        org.telegram.ui.Components.p20 p20Var = (org.telegram.ui.Components.p20) i5.c.h(1, arrayList);
                        usersSelectActivity.f43936b.b(p20Var);
                        if (usersSelectActivity.f43945y == 2) {
                            if (p20Var.getUid() == -9223372036854775800L) {
                                usersSelectActivity.L &= -2;
                            } else if (p20Var.getUid() == -9223372036854775799L) {
                                usersSelectActivity.L &= -3;
                            } else if (p20Var.getUid() == Long.MIN_VALUE) {
                                usersSelectActivity.L &= -5;
                            } else if (p20Var.getUid() == -9223372036854775807L) {
                                usersSelectActivity.L &= -9;
                            }
                        } else if (p20Var.getUid() == Long.MIN_VALUE) {
                            int i11 = org.telegram.messenger.mp.I8;
                            usersSelectActivity.L &= -2;
                        } else if (p20Var.getUid() == -9223372036854775807L) {
                            int i12 = org.telegram.messenger.mp.I8;
                            usersSelectActivity.L &= -3;
                        } else if (p20Var.getUid() == -9223372036854775806L) {
                            int i13 = org.telegram.messenger.mp.I8;
                            usersSelectActivity.L &= -5;
                        } else if (p20Var.getUid() == -9223372036854775805L) {
                            int i14 = org.telegram.messenger.mp.I8;
                            usersSelectActivity.L &= -9;
                        } else if (p20Var.getUid() == -9223372036854775804L) {
                            int i15 = org.telegram.messenger.mp.I8;
                            usersSelectActivity.L &= -17;
                        } else if (p20Var.getUid() == -9223372036854775803L) {
                            int i16 = org.telegram.messenger.mp.I8;
                            usersSelectActivity.L &= -33;
                        } else if (p20Var.getUid() == -9223372036854775802L) {
                            int i17 = org.telegram.messenger.mp.I8;
                            usersSelectActivity.L &= -65;
                        } else if (p20Var.getUid() == -9223372036854775801L) {
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
