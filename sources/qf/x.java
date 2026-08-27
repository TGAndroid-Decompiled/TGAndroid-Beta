package qf;

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
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;

public final class x {

    public final Context f46481a;

    public final int f46482b;

    public final c6 f46483c;
    public final n2 d;

    public final Runnable f46484e;

    public int f46485f;

    public int f46486g;
    public boolean h;

    public boolean f46487i;

    public final ArrayList f46488j;

    public final ArrayList f46489k;

    public TL_account.TL_businessBotRecipients f46490l;

    public int f46491m;

    public boolean f46492n;

    public x(n2 n2Var, Runnable runnable) {
        this.f46488j = new ArrayList();
        this.f46489k = new ArrayList();
        this.f46491m = -4;
        this.f46481a = n2Var.getContext();
        this.f46482b = n2Var.getCurrentAccount();
        this.d = n2Var;
        this.f46484e = runnable;
        this.f46483c = n2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, b51 b51Var, boolean z10) {
        String string;
        b51Var.U();
        int iD = d();
        String strI = "";
        if (!this.h) {
            if ((iD & 1) != 0) {
                string = y1.i(R.string.FilterExistingChats, com.google.android.recaptcha.internal.a.o(!TextUtils.isEmpty("") ? ", " : ""));
            } else {
                string = "";
            }
            if ((iD & 2) != 0) {
                if (!TextUtils.isEmpty(string)) {
                    string = s3.c.l(string, ", ");
                }
                string = y1.i(R.string.FilterNewChats, com.google.android.recaptcha.internal.a.o(string));
            }
            if ((iD & 4) != 0) {
                if (!TextUtils.isEmpty(string)) {
                    string = s3.c.l(string, ", ");
                }
                string = y1.i(R.string.FilterContacts, com.google.android.recaptcha.internal.a.o(string));
            }
            if ((iD & 8) != 0) {
                if (!TextUtils.isEmpty(string)) {
                    string = s3.c.l(string, ", ");
                }
                string = y1.i(R.string.FilterNonContacts, com.google.android.recaptcha.internal.a.o(string));
            }
            ArrayList arrayList2 = this.f46488j;
            if (!arrayList2.isEmpty()) {
                if (TextUtils.isEmpty(string)) {
                    StringBuilder sbO = com.google.android.recaptcha.internal.a.o(string);
                    sbO.append(LocaleController.formatPluralStringComma("Chats", arrayList2.size()));
                    string = sbO.toString();
                } else {
                    StringBuilder sbF = s3.c.f(string, " + ");
                    sbF.append(arrayList2.size());
                    string = sbF.toString();
                }
            }
            if (TextUtils.isEmpty(string)) {
                string = LocaleController.getString(R.string.BusinessChatsIncludedAdd2);
            }
            n41 n41VarF = n41.f(LocaleController.getString(R.string.BusinessChatsIncluded), string, 101);
            n41VarF.f30840g = z10;
            arrayList.add(n41VarF);
        }
        boolean z11 = this.f46487i;
        if (z11 || this.h) {
            if (!z11 || this.h) {
                if ((iD & 1) != 0) {
                    strI = y1.i(R.string.FilterExistingChats, com.google.android.recaptcha.internal.a.o(TextUtils.isEmpty("") ? "" : ", "));
                }
                if ((iD & 2) != 0) {
                    if (!TextUtils.isEmpty(strI)) {
                        strI = s3.c.l(strI, ", ");
                    }
                    strI = y1.i(R.string.FilterNewChats, com.google.android.recaptcha.internal.a.o(strI));
                }
                if ((iD & 4) != 0) {
                    if (!TextUtils.isEmpty(strI)) {
                        strI = s3.c.l(strI, ", ");
                    }
                    strI = y1.i(R.string.FilterContacts, com.google.android.recaptcha.internal.a.o(strI));
                }
                if ((iD & 8) != 0) {
                    if (!TextUtils.isEmpty(strI)) {
                        strI = s3.c.l(strI, ", ");
                    }
                    strI = y1.i(R.string.FilterNonContacts, com.google.android.recaptcha.internal.a.o(strI));
                }
            }
            ArrayList arrayList3 = this.f46489k;
            if (!arrayList3.isEmpty()) {
                if (TextUtils.isEmpty(strI)) {
                    StringBuilder sbO2 = com.google.android.recaptcha.internal.a.o(strI);
                    sbO2.append(LocaleController.formatPluralStringComma("Chats", arrayList3.size()));
                    strI = sbO2.toString();
                } else {
                    StringBuilder sbF2 = s3.c.f(strI, " + ");
                    sbF2.append(arrayList3.size());
                    strI = sbF2.toString();
                }
            }
            if (TextUtils.isEmpty(strI)) {
                strI = LocaleController.getString(R.string.BusinessChatsExcludedAdd2);
            }
            n41 n41VarF2 = n41.f(LocaleController.getString(R.string.BusinessChatsExcluded), strI, 103);
            n41VarF2.f30840g = z10;
            arrayList.add(n41VarF2);
        }
        b51Var.T();
    }

    public final TL_account.TL_inputBusinessBotRecipients b() {
        TL_account.TL_inputBusinessBotRecipients tL_inputBusinessBotRecipients = new TL_account.TL_inputBusinessBotRecipients();
        int iD = d();
        tL_inputBusinessBotRecipients.flags = iD & (-49);
        tL_inputBusinessBotRecipients.existing_chats = (iD & 1) != 0;
        tL_inputBusinessBotRecipients.new_chats = (iD & 2) != 0;
        tL_inputBusinessBotRecipients.contacts = (iD & 4) != 0;
        tL_inputBusinessBotRecipients.non_contacts = (iD & 8) != 0;
        boolean z10 = this.h;
        tL_inputBusinessBotRecipients.exclude_selected = z10;
        ArrayList arrayList = this.f46489k;
        ArrayList arrayList2 = z10 ? arrayList : this.f46488j;
        if (!arrayList2.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.InputUser inputUser = messagesController.getInputUser(((Long) arrayList2.get(i10)).longValue());
                if (inputUser == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList2.get(i10));
                } else {
                    tL_inputBusinessBotRecipients.users.add(inputUser);
                }
            }
        }
        if (!this.h) {
            MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_inputBusinessBotRecipients.flags |= 64;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.InputUser inputUser2 = messagesController2.getInputUser(((Long) arrayList.get(i11)).longValue());
                if (inputUser2 == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i11));
                } else {
                    tL_inputBusinessBotRecipients.exclude_users.add(inputUser2);
                }
            }
        }
        return tL_inputBusinessBotRecipients;
    }

    public final TL_account.TL_businessBotRecipients c() {
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
        int iD = d();
        tL_businessBotRecipients.flags = iD & (-49);
        tL_businessBotRecipients.existing_chats = (iD & 1) != 0;
        tL_businessBotRecipients.new_chats = (iD & 2) != 0;
        tL_businessBotRecipients.contacts = (iD & 4) != 0;
        tL_businessBotRecipients.non_contacts = (iD & 8) != 0;
        boolean z10 = this.h;
        tL_businessBotRecipients.exclude_selected = z10;
        ArrayList arrayList = this.f46489k;
        ArrayList arrayList2 = z10 ? arrayList : this.f46488j;
        if (!arrayList2.isEmpty()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessBotRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                if (messagesController.getInputUser(((Long) arrayList2.get(i10)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList2.get(i10));
                } else {
                    tL_businessBotRecipients.users.add((Long) arrayList2.get(i10));
                }
            }
        }
        if (!this.h) {
            MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
            tL_businessBotRecipients.flags |= 64;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (messagesController2.getInputUser(((Long) arrayList.get(i11)).longValue()) == null) {
                    FileLog.e("businessRecipientsHelper: user not found " + arrayList.get(i11));
                } else {
                    tL_businessBotRecipients.users.add((Long) arrayList.get(i11));
                }
            }
        }
        return tL_businessBotRecipients;
    }

    public final int d() {
        return this.h ? this.f46486g : this.f46485f;
    }

    public final TL_account.TL_inputBusinessRecipients e() {
        TL_account.TL_inputBusinessRecipients tL_inputBusinessRecipients = new TL_account.TL_inputBusinessRecipients();
        int iD = d();
        tL_inputBusinessRecipients.flags = iD & (-49);
        tL_inputBusinessRecipients.existing_chats = (iD & 1) != 0;
        tL_inputBusinessRecipients.new_chats = (iD & 2) != 0;
        tL_inputBusinessRecipients.contacts = (iD & 4) != 0;
        tL_inputBusinessRecipients.non_contacts = (iD & 8) != 0;
        boolean z10 = this.h;
        tL_inputBusinessRecipients.exclude_selected = z10;
        ArrayList arrayList = z10 ? this.f46489k : this.f46488j;
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
        TL_account.TL_businessRecipients tL_businessRecipients = new TL_account.TL_businessRecipients();
        int iD = d();
        tL_businessRecipients.flags = iD & (-49);
        tL_businessRecipients.existing_chats = (iD & 1) != 0;
        tL_businessRecipients.new_chats = (iD & 2) != 0;
        tL_businessRecipients.contacts = (iD & 4) != 0;
        tL_businessRecipients.non_contacts = (iD & 8) != 0;
        boolean z10 = this.h;
        tL_businessRecipients.exclude_selected = z10;
        ArrayList arrayList = z10 ? this.f46489k : this.f46488j;
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
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.f46490l;
        if (tL_businessBotRecipients == null || tL_businessBotRecipients.exclude_selected != this.h || (tL_businessBotRecipients.flags & (-49)) != d()) {
            return true;
        }
        boolean z10 = this.h;
        ArrayList arrayList = this.f46489k;
        ArrayList arrayList2 = z10 ? arrayList : this.f46488j;
        if (arrayList2.size() != this.f46490l.users.size()) {
            return true;
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            if (!this.f46490l.users.contains(arrayList2.get(i10))) {
                return true;
            }
        }
        if (this.f46487i && !this.h) {
            if (arrayList.size() != this.f46490l.exclude_users.size()) {
                return true;
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (!this.f46490l.exclude_users.contains(arrayList.get(i11))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean h(n41 n41Var) {
        int i10 = n41Var.d;
        n2 n2Var = this.d;
        boolean z10 = false;
        if (i10 == 101 || i10 == 103) {
            boolean z11 = i10 == 101;
            UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), z11 ? this.f46488j : this.f46489k, z11);
            usersSelectActivity.f36297x = 2;
            usersSelectActivity.C = false;
            usersSelectActivity.B = (!this.f46487i || this.h || z11) ? false : true;
            usersSelectActivity.C = false;
            if (!z11 && this.f46492n) {
                z10 = true;
            }
            usersSelectActivity.D = z10;
            usersSelectActivity.f36293n = new eh.q(9, this, z11);
            if (n2Var != null) {
                n2Var.presentFragment(usersSelectActivity);
                return true;
            }
            n2 n2VarU = LaunchActivity.U();
            if (n2VarU == null) {
                return true;
            }
            l2 l2Var = new l2();
            l2Var.f23619a = true;
            n2VarU.showAsSheet(usersSelectActivity, l2Var);
            return true;
        }
        Runnable runnable = this.f46484e;
        if (i10 == 102) {
            runnable.run();
            return true;
        }
        if (i10 == 104) {
            runnable.run();
            return true;
        }
        int i11 = 11;
        if (n41Var.f49413a != 11) {
            return false;
        }
        boolean z12 = n41Var.f30854w;
        String peerName = MessagesController.getInstance(this.f46482b).getPeerName(n41Var.f30855x);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f46481a, 0, this.f46483c);
        String string = LocaleController.getString(!z12 ? R.string.BusinessRecipientsRemoveExcludeTitle : R.string.BusinessRecipientsRemoveIncludeTitle);
        b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        b2Var.P = LocaleController.formatString(!z12 ? R.string.BusinessRecipientsRemoveExcludeMessage : R.string.BusinessRecipientsRemoveIncludeMessage, peerName);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new b5.d(this, z12, n41Var, i11));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        if (n2Var != null) {
            n2Var.showDialog(b2Var);
            return true;
        }
        b2Var.show();
        return true;
    }

    public final void i(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.f46487i = true;
        this.f46490l = tL_businessBotRecipients;
        ArrayList arrayList = this.f46488j;
        ArrayList arrayList2 = this.f46489k;
        if (tL_businessBotRecipients == null) {
            this.h = true;
            this.f46486g = 0;
            this.f46485f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f46485f = 0;
            this.f46486g = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f46490l.users);
            return;
        }
        this.f46485f = tL_businessBotRecipients.flags & (-49);
        this.f46486g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f46490l.users);
        arrayList2.addAll(this.f46490l.exclude_users);
    }

    public final void j(TL_account.TL_businessRecipients tL_businessRecipients) {
        this.f46487i = false;
        if (tL_businessRecipients != null) {
            TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.f46490l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            this.f46490l = null;
        }
        TL_account.TL_businessBotRecipients tL_businessBotRecipients2 = this.f46490l;
        ArrayList arrayList = this.f46488j;
        ArrayList arrayList2 = this.f46489k;
        if (tL_businessBotRecipients2 == null) {
            this.h = true;
            this.f46486g = 0;
            this.f46485f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients2.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f46485f = 0;
            this.f46486g = tL_businessBotRecipients2.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f46490l.users);
            return;
        }
        this.f46485f = tL_businessBotRecipients2.flags & (-49);
        this.f46486g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f46490l.users);
        arrayList2.addAll(this.f46490l.exclude_users);
    }

    public final boolean k(k51 k51Var) {
        if (this.h || !this.f46488j.isEmpty() || this.f46485f != 0) {
            return true;
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        View viewY1 = k51Var.y1(101);
        int i10 = -this.f46491m;
        this.f46491m = i10;
        AndroidUtilities.shakeViewSpring(viewY1, i10);
        k51Var.x0(k51Var.x1(101));
        return false;
    }

    public x(Context context, int i10, b bVar, c6 c6Var) {
        this.f46488j = new ArrayList();
        this.f46489k = new ArrayList();
        this.f46491m = -4;
        this.f46481a = context;
        this.f46482b = i10;
        this.d = null;
        this.f46484e = bVar;
        this.f46483c = c6Var;
    }
}
