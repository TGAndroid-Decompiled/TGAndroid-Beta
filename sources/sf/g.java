package sf;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class g {
    public static volatile g[] f47805g = new g[4];
    public static final Object[] h = new Object[4];
    public final int f47806a;
    public long f47807b;
    public TL_account.connectedBots f47808c;
    public final ArrayList d = new ArrayList();
    public boolean f47809e;
    public boolean f47810f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public g(int i10) {
        this.f47806a = i10;
    }

    public static g a(int i10) {
        g gVar;
        g gVar2 = f47805g[i10];
        if (gVar2 == null) {
            synchronized (h[i10]) {
                try {
                    gVar = f47805g[i10];
                    if (gVar == null) {
                        g[] gVarArr = f47805g;
                        g gVar3 = new g(i10);
                        gVarArr[i10] = gVar3;
                        gVar = gVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return gVar;
        }
        return gVar2;
    }

    public final void b() {
        this.f47810f = false;
        c(null);
    }

    public final void c(Utilities.Callback callback) {
        boolean z10;
        if (callback != null) {
            this.d.add(callback);
        }
        if (!this.f47809e) {
            if (System.currentTimeMillis() - this.f47807b <= 60000 && (z10 = this.f47810f)) {
                if (z10) {
                    d();
                    return;
                }
                return;
            }
            this.f47809e = true;
            ConnectionsManager.getInstance(this.f47806a).sendRequest(new TL_account.getConnectedBots(), new ef.a(this, 23));
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) != null) {
                    ((Utilities.Callback) arrayList.get(i10)).run(this.f47808c);
                }
                i10++;
            } else {
                arrayList.clear();
                NotificationCenter.getInstance(this.f47806a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updatedChatbot, new Object[0]);
                return;
            }
        }
    }
}
