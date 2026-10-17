package si;

import ai.n3;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import w7.p7;
public final class i0 implements Runnable {
    public final int f46636a = 1;
    public final boolean f46637b;
    public final Object f46638c;
    public final Object d;
    public final Object e;

    public i0(xc xcVar, boolean z10, TLRPC.Chat chat, d6 d6Var) {
        this.f46638c = xcVar;
        this.f46637b = z10;
        this.d = chat;
        this.e = d6Var;
    }

    @Override
    public final void run() {
        File file;
        boolean z10;
        long j10;
        int i10;
        File file2;
        int i11;
        String string;
        int i12;
        String string2;
        int i13;
        switch (this.f46636a) {
            case 0:
                t0 t0Var = (t0) this.f46638c;
                x xVar = (x) this.d;
                p0 p0Var = (p0) this.e;
                long nanoTime = System.nanoTime();
                try {
                    xVar.g();
                    long e = p7.e(xVar.f46862a) / 1000;
                    t0Var.f46795m.b("active output finalized: size=" + file.length() + ", durationMs=" + e + ", elapsedMs=" + t0.f(nanoTime));
                    t0Var.g();
                    long j11 = t0Var.f46797o;
                    if (e > j11) {
                        z10 = true;
                        j10 = j11;
                        i10 = 1;
                    } else {
                        z10 = false;
                        j10 = j11;
                        i10 = 1;
                    }
                    long j12 = j10;
                    boolean z11 = this.f46637b;
                    if (z11 && !z10) {
                        try {
                            t0Var.f46793k.execute(new g0(t0Var, p0Var, xVar.f46862a, e, true));
                            return;
                        } catch (Exception e7) {
                            e = e7;
                            t0Var = t0Var;
                            t0Var.f46791i.post(new e0(t0Var, e, 2));
                            return;
                        }
                    }
                    File file3 = xVar.f46862a;
                    try {
                        long min = Math.min(j12, e);
                        if (z10) {
                            i11 = i10;
                        } else {
                            i11 = 2;
                        }
                        file2 = file3;
                        try {
                            t0Var.s(file2, 0L, min, z11, i11);
                            p7.c(file2);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            p7.c(file2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        file2 = file3;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
            default:
                xc xcVar = (xc) this.f46638c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                d6 d6Var = (d6) this.e;
                int i14 = R.raw.star_premium_2;
                boolean z12 = this.f46637b;
                if (z12) {
                    string = LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated);
                } else {
                    string = LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
                }
                if (z12) {
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i13 = R.string.BoostingCheckStatistic;
                    } else {
                        i13 = R.string.BoostingCheckStatisticGroup;
                    }
                    string2 = LocaleController.getString(i13);
                } else {
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.BoostingCheckGiftsStatistic;
                    } else {
                        i12 = R.string.BoostingCheckGiftsStatisticGroup;
                    }
                    string2 = LocaleController.getString(i12);
                }
                qc M = xcVar.M(string, AndroidUtilities.replaceSingleTag(string2, h6.Gi, 0, new n3(chat), d6Var), i14);
                M.f29639j = 5000;
                M.j();
                return;
        }
    }

    public i0(t0 t0Var, x xVar, boolean z10, p0 p0Var) {
        this.f46638c = t0Var;
        this.d = xVar;
        this.f46637b = z10;
        this.e = p0Var;
    }
}
