package tc;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m21;
import org.telegram.ui.Wallet.x0;
import org.telegram.ui.Wallet.y0;
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
                        x0 x0Var = (x0) obj;
                        try {
                            try {
                                u uVar2 = (u) bVar.f4119b;
                                y0 y0Var = x0Var.f33829c;
                                int i11 = x0Var.f33827a;
                                AndroidUtilities.runOnUIThread(new m21(y0Var, uVar2, i11, "connect error: " + y0.a(e), 14));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            x0Var.getClass();
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
