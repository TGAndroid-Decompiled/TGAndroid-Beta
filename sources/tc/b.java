package tc;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Wallet.a1;
import org.telegram.ui.Wallet.z0;
public final class b extends z {
    public final int f46941b;

    public b(String str, u uVar, int i10, int i11) {
        super(str, uVar, i10);
        this.f46941b = i11;
    }

    @Override
    public final void a() {
        switch (this.f46941b) {
            case 0:
                u uVar = this.f47002a;
                try {
                    uVar.b();
                    return;
                } catch (v e) {
                    c2.b bVar = uVar.d;
                    bVar.d(e);
                    ArrayList arrayList = (ArrayList) bVar.n();
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        z0 z0Var = (z0) obj;
                        try {
                            try {
                                u uVar2 = (u) bVar.f4490b;
                                a1 a1Var = z0Var.f35168c;
                                int i11 = z0Var.f35166a;
                                AndroidUtilities.runOnUIThread(new cz0(a1Var, uVar2, i11, "connect error: " + a1.a(e), 15, false));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            z0Var.getClass();
                        }
                    }
                    return;
                }
            default:
                this.f47002a.d();
                return;
        }
    }
}
