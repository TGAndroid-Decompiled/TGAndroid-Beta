package tc;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.az0;
import org.telegram.ui.Wallet.a1;
import org.telegram.ui.Wallet.z0;
public final class b extends z {
    public final int f46931b;

    public b(String str, u uVar, int i10, int i11) {
        super(str, uVar, i10);
        this.f46931b = i11;
    }

    @Override
    public final void a() {
        switch (this.f46931b) {
            case 0:
                u uVar = this.f46992a;
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
                                u uVar2 = (u) bVar.f4494b;
                                a1 a1Var = z0Var.f35160c;
                                int i11 = z0Var.f35158a;
                                AndroidUtilities.runOnUIThread(new az0(a1Var, uVar2, i11, "connect error: " + a1.a(e), 15, false));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            z0Var.getClass();
                        }
                    }
                    return;
                }
            default:
                this.f46992a.d();
                return;
        }
    }
}
