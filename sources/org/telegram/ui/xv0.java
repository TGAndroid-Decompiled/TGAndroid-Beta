package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xv0 implements Runnable {
    public final int f42953a = 1;
    public final gw0 f42954b;
    public final boolean f42955c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.n2 f42956e;
    public final ArrayList f42957f;

    public xv0(gw0 gw0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList) {
        this.f42954b = gw0Var;
        this.f42955c = z10;
        this.d = pollAnswer;
        this.f42956e = n2Var;
        this.f42957f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f42953a) {
            case 0:
                gw0 gw0Var = this.f42954b;
                gw0Var.getClass();
                boolean z10 = this.f42955c;
                org.telegram.ui.ActionBar.n2 n2Var = this.f42956e;
                if (!z10) {
                    n2Var.getSendMessagesHelper().sendVote(gw0Var.H, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f42957f;
                    arrayList.remove(this.d);
                    n2Var.getSendMessagesHelper().sendVote(gw0Var.H, arrayList, null);
                }
                gw0Var.c(true);
                return;
            default:
                gw0 gw0Var2 = this.f42954b;
                gw0Var2.getClass();
                boolean z11 = this.f42955c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f42956e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(gw0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f42957f;
                    arrayList3.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(gw0Var2.H, arrayList3, null);
                }
                gw0Var2.c(true);
                return;
        }
    }

    public xv0(gw0 gw0Var, boolean z10, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f42954b = gw0Var;
        this.f42955c = z10;
        this.f42956e = n2Var;
        this.f42957f = arrayList;
        this.d = pollAnswer;
    }
}
