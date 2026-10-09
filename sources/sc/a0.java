package sc;

import java.util.ArrayList;
import org.telegram.ui.Wallet.y0;
public abstract class a0 extends Thread {
    public final u f47891a;

    public a0(String str, u uVar, int i10) {
        super(str);
        this.f47891a = uVar;
    }

    public abstract void a();

    @Override
    public final void run() {
        com.google.firebase.messaging.m mVar = this.f47891a.d;
        int i10 = 0;
        if (mVar != null) {
            ArrayList arrayList = (ArrayList) mVar.n();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                y0 y0Var = (y0) obj;
                try {
                    try {
                        y0Var.getClass();
                    } catch (Throwable unused) {
                        y0Var.getClass();
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
                y0 y0Var2 = (y0) obj2;
                try {
                    try {
                        y0Var2.getClass();
                    } catch (Throwable unused3) {
                        y0Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
    }
}
