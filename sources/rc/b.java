package rc;

import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Wallet.h1;
import org.telegram.ui.Wallet.i1;
public final class b extends z {
    public final int f56544b;

    public b(String str, u uVar, int i7, int i10) {
        super(str, uVar, i7);
        this.f56544b = i10;
    }

    @Override
    public final void a() {
        switch (this.f56544b) {
            case 0:
                u uVar = this.f56615a;
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
                        h1 h1Var = (h1) obj;
                        try {
                            try {
                                u uVar2 = (u) qVar.f988b;
                                i1 i1Var = h1Var.f44332c;
                                int i10 = h1Var.f44330a;
                                g0.g3(new lp0(i1Var, uVar2, i10, "connect error: " + i1.a(e10), 20));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            h1Var.getClass();
                        }
                    }
                    return;
                }
            default:
                this.f56615a.d();
                return;
        }
    }
}
