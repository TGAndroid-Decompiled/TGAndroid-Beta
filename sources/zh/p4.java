package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sa0;
import org.telegram.ui.ya0;
public final class p4 implements RequestDelegate {
    public final long f48774a;
    public final sa0 f48775b;
    public final i5 f48776c;

    public p4(i5 i5Var, long j3, sa0 sa0Var) {
        this.f48776c = i5Var;
        this.f48774a = j3;
        this.f48775b = sa0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ya0(this, tLObject, this.f48774a, this.f48775b, 11));
    }
}
