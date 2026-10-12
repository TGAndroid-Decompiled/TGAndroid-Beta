package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class x60 implements View.OnKeyListener {
    public final int f43776a;
    public boolean f43777b;
    public final org.telegram.ui.ActionBar.m2 f43778c;

    public x60(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f43776a = i10;
        this.f43778c = m2Var;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f43776a) {
            case 0:
                e70 e70Var = (e70) this.f43778c;
                if (i10 != 67) {
                    return false;
                }
                boolean z10 = true;
                if (keyEvent.getAction() == 0) {
                    if (e70Var.f37004f.f31362r.length() != 0) {
                        z10 = false;
                    }
                    this.f43777b = z10;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f43777b || e70Var.f36996a0.isEmpty()) {
                    return false;
                } else {
                    e70Var.h.c((org.telegram.ui.Components.g40) hg.c.h(1, e70Var.f36996a0));
                    e70Var.s0();
                    e70Var.k0();
                    return true;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f43778c;
                ArrayList arrayList = usersSelectActivity.O;
                if (i10 != 67) {
                    return false;
                }
                boolean z11 = true;
                if (keyEvent.getAction() == 0) {
                    if (usersSelectActivity.f34433c.length() != 0) {
                        z11 = false;
                    }
                    this.f43777b = z11;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f43777b || arrayList.isEmpty()) {
                    return false;
                } else {
                    org.telegram.ui.Components.g40 g40Var = (org.telegram.ui.Components.g40) hg.c.h(1, arrayList);
                    usersSelectActivity.f34432b.b(g40Var);
                    if (usersSelectActivity.f34440x == 2) {
                        if (g40Var.getUid() == -9223372036854775800L) {
                            usersSelectActivity.J &= -2;
                        } else if (g40Var.getUid() == -9223372036854775799L) {
                            usersSelectActivity.J &= -3;
                        } else if (g40Var.getUid() == Long.MIN_VALUE) {
                            usersSelectActivity.J &= -5;
                        } else if (g40Var.getUid() == -9223372036854775807L) {
                            usersSelectActivity.J &= -9;
                        }
                    } else if (g40Var.getUid() == Long.MIN_VALUE) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.J;
                    } else if (g40Var.getUid() == -9223372036854775807L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.J;
                    } else if (g40Var.getUid() == -9223372036854775806L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.J;
                    } else if (g40Var.getUid() == -9223372036854775805L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.J;
                    } else if (g40Var.getUid() == -9223372036854775804L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.J;
                    } else if (g40Var.getUid() == -9223372036854775803L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.J;
                    } else if (g40Var.getUid() == -9223372036854775802L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.J;
                    } else if (g40Var.getUid() == -9223372036854775801L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.J;
                    }
                    usersSelectActivity.Y();
                    usersSelectActivity.W();
                    return true;
                }
        }
    }
}
