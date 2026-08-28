package pf;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import mh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;
public final class x {
    public final Context f45813a;
    public final int f45814b;
    public final b6 f45815c;
    public final o2 d;
    public final Runnable f45816e;
    public int f45817f;
    public int f45818g;
    public boolean h;
    public boolean f45819i;
    public final ArrayList f45820j;
    public final ArrayList f45821k;
    public TL_account.TL_businessBotRecipients f45822l;
    public int f45823m;
    public boolean f45824n;

    public x(o2 o2Var, Runnable runnable) {
        this.f45820j = new ArrayList();
        this.f45821k = new ArrayList();
        this.f45823m = -4;
        this.f45813a = o2Var.getContext();
        this.f45814b = o2Var.getCurrentAccount();
        this.d = o2Var;
        this.f45816e = runnable;
        this.f45815c = o2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, z41 z41Var, boolean z10) {
        String str;
        String str2;
        z41Var.U();
        int d = d();
        String str3 = "";
        if (!this.h) {
            if ((d & 1) == 0) {
                str = "";
            } else {
                if (TextUtils.isEmpty("")) {
                    str2 = "";
                } else {
                    str2 = ", ";
                }
                str = org.telegram.messenger.l0.h(R.string.FilterExistingChats, e2.c.n(str2));
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = ta.b.j(str, ", ");
                }
                str = org.telegram.messenger.l0.h(R.string.FilterNewChats, e2.c.n(str));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = ta.b.j(str, ", ");
                }
                str = org.telegram.messenger.l0.h(R.string.FilterContacts, e2.c.n(str));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = ta.b.j(str, ", ");
                }
                str = org.telegram.messenger.l0.h(R.string.FilterNonContacts, e2.c.n(str));
            }
            ArrayList arrayList2 = this.f45820j;
            if (!arrayList2.isEmpty()) {
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder e10 = ta.b.e(str, " + ");
                    e10.append(arrayList2.size());
                    str = e10.toString();
                } else {
                    StringBuilder n10 = e2.c.n(str);
                    n10.append(LocaleController.formatPluralStringComma("Chats", arrayList2.size()));
                    str = n10.toString();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = LocaleController.getString(R.string.BusinessChatsIncludedAdd2);
            }
            l41 f10 = l41.f(LocaleController.getString(R.string.BusinessChatsIncluded), str, 101);
            f10.f30335g = z10;
            arrayList.add(f10);
        }
        boolean z11 = this.f45819i;
        if (z11 || this.h) {
            if (!z11 || this.h) {
                if ((d & 1) != 0) {
                    if (!TextUtils.isEmpty("")) {
                        str3 = ", ";
                    }
                    str3 = org.telegram.messenger.l0.h(R.string.FilterExistingChats, e2.c.n(str3));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = ta.b.j(str3, ", ");
                    }
                    str3 = org.telegram.messenger.l0.h(R.string.FilterNewChats, e2.c.n(str3));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = ta.b.j(str3, ", ");
                    }
                    str3 = org.telegram.messenger.l0.h(R.string.FilterContacts, e2.c.n(str3));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = ta.b.j(str3, ", ");
                    }
                    str3 = org.telegram.messenger.l0.h(R.string.FilterNonContacts, e2.c.n(str3));
                }
            }
            ArrayList arrayList3 = this.f45821k;
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder e11 = ta.b.e(str3, " + ");
                    e11.append(arrayList3.size());
                    str3 = e11.toString();
                } else {
                    StringBuilder n11 = e2.c.n(str3);
                    n11.append(LocaleController.formatPluralStringComma("Chats", arrayList3.size()));
                    str3 = n11.toString();
                }
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = LocaleController.getString(R.string.BusinessChatsExcludedAdd2);
            }
            l41 f11 = l41.f(LocaleController.getString(R.string.BusinessChatsExcluded), str3, 103);
            f11.f30335g = z10;
            arrayList.add(f11);
        }
        z41Var.T();
    }

    public final TL_account.TL_inputBusinessBotRecipients b() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        TL_account.TL_inputBusinessBotRecipients tL_inputBusinessBotRecipients = new TL_account.TL_inputBusinessBotRecipients();
        int d = d();
        tL_inputBusinessBotRecipients.flags = d & (-49);
        boolean z13 = true;
        if ((d & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_inputBusinessBotRecipients.existing_chats = z10;
        if ((d & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_inputBusinessBotRecipients.new_chats = z11;
        if ((d & 4) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        tL_inputBusinessBotRecipients.contacts = z12;
        if ((d & 8) == 0) {
            z13 = false;
        }
        tL_inputBusinessBotRecipients.non_contacts = z13;
        boolean z14 = this.h;
        tL_inputBusinessBotRecipients.exclude_selected = z14;
        ArrayList arrayList2 = this.f45821k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f45820j;
        }
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                TLRPC.InputUser inputUser = messagesController.getInputUser(((Long) arrayList.get(i9)).longValue());
                if (inputUser == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i9));
                } else {
                    tL_inputBusinessBotRecipients.users.add(inputUser);
                }
            }
        }
        if (!this.h) {
            MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessBotRecipients.flags |= 64;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.InputUser inputUser2 = messagesController2.getInputUser(((Long) arrayList2.get(i10)).longValue());
                if (inputUser2 == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList2.get(i10));
                } else {
                    tL_inputBusinessBotRecipients.exclude_users.add(inputUser2);
                }
            }
        }
        return tL_inputBusinessBotRecipients;
    }

    public final TL_account.TL_businessBotRecipients c() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
        int d = d();
        tL_businessBotRecipients.flags = d & (-49);
        boolean z13 = true;
        if ((d & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_businessBotRecipients.existing_chats = z10;
        if ((d & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_businessBotRecipients.new_chats = z11;
        if ((d & 4) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        tL_businessBotRecipients.contacts = z12;
        if ((d & 8) == 0) {
            z13 = false;
        }
        tL_businessBotRecipients.non_contacts = z13;
        boolean z14 = this.h;
        tL_businessBotRecipients.exclude_selected = z14;
        ArrayList arrayList2 = this.f45821k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f45820j;
        }
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessBotRecipients.flags |= 16;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                if (messagesController.getInputUser(((Long) arrayList.get(i9)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i9));
                } else {
                    tL_businessBotRecipients.users.add((Long) arrayList.get(i9));
                }
            }
        }
        if (!this.h) {
            MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessBotRecipients.flags |= 64;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                if (messagesController2.getInputUser(((Long) arrayList2.get(i10)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList2.get(i10));
                } else {
                    tL_businessBotRecipients.users.add((Long) arrayList2.get(i10));
                }
            }
        }
        return tL_businessBotRecipients;
    }

    public final int d() {
        if (this.h) {
            return this.f45818g;
        }
        return this.f45817f;
    }

    public final TL_account.TL_inputBusinessRecipients e() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        TL_account.TL_inputBusinessRecipients tL_inputBusinessRecipients = new TL_account.TL_inputBusinessRecipients();
        int d = d();
        tL_inputBusinessRecipients.flags = d & (-49);
        boolean z13 = true;
        if ((d & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_inputBusinessRecipients.existing_chats = z10;
        if ((d & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_inputBusinessRecipients.new_chats = z11;
        if ((d & 4) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        tL_inputBusinessRecipients.contacts = z12;
        if ((d & 8) == 0) {
            z13 = false;
        }
        tL_inputBusinessRecipients.non_contacts = z13;
        boolean z14 = this.h;
        tL_inputBusinessRecipients.exclude_selected = z14;
        if (z14) {
            arrayList = this.f45821k;
        } else {
            arrayList = this.f45820j;
        }
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessRecipients.flags |= 16;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                TLRPC.InputUser inputUser = messagesController.getInputUser(((Long) arrayList.get(i9)).longValue());
                if (inputUser == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i9));
                } else {
                    tL_inputBusinessRecipients.users.add(inputUser);
                }
            }
        }
        return tL_inputBusinessRecipients;
    }

    public final TL_account.TL_businessRecipients f() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        TL_account.TL_businessRecipients tL_businessRecipients = new TL_account.TL_businessRecipients();
        int d = d();
        tL_businessRecipients.flags = d & (-49);
        boolean z13 = true;
        if ((d & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_businessRecipients.existing_chats = z10;
        if ((d & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_businessRecipients.new_chats = z11;
        if ((d & 4) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        tL_businessRecipients.contacts = z12;
        if ((d & 8) == 0) {
            z13 = false;
        }
        tL_businessRecipients.non_contacts = z13;
        boolean z14 = this.h;
        tL_businessRecipients.exclude_selected = z14;
        if (z14) {
            arrayList = this.f45821k;
        } else {
            arrayList = this.f45820j;
        }
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessRecipients.flags |= 16;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                if (messagesController.getInputUser(((Long) arrayList.get(i9)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i9));
                } else {
                    tL_businessRecipients.users.add((Long) arrayList.get(i9));
                }
            }
        }
        return tL_businessRecipients;
    }

    public final boolean g() {
        ArrayList arrayList;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.f45822l;
        if (tL_businessBotRecipients != null && tL_businessBotRecipients.exclude_selected == this.h && (tL_businessBotRecipients.flags & (-49)) == d()) {
            boolean z10 = this.h;
            ArrayList arrayList2 = this.f45821k;
            if (z10) {
                arrayList = arrayList2;
            } else {
                arrayList = this.f45820j;
            }
            if (arrayList.size() == this.f45822l.users.size()) {
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    if (!this.f45822l.users.contains(arrayList.get(i9))) {
                        return true;
                    }
                }
                if (this.f45819i && !this.h) {
                    if (arrayList2.size() == this.f45822l.exclude_users.size()) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            if (!this.f45822l.exclude_users.contains(arrayList2.get(i10))) {
                                return true;
                            }
                        }
                    } else {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean h(l41 l41Var) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        int i9;
        int i10;
        int i11 = l41Var.d;
        o2 o2Var = this.d;
        boolean z12 = false;
        if (i11 != 101 && i11 != 103) {
            Runnable runnable = this.f45816e;
            if (i11 == 102) {
                runnable.run();
                return true;
            } else if (i11 == 104) {
                runnable.run();
                return true;
            } else if (l41Var.f48814a != 11) {
                return false;
            } else {
                boolean z13 = l41Var.f30349w;
                String peerName = MessagesController.getInstance(this.f45814b).getPeerName(l41Var.f30350x);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f45813a, 0, this.f45815c);
                if (!z13) {
                    i9 = R.string.BusinessRecipientsRemoveExcludeTitle;
                } else {
                    i9 = R.string.BusinessRecipientsRemoveIncludeTitle;
                }
                String string = LocaleController.getString(i9);
                c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.N = string;
                if (!z13) {
                    i10 = R.string.BusinessRecipientsRemoveExcludeMessage;
                } else {
                    i10 = R.string.BusinessRecipientsRemoveIncludeMessage;
                }
                c2Var.P = LocaleController.formatString(i10, peerName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new b5.e(this, z13, l41Var, 11));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (o2Var != null) {
                    o2Var.showDialog(c2Var);
                    return true;
                }
                c2Var.show();
                return true;
            }
        }
        if (i11 == 101) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList = this.f45820j;
        } else {
            arrayList = this.f45821k;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), arrayList, z10);
        usersSelectActivity.f36294x = 2;
        usersSelectActivity.C = false;
        if (this.f45819i && !this.h && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        usersSelectActivity.B = z11;
        usersSelectActivity.C = false;
        if (!z10 && this.f45824n) {
            z12 = true;
        }
        usersSelectActivity.D = z12;
        usersSelectActivity.f36290n = new dh.s(9, this, z10);
        if (o2Var != null) {
            o2Var.presentFragment(usersSelectActivity);
            return true;
        }
        o2 U = LaunchActivity.U();
        if (U == 0) {
            return true;
        }
        ?? obj = new Object();
        obj.f23653a = true;
        U.showAsSheet(usersSelectActivity, obj);
        return true;
    }

    public final void i(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.f45819i = true;
        this.f45822l = tL_businessBotRecipients;
        ArrayList arrayList = this.f45820j;
        ArrayList arrayList2 = this.f45821k;
        if (tL_businessBotRecipients == null) {
            this.h = true;
            this.f45818g = 0;
            this.f45817f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f45817f = 0;
            this.f45818g = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f45822l.users);
            return;
        }
        this.f45817f = tL_businessBotRecipients.flags & (-49);
        this.f45818g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f45822l.users);
        arrayList2.addAll(this.f45822l.exclude_users);
    }

    public final void j(TL_account.TL_businessRecipients tL_businessRecipients) {
        this.f45819i = false;
        if (tL_businessRecipients != null) {
            TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.f45822l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            this.f45822l = null;
        }
        TL_account.TL_businessBotRecipients tL_businessBotRecipients2 = this.f45822l;
        ArrayList arrayList = this.f45820j;
        ArrayList arrayList2 = this.f45821k;
        if (tL_businessBotRecipients2 == null) {
            this.h = true;
            this.f45818g = 0;
            this.f45817f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients2.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f45817f = 0;
            this.f45818g = tL_businessBotRecipients2.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f45822l.users);
            return;
        }
        this.f45817f = tL_businessBotRecipients2.flags & (-49);
        this.f45818g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f45822l.users);
        arrayList2.addAll(this.f45822l.exclude_users);
    }

    public final boolean k(i51 i51Var) {
        if (!this.h && this.f45820j.isEmpty() && this.f45817f == 0) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View y12 = i51Var.y1(101);
            int i9 = -this.f45823m;
            this.f45823m = i9;
            AndroidUtilities.shakeViewSpring(y12, i9);
            i51Var.x0(i51Var.x1(101));
            return false;
        }
        return true;
    }

    public x(Context context, int i9, m2 m2Var, b6 b6Var) {
        this.f45820j = new ArrayList();
        this.f45821k = new ArrayList();
        this.f45823m = -4;
        this.f45813a = context;
        this.f45814b = i9;
        this.d = null;
        this.f45816e = m2Var;
        this.f45815c = b6Var;
    }
}
