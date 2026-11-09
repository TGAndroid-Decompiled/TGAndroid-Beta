package rc;

import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.Wallet.x0;
import org.telegram.ui.Wallet.y0;
public final class b extends z {
    public final int f54454b;

    public b(String str, u uVar, int i7, int i10) {
        super(str, uVar, i7);
        this.f54454b = i10;
    }

    @Override
    public final void a() {
        switch (this.f54454b) {
            case 0:
                u uVar = this.f54525a;
                try {
                    uVar.b();
                    return;
                } catch (v e10) {
                    ab.q qVar = uVar.d;
                    qVar.d(e10);
                    ArrayList arrayList = (ArrayList) qVar.p();
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        x0 x0Var = (x0) obj;
                        try {
                            try {
                                u uVar2 = (u) qVar.f990b;
                                y0 y0Var = x0Var.f43299c;
                                int i10 = x0Var.f43297a;
                                g0.h3(new qp0(y0Var, uVar2, i10, "connect error: " + y0.a(e10), 18));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            x0Var.getClass();
                        }
                    }
                    return;
                }
            default:
                this.f54525a.d();
                return;
        }
    }
}
