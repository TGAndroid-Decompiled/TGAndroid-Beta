package tc;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n21;
import org.telegram.ui.Wallet.y0;
import org.telegram.ui.Wallet.z0;
public final class b extends z {
    public final int f45570b;

    public b(String str, u uVar, int i10, int i11) {
        super(str, uVar, i10);
        this.f45570b = i11;
    }

    @Override
    public final void a() {
        switch (this.f45570b) {
            case 0:
                u uVar = this.f45633a;
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
                        y0 y0Var = (y0) obj;
                        try {
                            try {
                                u uVar2 = (u) bVar.f4123b;
                                z0 z0Var = y0Var.f33601c;
                                int i11 = y0Var.f33599a;
                                AndroidUtilities.runOnUIThread(new n21(z0Var, uVar2, i11, "connect error: " + z0.a(e), 14));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            y0Var.getClass();
                        }
                    }
                    return;
                }
            default:
                this.f45633a.d();
                return;
        }
    }
}
