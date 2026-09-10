package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class x60 implements View.OnKeyListener {
    public final int f38590a;
    public boolean f38591b;
    public final org.telegram.ui.ActionBar.p2 f38592c;

    public x60(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f38590a = i10;
        this.f38592c = p2Var;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f38590a) {
            case 0:
                e70 e70Var = (e70) this.f38592c;
                if (i10 != 67) {
                    return false;
                }
                boolean z10 = true;
                if (keyEvent.getAction() == 0) {
                    if (e70Var.f32085f.f24572r.length() != 0) {
                        z10 = false;
                    }
                    this.f38591b = z10;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f38591b || e70Var.f32078a0.isEmpty()) {
                    return false;
                } else {
                    e70Var.h.c((org.telegram.ui.Components.w30) hc.b.i(1, e70Var.f32078a0));
                    e70Var.s0();
                    e70Var.k0();
                    return true;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f38592c;
                ArrayList arrayList = usersSelectActivity.O;
                if (i10 != 67) {
                    return false;
                }
                boolean z11 = true;
                if (keyEvent.getAction() == 0) {
                    if (usersSelectActivity.f30722c.length() != 0) {
                        z11 = false;
                    }
                    this.f38591b = z11;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f38591b || arrayList.isEmpty()) {
                    return false;
                } else {
                    org.telegram.ui.Components.w30 w30Var = (org.telegram.ui.Components.w30) hc.b.i(1, arrayList);
                    usersSelectActivity.f30721b.b(w30Var);
                    if (usersSelectActivity.f30728x == 2) {
                        if (w30Var.getUid() == -9223372036854775800L) {
                            usersSelectActivity.J &= -2;
                        } else if (w30Var.getUid() == -9223372036854775799L) {
                            usersSelectActivity.J &= -3;
                        } else if (w30Var.getUid() == Long.MIN_VALUE) {
                            usersSelectActivity.J &= -5;
                        } else if (w30Var.getUid() == -9223372036854775807L) {
                            usersSelectActivity.J &= -9;
                        }
                    } else if (w30Var.getUid() == Long.MIN_VALUE) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.J;
                    } else if (w30Var.getUid() == -9223372036854775807L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.J;
                    } else if (w30Var.getUid() == -9223372036854775806L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.J;
                    } else if (w30Var.getUid() == -9223372036854775805L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.J;
                    } else if (w30Var.getUid() == -9223372036854775804L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.J;
                    } else if (w30Var.getUid() == -9223372036854775803L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.J;
                    } else if (w30Var.getUid() == -9223372036854775802L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.J;
                    } else if (w30Var.getUid() == -9223372036854775801L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.J;
                    }
                    usersSelectActivity.Y();
                    usersSelectActivity.W();
                    return true;
                }
        }
    }
}
