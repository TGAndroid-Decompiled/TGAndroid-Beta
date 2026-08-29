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
public final class y5 extends zf.b {
    public final a6 d;

    public y5(a6 a6Var) {
        this.d = a6Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 == 1 || i10 == 2 || i10 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f36438c.size();
    }

    @Override
    public final int j(int i10) {
        return ((z5) this.d.f36438c.get(i10)).f50845a;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        String str;
        a6 a6Var = this.d;
        ArrayList arrayList = a6Var.f36438c;
        if (((z5) arrayList.get(i10)).f50845a == 2) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) n1Var.f6432a;
            CacheByChatsController.KeepMediaException keepMediaException = ((z5) arrayList.get(i10)).f45073c;
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
            saVar.setSelfAsSavedMessages(true);
            String keepMediaString = CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia);
            if (i10 != arrayList.size() - 1 && ((z5) arrayList.get(i10 + 1)).f50845a != 2) {
                z10 = false;
            }
            saVar.d(userOrChat, str, keepMediaString, z10);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m8 m8Var;
        View view = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                        m8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        m8Var2.e(-1, org.telegram.ui.ActionBar.g6.f23279p7);
                        m8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                        m8Var = m8Var2;
                    }
                } else {
                    m8Var = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (b) null);
                }
            } else {
                View saVar = new org.telegram.ui.Cells.sa(4, 0, viewGroup.getContext(), null, false, false);
                saVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                view = saVar;
            }
            return th.m(view, view, -1, -2);
        }
        org.telegram.ui.Cells.m8 m8Var3 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
        m8Var3.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
        m8Var3.e(org.telegram.ui.ActionBar.g6.f23383v6, org.telegram.ui.ActionBar.g6.f23365u6);
        m8Var3.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        m8Var = m8Var3;
        view = m8Var;
        return th.m(view, view, -1, -2);
    }
}
