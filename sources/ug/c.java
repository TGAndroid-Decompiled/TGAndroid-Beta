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
import w7.m7;
public final class c implements Runnable {
    public final int f47652a = 0;
    public final boolean f47653b;
    public final Object f47654c;
    public final Object d;
    public final Object e;

    public c(xc xcVar, boolean z10, TLRPC.Chat chat, d6 d6Var) {
        this.f47654c = xcVar;
        this.f47653b = z10;
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
        switch (this.f47652a) {
            case 0:
                xc xcVar = (xc) this.f47654c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                d6 d6Var = (d6) this.e;
                int i14 = R.raw.star_premium_2;
                boolean z11 = this.f47653b;
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
                M.f29594j = 5000;
                M.j();
                return;
            default:
                si.s0 s0Var = (si.s0) this.f47654c;
                si.w wVar = (si.w) this.d;
                si.o0 o0Var = (si.o0) this.e;
                long nanoTime = System.nanoTime();
                try {
                    wVar.g();
                    long e = m7.e(wVar.f46833a) / 1000;
                    s0Var.f46766m.b("active output finalized: size=" + file.length() + ", durationMs=" + e + ", elapsedMs=" + si.s0.f(nanoTime));
                    s0Var.g();
                    long j11 = s0Var.f46768o;
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
                    boolean z12 = this.f47653b;
                    if (z12 && !z10) {
                        try {
                            s0Var.f46764k.execute(new si.g0(s0Var, o0Var, wVar.f46833a, e, true));
                            return;
                        } catch (Exception e7) {
                            e = e7;
                            s0Var = s0Var;
                            s0Var.f46762i.post(new si.e0(s0Var, e, 2));
                            return;
                        }
                    }
                    File file3 = wVar.f46833a;
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
        }
    }

    public c(si.s0 s0Var, si.w wVar, boolean z10, si.o0 o0Var) {
        this.f47654c = s0Var;
        this.d = wVar;
        this.f47653b = z10;
        this.e = o0Var;
    }
}
