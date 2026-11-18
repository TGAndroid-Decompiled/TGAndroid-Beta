package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sr0 implements Runnable {
    public final int f52062a = 1;
    public final as0 f52063b;
    public final boolean f52064c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.h2 f52065e;
    public final ArrayList f52066f;

    public sr0(as0 as0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.h2 h2Var, ArrayList arrayList) {
        this.f52063b = as0Var;
        this.f52064c = z10;
        this.d = pollAnswer;
        this.f52065e = h2Var;
        this.f52066f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f52062a) {
            case 0:
                as0 as0Var = this.f52063b;
                as0Var.getClass();
                boolean z10 = this.f52064c;
                org.telegram.ui.ActionBar.h2 h2Var = this.f52065e;
                if (!z10) {
                    h2Var.getSendMessagesHelper().w0(as0Var.I, null, null);
                } else {
                    ArrayList arrayList = this.f52066f;
                    arrayList.remove(this.d);
                    h2Var.getSendMessagesHelper().w0(as0Var.I, arrayList, null);
                }
                as0Var.c(true);
                return;
            default:
                as0 as0Var2 = this.f52063b;
                as0Var2.getClass();
                boolean z11 = this.f52064c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.h2 h2Var2 = this.f52065e;
                if (!z11) {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(pollAnswer);
                    h2Var2.getSendMessagesHelper().w0(as0Var2.I, arrayList2, null);
                } else {
                    ArrayList arrayList3 = this.f52066f;
                    arrayList3.add(pollAnswer);
                    h2Var2.getSendMessagesHelper().w0(as0Var2.I, arrayList3, null);
                }
                as0Var2.c(true);
                return;
        }
    }

    public sr0(as0 as0Var, boolean z10, org.telegram.ui.ActionBar.h2 h2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f52063b = as0Var;
        this.f52064c = z10;
        this.f52065e = h2Var;
        this.f52066f = arrayList;
        this.d = pollAnswer;
    }
}
