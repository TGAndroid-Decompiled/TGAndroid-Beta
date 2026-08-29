package sf;

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
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;
public final class w {
    public final Context f47985a;
    public final int f47986b;
    public final c6 f47987c;
    public final o2 d;
    public final Runnable f47988e;
    public int f47989f;
    public int f47990g;
    public boolean h;
    public boolean f47991i;
    public final ArrayList f47992j;
    public final ArrayList f47993k;
    public TL_account.TL_businessBotRecipients f47994l;
    public int f47995m;
    public boolean f47996n;

    public w(o2 o2Var, Runnable runnable) {
        this.f47992j = new ArrayList();
        this.f47993k = new ArrayList();
        this.f47995m = -4;
        this.f47985a = o2Var.getContext();
        this.f47986b = o2Var.getCurrentAccount();
        this.d = o2Var;
        this.f47988e = runnable;
        this.f47987c = o2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, k51 k51Var, boolean z10) {
        String str;
        String str2;
        k51Var.U();
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
                str = x3.i(R.string.FilterExistingChats, com.google.android.recaptcha.internal.a.n(str2));
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = u3.c.k(str, ", ");
                }
                str = x3.i(R.string.FilterNewChats, com.google.android.recaptcha.internal.a.n(str));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = u3.c.k(str, ", ");
                }
                str = x3.i(R.string.FilterContacts, com.google.android.recaptcha.internal.a.n(str));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = u3.c.k(str, ", ");
                }
                str = x3.i(R.string.FilterNonContacts, com.google.android.recaptcha.internal.a.n(str));
            }
            ArrayList arrayList2 = this.f47992j;
            if (!arrayList2.isEmpty()) {
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder f9 = u3.c.f(str, " + ");
                    f9.append(arrayList2.size());
                    str = f9.toString();
                } else {
                    StringBuilder n10 = com.google.android.recaptcha.internal.a.n(str);
                    n10.append(LocaleController.formatPluralStringComma("Chats", arrayList2.size()));
                    str = n10.toString();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = LocaleController.getString(R.string.BusinessChatsIncludedAdd2);
            }
            w41 f10 = w41.f(LocaleController.getString(R.string.BusinessChatsIncluded), str, 101);
            f10.f34296g = z10;
            arrayList.add(f10);
        }
        boolean z11 = this.f47991i;
        if (z11 || this.h) {
            if (!z11 || this.h) {
                if ((d & 1) != 0) {
                    if (!TextUtils.isEmpty("")) {
                        str3 = ", ";
                    }
                    str3 = x3.i(R.string.FilterExistingChats, com.google.android.recaptcha.internal.a.n(str3));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = u3.c.k(str3, ", ");
                    }
                    str3 = x3.i(R.string.FilterNewChats, com.google.android.recaptcha.internal.a.n(str3));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = u3.c.k(str3, ", ");
                    }
                    str3 = x3.i(R.string.FilterContacts, com.google.android.recaptcha.internal.a.n(str3));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = u3.c.k(str3, ", ");
                    }
                    str3 = x3.i(R.string.FilterNonContacts, com.google.android.recaptcha.internal.a.n(str3));
                }
            }
            ArrayList arrayList3 = this.f47993k;
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder f11 = u3.c.f(str3, " + ");
                    f11.append(arrayList3.size());
                    str3 = f11.toString();
                } else {
                    StringBuilder n11 = com.google.android.recaptcha.internal.a.n(str3);
                    n11.append(LocaleController.formatPluralStringComma("Chats", arrayList3.size()));
                    str3 = n11.toString();
                }
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = LocaleController.getString(R.string.BusinessChatsExcludedAdd2);
            }
            w41 f12 = w41.f(LocaleController.getString(R.string.BusinessChatsExcluded), str3, 103);
            f12.f34296g = z10;
            arrayList.add(f12);
        }
        k51Var.T();
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
        ArrayList arrayList2 = this.f47993k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f47992j;
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
        ArrayList arrayList2 = this.f47993k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f47992j;
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
            return this.f47990g;
        }
        return this.f47989f;
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
            arrayList = this.f47993k;
        } else {
            arrayList = this.f47992j;
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
            arrayList = this.f47993k;
        } else {
            arrayList = this.f47992j;
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
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.f47994l;
        if (tL_businessBotRecipients != null && tL_businessBotRecipients.exclude_selected == this.h && (tL_businessBotRecipients.flags & (-49)) == d()) {
            boolean z10 = this.h;
            ArrayList arrayList2 = this.f47993k;
            if (z10) {
                arrayList = arrayList2;
            } else {
                arrayList = this.f47992j;
            }
            if (arrayList.size() == this.f47994l.users.size()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!this.f47994l.users.contains(arrayList.get(i10))) {
                        return true;
                    }
                }
                if (this.f47991i && !this.h) {
                    if (arrayList2.size() == this.f47994l.exclude_users.size()) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            if (!this.f47994l.exclude_users.contains(arrayList2.get(i11))) {
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

    public final boolean h(w41 w41Var) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        int i10;
        int i11;
        int i12 = w41Var.d;
        o2 o2Var = this.d;
        boolean z12 = false;
        if (i12 != 101 && i12 != 103) {
            Runnable runnable = this.f47988e;
            if (i12 == 102) {
                runnable.run();
                return true;
            } else if (i12 == 104) {
                runnable.run();
                return true;
            } else if (w41Var.f50845a != 11) {
                return false;
            } else {
                boolean z13 = w41Var.f34310w;
                String peerName = MessagesController.getInstance(this.f47986b).getPeerName(w41Var.f34311x);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f47985a, 0, this.f47987c);
                if (!z13) {
                    i10 = R.string.BusinessRecipientsRemoveExcludeTitle;
                } else {
                    i10 = R.string.BusinessRecipientsRemoveIncludeTitle;
                }
                String string = LocaleController.getString(i10);
                c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.N = string;
                if (!z13) {
                    i11 = R.string.BusinessRecipientsRemoveExcludeMessage;
                } else {
                    i11 = R.string.BusinessRecipientsRemoveIncludeMessage;
                }
                c2Var.P = LocaleController.formatString(i11, peerName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new com.google.firebase.messaging.i(this, z13, w41Var, 12));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (o2Var != null) {
                    o2Var.showDialog(c2Var);
                    return true;
                }
                c2Var.show();
                return true;
            }
        }
        if (i12 == 101) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList = this.f47992j;
        } else {
            arrayList = this.f47993k;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), arrayList, z10);
        usersSelectActivity.f36359x = 2;
        usersSelectActivity.C = false;
        if (this.f47991i && !this.h && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        usersSelectActivity.B = z11;
        usersSelectActivity.C = false;
        if (!z10 && this.f47996n) {
            z12 = true;
        }
        usersSelectActivity.D = z12;
        usersSelectActivity.f36355n = new gh.q(9, this, z10);
        if (o2Var != null) {
            o2Var.presentFragment(usersSelectActivity);
            return true;
        }
        o2 U = LaunchActivity.U();
        if (U == 0) {
            return true;
        }
        ?? obj = new Object();
        obj.f23673a = true;
        U.showAsSheet(usersSelectActivity, obj);
        return true;
    }

    public final void i(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.f47991i = true;
        this.f47994l = tL_businessBotRecipients;
        ArrayList arrayList = this.f47992j;
        ArrayList arrayList2 = this.f47993k;
        if (tL_businessBotRecipients == null) {
            this.h = true;
            this.f47990g = 0;
            this.f47989f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f47989f = 0;
            this.f47990g = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f47994l.users);
            return;
        }
        this.f47989f = tL_businessBotRecipients.flags & (-49);
        this.f47990g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f47994l.users);
        arrayList2.addAll(this.f47994l.exclude_users);
    }

    public final void j(TL_account.TL_businessRecipients tL_businessRecipients) {
        this.f47991i = false;
        if (tL_businessRecipients != null) {
            TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.f47994l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            this.f47994l = null;
        }
        TL_account.TL_businessBotRecipients tL_businessBotRecipients2 = this.f47994l;
        ArrayList arrayList = this.f47992j;
        ArrayList arrayList2 = this.f47993k;
        if (tL_businessBotRecipients2 == null) {
            this.h = true;
            this.f47990g = 0;
            this.f47989f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients2.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f47989f = 0;
            this.f47990g = tL_businessBotRecipients2.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f47994l.users);
            return;
        }
        this.f47989f = tL_businessBotRecipients2.flags & (-49);
        this.f47990g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f47994l.users);
        arrayList2.addAll(this.f47994l.exclude_users);
    }

    public final boolean k(u51 u51Var) {
        if (!this.h && this.f47992j.isEmpty() && this.f47989f == 0) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View y12 = u51Var.y1(101);
            int i10 = -this.f47995m;
            this.f47995m = i10;
            AndroidUtilities.shakeViewSpring(y12, i10);
            u51Var.x0(u51Var.x1(101));
            return false;
        }
        return true;
    }

    public w(Context context, int i10, org.telegram.ui.web.t1 t1Var, c6 c6Var) {
        this.f47992j = new ArrayList();
        this.f47993k = new ArrayList();
        this.f47995m = -4;
        this.f47985a = context;
        this.f47986b = i10;
        this.d = null;
        this.f47988e = t1Var;
        this.f47987c = c6Var;
    }
}
