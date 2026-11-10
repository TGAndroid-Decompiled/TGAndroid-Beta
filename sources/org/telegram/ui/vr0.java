package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vr0 implements Runnable {
    public final int f50782a = 1;
    public final cs0 f50783b;
    public final boolean f50784c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.f2 f50785e;
    public final ArrayList f50786f;

    public vr0(cs0 cs0Var, boolean z9, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList) {
        this.f50783b = cs0Var;
        this.f50784c = z9;
        this.d = pollAnswer;
        this.f50785e = f2Var;
        this.f50786f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f50782a) {
            case 0:
                cs0 cs0Var = this.f50783b;
                cs0Var.getClass();
                boolean z9 = this.f50784c;
                org.telegram.ui.ActionBar.f2 f2Var = this.f50785e;
                if (!z9) {
                    f2Var.getSendMessagesHelper().w0(cs0Var.H, null, null);
                } else {
                    ArrayList arrayList = this.f50786f;
                    arrayList.remove(this.d);
                    f2Var.getSendMessagesHelper().w0(cs0Var.H, arrayList, null);
                }
                cs0Var.c(true);
                return;
            default:
                cs0 cs0Var2 = this.f50783b;
                cs0Var2.getClass();
                boolean z10 = this.f50784c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.f2 f2Var2 = this.f50785e;
                if (!z10) {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(pollAnswer);
                    f2Var2.getSendMessagesHelper().w0(cs0Var2.H, arrayList2, null);
                } else {
                    ArrayList arrayList3 = this.f50786f;
                    arrayList3.add(pollAnswer);
                    f2Var2.getSendMessagesHelper().w0(cs0Var2.H, arrayList3, null);
                }
                cs0Var2.c(true);
                return;
        }
    }

    public vr0(cs0 cs0Var, boolean z9, org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f50783b = cs0Var;
        this.f50784c = z9;
        this.f50785e = f2Var;
        this.f50786f = arrayList;
        this.d = pollAnswer;
    }
}
