package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sr0 implements Runnable {
    public final int f52109a = 1;
    public final as0 f52110b;
    public final boolean f52111c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.g2 f52112e;
    public final ArrayList f52113f;

    public sr0(as0 as0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList) {
        this.f52110b = as0Var;
        this.f52111c = z10;
        this.d = pollAnswer;
        this.f52112e = g2Var;
        this.f52113f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f52109a) {
            case 0:
                as0 as0Var = this.f52110b;
                as0Var.getClass();
                boolean z10 = this.f52111c;
                org.telegram.ui.ActionBar.g2 g2Var = this.f52112e;
                if (!z10) {
                    g2Var.getSendMessagesHelper().w0(as0Var.I, null, null);
                } else {
                    ArrayList arrayList = this.f52113f;
                    arrayList.remove(this.d);
                    g2Var.getSendMessagesHelper().w0(as0Var.I, arrayList, null);
                }
                as0Var.c(true);
                return;
            default:
                as0 as0Var2 = this.f52110b;
                as0Var2.getClass();
                boolean z11 = this.f52111c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.g2 g2Var2 = this.f52112e;
                if (!z11) {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(pollAnswer);
                    g2Var2.getSendMessagesHelper().w0(as0Var2.I, arrayList2, null);
                } else {
                    ArrayList arrayList3 = this.f52113f;
                    arrayList3.add(pollAnswer);
                    g2Var2.getSendMessagesHelper().w0(as0Var2.I, arrayList3, null);
                }
                as0Var2.c(true);
                return;
        }
    }

    public sr0(as0 as0Var, boolean z10, org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f52110b = as0Var;
        this.f52111c = z10;
        this.f52112e = g2Var;
        this.f52113f = arrayList;
        this.d = pollAnswer;
    }
}
