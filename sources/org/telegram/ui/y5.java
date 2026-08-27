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

public final class y5 extends xf.b {
    public final a6 d;

    public y5(a6 a6Var) {
        this.d = a6Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 1 || i10 == 2 || i10 == 4;
    }

    @Override
    public final int h() {
        return this.d.f36381c.size();
    }

    @Override
    public final int j(int i10) {
        return ((z5) this.d.f36381c.get(i10)).f49413a;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        String string;
        a6 a6Var = this.d;
        ArrayList arrayList = a6Var.f36381c;
        if (((z5) arrayList.get(i10)).f49413a == 2) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) o1Var.f5789a;
            CacheByChatsController.KeepMediaException keepMediaException = ((z5) arrayList.get(i10)).f45029c;
            TLObject userOrChat = a6Var.getMessagesController().getUserOrChat(keepMediaException.dialogId);
            if (userOrChat instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) userOrChat;
                string = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
            } else {
                string = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
            }
            boolean z10 = true;
            saVar.setSelfAsSavedMessages(true);
            String keepMediaString = CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia);
            if (i10 != arrayList.size() - 1 && ((z5) arrayList.get(i10 + 1)).f49413a != 2) {
                z10 = false;
            }
            saVar.e(userOrChat, string, keepMediaString, z10);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View w6Var;
        View view = null;
        if (i10 != 1) {
            if (i10 == 2) {
                org.telegram.ui.Cells.sa saVar = new org.telegram.ui.Cells.sa(4, 0, viewGroup.getContext(), null, false, false);
                saVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                view = saVar;
            } else if (i10 == 3) {
                w6Var = new org.telegram.ui.Cells.w6(viewGroup.getContext(), (org.telegram.messenger.rl) null);
            } else if (i10 == 4) {
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                l8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                l8Var.e(-1, org.telegram.ui.ActionBar.g6.f23269p7);
                l8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                w6Var = l8Var;
            }
            return org.telegram.ui.Cells.pa.l(view, view, -1, -2);
        }
        org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
        l8Var2.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
        l8Var2.e(org.telegram.ui.ActionBar.g6.f23373v6, org.telegram.ui.ActionBar.g6.f23357u6);
        l8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        w6Var = l8Var2;
        view = w6Var;
        return org.telegram.ui.Cells.pa.l(view, view, -1, -2);
    }
}
