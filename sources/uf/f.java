package uf;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class f {
    public static volatile f[] f45360g = new f[4];
    public static final Object[] h = new Object[4];
    public final int f45361a;
    public long f45362b;
    public TL_account.connectedBots f45363c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f45364f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public f(int i10) {
        this.f45361a = i10;
    }

    public static f a(int i10) {
        f fVar;
        f fVar2 = f45360g[i10];
        if (fVar2 == null) {
            synchronized (h[i10]) {
                try {
                    fVar = f45360g[i10];
                    if (fVar == null) {
                        f[] fVarArr = f45360g;
                        f fVar3 = new f(i10);
                        fVarArr[i10] = fVar3;
                        fVar = fVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fVar;
        }
        return fVar2;
    }

    public final void b() {
        this.f45364f = false;
        c(null);
    }

    public final void c(Utilities.Callback callback) {
        boolean z4;
        if (callback != null) {
            this.d.add(callback);
        }
        if (!this.e) {
            if (System.currentTimeMillis() - this.f45362b <= 60000 && (z4 = this.f45364f)) {
                if (z4) {
                    d();
                    return;
                }
                return;
            }
            this.e = true;
            ConnectionsManager.getInstance(this.f45361a).sendRequest(new TL_account.getConnectedBots(), new ff.a(this, 23));
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) != null) {
                    ((Utilities.Callback) arrayList.get(i10)).run(this.f45363c);
                }
                i10++;
            } else {
                arrayList.clear();
                NotificationCenter.getInstance(this.f45361a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updatedChatbot, new Object[0]);
                return;
            }
        }
    }
}
