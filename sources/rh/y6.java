package rh;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.kj;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.un;
public final class y6 implements View.OnClickListener {
    public final int f47773a = 1;
    public final int f47774b;
    public final boolean f47775c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final long e;
    public final KeyEvent.Callback f47776f;
    public final Object h;
    public final Object f47777n;
    public final Context f47778r;
    public final Object f47779s;

    public y6(y8 y8Var, kj kjVar, un unVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.p6 p6Var, long j10, TLRPC.Chat chat) {
        this.f47776f = y8Var;
        this.h = kjVar;
        this.f47777n = unVar;
        this.f47774b = i10;
        this.f47775c = z10;
        this.f47778r = context;
        this.d = p6Var;
        this.e = j10;
        this.f47779s = chat;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        switch (this.f47773a) {
            case 0:
                vh.d dVar = (vh.d) this.f47776f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.z2[] z2VarArr = (org.telegram.ui.ActionBar.z2[]) this.f47777n;
                Activity activity = (Activity) this.f47778r;
                String str2 = (String) this.f47779s;
                if (!dVar.Q) {
                    int i11 = this.f47774b;
                    e6 y3 = e6.y(i11, false);
                    long j10 = this.e;
                    org.telegram.ui.Cells.e1 e1Var = new org.telegram.ui.Cells.e1(dVar, starsSubscription, i11, z2VarArr, j10, 3);
                    if (y3.f46866f.amount < starsSubscription.pricing.amount) {
                        long j11 = starsSubscription.pricing.amount;
                        if (this.f47775c) {
                            i10 = 8;
                        } else if (j10 < 0) {
                            i10 = 2;
                        } else {
                            i10 = 7;
                        }
                        new x7(activity, this.d, j11, i10, str2, e1Var, j10).show();
                        return;
                    }
                    e1Var.run();
                    return;
                }
                return;
            default:
                y8 y8Var = (y8) this.f47776f;
                kj kjVar = (kj) this.h;
                un unVar = (un) this.f47777n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f47779s;
                if (!y8Var.K1) {
                    long value = y8Var.f47786p1.getValue();
                    if ((y8Var.I1 != null || (kjVar != null && unVar != null)) && y8Var.O1 == null) {
                        int i12 = this.f47774b;
                        if (wp.r1(i12).u2()) {
                            org.telegram.ui.b.b(i12);
                            return;
                        }
                        e6 y10 = e6.y(i12, false);
                        org.telegram.messenger.voip.g gVar = new org.telegram.messenger.voip.g(y8Var, value, y10, kjVar, unVar, 17);
                        if (y10.e && y10.p().amount < value) {
                            boolean z10 = this.f47775c;
                            Context context = this.f47778r;
                            org.telegram.ui.ActionBar.p6 p6Var = this.d;
                            long j12 = this.e;
                            if (z10) {
                                new x7(context, p6Var, value, 17, org.telegram.messenger.o5.s(i12, j12), gVar, j12).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new x7(context, p6Var, value, 5, str, gVar, j12).show();
                            return;
                        }
                        gVar.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public y6(vh.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.z2[] z2VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, String str) {
        this.f47776f = dVar;
        this.f47774b = i10;
        this.h = starsSubscription;
        this.f47777n = z2VarArr;
        this.e = j10;
        this.f47778r = activity;
        this.d = p6Var;
        this.f47775c = z10;
        this.f47779s = str;
    }
}
