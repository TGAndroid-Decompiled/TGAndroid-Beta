package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y5 extends og.b {
    public final a6 d;

    public y5(a6 a6Var) {
        this.d = a6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42998f;
        if (i10 == 1 || i10 == 2 || i10 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f32018c.size();
    }

    @Override
    public final int j(int i10) {
        return ((z5) this.d.f32018c.get(i10)).f15719a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        a6 a6Var = this.d;
        ArrayList arrayList = a6Var.f32018c;
        if (((z5) arrayList.get(i10)).f15719a == 2) {
            org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) c1Var.f42995a;
            CacheByChatsController.KeepMediaException keepMediaException = ((z5) arrayList.get(i10)).f40120c;
            TLObject userOrChat = a6Var.getMessagesController().getUserOrChat(keepMediaException.dialogId);
            if (userOrChat instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) userOrChat;
                if (user.self) {
                    str = LocaleController.getString(R.string.SavedMessages);
                } else {
                    str = ContactsController.formatName(user.first_name, user.last_name);
                }
            } else if (userOrChat instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) userOrChat).title;
            } else {
                str = null;
            }
            boolean z10 = true;
            abVar.setSelfAsSavedMessages(true);
            String keepMediaString = CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia);
            if (i10 != arrayList.size() - 1 && ((z5) arrayList.get(i10 + 1)).f15719a != 2) {
                z10 = false;
            }
            abVar.d(userOrChat, str, keepMediaString, z10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s8 s8Var;
        View view = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(viewGroup.getContext());
                        s8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        s8Var2.e(-1, org.telegram.ui.ActionBar.j6.f19330p7);
                        s8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false));
                        s8Var = s8Var2;
                    }
                } else {
                    s8Var = new org.telegram.ui.Cells.c7(viewGroup.getContext(), (org.telegram.ui.Cells.c1) null);
                }
            } else {
                View abVar = new org.telegram.ui.Cells.ab(4, 0, viewGroup.getContext(), null, false, false);
                abVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false));
                view = abVar;
            }
            return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
        }
        org.telegram.ui.Cells.s8 s8Var3 = new org.telegram.ui.Cells.s8(viewGroup.getContext());
        s8Var3.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
        s8Var3.e(org.telegram.ui.ActionBar.j6.f19440v6, org.telegram.ui.ActionBar.j6.f19422u6);
        s8Var3.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false));
        s8Var = s8Var3;
        view = s8Var;
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
