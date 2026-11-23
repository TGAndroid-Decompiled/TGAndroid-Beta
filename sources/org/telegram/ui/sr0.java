package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sr0 implements Runnable {
    public final int f52113a = 1;
    public final as0 f52114b;
    public final boolean f52115c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.g2 f52116e;
    public final ArrayList f52117f;

    public sr0(as0 as0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList) {
        this.f52114b = as0Var;
        this.f52115c = z10;
        this.d = pollAnswer;
        this.f52116e = g2Var;
        this.f52117f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f52113a) {
            case 0:
                as0 as0Var = this.f52114b;
                as0Var.getClass();
                boolean z10 = this.f52115c;
                org.telegram.ui.ActionBar.g2 g2Var = this.f52116e;
                if (!z10) {
                    g2Var.getSendMessagesHelper().w0(as0Var.I, null, null);
                } else {
                    ArrayList arrayList = this.f52117f;
                    arrayList.remove(this.d);
                    g2Var.getSendMessagesHelper().w0(as0Var.I, arrayList, null);
                }
                as0Var.c(true);
                return;
            default:
                as0 as0Var2 = this.f52114b;
                as0Var2.getClass();
                boolean z11 = this.f52115c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.g2 g2Var2 = this.f52116e;
                if (!z11) {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(pollAnswer);
                    g2Var2.getSendMessagesHelper().w0(as0Var2.I, arrayList2, null);
                } else {
                    ArrayList arrayList3 = this.f52117f;
                    arrayList3.add(pollAnswer);
                    g2Var2.getSendMessagesHelper().w0(as0Var2.I, arrayList3, null);
                }
                as0Var2.c(true);
                return;
        }
    }

    public sr0(as0 as0Var, boolean z10, org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f52114b = as0Var;
        this.f52115c = z10;
        this.f52116e = g2Var;
        this.f52117f = arrayList;
        this.d = pollAnswer;
    }
}
