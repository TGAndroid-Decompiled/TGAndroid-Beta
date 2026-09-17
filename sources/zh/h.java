package zh;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h implements RequestDelegate {
    public final int f52001a;
    public final o f52002b;
    public final long f52003c;

    public h(o oVar, long j3, int i10) {
        this.f52001a = i10;
        this.f52002b = oVar;
        this.f52003c = j3;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52001a) {
            case 0:
                final o oVar = this.f52002b;
                final long j3 = this.f52003c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r5;
                        long j10 = j3;
                        TLObject tLObject2 = tLObject;
                        o oVar2 = oVar;
                        switch (i10) {
                            case 0:
                                HashMap hashMap = oVar2.f52383e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j10), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j10), null);
                                }
                                oVar2.d.put(Long.valueOf(j10), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(oVar2.f52380a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j10));
                                return;
                            default:
                                HashMap hashMap2 = oVar2.f52382c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j10), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j10), null);
                                }
                                oVar2.f52381b.put(Long.valueOf(j10), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(oVar2.f52380a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j10));
                                return;
                        }
                    }
                });
                return;
            default:
                final o oVar2 = this.f52002b;
                final long j10 = this.f52003c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r5;
                        long j102 = j10;
                        TLObject tLObject2 = tLObject;
                        o oVar22 = oVar2;
                        switch (i10) {
                            case 0:
                                HashMap hashMap = oVar22.f52383e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j102), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j102), null);
                                }
                                oVar22.d.put(Long.valueOf(j102), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(oVar22.f52380a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j102));
                                return;
                            default:
                                HashMap hashMap2 = oVar22.f52382c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j102), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j102), null);
                                }
                                oVar22.f52381b.put(Long.valueOf(j102), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(oVar22.f52380a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j102));
                                return;
                        }
                    }
                });
                return;
        }
    }
}
