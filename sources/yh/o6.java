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
public final class o6 implements View.OnClickListener {
    public final int f51767a = 0;
    public final int f51768b;
    public final boolean f51769c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final long f51770e;
    public final KeyEvent.Callback f51771f;
    public final Object h;
    public final Object f51772n;
    public final Context f51773r;
    public final Object f51774s;

    public o6(ci.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.f3[] f3VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str) {
        this.f51771f = dVar;
        this.f51768b = i10;
        this.h = starsSubscription;
        this.f51772n = f3VarArr;
        this.f51770e = j3;
        this.f51773r = activity;
        this.d = d6Var;
        this.f51769c = z10;
        this.f51774s = str;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        switch (this.f51767a) {
            case 0:
                ci.d dVar = (ci.d) this.f51771f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f51772n;
                Activity activity = (Activity) this.f51773r;
                String str2 = (String) this.f51774s;
                if (!dVar.N) {
                    int i11 = this.f51768b;
                    t5 y3 = t5.y(i11, false);
                    long j3 = this.f51770e;
                    ai.m8 m8Var = new ai.m8(dVar, starsSubscription, i11, f3VarArr, j3, 13);
                    if (y3.f52020f.amount < starsSubscription.pricing.amount) {
                        long j10 = starsSubscription.pricing.amount;
                        if (this.f51769c) {
                            i10 = 8;
                        } else if (j3 < 0) {
                            i10 = 2;
                        } else {
                            i10 = 7;
                        }
                        new m7(activity, this.d, j10, i10, str2, m8Var, j3).show();
                        return;
                    }
                    m8Var.run();
                    return;
                }
                return;
            default:
                p8 p8Var = (p8) this.f51771f;
                MessageObject messageObject = (MessageObject) this.h;
                yn ynVar = (yn) this.f51772n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f51774s;
                if (!p8Var.R) {
                    long value = p8Var.f51831r.getValue();
                    if ((p8Var.P != null || (messageObject != null && ynVar != null)) && p8Var.V == null) {
                        int i12 = this.f51768b;
                        if (MessagesController.getInstance(i12).isFrozen()) {
                            org.telegram.ui.b.b(i12);
                            return;
                        }
                        t5 y10 = t5.y(i12, false);
                        org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(p8Var, value, y10, messageObject, ynVar, 15);
                        if (y10.f52019e && y10.p().amount < value) {
                            boolean z10 = this.f51769c;
                            Context context = this.f51773r;
                            org.telegram.ui.ActionBar.d6 d6Var = this.d;
                            long j11 = this.f51770e;
                            if (z10) {
                                new m7(context, d6Var, value, 17, DialogObject.getShortName(i12, j11), fVar, j11).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new m7(context, d6Var, value, 5, str, fVar, j11).show();
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

    public o6(p8 p8Var, MessageObject messageObject, yn ynVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, TLRPC.Chat chat) {
        this.f51771f = p8Var;
        this.h = messageObject;
        this.f51772n = ynVar;
        this.f51768b = i10;
        this.f51769c = z10;
        this.f51773r = context;
        this.d = d6Var;
        this.f51770e = j3;
        this.f51774s = chat;
    }
}
