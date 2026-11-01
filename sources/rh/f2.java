package rh;

import org.telegram.messenger.wp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wb;
public final class f2 implements RequestDelegate {
    public final int f46907a;
    public final e4 f46908b;

    public f2(e4 e4Var, int i10) {
        this.f46907a = i10;
        this.f46908b = e4Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f46907a) {
            case 0:
                final e4 e4Var = this.f46908b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                e4 e4Var2 = e4Var;
                                w0 w0Var = e4Var2.f46836m3;
                                e4Var2.f46830j3 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    wp.r1(e4Var2.f21584a).V3(paymentForm.users, false);
                                    e4Var2.f46832k3 = paymentForm;
                                    org.telegram.messenger.i0.r(w0Var);
                                    org.telegram.messenger.i0.g3(w0Var);
                                    return;
                                }
                                wb Y = e4Var2.k().Y(tL_error);
                                Y.f32211t = true;
                                Y.j();
                                return;
                            default:
                                e4 e4Var3 = e4Var;
                                e4Var3.f46830j3 = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    wp.r1(e4Var3.f21584a).V3(paymentForm2.users, false);
                                    e4Var3.f46832k3 = paymentForm2;
                                    e4Var3.a2();
                                    return;
                                }
                                wb Y2 = e4Var3.k().Y(tL_error);
                                Y2.f32211t = true;
                                Y2.j();
                                return;
                        }
                    }
                });
                return;
            default:
                final e4 e4Var2 = this.f46908b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                e4 e4Var22 = e4Var2;
                                w0 w0Var = e4Var22.f46836m3;
                                e4Var22.f46830j3 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    wp.r1(e4Var22.f21584a).V3(paymentForm.users, false);
                                    e4Var22.f46832k3 = paymentForm;
                                    org.telegram.messenger.i0.r(w0Var);
                                    org.telegram.messenger.i0.g3(w0Var);
                                    return;
                                }
                                wb Y = e4Var22.k().Y(tL_error);
                                Y.f32211t = true;
                                Y.j();
                                return;
                            default:
                                e4 e4Var3 = e4Var2;
                                e4Var3.f46830j3 = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    wp.r1(e4Var3.f21584a).V3(paymentForm2.users, false);
                                    e4Var3.f46832k3 = paymentForm2;
                                    e4Var3.a2();
                                    return;
                                }
                                wb Y2 = e4Var3.k().Y(tL_error);
                                Y2.f32211t = true;
                                Y2.j();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
