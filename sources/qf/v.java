package qf;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.mc;
import org.telegram.ui.ol0;
import org.telegram.ui.op0;

public final class v {

    public static volatile v[] f46463e = new v[4];

    public static final Object[] f46464f = new Object[4];

    public final int f46465a;

    public final ArrayList f46466b = new ArrayList();

    public boolean f46467c = false;
    public boolean d = false;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f46464f[i10] = new Object();
        }
    }

    public v(int i10) {
        this.f46465a = i10;
    }

    public static v d(int i10) {
        v vVar;
        v vVar2 = f46463e[i10];
        if (vVar2 != null) {
            return vVar2;
        }
        synchronized (f46464f[i10]) {
            try {
                vVar = f46463e[i10];
                if (vVar == null) {
                    v[] vVarArr = f46463e;
                    v vVar3 = new v(i10);
                    vVarArr[i10] = vVar3;
                    vVar = vVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    public final void a(s sVar, String str) {
        TL_account.TL_businessChatLink tL_businessChatLinkC = c(str);
        if (tL_businessChatLinkC != null) {
            ArrayList arrayList = this.f46466b;
            int iIndexOf = arrayList.indexOf(tL_businessChatLinkC);
            arrayList.remove(tL_businessChatLinkC);
            NotificationCenter.getInstance(this.f46465a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
            mc.a0(sVar).U(LocaleController.getString(R.string.BusinessLinkDeleted), true, new ol0(this, iIndexOf, tL_businessChatLinkC, 13), new a(this, str, tL_businessChatLinkC, 3)).j();
        }
    }

    public final void b(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, ed edVar) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.f46465a).sendRequest(editbusinesschatlink, new cg.y(this, tL_businessChatLink, edVar, 25));
    }

    public final TL_account.TL_businessChatLink c(String str) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f46466b;
            if (i10 >= arrayList.size()) {
                return null;
            }
            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList.get(i10);
            if (!TextUtils.equals(tL_businessChatLink.link, str)) {
                if (!TextUtils.equals(tL_businessChatLink.link, "https://" + str)) {
                    if (!TextUtils.equals(tL_businessChatLink.link, "https://t.me/m/" + str)) {
                        if (!TextUtils.equals(tL_businessChatLink.link, "tg://message?slug=" + str)) {
                            i10++;
                        }
                    }
                }
            }
            return tL_businessChatLink;
        }
    }

    public final void e(boolean z10, boolean z11) {
        if (this.f46467c) {
            return;
        }
        if (!this.d || (z11 && !z10)) {
            this.f46467c = true;
            int i10 = this.f46465a;
            if (z10) {
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new op0(this, messagesStorage, z11, 10));
            } else {
                ConnectionsManager.getInstance(i10).sendRequest(new TL_account.getBusinessChatLinks(), new u(this, 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.f46466b);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f46465a);
        messagesStorage.getStorageQueue().postRunnable(new lh.w0(1, arrayList, messagesStorage));
    }
}
