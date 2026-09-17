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
public final class n6 implements View.OnClickListener {
    public final int f47527a = 0;
    public final int f47528b;
    public final boolean f47529c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final long e;
    public final KeyEvent.Callback f47530f;
    public final Object h;
    public final Object f47531n;
    public final Context f47532r;
    public final Object f47533s;

    public n6(ci.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.g3[] g3VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, String str) {
        this.f47530f = dVar;
        this.f47528b = i10;
        this.h = starsSubscription;
        this.f47531n = g3VarArr;
        this.e = j3;
        this.f47532r = activity;
        this.d = f6Var;
        this.f47529c = z10;
        this.f47533s = str;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        switch (this.f47527a) {
            case 0:
                ci.d dVar = (ci.d) this.f47530f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) this.f47531n;
                Activity activity = (Activity) this.f47532r;
                String str2 = (String) this.f47533s;
                if (!dVar.N) {
                    int i11 = this.f47528b;
                    v5 y3 = v5.y(i11, false);
                    long j3 = this.e;
                    ai.l8 l8Var = new ai.l8(dVar, starsSubscription, i11, g3VarArr, j3, 12);
                    if (y3.f47921f.amount < starsSubscription.pricing.amount) {
                        long j10 = starsSubscription.pricing.amount;
                        if (this.f47529c) {
                            i10 = 8;
                        } else if (j3 < 0) {
                            i10 = 2;
                        } else {
                            i10 = 7;
                        }
                        new n7(activity, this.d, j10, i10, str2, l8Var, j3).show();
                        return;
                    }
                    l8Var.run();
                    return;
                }
                return;
            default:
                q8 q8Var = (q8) this.f47530f;
                MessageObject messageObject = (MessageObject) this.h;
                bo boVar = (bo) this.f47531n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f47533s;
                if (!q8Var.R) {
                    long value = q8Var.f47704r.getValue();
                    if ((q8Var.P != null || (messageObject != null && boVar != null)) && q8Var.V == null) {
                        int i12 = this.f47528b;
                        if (MessagesController.getInstance(i12).isFrozen()) {
                            org.telegram.ui.b.b(i12);
                            return;
                        }
                        v5 y10 = v5.y(i12, false);
                        org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(q8Var, value, y10, messageObject, boVar, 15);
                        if (y10.e && y10.p().amount < value) {
                            boolean z10 = this.f47529c;
                            Context context = this.f47532r;
                            org.telegram.ui.ActionBar.f6 f6Var = this.d;
                            long j11 = this.e;
                            if (z10) {
                                new n7(context, f6Var, value, 17, DialogObject.getShortName(i12, j11), fVar, j11).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new n7(context, f6Var, value, 5, str, fVar, j11).show();
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

    public n6(q8 q8Var, MessageObject messageObject, bo boVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, TLRPC.Chat chat) {
        this.f47530f = q8Var;
        this.h = messageObject;
        this.f47531n = boVar;
        this.f47528b = i10;
        this.f47529c = z10;
        this.f47532r = context;
        this.d = f6Var;
        this.e = j3;
        this.f47533s = chat;
    }
}
