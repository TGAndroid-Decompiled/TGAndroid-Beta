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
public final class x5 extends wf.b {
    public final z5 d;

    public x5(z5 z5Var) {
        this.d = z5Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 == 1 || i9 == 2 || i9 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f45035c.size();
    }

    @Override
    public final int j(int i9) {
        return ((y5) this.d.f45035c.get(i9)).f48814a;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        String str;
        z5 z5Var = this.d;
        ArrayList arrayList = z5Var.f45035c;
        if (((y5) arrayList.get(i9)).f48814a == 2) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) q1Var.f5501a;
            CacheByChatsController.KeepMediaException keepMediaException = ((y5) arrayList.get(i9)).f44726c;
            TLObject userOrChat = z5Var.getMessagesController().getUserOrChat(keepMediaException.dialogId);
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
            vaVar.setSelfAsSavedMessages(true);
            String keepMediaString = CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia);
            if (i9 != arrayList.size() - 1 && ((y5) arrayList.get(i9 + 1)).f48814a != 2) {
                z10 = false;
            }
            vaVar.e(userOrChat, str, keepMediaString, z10);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.p8 p8Var;
        View view = null;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 == 4) {
                        org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                        p8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        p8Var2.e(-1, org.telegram.ui.ActionBar.f6.f23212p7);
                        p8Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                        p8Var = p8Var2;
                    }
                } else {
                    p8Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.j2) null);
                }
            } else {
                View vaVar = new org.telegram.ui.Cells.va(4, 0, viewGroup.getContext(), null, false, false);
                vaVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                view = vaVar;
            }
            return j3.r0.s(view, view, -1, -2);
        }
        org.telegram.ui.Cells.p8 p8Var3 = new org.telegram.ui.Cells.p8(viewGroup.getContext());
        p8Var3.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
        p8Var3.e(org.telegram.ui.ActionBar.f6.f23319v6, org.telegram.ui.ActionBar.f6.f23303u6);
        p8Var3.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        p8Var = p8Var3;
        view = p8Var;
        return j3.r0.s(view, view, -1, -2);
    }
}
