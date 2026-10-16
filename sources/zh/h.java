package zh;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h implements RequestDelegate {
    public final int f50593a;
    public final p f50594b;
    public final long f50595c;

    public h(p pVar, long j10, int i10) {
        this.f50593a = i10;
        this.f50594b = pVar;
        this.f50595c = j10;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50593a) {
            case 0:
                final p pVar = this.f50594b;
                final long j10 = this.f50595c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r5;
                        long j11 = j10;
                        TLObject tLObject2 = tLObject;
                        p pVar2 = pVar;
                        switch (i10) {
                            case 0:
                                HashMap hashMap = pVar2.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j11), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j11), null);
                                }
                                pVar2.d.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(pVar2.f50959a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j11));
                                return;
                            default:
                                HashMap hashMap2 = pVar2.f50961c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j11), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j11), null);
                                }
                                pVar2.f50960b.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(pVar2.f50959a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j11));
                                return;
                        }
                    }
                });
                return;
            default:
                final p pVar2 = this.f50594b;
                final long j11 = this.f50595c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r5;
                        long j112 = j11;
                        TLObject tLObject2 = tLObject;
                        p pVar22 = pVar2;
                        switch (i10) {
                            case 0:
                                HashMap hashMap = pVar22.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j112), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j112), null);
                                }
                                pVar22.d.put(Long.valueOf(j112), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(pVar22.f50959a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j112));
                                return;
                            default:
                                HashMap hashMap2 = pVar22.f50961c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j112), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j112), null);
                                }
                                pVar22.f50960b.put(Long.valueOf(j112), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(pVar22.f50959a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j112));
                                return;
                        }
                    }
                });
                return;
        }
    }
}
