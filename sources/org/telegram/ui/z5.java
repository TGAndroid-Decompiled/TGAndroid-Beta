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
public final class z5 extends og.b {
    public final b6 d;

    public z5(b6 b6Var) {
        this.d = b6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42630f;
        if (i10 == 1 || i10 == 2 || i10 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f31971c.size();
    }

    @Override
    public final int j(int i10) {
        return ((a6) this.d.f31971c.get(i10)).f15508a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        b6 b6Var = this.d;
        ArrayList arrayList = b6Var.f31971c;
        if (((a6) arrayList.get(i10)).f15508a == 2) {
            org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) c1Var.f42627a;
            CacheByChatsController.KeepMediaException keepMediaException = ((a6) arrayList.get(i10)).f31681c;
            TLObject userOrChat = b6Var.getMessagesController().getUserOrChat(keepMediaException.dialogId);
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
            bbVar.setSelfAsSavedMessages(true);
            String keepMediaString = CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia);
            if (i10 != arrayList.size() - 1 && ((a6) arrayList.get(i10 + 1)).f15508a != 2) {
                z10 = false;
            }
            bbVar.d(userOrChat, str, keepMediaString, z10);
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
                        s8Var2.e(-1, org.telegram.ui.ActionBar.h6.f19008p7);
                        s8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                        s8Var = s8Var2;
                    }
                } else {
                    s8Var = new org.telegram.ui.Cells.a7(viewGroup.getContext(), (org.telegram.ui.Cells.q3) null);
                }
            } else {
                View bbVar = new org.telegram.ui.Cells.bb(4, 0, viewGroup.getContext(), null, false, false);
                bbVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                view = bbVar;
            }
            return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
        }
        org.telegram.ui.Cells.s8 s8Var3 = new org.telegram.ui.Cells.s8(viewGroup.getContext());
        s8Var3.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
        s8Var3.e(org.telegram.ui.ActionBar.h6.f19118v6, org.telegram.ui.ActionBar.h6.f19100u6);
        s8Var3.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
        s8Var = s8Var3;
        view = s8Var;
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
