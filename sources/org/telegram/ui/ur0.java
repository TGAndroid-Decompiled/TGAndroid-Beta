package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ur0 implements Runnable {
    public final int f50453a = 1;
    public final bs0 f50454b;
    public final boolean f50455c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.f2 f50456e;
    public final ArrayList f50457f;

    public ur0(bs0 bs0Var, boolean z9, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList) {
        this.f50454b = bs0Var;
        this.f50455c = z9;
        this.d = pollAnswer;
        this.f50456e = f2Var;
        this.f50457f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f50453a) {
            case 0:
                bs0 bs0Var = this.f50454b;
                bs0Var.getClass();
                boolean z9 = this.f50455c;
                org.telegram.ui.ActionBar.f2 f2Var = this.f50456e;
                if (!z9) {
                    f2Var.getSendMessagesHelper().w0(bs0Var.H, null, null);
                } else {
                    ArrayList arrayList = this.f50457f;
                    arrayList.remove(this.d);
                    f2Var.getSendMessagesHelper().w0(bs0Var.H, arrayList, null);
                }
                bs0Var.c(true);
                return;
            default:
                bs0 bs0Var2 = this.f50454b;
                bs0Var2.getClass();
                boolean z10 = this.f50455c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.f2 f2Var2 = this.f50456e;
                if (!z10) {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(pollAnswer);
                    f2Var2.getSendMessagesHelper().w0(bs0Var2.H, arrayList2, null);
                } else {
                    ArrayList arrayList3 = this.f50457f;
                    arrayList3.add(pollAnswer);
                    f2Var2.getSendMessagesHelper().w0(bs0Var2.H, arrayList3, null);
                }
                bs0Var2.c(true);
                return;
        }
    }

    public ur0(bs0 bs0Var, boolean z9, org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f50454b = bs0Var;
        this.f50455c = z9;
        this.f50456e = f2Var;
        this.f50457f = arrayList;
        this.d = pollAnswer;
    }
}
