package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z1 implements RequestDelegate {
    public final int f53456a;
    public final s3 f53457b;

    public z1(s3 s3Var, int i10) {
        this.f53456a = i10;
        this.f53457b = s3Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f53456a) {
            case 0:
                final s3 s3Var = this.f53457b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                s3.b0(s3Var, tLObject, tL_error);
                                return;
                            default:
                                s3.A0(s3Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final s3 s3Var2 = this.f53457b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                s3.b0(s3Var2, tLObject, tL_error);
                                return;
                            default:
                                s3.A0(s3Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
