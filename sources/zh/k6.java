package zh;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.co;
public final class k6 implements View.OnClickListener {
    public final int f52136a = 0;
    public final int f52137b;
    public final boolean f52138c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final long f52139e;
    public final KeyEvent.Callback f52140f;
    public final Object h;
    public final Object f52141n;
    public final Context f52142r;
    public final Object f52143s;

    public k6(di.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.f3[] f3VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, String str) {
        this.f52140f = dVar;
        this.f52137b = i10;
        this.h = starsSubscription;
        this.f52141n = f3VarArr;
        this.f52139e = j3;
        this.f52142r = activity;
        this.d = f6Var;
        this.f52138c = z10;
        this.f52143s = str;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        switch (this.f52136a) {
            case 0:
                di.d dVar = (di.d) this.f52140f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f52141n;
                Activity activity = (Activity) this.f52142r;
                String str2 = (String) this.f52143s;
                if (!dVar.N) {
                    int i11 = this.f52137b;
                    s5 y3 = s5.y(i11, false);
                    long j3 = this.f52139e;
                    bi.u7 u7Var = new bi.u7(dVar, starsSubscription, i11, f3VarArr, j3, 12);
                    if (y3.f52570f.amount < starsSubscription.pricing.amount) {
                        long j10 = starsSubscription.pricing.amount;
                        if (this.f52138c) {
                            i10 = 8;
                        } else if (j3 < 0) {
                            i10 = 2;
                        } else {
                            i10 = 7;
                        }
                        new k7(activity, this.d, j10, i10, str2, u7Var, j3).show();
                        return;
                    }
                    u7Var.run();
                    return;
                }
                return;
            default:
                n8 n8Var = (n8) this.f52140f;
                MessageObject messageObject = (MessageObject) this.h;
                co coVar = (co) this.f52141n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f52143s;
                if (!n8Var.R) {
                    long value = n8Var.f52341r.getValue();
                    if ((n8Var.P != null || (messageObject != null && coVar != null)) && n8Var.V == null) {
                        int i12 = this.f52137b;
                        if (MessagesController.getInstance(i12).isFrozen()) {
                            org.telegram.ui.b.b(i12);
                            return;
                        }
                        s5 y10 = s5.y(i12, false);
                        org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(n8Var, value, y10, messageObject, coVar, 15);
                        if (y10.f52569e && y10.p().amount < value) {
                            boolean z10 = this.f52138c;
                            Context context = this.f52142r;
                            org.telegram.ui.ActionBar.f6 f6Var = this.d;
                            long j11 = this.f52139e;
                            if (z10) {
                                new k7(context, f6Var, value, 17, DialogObject.getShortName(i12, j11), fVar, j11).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new k7(context, f6Var, value, 5, str, fVar, j11).show();
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

    public k6(n8 n8Var, MessageObject messageObject, co coVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, TLRPC.Chat chat) {
        this.f52140f = n8Var;
        this.h = messageObject;
        this.f52141n = coVar;
        this.f52137b = i10;
        this.f52138c = z10;
        this.f52142r = context;
        this.d = f6Var;
        this.f52139e = j3;
        this.f52143s = chat;
    }
}
