package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class x60 implements View.OnKeyListener {
    public final int f39355a;
    public boolean f39356b;
    public final org.telegram.ui.ActionBar.n2 f39357c;

    public x60(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f39355a = i10;
        this.f39357c = n2Var;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f39355a) {
            case 0:
                e70 e70Var = (e70) this.f39357c;
                if (i10 != 67) {
                    return false;
                }
                boolean z10 = true;
                if (keyEvent.getAction() == 0) {
                    if (e70Var.f33253f.f22856r.length() != 0) {
                        z10 = false;
                    }
                    this.f39356b = z10;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f39356b || e70Var.f33246a0.isEmpty()) {
                    return false;
                } else {
                    e70Var.h.c((org.telegram.ui.Components.m30) hg.k0.g(1, e70Var.f33246a0));
                    e70Var.s0();
                    e70Var.k0();
                    return true;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f39357c;
                ArrayList arrayList = usersSelectActivity.O;
                if (i10 != 67) {
                    return false;
                }
                boolean z11 = true;
                if (keyEvent.getAction() == 0) {
                    if (usersSelectActivity.f31894c.length() != 0) {
                        z11 = false;
                    }
                    this.f39356b = z11;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f39356b || arrayList.isEmpty()) {
                    return false;
                } else {
                    org.telegram.ui.Components.m30 m30Var = (org.telegram.ui.Components.m30) hg.k0.g(1, arrayList);
                    usersSelectActivity.f31893b.b(m30Var);
                    if (usersSelectActivity.f31900x == 2) {
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
