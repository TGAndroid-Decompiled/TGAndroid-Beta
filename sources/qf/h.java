package qf;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

public final class h {

    public static volatile h[] f46308g = new h[4];
    public static final Object[] h = new Object[4];

    public final int f46309a;

    public long f46310b;

    public TL_account.connectedBots f46311c;
    public final ArrayList d = new ArrayList();

    public boolean f46312e;

    public boolean f46313f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public h(int i10) {
        this.f46309a = i10;
    }

    public static h a(int i10) {
        h hVar;
        h hVar2 = f46308g[i10];
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (h[i10]) {
            try {
                hVar = f46308g[i10];
                if (hVar == null) {
                    h[] hVarArr = f46308g;
                    h hVar3 = new h(i10);
                    hVarArr[i10] = hVar3;
                    hVar = hVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public final void b() {
        this.f46313f = false;
        c(null);
    }

    public final void c(Utilities.Callback callback) {
        boolean z10;
        if (callback != null) {
            this.d.add(callback);
        }
        if (this.f46312e) {
            return;
        }
        if (System.currentTimeMillis() - this.f46310b > 60000 || !(z10 = this.f46313f)) {
            this.f46312e = true;
            ConnectionsManager.getInstance(this.f46309a).sendRequest(new TL_account.getConnectedBots(), new cf.a(this, 23));
        } else if (z10) {
            d();
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                NotificationCenter.getInstance(this.f46309a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updatedChatbot, new Object[0]);
                return;
            } else {
                if (arrayList.get(i10) != null) {
                    ((Utilities.Callback) arrayList.get(i10)).run(this.f46311c);
                }
                i10++;
            }
        }
    }
}
