package vg;

import bi.k3;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
public final class c implements Runnable {
    public final int f50147a = 0;
    public final boolean f50148b;
    public final Object f50149c;
    public final Object d;
    public final Object e;

    public c(wc wcVar, boolean z10, TLRPC.Chat chat, u6 u6Var) {
        this.f50149c = wcVar;
        this.f50148b = z10;
        this.d = chat;
        this.e = u6Var;
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
        switch (this.f50147a) {
            case 0:
                wc wcVar = (wc) this.f50149c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                u6 u6Var = (u6) this.e;
                int i14 = R.raw.star_premium_2;
                boolean z11 = this.f50148b;
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
                qc M = wcVar.M(string, AndroidUtilities.replaceSingleTag(string2, y6.Gi, 0, new k3(chat), u6Var), i14);
                M.f31887j = 5000;
                M.j();
                return;
            default:
                vi.s0 s0Var = (vi.s0) this.f50149c;
                vi.v vVar = (vi.v) this.d;
                vi.o0 o0Var = (vi.o0) this.e;
                long nanoTime = System.nanoTime();
                try {
                    vVar.g();
                    long e = w7.x.e(vVar.f50611a) / 1000;
                    s0Var.f50589m.b("active output finalized: size=" + file.length() + ", durationMs=" + e + ", elapsedMs=" + vi.s0.f(nanoTime));
                    s0Var.g();
                    long j11 = s0Var.f50591o;
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
                    boolean z12 = this.f50148b;
                    if (z12 && !z10) {
                        try {
                            s0Var.f50587k.execute(new vi.f0(s0Var, o0Var, vVar.f50611a, e, true));
                            return;
                        } catch (Exception e10) {
                            e = e10;
                            s0Var = s0Var;
                            s0Var.f50585i.post(new vi.d0(s0Var, e, 2));
                            return;
                        }
                    }
                    File file3 = vVar.f50611a;
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
                            w7.x.c(file2);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            w7.x.c(file2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        file2 = file3;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
        }
    }

    public c(vi.s0 s0Var, vi.v vVar, boolean z10, vi.o0 o0Var) {
        this.f50149c = s0Var;
        this.d = vVar;
        this.f50148b = z10;
        this.e = o0Var;
    }
}
