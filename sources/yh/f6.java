package yh;

import ai.n8;
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
public final class f6 implements View.OnClickListener {
    public final int f52520a = 0;
    public final int f52521b;
    public final boolean f52522c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final long f52523e;
    public final KeyEvent.Callback f52524f;
    public final Object h;
    public final Object f52525n;
    public final Context f52526r;
    public final Object f52527s;

    public f6(ci.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.f3[] f3VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, String str) {
        this.f52524f = dVar;
        this.f52521b = i10;
        this.h = starsSubscription;
        this.f52525n = f3VarArr;
        this.f52523e = j3;
        this.f52526r = activity;
        this.d = e6Var;
        this.f52522c = z10;
        this.f52527s = str;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        switch (this.f52520a) {
            case 0:
                ci.d dVar = (ci.d) this.f52524f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f52525n;
                Activity activity = (Activity) this.f52526r;
                String str2 = (String) this.f52527s;
                if (!dVar.N) {
                    int i11 = this.f52521b;
                    m5 y3 = m5.y(i11, false);
                    long j3 = this.f52523e;
                    n8 n8Var = new n8(dVar, starsSubscription, i11, f3VarArr, j3, 14);
                    if (y3.f52882f.amount < starsSubscription.pricing.amount) {
                        long j10 = starsSubscription.pricing.amount;
                        if (this.f52522c) {
                            i10 = 8;
                        } else if (j3 < 0) {
                            i10 = 2;
                        } else {
                            i10 = 7;
                        }
                        new e7(activity, this.d, j10, i10, str2, n8Var, j3).show();
                        return;
                    }
                    n8Var.run();
                    return;
                }
                return;
            default:
                h8 h8Var = (h8) this.f52524f;
                MessageObject messageObject = (MessageObject) this.h;
                zn znVar = (zn) this.f52525n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f52527s;
                if (!h8Var.S) {
                    long value = h8Var.f52651r.getValue();
                    if ((h8Var.Q != null || (messageObject != null && znVar != null)) && h8Var.W == null) {
                        int i12 = this.f52521b;
                        if (MessagesController.getInstance(i12).isFrozen()) {
                            org.telegram.ui.b.b(i12);
                            return;
                        }
                        m5 y10 = m5.y(i12, false);
                        org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(h8Var, value, y10, messageObject, znVar, 15);
                        if (y10.f52881e && y10.p().amount < value) {
                            boolean z10 = this.f52522c;
                            Context context = this.f52526r;
                            org.telegram.ui.ActionBar.e6 e6Var = this.d;
                            long j11 = this.f52523e;
                            if (z10) {
                                new e7(context, e6Var, value, 17, DialogObject.getShortName(i12, j11), fVar, j11).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new e7(context, e6Var, value, 5, str, fVar, j11).show();
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

    public f6(h8 h8Var, MessageObject messageObject, zn znVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, TLRPC.Chat chat) {
        this.f52524f = h8Var;
        this.h = messageObject;
        this.f52525n = znVar;
        this.f52521b = i10;
        this.f52522c = z10;
        this.f52526r = context;
        this.d = e6Var;
        this.f52523e = j3;
        this.f52527s = chat;
    }
}
