package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class u60 implements View.OnKeyListener {
    public final int f37921a;
    public boolean f37922b;
    public final org.telegram.ui.ActionBar.n2 f37923c;

    public u60(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f37921a = i10;
        this.f37923c = n2Var;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f37921a) {
            case 0:
                b70 b70Var = (b70) this.f37923c;
                if (i10 != 67) {
                    return false;
                }
                boolean z10 = true;
                if (keyEvent.getAction() == 0) {
                    if (b70Var.f31991f.f22890r.length() != 0) {
                        z10 = false;
                    }
                    this.f37922b = z10;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f37922b || b70Var.f31984a0.isEmpty()) {
                    return false;
                } else {
                    b70Var.h.c((org.telegram.ui.Components.n30) hg.c.h(1, b70Var.f31984a0));
                    b70Var.s0();
                    b70Var.k0();
                    return true;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f37923c;
                ArrayList arrayList = usersSelectActivity.O;
                if (i10 != 67) {
                    return false;
                }
                boolean z11 = true;
                if (keyEvent.getAction() == 0) {
                    if (usersSelectActivity.f31581c.length() != 0) {
                        z11 = false;
                    }
                    this.f37922b = z11;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f37922b || arrayList.isEmpty()) {
                    return false;
                } else {
                    org.telegram.ui.Components.n30 n30Var = (org.telegram.ui.Components.n30) hg.c.h(1, arrayList);
                    usersSelectActivity.f31580b.b(n30Var);
                    if (usersSelectActivity.f31587x == 2) {
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
