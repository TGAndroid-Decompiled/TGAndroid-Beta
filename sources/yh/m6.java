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
import org.telegram.ui.bo;
public final class m6 implements View.OnClickListener {
    public final int f47412a = 0;
    public final int f47413b;
    public final boolean f47414c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final long e;
    public final KeyEvent.Callback f47415f;
    public final Object h;
    public final Object f47416n;
    public final Context f47417r;
    public final Object f47418s;

    public m6(ci.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.f3[] f3VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, String str) {
        this.f47415f = dVar;
        this.f47413b = i10;
        this.h = starsSubscription;
        this.f47416n = f3VarArr;
        this.e = j3;
        this.f47417r = activity;
        this.d = e6Var;
        this.f47414c = z10;
        this.f47418s = str;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        switch (this.f47412a) {
            case 0:
                ci.d dVar = (ci.d) this.f47415f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f47416n;
                Activity activity = (Activity) this.f47417r;
                String str2 = (String) this.f47418s;
                if (!dVar.N) {
                    int i11 = this.f47413b;
                    u5 y3 = u5.y(i11, false);
                    long j3 = this.e;
                    ai.l8 l8Var = new ai.l8(dVar, starsSubscription, i11, f3VarArr, j3, 12);
                    if (y3.f47804f.amount < starsSubscription.pricing.amount) {
                        long j10 = starsSubscription.pricing.amount;
                        if (this.f47414c) {
                            i10 = 8;
                        } else if (j3 < 0) {
                            i10 = 2;
                        } else {
                            i10 = 7;
                        }
                        new m7(activity, this.d, j10, i10, str2, l8Var, j3).show();
                        return;
                    }
                    l8Var.run();
                    return;
                }
                return;
            default:
                p8 p8Var = (p8) this.f47415f;
                MessageObject messageObject = (MessageObject) this.h;
                bo boVar = (bo) this.f47416n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f47418s;
                if (!p8Var.R) {
                    long value = p8Var.f47584r.getValue();
                    if ((p8Var.P != null || (messageObject != null && boVar != null)) && p8Var.V == null) {
                        int i12 = this.f47413b;
                        if (MessagesController.getInstance(i12).isFrozen()) {
                            org.telegram.ui.b.b(i12);
                            return;
                        }
                        u5 y10 = u5.y(i12, false);
                        org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(p8Var, value, y10, messageObject, boVar, 15);
                        if (y10.e && y10.p().amount < value) {
                            boolean z10 = this.f47414c;
                            Context context = this.f47417r;
                            org.telegram.ui.ActionBar.e6 e6Var = this.d;
                            long j11 = this.e;
                            if (z10) {
                                new m7(context, e6Var, value, 17, DialogObject.getShortName(i12, j11), fVar, j11).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new m7(context, e6Var, value, 5, str, fVar, j11).show();
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

    public m6(p8 p8Var, MessageObject messageObject, bo boVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, TLRPC.Chat chat) {
        this.f47415f = p8Var;
        this.h = messageObject;
        this.f47416n = boVar;
        this.f47413b = i10;
        this.f47414c = z10;
        this.f47417r = context;
        this.d = e6Var;
        this.e = j3;
        this.f47418s = chat;
    }
}
