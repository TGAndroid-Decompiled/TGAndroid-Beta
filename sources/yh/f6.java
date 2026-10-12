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
import org.telegram.ui.eo;
public final class f6 implements View.OnClickListener {
    public final int f52749a = 0;
    public final int f52750b;
    public final boolean f52751c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final long f52752e;
    public final KeyEvent.Callback f52753f;
    public final Object h;
    public final Object f52754n;
    public final Context f52755r;
    public final Object f52756s;

    public f6(ci.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.e3[] e3VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, String str) {
        this.f52753f = dVar;
        this.f52750b = i10;
        this.h = starsSubscription;
        this.f52754n = e3VarArr;
        this.f52752e = j3;
        this.f52755r = activity;
        this.d = c6Var;
        this.f52751c = z10;
        this.f52756s = str;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        switch (this.f52749a) {
            case 0:
                ci.d dVar = (ci.d) this.f52753f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.f52754n;
                Activity activity = (Activity) this.f52755r;
                String str2 = (String) this.f52756s;
                if (!dVar.N) {
                    int i11 = this.f52750b;
                    n5 y3 = n5.y(i11, false);
                    long j3 = this.f52752e;
                    n8 n8Var = new n8(dVar, starsSubscription, i11, e3VarArr, j3, 14);
                    if (y3.f53138f.amount < starsSubscription.pricing.amount) {
                        long j10 = starsSubscription.pricing.amount;
                        if (this.f52751c) {
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
                h8 h8Var = (h8) this.f52753f;
                MessageObject messageObject = (MessageObject) this.h;
                eo eoVar = (eo) this.f52754n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f52756s;
                if (!h8Var.S) {
                    long value = h8Var.f52878r.getValue();
                    if ((h8Var.Q != null || (messageObject != null && eoVar != null)) && h8Var.W == null) {
                        int i12 = this.f52750b;
                        if (MessagesController.getInstance(i12).isFrozen()) {
                            org.telegram.ui.b.b(i12);
                            return;
                        }
                        n5 y10 = n5.y(i12, false);
                        org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(h8Var, value, y10, messageObject, eoVar, 15);
                        if (y10.f53137e && y10.p().amount < value) {
                            boolean z10 = this.f52751c;
                            Context context = this.f52755r;
                            org.telegram.ui.ActionBar.c6 c6Var = this.d;
                            long j11 = this.f52752e;
                            if (z10) {
                                new e7(context, c6Var, value, 17, DialogObject.getShortName(i12, j11), fVar, j11).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new e7(context, c6Var, value, 5, str, fVar, j11).show();
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

    public f6(h8 h8Var, MessageObject messageObject, eo eoVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j3, TLRPC.Chat chat) {
        this.f52753f = h8Var;
        this.h = messageObject;
        this.f52754n = eoVar;
        this.f52750b = i10;
        this.f52751c = z10;
        this.f52755r = context;
        this.d = c6Var;
        this.f52752e = j3;
        this.f52756s = chat;
    }
}
