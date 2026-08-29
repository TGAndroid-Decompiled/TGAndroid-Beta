package sf;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.tc;
import org.telegram.ui.ll0;
import org.telegram.ui.mp0;
public final class u {
    public static volatile u[] f47956e = new u[4];
    public static final Object[] f47957f = new Object[4];
    public final int f47958a;
    public final ArrayList f47959b = new ArrayList();
    public boolean f47960c = false;
    public boolean d = false;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f47957f[i10] = new Object();
        }
    }

    public u(int i10) {
        this.f47958a = i10;
    }

    public static u d(int i10) {
        u uVar;
        u uVar2 = f47956e[i10];
        if (uVar2 == null) {
            synchronized (f47957f[i10]) {
                try {
                    uVar = f47956e[i10];
                    if (uVar == null) {
                        u[] uVarArr = f47956e;
                        u uVar3 = new u(i10);
                        uVarArr[i10] = uVar3;
                        uVar = uVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return uVar;
        }
        return uVar2;
    }

    public final void a(r rVar, String str) {
        TL_account.TL_businessChatLink c3 = c(str);
        if (c3 != null) {
            ArrayList arrayList = this.f47959b;
            int indexOf = arrayList.indexOf(c3);
            arrayList.remove(c3);
            NotificationCenter.getInstance(this.f47958a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
            tc.a0(rVar).U(LocaleController.getString(R.string.BusinessLinkDeleted), true, new ll0(this, indexOf, c3, 15), new a(this, str, c3, 3)).j();
        }
    }

    public final void b(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, ld ldVar) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.f47958a).sendRequest(editbusinesschatlink, new eg.z(this, tL_businessChatLink, ldVar, 25));
    }

    public final TL_account.TL_businessChatLink c(String str) {
        TL_account.TL_businessChatLink tL_businessChatLink;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47959b;
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

    public final void e(boolean z10, boolean z11) {
        if (!this.f47960c) {
            if (!this.d || (z11 && !z10)) {
                this.f47960c = true;
                int i10 = this.f47958a;
                if (z10) {
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                    messagesStorage.getStorageQueue().postRunnable(new mp0(this, messagesStorage, z11, 10));
                    return;
                }
                ConnectionsManager.getInstance(i10).sendRequest(new TL_account.getBusinessChatLinks(), new t(this, 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.f47959b);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f47958a);
        messagesStorage.getStorageQueue().postRunnable(new nh.w0(1, arrayList, messagesStorage));
    }
}
