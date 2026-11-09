package rc;

import java.util.ArrayList;
import org.telegram.ui.Wallet.x0;
public abstract class z extends Thread {
    public final u f54525a;

    public z(String str, u uVar, int i7) {
        super(str);
        this.f54525a = uVar;
    }

    public abstract void a();

    @Override
    public final void run() {
        ab.q qVar = this.f54525a.d;
        int i7 = 0;
        if (qVar != null) {
            ArrayList arrayList = (ArrayList) qVar.p();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                x0 x0Var = (x0) obj;
                try {
                    try {
                        x0Var.getClass();
                    } catch (Throwable unused) {
                        x0Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        a();
        if (qVar != null) {
            ArrayList arrayList2 = (ArrayList) qVar.p();
            int size2 = arrayList2.size();
            while (i7 < size2) {
                Object obj2 = arrayList2.get(i7);
                i7++;
                x0 x0Var2 = (x0) obj2;
                try {
                    try {
                        x0Var2.getClass();
                    } catch (Throwable unused3) {
                        x0Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
    }
}
