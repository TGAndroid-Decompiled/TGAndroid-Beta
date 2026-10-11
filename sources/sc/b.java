package sc;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.s21;
import org.telegram.ui.Wallet.a1;
import org.telegram.ui.Wallet.z0;
public final class b extends a0 {
    public final int f47982b;

    public b(String str, u uVar, int i10, int i11) {
        super(str, uVar, i10);
        this.f47982b = i11;
    }

    @Override
    public final void a() {
        switch (this.f47982b) {
            case 0:
                u uVar = this.f47981a;
                try {
                    uVar.b();
                    return;
                } catch (w e7) {
                    com.google.firebase.messaging.m mVar = uVar.d;
                    mVar.d(e7);
                    ArrayList arrayList = (ArrayList) mVar.n();
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        z0 z0Var = (z0) obj;
                        try {
                            try {
                                u uVar2 = (u) mVar.f7951b;
                                a1 a1Var = z0Var.f35767c;
                                int i11 = z0Var.f35765a;
                                AndroidUtilities.runOnUIThread(new s21(a1Var, uVar2, i11, "connect error: " + a1.a(e7), 14));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            z0Var.getClass();
                        }
                    }
                    return;
                }
            default:
                this.f47981a.d();
                return;
        }
    }
}
