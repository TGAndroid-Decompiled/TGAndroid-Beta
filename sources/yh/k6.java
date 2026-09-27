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
import org.telegram.ui.xn;
public final class k6 implements View.OnClickListener {
    public final int f47672a = 0;
    public final int f47673b;
    public final boolean f47674c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final long e;
    public final KeyEvent.Callback f47675f;
    public final Object h;
    public final Object f47676n;
    public final Context f47677r;
    public final Object f47678s;

    public k6(ci.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.g3[] g3VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, String str) {
        this.f47675f = dVar;
        this.f47673b = i10;
        this.h = starsSubscription;
        this.f47676n = g3VarArr;
        this.e = j3;
        this.f47677r = activity;
        this.d = e6Var;
        this.f47674c = z10;
        this.f47678s = str;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        switch (this.f47672a) {
            case 0:
                ci.d dVar = (ci.d) this.f47675f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) this.f47676n;
                Activity activity = (Activity) this.f47677r;
                String str2 = (String) this.f47678s;
                if (!dVar.N) {
                    int i11 = this.f47673b;
                    s5 y3 = s5.y(i11, false);
                    long j3 = this.e;
                    ai.m8 m8Var = new ai.m8(dVar, starsSubscription, i11, g3VarArr, j3, 13);
                    if (y3.f48059f.amount < starsSubscription.pricing.amount) {
                        long j10 = starsSubscription.pricing.amount;
                        if (this.f47674c) {
                            i10 = 8;
                        } else if (j3 < 0) {
                            i10 = 2;
                        } else {
                            i10 = 7;
                        }
                        new k7(activity, this.d, j10, i10, str2, m8Var, j3).show();
                        return;
                    }
                    m8Var.run();
                    return;
                }
                return;
            default:
                n8 n8Var = (n8) this.f47675f;
                MessageObject messageObject = (MessageObject) this.h;
                xn xnVar = (xn) this.f47676n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f47678s;
                if (!n8Var.R) {
                    long value = n8Var.f47840r.getValue();
                    if ((n8Var.P != null || (messageObject != null && xnVar != null)) && n8Var.V == null) {
                        int i12 = this.f47673b;
                        if (MessagesController.getInstance(i12).isFrozen()) {
                            org.telegram.ui.b.b(i12);
                            return;
                        }
                        s5 y10 = s5.y(i12, false);
                        org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(n8Var, value, y10, messageObject, xnVar, 15);
                        if (y10.e && y10.p().amount < value) {
                            boolean z10 = this.f47674c;
                            Context context = this.f47677r;
                            org.telegram.ui.ActionBar.e6 e6Var = this.d;
                            long j11 = this.e;
                            if (z10) {
                                new k7(context, e6Var, value, 17, DialogObject.getShortName(i12, j11), fVar, j11).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new k7(context, e6Var, value, 5, str, fVar, j11).show();
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

    public k6(n8 n8Var, MessageObject messageObject, xn xnVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, TLRPC.Chat chat) {
        this.f47675f = n8Var;
        this.h = messageObject;
        this.f47676n = xnVar;
        this.f47673b = i10;
        this.f47674c = z10;
        this.f47677r = context;
        this.d = e6Var;
        this.e = j3;
        this.f47678s = chat;
    }
}
