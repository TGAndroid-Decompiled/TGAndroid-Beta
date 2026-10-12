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
import org.telegram.ui.fo;
public final class f6 implements View.OnClickListener {
    public final int f50515a = 0;
    public final int f50516b;
    public final boolean f50517c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final long e;
    public final KeyEvent.Callback f50518f;
    public final Object h;
    public final Object f50519n;
    public final Context f50520r;
    public final Object f50521s;

    public f6(di.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.e3[] e3VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, String str) {
        this.f50518f = dVar;
        this.f50516b = i10;
        this.h = starsSubscription;
        this.f50519n = e3VarArr;
        this.e = j10;
        this.f50520r = activity;
        this.d = c6Var;
        this.f50517c = z10;
        this.f50521s = str;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        switch (this.f50515a) {
            case 0:
                di.d dVar = (di.d) this.f50518f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.f50519n;
                Activity activity = (Activity) this.f50520r;
                String str2 = (String) this.f50521s;
                if (!dVar.N) {
                    int i11 = this.f50516b;
                    n5 y3 = n5.y(i11, false);
                    long j10 = this.e;
                    bi.y7 y7Var = new bi.y7(dVar, starsSubscription, i11, e3VarArr, j10, 14);
                    if (y3.f50867f.amount < starsSubscription.pricing.amount) {
                        long j11 = starsSubscription.pricing.amount;
                        if (this.f50517c) {
                            i10 = 8;
                        } else if (j10 < 0) {
                            i10 = 2;
                        } else {
                            i10 = 7;
                        }
                        new e7(activity, this.d, j11, i10, str2, y7Var, j10).show();
                        return;
                    }
                    y7Var.run();
                    return;
                }
                return;
            default:
                h8 h8Var = (h8) this.f50518f;
                MessageObject messageObject = (MessageObject) this.h;
                fo foVar = (fo) this.f50519n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f50521s;
                if (!h8Var.S) {
                    long value = h8Var.f50644r.getValue();
                    if ((h8Var.Q != null || (messageObject != null && foVar != null)) && h8Var.W == null) {
                        int i12 = this.f50516b;
                        if (MessagesController.getInstance(i12).isFrozen()) {
                            org.telegram.ui.b.b(i12);
                            return;
                        }
                        n5 y10 = n5.y(i12, false);
                        org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(h8Var, value, y10, messageObject, foVar, 15);
                        if (y10.e && y10.p().amount < value) {
                            boolean z10 = this.f50517c;
                            Context context = this.f50520r;
                            org.telegram.ui.ActionBar.c6 c6Var = this.d;
                            long j12 = this.e;
                            if (z10) {
                                new e7(context, c6Var, value, 17, DialogObject.getShortName(i12, j12), fVar, j12).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new e7(context, c6Var, value, 5, str, fVar, j12).show();
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

    public f6(h8 h8Var, MessageObject messageObject, fo foVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, TLRPC.Chat chat) {
        this.f50518f = h8Var;
        this.h = messageObject;
        this.f50519n = foVar;
        this.f50516b = i10;
        this.f50517c = z10;
        this.f50520r = context;
        this.d = c6Var;
        this.e = j10;
        this.f50521s = chat;
    }
}
