package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class z60 implements View.OnKeyListener {
    public final int f40135a;
    public boolean f40136b;
    public final org.telegram.ui.ActionBar.o2 f40137c;

    public z60(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f40135a = i10;
        this.f40137c = o2Var;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f40135a) {
            case 0:
                g70 g70Var = (g70) this.f40137c;
                if (i10 != 67) {
                    return false;
                }
                boolean z10 = true;
                if (keyEvent.getAction() == 0) {
                    if (g70Var.f33879f.f22546r.length() != 0) {
                        z10 = false;
                    }
                    this.f40136b = z10;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f40136b || g70Var.f33872a0.isEmpty()) {
                    return false;
                } else {
                    g70Var.h.c((org.telegram.ui.Components.m30) hg.k0.h(1, g70Var.f33872a0));
                    g70Var.s0();
                    g70Var.k0();
                    return true;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f40137c;
                ArrayList arrayList = usersSelectActivity.O;
                if (i10 != 67) {
                    return false;
                }
                boolean z11 = true;
                if (keyEvent.getAction() == 0) {
                    if (usersSelectActivity.f31627c.length() != 0) {
                        z11 = false;
                    }
                    this.f40136b = z11;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f40136b || arrayList.isEmpty()) {
                    return false;
                } else {
                    org.telegram.ui.Components.m30 m30Var = (org.telegram.ui.Components.m30) hg.k0.h(1, arrayList);
                    usersSelectActivity.f31626b.b(m30Var);
                    if (usersSelectActivity.f31633x == 2) {
                        if (m30Var.getUid() == -9223372036854775800L) {
                            usersSelectActivity.J &= -2;
                        } else if (m30Var.getUid() == -9223372036854775799L) {
                            usersSelectActivity.J &= -3;
                        } else if (m30Var.getUid() == Long.MIN_VALUE) {
                            usersSelectActivity.J &= -5;
                        } else if (m30Var.getUid() == -9223372036854775807L) {
                            usersSelectActivity.J &= -9;
                        }
                    } else if (m30Var.getUid() == Long.MIN_VALUE) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.J;
                    } else if (m30Var.getUid() == -9223372036854775807L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.J;
                    } else if (m30Var.getUid() == -9223372036854775806L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.J;
                    } else if (m30Var.getUid() == -9223372036854775805L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.J;
                    } else if (m30Var.getUid() == -9223372036854775804L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.J;
                    } else if (m30Var.getUid() == -9223372036854775803L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.J;
                    } else if (m30Var.getUid() == -9223372036854775802L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.J;
                    } else if (m30Var.getUid() == -9223372036854775801L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.J;
                    }
                    usersSelectActivity.Y();
                    usersSelectActivity.W();
                    return true;
                }
        }
    }
}
