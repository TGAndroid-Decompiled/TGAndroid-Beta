package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wv0 implements Runnable {
    public final int f39112a = 1;
    public final fw0 f39113b;
    public final boolean f39114c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.n2 e;
    public final ArrayList f39115f;

    public wv0(fw0 fw0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList) {
        this.f39113b = fw0Var;
        this.f39114c = z10;
        this.d = pollAnswer;
        this.e = n2Var;
        this.f39115f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f39112a) {
            case 0:
                fw0 fw0Var = this.f39113b;
                fw0Var.getClass();
                boolean z10 = this.f39114c;
                org.telegram.ui.ActionBar.n2 n2Var = this.e;
                if (!z10) {
                    n2Var.getSendMessagesHelper().sendVote(fw0Var.H, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f39115f;
                    arrayList.remove(this.d);
                    n2Var.getSendMessagesHelper().sendVote(fw0Var.H, arrayList, null);
                }
                fw0Var.c(true);
                return;
            default:
                fw0 fw0Var2 = this.f39113b;
                fw0Var2.getClass();
                boolean z11 = this.f39114c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = this.e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(fw0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f39115f;
                    arrayList3.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(fw0Var2.H, arrayList3, null);
                }
                fw0Var2.c(true);
                return;
        }
    }

    public wv0(fw0 fw0Var, boolean z10, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f39113b = fw0Var;
        this.f39114c = z10;
        this.e = n2Var;
        this.f39115f = arrayList;
        this.d = pollAnswer;
    }
}
