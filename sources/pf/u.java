package pf;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.oc;
import org.telegram.ui.jh0;
import org.telegram.ui.np0;
public final class u {
    public static volatile u[] f45787e = new u[4];
    public static final Object[] f45788f = new Object[4];
    public final int f45789a;
    public final ArrayList f45790b = new ArrayList();
    public boolean f45791c = false;
    public boolean d = false;

    static {
        for (int i9 = 0; i9 < 4; i9++) {
            f45788f[i9] = new Object();
        }
    }

    public u(int i9) {
        this.f45789a = i9;
    }

    public static u d(int i9) {
        u uVar;
        u uVar2 = f45787e[i9];
        if (uVar2 == null) {
            synchronized (f45788f[i9]) {
                try {
                    uVar = f45787e[i9];
                    if (uVar == null) {
                        u[] uVarArr = f45787e;
                        u uVar3 = new u(i9);
                        uVarArr[i9] = uVar3;
                        uVar = uVar3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return uVar;
        }
        return uVar2;
    }

    public final void a(r rVar, String str) {
        TL_account.TL_businessChatLink c10 = c(str);
        if (c10 != null) {
            ArrayList arrayList = this.f45790b;
            int indexOf = arrayList.indexOf(c10);
            arrayList.remove(c10);
            NotificationCenter.getInstance(this.f45789a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
            oc.a0(rVar).U(LocaleController.getString(R.string.BusinessLinkDeleted), true, new jh0(this, indexOf, c10, 13), new a(this, str, c10, 3)).j();
        }
    }

    public final void b(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, hd hdVar) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.f45789a).sendRequest(editbusinesschatlink, new bg.b0(this, tL_businessChatLink, hdVar, 25));
    }

    public final TL_account.TL_businessChatLink c(String str) {
        TL_account.TL_businessChatLink tL_businessChatLink;
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f45790b;
            if (i9 < arrayList.size()) {
                tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList.get(i9);
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
                        i9++;
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

    public final void e(boolean z10, boolean z11) {
        if (!this.f45791c) {
            if (!this.d || (z11 && !z10)) {
                this.f45791c = true;
                int i9 = this.f45789a;
                if (z10) {
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i9);
                    messagesStorage.getStorageQueue().postRunnable(new np0(this, messagesStorage, z11, 10));
                    return;
                }
                ConnectionsManager.getInstance(i9).sendRequest(new TL_account.getBusinessChatLinks(), new t(this, 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.f45790b);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f45789a);
        messagesStorage.getStorageQueue().postRunnable(new kh.x0(1, arrayList, messagesStorage));
    }
}
