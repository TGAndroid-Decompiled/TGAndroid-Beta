package vf;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;
import qh.v9;
public final class v {
    public final Context f49207a;
    public final int f49208b;
    public final g6 f49209c;
    public final p2 d;
    public final Runnable f49210e;
    public int f49211f;
    public int f49212g;
    public boolean h;
    public boolean f49213i;
    public final ArrayList f49214j;
    public final ArrayList f49215k;
    public TL_account.TL_businessBotRecipients f49216l;
    public int f49217m;
    public boolean f49218n;

    public v(p2 p2Var, Runnable runnable) {
        this.f49214j = new ArrayList();
        this.f49215k = new ArrayList();
        this.f49217m = -4;
        this.f49207a = p2Var.getContext();
        this.f49208b = p2Var.getCurrentAccount();
        this.d = p2Var;
        this.f49210e = runnable;
        this.f49209c = p2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, x51 x51Var, boolean z4) {
        String str;
        String str2;
        x51Var.U();
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
                str = y3.h(R.string.FilterExistingChats, e2.c.l(str2));
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = w.c.e(str, ", ");
                }
                str = y3.h(R.string.FilterNewChats, e2.c.l(str));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = w.c.e(str, ", ");
                }
                str = y3.h(R.string.FilterContacts, e2.c.l(str));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = w.c.e(str, ", ");
                }
                str = y3.h(R.string.FilterNonContacts, e2.c.l(str));
            }
            ArrayList arrayList2 = this.f49214j;
            if (!arrayList2.isEmpty()) {
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder f10 = w.c.f(str, " + ");
                    f10.append(arrayList2.size());
                    str = f10.toString();
                } else {
                    StringBuilder l10 = e2.c.l(str);
                    l10.append(LocaleController.formatPluralStringComma("Chats", arrayList2.size()));
                    str = l10.toString();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = LocaleController.getString(R.string.BusinessChatsIncludedAdd2);
            }
            j51 f11 = j51.f(LocaleController.getString(R.string.BusinessChatsIncluded), str, 101);
            f11.f28010g = z4;
            arrayList.add(f11);
        }
        boolean z10 = this.f49213i;
        if (z10 || this.h) {
            if (!z10 || this.h) {
                if ((d & 1) != 0) {
                    if (!TextUtils.isEmpty("")) {
                        str3 = ", ";
                    }
                    str3 = y3.h(R.string.FilterExistingChats, e2.c.l(str3));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = w.c.e(str3, ", ");
                    }
                    str3 = y3.h(R.string.FilterNewChats, e2.c.l(str3));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = w.c.e(str3, ", ");
                    }
                    str3 = y3.h(R.string.FilterContacts, e2.c.l(str3));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = w.c.e(str3, ", ");
                    }
                    str3 = y3.h(R.string.FilterNonContacts, e2.c.l(str3));
                }
            }
            ArrayList arrayList3 = this.f49215k;
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder f12 = w.c.f(str3, " + ");
                    f12.append(arrayList3.size());
                    str3 = f12.toString();
                } else {
                    StringBuilder l11 = e2.c.l(str3);
                    l11.append(LocaleController.formatPluralStringComma("Chats", arrayList3.size()));
                    str3 = l11.toString();
                }
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = LocaleController.getString(R.string.BusinessChatsExcludedAdd2);
            }
            j51 f13 = j51.f(LocaleController.getString(R.string.BusinessChatsExcluded), str3, 103);
            f13.f28010g = z4;
            arrayList.add(f13);
        }
        x51Var.T();
    }

    public final TL_account.TL_inputBusinessBotRecipients b() {
        boolean z4;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        TL_account.TL_inputBusinessBotRecipients tL_inputBusinessBotRecipients = new TL_account.TL_inputBusinessBotRecipients();
        int d = d();
        tL_inputBusinessBotRecipients.flags = d & (-49);
        boolean z12 = true;
        if ((d & 1) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        tL_inputBusinessBotRecipients.existing_chats = z4;
        if ((d & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_inputBusinessBotRecipients.new_chats = z10;
        if ((d & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_inputBusinessBotRecipients.contacts = z11;
        if ((d & 8) == 0) {
            z12 = false;
        }
        tL_inputBusinessBotRecipients.non_contacts = z12;
        boolean z13 = this.h;
        tL_inputBusinessBotRecipients.exclude_selected = z13;
        ArrayList arrayList2 = this.f49215k;
        if (z13) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f49214j;
        }
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.InputUser inputUser = messagesController.getInputUser(((Long) arrayList.get(i10)).longValue());
                if (inputUser == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i10));
                } else {
                    tL_inputBusinessBotRecipients.users.add(inputUser);
                }
            }
        }
        if (!this.h) {
            MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessBotRecipients.flags |= 64;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TLRPC.InputUser inputUser2 = messagesController2.getInputUser(((Long) arrayList2.get(i11)).longValue());
                if (inputUser2 == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList2.get(i11));
                } else {
                    tL_inputBusinessBotRecipients.exclude_users.add(inputUser2);
                }
            }
        }
        return tL_inputBusinessBotRecipients;
    }

    public final TL_account.TL_businessBotRecipients c() {
        boolean z4;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
        int d = d();
        tL_businessBotRecipients.flags = d & (-49);
        boolean z12 = true;
        if ((d & 1) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        tL_businessBotRecipients.existing_chats = z4;
        if ((d & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_businessBotRecipients.new_chats = z10;
        if ((d & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_businessBotRecipients.contacts = z11;
        if ((d & 8) == 0) {
            z12 = false;
        }
        tL_businessBotRecipients.non_contacts = z12;
        boolean z13 = this.h;
        tL_businessBotRecipients.exclude_selected = z13;
        ArrayList arrayList2 = this.f49215k;
        if (z13) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f49214j;
        }
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessBotRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (messagesController.getInputUser(((Long) arrayList.get(i10)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i10));
                } else {
                    tL_businessBotRecipients.users.add((Long) arrayList.get(i10));
                }
            }
        }
        if (!this.h) {
            MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessBotRecipients.flags |= 64;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if (messagesController2.getInputUser(((Long) arrayList2.get(i11)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList2.get(i11));
                } else {
                    tL_businessBotRecipients.users.add((Long) arrayList2.get(i11));
                }
            }
        }
        return tL_businessBotRecipients;
    }

    public final int d() {
        if (this.h) {
            return this.f49212g;
        }
        return this.f49211f;
    }

    public final TL_account.TL_inputBusinessRecipients e() {
        boolean z4;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        TL_account.TL_inputBusinessRecipients tL_inputBusinessRecipients = new TL_account.TL_inputBusinessRecipients();
        int d = d();
        tL_inputBusinessRecipients.flags = d & (-49);
        boolean z12 = true;
        if ((d & 1) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        tL_inputBusinessRecipients.existing_chats = z4;
        if ((d & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_inputBusinessRecipients.new_chats = z10;
        if ((d & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_inputBusinessRecipients.contacts = z11;
        if ((d & 8) == 0) {
            z12 = false;
        }
        tL_inputBusinessRecipients.non_contacts = z12;
        boolean z13 = this.h;
        tL_inputBusinessRecipients.exclude_selected = z13;
        if (z13) {
            arrayList = this.f49215k;
        } else {
            arrayList = this.f49214j;
        }
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.InputUser inputUser = messagesController.getInputUser(((Long) arrayList.get(i10)).longValue());
                if (inputUser == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i10));
                } else {
                    tL_inputBusinessRecipients.users.add(inputUser);
                }
            }
        }
        return tL_inputBusinessRecipients;
    }

    public final TL_account.TL_businessRecipients f() {
        boolean z4;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        TL_account.TL_businessRecipients tL_businessRecipients = new TL_account.TL_businessRecipients();
        int d = d();
        tL_businessRecipients.flags = d & (-49);
        boolean z12 = true;
        if ((d & 1) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        tL_businessRecipients.existing_chats = z4;
        if ((d & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_businessRecipients.new_chats = z10;
        if ((d & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_businessRecipients.contacts = z11;
        if ((d & 8) == 0) {
            z12 = false;
        }
        tL_businessRecipients.non_contacts = z12;
        boolean z13 = this.h;
        tL_businessRecipients.exclude_selected = z13;
        if (z13) {
            arrayList = this.f49215k;
        } else {
            arrayList = this.f49214j;
        }
        if (!arrayList.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (messagesController.getInputUser(((Long) arrayList.get(i10)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i10));
                } else {
                    tL_businessRecipients.users.add((Long) arrayList.get(i10));
                }
            }
        }
        return tL_businessRecipients;
    }

    public final boolean g() {
        ArrayList arrayList;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.f49216l;
        if (tL_businessBotRecipients != null && tL_businessBotRecipients.exclude_selected == this.h && (tL_businessBotRecipients.flags & (-49)) == d()) {
            boolean z4 = this.h;
            ArrayList arrayList2 = this.f49215k;
            if (z4) {
                arrayList = arrayList2;
            } else {
                arrayList = this.f49214j;
            }
            if (arrayList.size() == this.f49216l.users.size()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!this.f49216l.users.contains(arrayList.get(i10))) {
                        return true;
                    }
                }
                if (this.f49213i && !this.h) {
                    if (arrayList2.size() == this.f49216l.exclude_users.size()) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            if (!this.f49216l.exclude_users.contains(arrayList2.get(i11))) {
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

    public final boolean h(j51 j51Var) {
        boolean z4;
        ArrayList arrayList;
        boolean z10;
        int i10;
        int i11;
        int i12 = j51Var.d;
        p2 p2Var = this.d;
        boolean z11 = false;
        if (i12 != 101 && i12 != 103) {
            Runnable runnable = this.f49210e;
            if (i12 == 102) {
                runnable.run();
                return true;
            } else if (i12 == 104) {
                runnable.run();
                return true;
            } else if (j51Var.f2505a != 11) {
                return false;
            } else {
                boolean z12 = j51Var.f28024w;
                String peerName = MessagesController.getInstance(this.f49208b).getPeerName(j51Var.f28025x);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f49207a, 0, this.f49209c);
                if (!z12) {
                    i10 = R.string.BusinessRecipientsRemoveExcludeTitle;
                } else {
                    i10 = R.string.BusinessRecipientsRemoveIncludeTitle;
                }
                String string = LocaleController.getString(i10);
                d2 d2Var = alertDialog$Builder.f21166a;
                d2Var.O = string;
                if (!z12) {
                    i11 = R.string.BusinessRecipientsRemoveExcludeMessage;
                } else {
                    i11 = R.string.BusinessRecipientsRemoveIncludeMessage;
                }
                d2Var.Q = LocaleController.formatString(i11, peerName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new com.google.firebase.messaging.i(this, z12, j51Var, 12));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (p2Var != null) {
                    p2Var.showDialog(d2Var);
                    return true;
                }
                d2Var.show();
                return true;
            }
        }
        if (i12 == 101) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            arrayList = this.f49214j;
        } else {
            arrayList = this.f49215k;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), arrayList, z4);
        usersSelectActivity.f34939x = 2;
        usersSelectActivity.D = false;
        if (this.f49213i && !this.h && !z4) {
            z10 = true;
        } else {
            z10 = false;
        }
        usersSelectActivity.C = z10;
        usersSelectActivity.D = false;
        if (!z4 && this.f49218n) {
            z11 = true;
        }
        usersSelectActivity.E = z11;
        usersSelectActivity.f34935n = new jh.q(9, this, z4);
        if (p2Var != null) {
            p2Var.presentFragment(usersSelectActivity);
            return true;
        }
        p2 U = LaunchActivity.U();
        if (U == 0) {
            return true;
        }
        ?? obj = new Object();
        obj.f22156a = true;
        U.showAsSheet(usersSelectActivity, obj);
        return true;
    }

    public final void i(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.f49213i = true;
        this.f49216l = tL_businessBotRecipients;
        ArrayList arrayList = this.f49214j;
        ArrayList arrayList2 = this.f49215k;
        if (tL_businessBotRecipients == null) {
            this.h = true;
            this.f49212g = 0;
            this.f49211f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z4 = tL_businessBotRecipients.exclude_selected;
        this.h = z4;
        if (z4) {
            this.f49211f = 0;
            this.f49212g = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f49216l.users);
            return;
        }
        this.f49211f = tL_businessBotRecipients.flags & (-49);
        this.f49212g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f49216l.users);
        arrayList2.addAll(this.f49216l.exclude_users);
    }

    public final void j(TL_account.TL_businessRecipients tL_businessRecipients) {
        this.f49213i = false;
        if (tL_businessRecipients != null) {
            TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.f49216l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            this.f49216l = null;
        }
        TL_account.TL_businessBotRecipients tL_businessBotRecipients2 = this.f49216l;
        ArrayList arrayList = this.f49214j;
        ArrayList arrayList2 = this.f49215k;
        if (tL_businessBotRecipients2 == null) {
            this.h = true;
            this.f49212g = 0;
            this.f49211f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z4 = tL_businessBotRecipients2.exclude_selected;
        this.h = z4;
        if (z4) {
            this.f49211f = 0;
            this.f49212g = tL_businessBotRecipients2.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f49216l.users);
            return;
        }
        this.f49211f = tL_businessBotRecipients2.flags & (-49);
        this.f49212g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f49216l.users);
        arrayList2.addAll(this.f49216l.exclude_users);
    }

    public final boolean k(i61 i61Var) {
        if (!this.h && this.f49214j.isEmpty() && this.f49211f == 0) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View y12 = i61Var.y1(101);
            int i10 = -this.f49217m;
            this.f49217m = i10;
            AndroidUtilities.shakeViewSpring(y12, i10);
            i61Var.x0(i61Var.x1(101));
            return false;
        }
        return true;
    }

    public v(Context context, int i10, v9 v9Var, g6 g6Var) {
        this.f49214j = new ArrayList();
        this.f49215k = new ArrayList();
        this.f49217m = -4;
        this.f49207a = context;
        this.f49208b = i10;
        this.d = null;
        this.f49210e = v9Var;
        this.f49209c = g6Var;
    }
}
