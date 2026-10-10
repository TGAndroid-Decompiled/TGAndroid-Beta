package sc;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r21;
import org.telegram.ui.Wallet.y0;
import org.telegram.ui.Wallet.z0;
public final class b extends a0 {
    public final int f47936b;

    public b(String str, u uVar, int i10, int i11) {
        super(str, uVar, i10);
        this.f47936b = i11;
    }

    @Override
    public final void a() {
        switch (this.f47936b) {
            case 0:
                u uVar = this.f47935a;
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
                        y0 y0Var = (y0) obj;
                        try {
                            try {
                                u uVar2 = (u) mVar.f7952b;
                                z0 z0Var = y0Var.f35737c;
                                int i11 = y0Var.f35735a;
                                AndroidUtilities.runOnUIThread(new r21(z0Var, uVar2, i11, "connect error: " + z0.a(e7), 14));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            y0Var.getClass();
                        }
                    }
                    return;
                }
            default:
                this.f47935a.d();
                return;
        }
    }
}
