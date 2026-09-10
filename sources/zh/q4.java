package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ya0;
public final class q4 implements RequestDelegate {
    public final long f48816a;
    public final e2.h f48817b;
    public final i5 f48818c;

    public q4(i5 i5Var, long j3, e2.h hVar) {
        this.f48818c = i5Var;
        this.f48816a = j3;
        this.f48817b = hVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ya0(this, tLObject, this.f48816a, this.f48817b, 12));
    }
}
