package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class r60 implements View.OnKeyListener {
    public final int f37925a;
    public boolean f37926b;
    public final org.telegram.ui.ActionBar.p2 f37927c;

    public r60(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f37925a = i10;
        this.f37927c = p2Var;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f37925a) {
            case 0:
                y60 y60Var = (y60) this.f37927c;
                if (i10 != 67) {
                    return false;
                }
                boolean z4 = true;
                if (keyEvent.getAction() == 0) {
                    if (y60Var.f40419f.f23815r.length() != 0) {
                        z4 = false;
                    }
                    this.f37926b = z4;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f37926b || y60Var.X.isEmpty()) {
                    return false;
                } else {
                    y60Var.h.c((org.telegram.ui.Components.n30) kh.a2.i(1, y60Var.X));
                    y60Var.s0();
                    y60Var.k0();
                    return true;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f37927c;
                ArrayList arrayList = usersSelectActivity.L;
                if (i10 != 67) {
                    return false;
                }
                boolean z10 = true;
                if (keyEvent.getAction() == 0) {
                    if (usersSelectActivity.f32389c.length() != 0) {
                        z10 = false;
                    }
                    this.f37926b = z10;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f37926b || arrayList.isEmpty()) {
                    return false;
                } else {
                    org.telegram.ui.Components.n30 n30Var = (org.telegram.ui.Components.n30) kh.a2.i(1, arrayList);
                    usersSelectActivity.f32388b.b(n30Var);
                    if (usersSelectActivity.f32395x == 2) {
                        if (n30Var.getUid() == -9223372036854775800L) {
                            usersSelectActivity.G &= -2;
                        } else if (n30Var.getUid() == -9223372036854775799L) {
                            usersSelectActivity.G &= -3;
                        } else if (n30Var.getUid() == Long.MIN_VALUE) {
                            usersSelectActivity.G &= -5;
                        } else if (n30Var.getUid() == -9223372036854775807L) {
                            usersSelectActivity.G &= -9;
                        }
                    } else if (n30Var.getUid() == Long.MIN_VALUE) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.G;
                    } else if (n30Var.getUid() == -9223372036854775807L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.G;
                    } else if (n30Var.getUid() == -9223372036854775806L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.G;
                    } else if (n30Var.getUid() == -9223372036854775805L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.G;
                    } else if (n30Var.getUid() == -9223372036854775804L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.G;
                    } else if (n30Var.getUid() == -9223372036854775803L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.G;
                    } else if (n30Var.getUid() == -9223372036854775802L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.G;
                    } else if (n30Var.getUid() == -9223372036854775801L) {
                        usersSelectActivity.G = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.G;
                    }
                    usersSelectActivity.Y();
                    usersSelectActivity.W();
                    return true;
                }
        }
    }
}
