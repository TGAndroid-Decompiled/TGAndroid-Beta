package uf;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.qc;
import org.telegram.ui.vq0;
import org.telegram.ui.zt0;
public final class t {
    public static volatile t[] e = new t[4];
    public static final Object[] f45439f = new Object[4];
    public final int f45440a;
    public final ArrayList f45441b = new ArrayList();
    public boolean f45442c = false;
    public boolean d = false;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f45439f[i10] = new Object();
        }
    }

    public t(int i10) {
        this.f45440a = i10;
    }

    public static t d(int i10) {
        t tVar;
        t tVar2 = e[i10];
        if (tVar2 == null) {
            synchronized (f45439f[i10]) {
                try {
                    tVar = e[i10];
                    if (tVar == null) {
                        t[] tVarArr = e;
                        t tVar3 = new t(i10);
                        tVarArr[i10] = tVar3;
                        tVar = tVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return tVar;
        }
        return tVar2;
    }

    public final void a(q qVar, String str) {
        TL_account.TL_businessChatLink c3 = c(str);
        if (c3 != null) {
            ArrayList arrayList = this.f45441b;
            int indexOf = arrayList.indexOf(c3);
            arrayList.remove(c3);
            NotificationCenter.getInstance(this.f45440a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
            qc.a0(qVar).U(LocaleController.getString(R.string.BusinessLinkDeleted), true, new zt0(this, indexOf, c3, 18), new tf.h1(this, str, c3, 5)).j();
        }
    }

    public final void b(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, id idVar) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.f45440a).sendRequest(editbusinesschatlink, new gg.y(this, tL_businessChatLink, idVar, 25));
    }

    public final TL_account.TL_businessChatLink c(String str) {
        TL_account.TL_businessChatLink tL_businessChatLink;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f45441b;
            if (i10 < arrayList.size()) {
                tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList.get(i10);
                if (!TextUtils.equals(tL_businessChatLink.link, str)) {
                    String str2 = tL_businessChatLink.link;
                    if (!TextUtils.equals(str2, "https://" + str)) {
                        String str3 = tL_businessChatLink.link;
                        if (TextUtils.equals(str3, "https://t.me/m/" + str)) {
                            break;
                        }
                        String str4 = tL_businessChatLink.link;
                        if (TextUtils.equals(str4, "tg://message?slug=" + str)) {
                            break;
                        }
                        i10++;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return null;
            }
        }
        return tL_businessChatLink;
    }

    public final void e(boolean z4, boolean z10) {
        if (!this.f45442c) {
            if (!this.d || (z10 && !z4)) {
                this.f45442c = true;
                int i10 = this.f45440a;
                if (z4) {
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                    messagesStorage.getStorageQueue().postRunnable(new vq0(this, messagesStorage, z10, 10));
                    return;
                }
                ConnectionsManager.getInstance(i10).sendRequest(new TL_account.getBusinessChatLinks(), new s(this, 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.f45441b);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f45440a);
        messagesStorage.getStorageQueue().postRunnable(new ph.p0(1, arrayList, messagesStorage));
    }
}
