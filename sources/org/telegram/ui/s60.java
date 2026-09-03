package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class s60 implements View.OnKeyListener {
    public final int f41026a;
    public boolean f41027b;
    public final org.telegram.ui.ActionBar.p2 f41028c;

    public s60(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f41026a = i10;
        this.f41028c = p2Var;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f41026a) {
            case 0:
                z60 z60Var = (z60) this.f41028c;
                if (i10 != 67) {
                    return false;
                }
                boolean z4 = true;
                if (keyEvent.getAction() == 0) {
                    if (z60Var.f43820f.f26132r.length() != 0) {
                        z4 = false;
                    }
                    this.f41027b = z4;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f41027b || z60Var.X.isEmpty()) {
                    return false;
                } else {
                    z60Var.h.c((org.telegram.ui.Components.p30) l.d.i(1, z60Var.X));
                    z60Var.s0();
                    z60Var.k0();
                    return true;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f41028c;
                ArrayList arrayList = usersSelectActivity.L;
                if (i10 != 67) {
                    return false;
                }
                boolean z10 = true;
                if (keyEvent.getAction() == 0) {
                    if (usersSelectActivity.f34932c.length() != 0) {
                        z10 = false;
                    }
                    this.f41027b = z10;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f41027b || arrayList.isEmpty()) {
                    return false;
                } else {
                    org.telegram.ui.Components.p30 p30Var = (org.telegram.ui.Components.p30) l.d.i(1, arrayList);
                    usersSelectActivity.f34931b.b(p30Var);
                    if (usersSelectActivity.f34939x == 2) {
                        if (p30Var.getUid() == -9223372036854775800L) {
                            usersSelectActivity.G &= -2;
                        } else if (p30Var.getUid() == -9223372036854775799L) {
                            usersSelectActivity.G &= -3;
                        } else if (p30Var.getUid() == Long.MIN_VALUE) {
                            usersSelectActivity.G &= -5;
                        } else if (p30Var.getUid() == -9223372036854775807L) {
                            usersSelectActivity.G &= -9;
                        }
                    } else if (p30Var.getUid() == Long.MIN_VALUE) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.G;
                    } else if (p30Var.getUid() == -9223372036854775807L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.G;
                    } else if (p30Var.getUid() == -9223372036854775806L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.G;
                    } else if (p30Var.getUid() == -9223372036854775805L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.G;
                    } else if (p30Var.getUid() == -9223372036854775804L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.G;
                    } else if (p30Var.getUid() == -9223372036854775803L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.G;
                    } else if (p30Var.getUid() == -9223372036854775802L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.G;
                    } else if (p30Var.getUid() == -9223372036854775801L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.G;
                    }
                    usersSelectActivity.Y();
                    usersSelectActivity.W();
                    return true;
                }
        }
    }
}
