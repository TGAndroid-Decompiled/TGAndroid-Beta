package vf;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class f {
    public static volatile f[] f49076g = new f[4];
    public static final Object[] h = new Object[4];
    public final int f49077a;
    public long f49078b;
    public TL_account.connectedBots f49079c;
    public final ArrayList d = new ArrayList();
    public boolean f49080e;
    public boolean f49081f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public f(int i10) {
        this.f49077a = i10;
    }

    public static f a(int i10) {
        f fVar;
        f fVar2 = f49076g[i10];
        if (fVar2 == null) {
            synchronized (h[i10]) {
                try {
                    fVar = f49076g[i10];
                    if (fVar == null) {
                        f[] fVarArr = f49076g;
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
        this.f49081f = false;
        c(null);
    }

    public final void c(Utilities.Callback callback) {
        boolean z4;
        if (callback != null) {
            this.d.add(callback);
        }
        if (!this.f49080e) {
            if (System.currentTimeMillis() - this.f49078b <= 60000 && (z4 = this.f49081f)) {
                if (z4) {
                    d();
                    return;
                }
                return;
            }
            this.f49080e = true;
            ConnectionsManager.getInstance(this.f49077a).sendRequest(new TL_account.getConnectedBots(), new gf.a(this, 23));
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) != null) {
                    ((Utilities.Callback) arrayList.get(i10)).run(this.f49079c);
                }
                i10++;
            } else {
                arrayList.clear();
                NotificationCenter.getInstance(this.f49077a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updatedChatbot, new Object[0]);
                return;
            }
        }
    }
}
