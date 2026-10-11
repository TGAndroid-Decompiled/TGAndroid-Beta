package sc;

import java.util.ArrayList;
import org.telegram.ui.Wallet.z0;
public abstract class a0 extends Thread {
    public final u f48015a;

    public a0(String str, u uVar, int i10) {
        super(str);
        this.f48015a = uVar;
    }

    public abstract void a();

    @Override
    public final void run() {
        com.google.firebase.messaging.m mVar = this.f48015a.d;
        int i10 = 0;
        if (mVar != null) {
            ArrayList arrayList = (ArrayList) mVar.n();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                z0 z0Var = (z0) obj;
                try {
                    try {
                        z0Var.getClass();
                    } catch (Throwable unused) {
                        z0Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        a();
        if (mVar != null) {
            ArrayList arrayList2 = (ArrayList) mVar.n();
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                z0 z0Var2 = (z0) obj2;
                try {
                    try {
                        z0Var2.getClass();
                    } catch (Throwable unused3) {
                        z0Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
    }
}
