package rc;

import java.util.ArrayList;
import org.telegram.ui.Wallet.i1;
public abstract class z extends Thread {
    public final u f56693a;

    public z(String str, u uVar, int i7) {
        super(str);
        this.f56693a = uVar;
    }

    public abstract void a();

    @Override
    public final void run() {
        ab.q qVar = this.f56693a.d;
        int i7 = 0;
        if (qVar != null) {
            ArrayList arrayList = (ArrayList) qVar.q();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                i1 i1Var = (i1) obj;
                try {
                    try {
                        i1Var.getClass();
                    } catch (Throwable unused) {
                        i1Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        a();
        if (qVar != null) {
            ArrayList arrayList2 = (ArrayList) qVar.q();
            int size2 = arrayList2.size();
            while (i7 < size2) {
                Object obj2 = arrayList2.get(i7);
                i7++;
                i1 i1Var2 = (i1) obj2;
                try {
                    try {
                        i1Var2.getClass();
                    } catch (Throwable unused3) {
                        i1Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
    }
}
