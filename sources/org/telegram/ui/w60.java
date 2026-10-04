package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class w60 implements View.OnKeyListener {
    public final int f41930a;
    public boolean f41931b;
    public final org.telegram.ui.ActionBar.n2 f41932c;

    public w60(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f41930a = i10;
        this.f41932c = n2Var;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f41930a) {
            case 0:
                d70 d70Var = (d70) this.f41932c;
                if (i10 != 67) {
                    return false;
                }
                boolean z10 = true;
                if (keyEvent.getAction() == 0) {
                    if (d70Var.f35669f.f26247r.length() != 0) {
                        z10 = false;
                    }
                    this.f41931b = z10;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f41931b || d70Var.f35661a0.isEmpty()) {
                    return false;
                } else {
                    d70Var.h.c((org.telegram.ui.Components.q30) hg.k0.g(1, d70Var.f35661a0));
                    d70Var.s0();
                    d70Var.k0();
                    return true;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f41932c;
                ArrayList arrayList = usersSelectActivity.O;
                if (i10 != 67) {
                    return false;
                }
                boolean z11 = true;
                if (keyEvent.getAction() == 0) {
                    if (usersSelectActivity.f34585c.length() != 0) {
                        z11 = false;
                    }
                    this.f41931b = z11;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f41931b || arrayList.isEmpty()) {
                    return false;
                } else {
                    org.telegram.ui.Components.q30 q30Var = (org.telegram.ui.Components.q30) hg.k0.g(1, arrayList);
                    usersSelectActivity.f34584b.b(q30Var);
                    if (usersSelectActivity.f34592x == 2) {
                        if (q30Var.getUid() == -9223372036854775800L) {
                            usersSelectActivity.J &= -2;
                        } else if (q30Var.getUid() == -9223372036854775799L) {
                            usersSelectActivity.J &= -3;
                        } else if (q30Var.getUid() == Long.MIN_VALUE) {
                            usersSelectActivity.J &= -5;
                        } else if (q30Var.getUid() == -9223372036854775807L) {
                            usersSelectActivity.J &= -9;
                        }
                    } else if (q30Var.getUid() == Long.MIN_VALUE) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.J;
                    } else if (q30Var.getUid() == -9223372036854775807L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.J;
                    } else if (q30Var.getUid() == -9223372036854775806L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.J;
                    } else if (q30Var.getUid() == -9223372036854775805L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.J;
                    } else if (q30Var.getUid() == -9223372036854775804L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.J;
                    } else if (q30Var.getUid() == -9223372036854775803L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.J;
                    } else if (q30Var.getUid() == -9223372036854775802L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.J;
                    } else if (q30Var.getUid() == -9223372036854775801L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.J;
                    }
                    usersSelectActivity.X();
                    usersSelectActivity.U();
                    return true;
                }
        }
    }
}
