package yh;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.wn;
public final class l6 implements View.OnClickListener {
    public final int f47663a = 0;
    public final int f47664b;
    public final boolean f47665c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final long e;
    public final KeyEvent.Callback f47666f;
    public final Object h;
    public final Object f47667n;
    public final Context f47668r;
    public final Object f47669s;

    public l6(ci.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.e3[] e3VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str) {
        this.f47666f = dVar;
        this.f47664b = i10;
        this.h = starsSubscription;
        this.f47667n = e3VarArr;
        this.e = j3;
        this.f47668r = activity;
        this.d = d6Var;
        this.f47665c = z10;
        this.f47669s = str;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        switch (this.f47663a) {
            case 0:
                ci.d dVar = (ci.d) this.f47666f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.f47667n;
                Activity activity = (Activity) this.f47668r;
                String str2 = (String) this.f47669s;
                if (!dVar.N) {
                    int i11 = this.f47664b;
                    t5 y3 = t5.y(i11, false);
                    long j3 = this.e;
                    ai.m8 m8Var = new ai.m8(dVar, starsSubscription, i11, e3VarArr, j3, 13);
                    if (y3.f48044f.amount < starsSubscription.pricing.amount) {
                        long j10 = starsSubscription.pricing.amount;
                        if (this.f47665c) {
                            i10 = 8;
                        } else if (j3 < 0) {
                            i10 = 2;
                        } else {
                            i10 = 7;
                        }
                        new l7(activity, this.d, j10, i10, str2, m8Var, j3).show();
                        return;
                    }
                    m8Var.run();
                    return;
                }
                return;
            default:
                o8 o8Var = (o8) this.f47666f;
                MessageObject messageObject = (MessageObject) this.h;
                wn wnVar = (wn) this.f47667n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f47669s;
                if (!o8Var.R) {
                    long value = o8Var.f47851r.getValue();
                    if ((o8Var.P != null || (messageObject != null && wnVar != null)) && o8Var.V == null) {
                        int i12 = this.f47664b;
                        if (MessagesController.getInstance(i12).isFrozen()) {
                            org.telegram.ui.b.b(i12);
                            return;
                        }
                        t5 y10 = t5.y(i12, false);
                        org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(o8Var, value, y10, messageObject, wnVar, 15);
                        if (y10.e && y10.p().amount < value) {
                            boolean z10 = this.f47665c;
                            Context context = this.f47668r;
                            org.telegram.ui.ActionBar.d6 d6Var = this.d;
                            long j11 = this.e;
                            if (z10) {
                                new l7(context, d6Var, value, 17, DialogObject.getShortName(i12, j11), fVar, j11).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new l7(context, d6Var, value, 5, str, fVar, j11).show();
                            return;
                        }
                        fVar.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public l6(o8 o8Var, MessageObject messageObject, wn wnVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, TLRPC.Chat chat) {
        this.f47666f = o8Var;
        this.h = messageObject;
        this.f47667n = wnVar;
        this.f47664b = i10;
        this.f47665c = z10;
        this.f47668r = context;
        this.d = d6Var;
        this.e = j3;
        this.f47669s = chat;
    }
}
