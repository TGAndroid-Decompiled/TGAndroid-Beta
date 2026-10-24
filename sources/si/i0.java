package si;

import ai.o3;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import w7.m7;
public final class i0 implements Runnable {
    public final int f47058a = 1;
    public final boolean f47059b;
    public final Object f47060c;
    public final Object d;
    public final Object e;

    public i0(vc vcVar, boolean z10, TLRPC.Chat chat, g6 g6Var) {
        this.f47060c = vcVar;
        this.f47059b = z10;
        this.d = chat;
        this.e = g6Var;
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
        switch (this.f47058a) {
            case 0:
                u0 u0Var = (u0) this.f47060c;
                w wVar = (w) this.d;
                q0 q0Var = (q0) this.e;
                long nanoTime = System.nanoTime();
                try {
                    wVar.g();
                    long e = m7.e(wVar.f47276a) / 1000;
                    u0Var.f47257m.b("active output finalized: size=" + file.length() + ", durationMs=" + e + ", elapsedMs=" + u0.f(nanoTime));
                    u0Var.g();
                    long j11 = u0Var.f47259o;
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
                    boolean z11 = this.f47059b;
                    if (z11 && !z10) {
                        try {
                            u0Var.f47255k.execute(new g0(u0Var, q0Var, wVar.f47276a, e, true));
                            return;
                        } catch (Exception e7) {
                            e = e7;
                            u0Var = u0Var;
                            u0Var.f47253i.post(new e0(u0Var, e, 2));
                            return;
                        }
                    }
                    File file3 = wVar.f47276a;
                    try {
                        long min = Math.min(j12, e);
                        if (z10) {
                            i11 = i10;
                        } else {
                            i11 = 2;
                        }
                        file2 = file3;
                        try {
                            u0Var.s(file2, 0L, min, z11, i11);
                            m7.c(file2);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            m7.c(file2);
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
                vc vcVar = (vc) this.f47060c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                g6 g6Var = (g6) this.e;
                int i14 = R.raw.star_premium_2;
                boolean z12 = this.f47059b;
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
                oc M = vcVar.M(string, AndroidUtilities.replaceSingleTag(string2, k6.Gi, 0, new o3(chat), g6Var), i14);
                M.f29203j = 5000;
                M.j();
                return;
        }
    }

    public i0(u0 u0Var, w wVar, boolean z10, q0 q0Var) {
        this.f47060c = u0Var;
        this.d = wVar;
        this.f47059b = z10;
        this.e = q0Var;
    }
}
