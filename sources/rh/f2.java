package rh;

import org.telegram.messenger.vp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wb;
public final class f2 implements RequestDelegate {
    public final int f46893a;
    public final e4 f46894b;

    public f2(e4 e4Var, int i10) {
        this.f46893a = i10;
        this.f46894b = e4Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f46893a) {
            case 0:
                final e4 e4Var = this.f46894b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                e4 e4Var2 = e4Var;
                                w0 w0Var = e4Var2.f46822m3;
                                e4Var2.f46816j3 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    vp.r1(e4Var2.f21583a).V3(paymentForm.users, false);
                                    e4Var2.f46818k3 = paymentForm;
                                    org.telegram.messenger.i0.r(w0Var);
                                    org.telegram.messenger.i0.g3(w0Var);
                                    return;
                                }
                                wb Y = e4Var2.k().Y(tL_error);
                                Y.f32145t = true;
                                Y.j();
                                return;
                            default:
                                e4 e4Var3 = e4Var;
                                e4Var3.f46816j3 = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    vp.r1(e4Var3.f21583a).V3(paymentForm2.users, false);
                                    e4Var3.f46818k3 = paymentForm2;
                                    e4Var3.a2();
                                    return;
                                }
                                wb Y2 = e4Var3.k().Y(tL_error);
                                Y2.f32145t = true;
                                Y2.j();
                                return;
                        }
                    }
                });
                return;
            default:
                final e4 e4Var2 = this.f46894b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                e4 e4Var22 = e4Var2;
                                w0 w0Var = e4Var22.f46822m3;
                                e4Var22.f46816j3 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    vp.r1(e4Var22.f21583a).V3(paymentForm.users, false);
                                    e4Var22.f46818k3 = paymentForm;
                                    org.telegram.messenger.i0.r(w0Var);
                                    org.telegram.messenger.i0.g3(w0Var);
                                    return;
                                }
                                wb Y = e4Var22.k().Y(tL_error);
                                Y.f32145t = true;
                                Y.j();
                                return;
                            default:
                                e4 e4Var3 = e4Var2;
                                e4Var3.f46816j3 = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    vp.r1(e4Var3.f21583a).V3(paymentForm2.users, false);
                                    e4Var3.f46818k3 = paymentForm2;
                                    e4Var3.a2();
                                    return;
                                }
                                wb Y2 = e4Var3.k().Y(tL_error);
                                Y2.f32145t = true;
                                Y2.j();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
