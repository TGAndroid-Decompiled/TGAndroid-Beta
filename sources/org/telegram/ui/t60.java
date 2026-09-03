package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class t60 implements View.OnKeyListener {
    public final int f38389a;
    public boolean f38390b;
    public final org.telegram.ui.ActionBar.p2 f38391c;

    public t60(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f38389a = i10;
        this.f38391c = p2Var;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f38389a) {
            case 0:
                a70 a70Var = (a70) this.f38391c;
                if (i10 != 67) {
                    return false;
                }
                boolean z4 = true;
                if (keyEvent.getAction() == 0) {
                    if (a70Var.f32491f.f24117r.length() != 0) {
                        z4 = false;
                    }
                    this.f38390b = z4;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f38390b || a70Var.X.isEmpty()) {
                    return false;
                } else {
                    a70Var.h.c((org.telegram.ui.Components.o30) kf.k0.i(1, a70Var.X));
                    a70Var.s0();
                    a70Var.k0();
                    return true;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f38391c;
                ArrayList arrayList = usersSelectActivity.L;
                if (i10 != 67) {
                    return false;
                }
                boolean z10 = true;
                if (keyEvent.getAction() == 0) {
                    if (usersSelectActivity.f32363c.length() != 0) {
                        z10 = false;
                    }
                    this.f38390b = z10;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f38390b || arrayList.isEmpty()) {
                    return false;
                } else {
                    org.telegram.ui.Components.o30 o30Var = (org.telegram.ui.Components.o30) kf.k0.i(1, arrayList);
                    usersSelectActivity.f32362b.b(o30Var);
                    if (usersSelectActivity.f32369x == 2) {
                        if (o30Var.getUid() == -9223372036854775800L) {
                            usersSelectActivity.G &= -2;
                        } else if (o30Var.getUid() == -9223372036854775799L) {
                            usersSelectActivity.G &= -3;
                        } else if (o30Var.getUid() == Long.MIN_VALUE) {
                            usersSelectActivity.G &= -5;
                        } else if (o30Var.getUid() == -9223372036854775807L) {
                            usersSelectActivity.G &= -9;
                        }
                    } else if (o30Var.getUid() == Long.MIN_VALUE) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.G;
                    } else if (o30Var.getUid() == -9223372036854775807L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.G;
                    } else if (o30Var.getUid() == -9223372036854775806L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.G;
                    } else if (o30Var.getUid() == -9223372036854775805L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.G;
                    } else if (o30Var.getUid() == -9223372036854775804L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.G;
                    } else if (o30Var.getUid() == -9223372036854775803L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.G;
                    } else if (o30Var.getUid() == -9223372036854775802L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.G;
                    } else if (o30Var.getUid() == -9223372036854775801L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.G;
                    }
                    usersSelectActivity.Y();
                    usersSelectActivity.W();
                    return true;
                }
        }
    }
}
