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
    public final int f50185a = 0;
    public final boolean f50186b;
    public final Object f50187c;
    public final Object d;
    public final Object e;

    public c(wc wcVar, boolean z10, TLRPC.Chat chat, u6 u6Var) {
        this.f50187c = wcVar;
        this.f50186b = z10;
        this.d = chat;
        this.e = u6Var;
    }

    @Override
    public final void run() {
        String string;
        int i10;
        String string2;
        int i11;
        boolean z10;
        File file;
        int i12;
        switch (this.f50185a) {
            case 0:
                wc wcVar = (wc) this.f50187c;
                boolean z11 = this.f50186b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                u6 u6Var = (u6) this.e;
                int i13 = R.raw.star_premium_2;
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
                qc M = wcVar.M(string, AndroidUtilities.replaceSingleTag(string2, y6.Gi, 0, new k3(chat), u6Var), i13);
                M.f31861j = 5000;
                M.j();
                return;
            default:
                vi.u0 u0Var = (vi.u0) this.f50187c;
                vi.w wVar = (vi.w) this.d;
                boolean z12 = this.f50186b;
                vi.q0 q0Var = (vi.q0) this.e;
                long j10 = u0Var.f50647q;
                long nanoTime = System.nanoTime();
                try {
                    wVar.g();
                    long h = wVar.h();
                    u0Var.f50643m.b("active output finalized: size=" + wVar.f50662a.length() + ", durationMs=" + h + ", elapsedMs=" + vi.u0.f(nanoTime));
                    u0Var.g();
                    int i14 = (h > j10 ? 1 : (h == j10 ? 0 : -1));
                    int i15 = 1;
                    if (i14 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z12 && !z10) {
                        try {
                            u0Var.f50641k.execute(new vi.g0(u0Var, q0Var, wVar.f50662a, h, true));
                            return;
                        } catch (Exception e) {
                            e = e;
                            u0Var = u0Var;
                            u0Var.f50639i.post(new vi.e0(u0Var, e, 2));
                            return;
                        }
                    }
                    File file2 = wVar.f50662a;
                    try {
                        synchronized (wVar) {
                            file = file2;
                            try {
                                i12 = wVar.f50677s;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        long min = Math.min(j10, h);
                        if (!z10) {
                            i15 = 2;
                        }
                        try {
                            u0Var.t(file, i12, 0L, min, z12, i15);
                            w7.x.c(file);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            file = file;
                            w7.x.c(file);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        file = file2;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
        }
    }

    public c(vi.u0 u0Var, vi.w wVar, boolean z10, vi.q0 q0Var) {
        this.f50187c = u0Var;
        this.d = wVar;
        this.f50186b = z10;
        this.e = q0Var;
    }
}
