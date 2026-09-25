package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class s60 implements View.OnKeyListener {
    public final int f37602a;
    public boolean f37603b;
    public final org.telegram.ui.ActionBar.m2 f37604c;

    public s60(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f37602a = i10;
        this.f37604c = m2Var;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f37602a) {
            case 0:
                z60 z60Var = (z60) this.f37604c;
                if (i10 != 67) {
                    return false;
                }
                boolean z10 = true;
                if (keyEvent.getAction() == 0) {
                    if (z60Var.f40375f.f23161r.length() != 0) {
                        z10 = false;
                    }
                    this.f37603b = z10;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f37603b || z60Var.f40368a0.isEmpty()) {
                    return false;
                } else {
                    z60Var.h.c((org.telegram.ui.Components.n30) hg.c.g(1, z60Var.f40368a0));
                    z60Var.s0();
                    z60Var.k0();
                    return true;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f37604c;
                ArrayList arrayList = usersSelectActivity.O;
                if (i10 != 67) {
                    return false;
                }
                boolean z11 = true;
                if (keyEvent.getAction() == 0) {
                    if (usersSelectActivity.f31897c.length() != 0) {
                        z11 = false;
                    }
                    this.f37603b = z11;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f37603b || arrayList.isEmpty()) {
                    return false;
                } else {
                    org.telegram.ui.Components.n30 n30Var = (org.telegram.ui.Components.n30) hg.c.g(1, arrayList);
                    usersSelectActivity.f31896b.b(n30Var);
                    if (usersSelectActivity.f31903x == 2) {
                        if (n30Var.getUid() == -9223372036854775800L) {
                            usersSelectActivity.J &= -2;
                        } else if (n30Var.getUid() == -9223372036854775799L) {
                            usersSelectActivity.J &= -3;
                        } else if (n30Var.getUid() == Long.MIN_VALUE) {
                            usersSelectActivity.J &= -5;
                        } else if (n30Var.getUid() == -9223372036854775807L) {
                            usersSelectActivity.J &= -9;
                        }
                    } else if (n30Var.getUid() == Long.MIN_VALUE) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.J;
                    } else if (n30Var.getUid() == -9223372036854775807L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.J;
                    } else if (n30Var.getUid() == -9223372036854775806L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.J;
                    } else if (n30Var.getUid() == -9223372036854775805L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.J;
                    } else if (n30Var.getUid() == -9223372036854775804L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.J;
                    } else if (n30Var.getUid() == -9223372036854775803L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.J;
                    } else if (n30Var.getUid() == -9223372036854775802L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.J;
                    } else if (n30Var.getUid() == -9223372036854775801L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.J;
                    }
                    usersSelectActivity.Y();
                    usersSelectActivity.W();
                    return true;
                }
        }
    }
}
