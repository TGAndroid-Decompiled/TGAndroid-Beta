package ug;

import ai.o3;
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
public final class c implements Runnable {
    public final int f47697a = 0;
    public final boolean f47698b;
    public final Object f47699c;
    public final Object d;
    public final Object e;

    public c(xc xcVar, boolean z10, TLRPC.Chat chat, d6 d6Var) {
        this.f47699c = xcVar;
        this.f47698b = z10;
        this.d = chat;
        this.e = d6Var;
    }

    @Override
    public final void run() {
        String string;
        int i10;
        String string2;
        int i11;
        File file;
        boolean z10;
        long j10;
        int i12;
        File file2;
        int i13;
        switch (this.f47697a) {
            case 0:
                xc xcVar = (xc) this.f47699c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                d6 d6Var = (d6) this.e;
                int i14 = R.raw.star_premium_2;
                boolean z11 = this.f47698b;
                if (z11) {
                    string = LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated);
                } else {
                    string = LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
                }
                if (z11) {
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i11 = R.string.BoostingCheckStatistic;
                    } else {
                        i11 = R.string.BoostingCheckStatisticGroup;
                    }
                    string2 = LocaleController.getString(i11);
                } else {
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i10 = R.string.BoostingCheckGiftsStatistic;
                    } else {
                        i10 = R.string.BoostingCheckGiftsStatisticGroup;
                    }
                    string2 = LocaleController.getString(i10);
                }
                qc M = xcVar.M(string, AndroidUtilities.replaceSingleTag(string2, h6.Gi, 0, new o3(chat), d6Var), i14);
                M.f29645j = 5000;
                M.j();
                return;
            default:
                si.s0 s0Var = (si.s0) this.f47699c;
                si.x xVar = (si.x) this.d;
                si.o0 o0Var = (si.o0) this.e;
                long nanoTime = System.nanoTime();
                try {
                    xVar.g();
                    long e = p7.e(xVar.f46880a) / 1000;
                    s0Var.f46813m.b("active output finalized: size=" + file.length() + ", durationMs=" + e + ", elapsedMs=" + si.s0.f(nanoTime));
                    s0Var.g();
                    long j11 = s0Var.f46815o;
                    if (e > j11) {
                        z10 = true;
                        j10 = j11;
                        i12 = 1;
                    } else {
                        z10 = false;
                        j10 = j11;
                        i12 = 1;
                    }
                    long j12 = j10;
                    boolean z12 = this.f47698b;
                    if (z12 && !z10) {
                        try {
                            s0Var.f46811k.execute(new si.g0(s0Var, o0Var, xVar.f46880a, e, true));
                            return;
                        } catch (Exception e7) {
                            e = e7;
                            s0Var = s0Var;
                            s0Var.f46809i.post(new si.e0(s0Var, e, 2));
                            return;
                        }
                    }
                    File file3 = xVar.f46880a;
                    try {
                        long min = Math.min(j12, e);
                        if (z10) {
                            i13 = i12;
                        } else {
                            i13 = 2;
                        }
                        file2 = file3;
                        try {
                            s0Var.s(file2, 0L, min, z12, i13);
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
        }
    }

    public c(si.s0 s0Var, si.x xVar, boolean z10, si.o0 o0Var) {
        this.f47699c = s0Var;
        this.d = xVar;
        this.f47698b = z10;
        this.e = o0Var;
    }
}
