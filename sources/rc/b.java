package rc;

import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Wallet.i1;
import org.telegram.ui.Wallet.j1;
public final class b extends z {
    public final int f56622b;

    public b(String str, u uVar, int i7, int i10) {
        super(str, uVar, i7);
        this.f56622b = i10;
    }

    @Override
    public final void a() {
        switch (this.f56622b) {
            case 0:
                u uVar = this.f56693a;
                try {
                    uVar.b();
                    return;
                } catch (v e10) {
                    ab.q qVar = uVar.d;
                    qVar.d(e10);
                    ArrayList arrayList = (ArrayList) qVar.q();
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        i1 i1Var = (i1) obj;
                        try {
                            try {
                                u uVar2 = (u) qVar.f988b;
                                j1 j1Var = i1Var.f44460c;
                                int i10 = i1Var.f44458a;
                                g0.g3(new kp0(j1Var, uVar2, i10, "connect error: " + j1.a(e10), 20));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            i1Var.getClass();
                        }
                    }
                    return;
                }
            default:
                this.f56693a.d();
                return;
        }
    }
}
