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
import org.telegram.ui.yn;
public final class p6 implements View.OnClickListener {
    public final int f51819a = 0;
    public final int f51820b;
    public final boolean f51821c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final long f51822e;
    public final KeyEvent.Callback f51823f;
    public final Object h;
    public final Object f51824n;
    public final Context f51825r;
    public final Object f51826s;

    public p6(ci.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.f3[] f3VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str) {
        this.f51823f = dVar;
        this.f51820b = i10;
        this.h = starsSubscription;
        this.f51824n = f3VarArr;
        this.f51822e = j3;
        this.f51825r = activity;
        this.d = d6Var;
        this.f51821c = z10;
        this.f51826s = str;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        switch (this.f51819a) {
            case 0:
                ci.d dVar = (ci.d) this.f51823f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f51824n;
                Activity activity = (Activity) this.f51825r;
                String str2 = (String) this.f51826s;
                if (!dVar.N) {
                    int i11 = this.f51820b;
                    u5 y3 = u5.y(i11, false);
                    long j3 = this.f51822e;
                    ai.m8 m8Var = new ai.m8(dVar, starsSubscription, i11, f3VarArr, j3, 13);
                    if (y3.f52089f.amount < starsSubscription.pricing.amount) {
                        long j10 = starsSubscription.pricing.amount;
                        if (this.f51821c) {
                            i10 = 8;
                        } else if (j3 < 0) {
                            i10 = 2;
                        } else {
                            i10 = 7;
                        }
                        new n7(activity, this.d, j10, i10, str2, m8Var, j3).show();
                        return;
                    }
                    m8Var.run();
                    return;
                }
                return;
            default:
                r8 r8Var = (r8) this.f51823f;
                MessageObject messageObject = (MessageObject) this.h;
                yn ynVar = (yn) this.f51824n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f51826s;
                if (!r8Var.R) {
                    long value = r8Var.f51943r.getValue();
                    if ((r8Var.P != null || (messageObject != null && ynVar != null)) && r8Var.V == null) {
                        int i12 = this.f51820b;
                        if (MessagesController.getInstance(i12).isFrozen()) {
                            org.telegram.ui.b.b(i12);
                            return;
                        }
                        u5 y10 = u5.y(i12, false);
                        org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(r8Var, value, y10, messageObject, ynVar, 15);
                        if (y10.f52088e && y10.p().amount < value) {
                            boolean z10 = this.f51821c;
                            Context context = this.f51825r;
                            org.telegram.ui.ActionBar.d6 d6Var = this.d;
                            long j11 = this.f51822e;
                            if (z10) {
                                new n7(context, d6Var, value, 17, DialogObject.getShortName(i12, j11), fVar, j11).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new n7(context, d6Var, value, 5, str, fVar, j11).show();
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

    public p6(r8 r8Var, MessageObject messageObject, yn ynVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, TLRPC.Chat chat) {
        this.f51823f = r8Var;
        this.h = messageObject;
        this.f51824n = ynVar;
        this.f51820b = i10;
        this.f51821c = z10;
        this.f51825r = context;
        this.d = d6Var;
        this.f51822e = j3;
        this.f51826s = chat;
    }
}
