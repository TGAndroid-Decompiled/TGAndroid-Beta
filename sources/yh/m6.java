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
import org.telegram.ui.zn;
public final class m6 implements View.OnClickListener {
    public final int f47759a = 0;
    public final int f47760b;
    public final boolean f47761c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final long e;
    public final KeyEvent.Callback f47762f;
    public final Object h;
    public final Object f47763n;
    public final Context f47764r;
    public final Object f47765s;

    public m6(ci.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.f3[] f3VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, String str) {
        this.f47762f = dVar;
        this.f47760b = i10;
        this.h = starsSubscription;
        this.f47763n = f3VarArr;
        this.e = j3;
        this.f47764r = activity;
        this.d = f6Var;
        this.f47761c = z10;
        this.f47765s = str;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        switch (this.f47759a) {
            case 0:
                ci.d dVar = (ci.d) this.f47762f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f47763n;
                Activity activity = (Activity) this.f47764r;
                String str2 = (String) this.f47765s;
                if (!dVar.N) {
                    int i11 = this.f47760b;
                    u5 y3 = u5.y(i11, false);
                    long j3 = this.e;
                    ai.l8 l8Var = new ai.l8(dVar, starsSubscription, i11, f3VarArr, j3, 12);
                    if (y3.f48114f.amount < starsSubscription.pricing.amount) {
                        long j10 = starsSubscription.pricing.amount;
                        if (this.f47761c) {
                            i10 = 8;
                        } else if (j3 < 0) {
                            i10 = 2;
                        } else {
                            i10 = 7;
                        }
                        new l7(activity, this.d, j10, i10, str2, l8Var, j3).show();
                        return;
                    }
                    l8Var.run();
                    return;
                }
                return;
            default:
                o8 o8Var = (o8) this.f47762f;
                MessageObject messageObject = (MessageObject) this.h;
                zn znVar = (zn) this.f47763n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f47765s;
                if (!o8Var.R) {
                    long value = o8Var.f47871r.getValue();
                    if ((o8Var.P != null || (messageObject != null && znVar != null)) && o8Var.V == null) {
                        int i12 = this.f47760b;
                        if (MessagesController.getInstance(i12).isFrozen()) {
                            org.telegram.ui.b.b(i12);
                            return;
                        }
                        u5 y10 = u5.y(i12, false);
                        org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(o8Var, value, y10, messageObject, znVar, 15);
                        if (y10.e && y10.p().amount < value) {
                            boolean z10 = this.f47761c;
                            Context context = this.f47764r;
                            org.telegram.ui.ActionBar.f6 f6Var = this.d;
                            long j11 = this.e;
                            if (z10) {
                                new l7(context, f6Var, value, 17, DialogObject.getShortName(i12, j11), fVar, j11).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new l7(context, f6Var, value, 5, str, fVar, j11).show();
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

    public m6(o8 o8Var, MessageObject messageObject, zn znVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, TLRPC.Chat chat) {
        this.f47762f = o8Var;
        this.h = messageObject;
        this.f47763n = znVar;
        this.f47760b = i10;
        this.f47761c = z10;
        this.f47764r = context;
        this.d = f6Var;
        this.e = j3;
        this.f47765s = chat;
    }
}
