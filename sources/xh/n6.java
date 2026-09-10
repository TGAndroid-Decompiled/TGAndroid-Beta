package xh;

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
public final class n6 implements View.OnClickListener {
    public final int f45767a = 0;
    public final int f45768b;
    public final boolean f45769c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final long e;
    public final KeyEvent.Callback f45770f;
    public final Object h;
    public final Object f45771n;
    public final Context f45772r;
    public final Object f45773s;

    public n6(bi.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.h3[] h3VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, String str) {
        this.f45770f = dVar;
        this.f45768b = i10;
        this.h = starsSubscription;
        this.f45771n = h3VarArr;
        this.e = j3;
        this.f45772r = activity;
        this.d = f6Var;
        this.f45769c = z10;
        this.f45773s = str;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        switch (this.f45767a) {
            case 0:
                bi.d dVar = (bi.d) this.f45770f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.f45771n;
                Activity activity = (Activity) this.f45772r;
                String str2 = (String) this.f45773s;
                if (!dVar.N) {
                    int i11 = this.f45768b;
                    v5 y3 = v5.y(i11, false);
                    long j3 = this.e;
                    org.telegram.messenger.k0 k0Var = new org.telegram.messenger.k0(dVar, starsSubscription, i11, h3VarArr, j3, 11);
                    if (y3.f46179f.amount < starsSubscription.pricing.amount) {
                        long j10 = starsSubscription.pricing.amount;
                        if (this.f45769c) {
                            i10 = 8;
                        } else if (j3 < 0) {
                            i10 = 2;
                        } else {
                            i10 = 7;
                        }
                        new o7(activity, this.d, j10, i10, str2, k0Var, j3).show();
                        return;
                    }
                    k0Var.run();
                    return;
                }
                return;
            default:
                r8 r8Var = (r8) this.f45770f;
                MessageObject messageObject = (MessageObject) this.h;
                eo eoVar = (eo) this.f45771n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f45773s;
                if (!r8Var.R) {
                    long value = r8Var.f45992r.getValue();
                    if ((r8Var.P != null || (messageObject != null && eoVar != null)) && r8Var.V == null) {
                        int i12 = this.f45768b;
                        if (MessagesController.getInstance(i12).isFrozen()) {
                            org.telegram.ui.b.b(i12);
                            return;
                        }
                        v5 y10 = v5.y(i12, false);
                        org.telegram.messenger.voip.g gVar = new org.telegram.messenger.voip.g(r8Var, value, y10, messageObject, eoVar, 15);
                        if (y10.e && y10.p().amount < value) {
                            boolean z10 = this.f45769c;
                            Context context = this.f45772r;
                            org.telegram.ui.ActionBar.f6 f6Var = this.d;
                            long j11 = this.e;
                            if (z10) {
                                new o7(context, f6Var, value, 17, DialogObject.getShortName(i12, j11), gVar, j11).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new o7(context, f6Var, value, 5, str, gVar, j11).show();
                            return;
                        }
                        gVar.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public n6(r8 r8Var, MessageObject messageObject, eo eoVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, TLRPC.Chat chat) {
        this.f45770f = r8Var;
        this.h = messageObject;
        this.f45771n = eoVar;
        this.f45768b = i10;
        this.f45769c = z10;
        this.f45772r = context;
        this.d = f6Var;
        this.e = j3;
        this.f45773s = chat;
    }
}
