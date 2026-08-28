package pf;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class g {
    public static volatile g[] f45630g = new g[4];
    public static final Object[] h = new Object[4];
    public final int f45631a;
    public long f45632b;
    public TL_account.connectedBots f45633c;
    public final ArrayList d = new ArrayList();
    public boolean f45634e;
    public boolean f45635f;

    static {
        for (int i9 = 0; i9 < 4; i9++) {
            h[i9] = new Object();
        }
    }

    public g(int i9) {
        this.f45631a = i9;
    }

    public static g a(int i9) {
        g gVar;
        g gVar2 = f45630g[i9];
        if (gVar2 == null) {
            synchronized (h[i9]) {
                try {
                    gVar = f45630g[i9];
                    if (gVar == null) {
                        g[] gVarArr = f45630g;
                        g gVar3 = new g(i9);
                        gVarArr[i9] = gVar3;
                        gVar = gVar3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return gVar;
        }
        return gVar2;
    }

    public final void b() {
        this.f45635f = false;
        c(null);
    }

    public final void c(Utilities.Callback callback) {
        boolean z10;
        if (callback != null) {
            this.d.add(callback);
        }
        if (!this.f45634e) {
            if (System.currentTimeMillis() - this.f45632b <= 60000 && (z10 = this.f45635f)) {
                if (z10) {
                    d();
                    return;
                }
                return;
            }
            this.f45634e = true;
            ConnectionsManager.getInstance(this.f45631a).sendRequest(new TL_account.getConnectedBots(), new bf.a(this, 23));
        }
    }

    public final void d() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i9 < arrayList.size()) {
                if (arrayList.get(i9) != null) {
                    ((Utilities.Callback) arrayList.get(i9)).run(this.f45633c);
                }
                i9++;
            } else {
                arrayList.clear();
                NotificationCenter.getInstance(this.f45631a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updatedChatbot, new Object[0]);
                return;
            }
        }
    }
}
