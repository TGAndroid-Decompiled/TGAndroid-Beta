package xh;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i implements RequestDelegate {
    public final int f45521a;
    public final p f45522b;
    public final long f45523c;

    public i(p pVar, long j3, int i10) {
        this.f45521a = i10;
        this.f45522b = pVar;
        this.f45523c = j3;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45521a) {
            case 0:
                final p pVar = this.f45522b;
                final long j3 = this.f45523c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r5;
                        long j10 = j3;
                        TLObject tLObject2 = tLObject;
                        p pVar2 = pVar;
                        switch (i10) {
                            case 0:
                                HashMap hashMap = pVar2.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j10), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j10), null);
                                }
                                pVar2.d.put(Long.valueOf(j10), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(pVar2.f45843a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j10));
                                return;
                            default:
                                HashMap hashMap2 = pVar2.f45845c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j10), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j10), null);
                                }
                                pVar2.f45844b.put(Long.valueOf(j10), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(pVar2.f45843a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j10));
                                return;
                        }
                    }
                });
                return;
            default:
                final p pVar2 = this.f45522b;
                final long j10 = this.f45523c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r5;
                        long j102 = j10;
                        TLObject tLObject2 = tLObject;
                        p pVar22 = pVar2;
                        switch (i10) {
                            case 0:
                                HashMap hashMap = pVar22.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j102), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j102), null);
                                }
                                pVar22.d.put(Long.valueOf(j102), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(pVar22.f45843a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j102));
                                return;
                            default:
                                HashMap hashMap2 = pVar22.f45845c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j102), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j102), null);
                                }
                                pVar22.f45844b.put(Long.valueOf(j102), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(pVar22.f45843a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j102));
                                return;
                        }
                    }
                });
                return;
        }
    }
}
