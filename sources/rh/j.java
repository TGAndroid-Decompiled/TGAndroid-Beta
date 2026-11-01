package rh;

import java.util.HashMap;
import org.telegram.messenger.at;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j implements RequestDelegate {
    public final int f47118a;
    public final r f47119b;
    public final long f47120c;

    public j(r rVar, long j10, int i10) {
        this.f47118a = i10;
        this.f47119b = rVar;
        this.f47120c = j10;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47118a) {
            case 0:
                final r rVar = this.f47119b;
                final long j10 = this.f47120c;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r5;
                        long j11 = j10;
                        TLObject tLObject2 = tLObject;
                        r rVar2 = rVar;
                        switch (i10) {
                            case 0:
                                HashMap hashMap = rVar2.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j11), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j11), null);
                                }
                                rVar2.d.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
                                at.f(rVar2.f47396a).k(225, Long.valueOf(j11));
                                return;
                            default:
                                HashMap hashMap2 = rVar2.f47398c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j11), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j11), null);
                                }
                                rVar2.f47397b.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
                                at.f(rVar2.f47396a).k(225, Long.valueOf(j11));
                                return;
                        }
                    }
                });
                return;
            default:
                final r rVar2 = this.f47119b;
                final long j11 = this.f47120c;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r5;
                        long j112 = j11;
                        TLObject tLObject2 = tLObject;
                        r rVar22 = rVar2;
                        switch (i10) {
                            case 0:
                                HashMap hashMap = rVar22.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j112), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j112), null);
                                }
                                rVar22.d.put(Long.valueOf(j112), Long.valueOf(System.currentTimeMillis()));
                                at.f(rVar22.f47396a).k(225, Long.valueOf(j112));
                                return;
                            default:
                                HashMap hashMap2 = rVar22.f47398c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j112), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j112), null);
                                }
                                rVar22.f47397b.put(Long.valueOf(j112), Long.valueOf(System.currentTimeMillis()));
                                at.f(rVar22.f47396a).k(225, Long.valueOf(j112));
                                return;
                        }
                    }
                });
                return;
        }
    }
}
