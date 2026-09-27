package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class v60 implements View.OnKeyListener {
    public final int f38458a;
    public boolean f38459b;
    public final org.telegram.ui.ActionBar.o2 f38460c;

    public v60(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f38458a = i10;
        this.f38460c = o2Var;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f38458a) {
            case 0:
                c70 c70Var = (c70) this.f38460c;
                if (i10 != 67) {
                    return false;
                }
                boolean z10 = true;
                if (keyEvent.getAction() == 0) {
                    if (c70Var.f32543f.f23850r.length() != 0) {
                        z10 = false;
                    }
                    this.f38459b = z10;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f38459b || c70Var.f32536a0.isEmpty()) {
                    return false;
                } else {
                    c70Var.h.c((org.telegram.ui.Components.p30) hg.k0.g(1, c70Var.f32536a0));
                    c70Var.s0();
                    c70Var.k0();
                    return true;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f38460c;
                ArrayList arrayList = usersSelectActivity.O;
                if (i10 != 67) {
                    return false;
                }
                boolean z11 = true;
                if (keyEvent.getAction() == 0) {
                    if (usersSelectActivity.f31898c.length() != 0) {
                        z11 = false;
                    }
                    this.f38459b = z11;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f38459b || arrayList.isEmpty()) {
                    return false;
                } else {
                    org.telegram.ui.Components.p30 p30Var = (org.telegram.ui.Components.p30) hg.k0.g(1, arrayList);
                    usersSelectActivity.f31897b.b(p30Var);
                    if (usersSelectActivity.f31904x == 2) {
                        if (p30Var.getUid() == -9223372036854775800L) {
                            usersSelectActivity.J &= -2;
                        } else if (p30Var.getUid() == -9223372036854775799L) {
                            usersSelectActivity.J &= -3;
                        } else if (p30Var.getUid() == Long.MIN_VALUE) {
                            usersSelectActivity.J &= -5;
                        } else if (p30Var.getUid() == -9223372036854775807L) {
                            usersSelectActivity.J &= -9;
                        }
                    } else if (p30Var.getUid() == Long.MIN_VALUE) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.J;
                    } else if (p30Var.getUid() == -9223372036854775807L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.J;
                    } else if (p30Var.getUid() == -9223372036854775806L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.J;
                    } else if (p30Var.getUid() == -9223372036854775805L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.J;
                    } else if (p30Var.getUid() == -9223372036854775804L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.J;
                    } else if (p30Var.getUid() == -9223372036854775803L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.J;
                    } else if (p30Var.getUid() == -9223372036854775802L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.J;
                    } else if (p30Var.getUid() == -9223372036854775801L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.J;
                    }
                    usersSelectActivity.Y();
                    usersSelectActivity.W();
                    return true;
                }
        }
    }
}
