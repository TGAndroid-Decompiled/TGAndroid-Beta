package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class uv0 implements Runnable {
    public final int f38561a = 1;
    public final dw0 f38562b;
    public final boolean f38563c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.m2 e;
    public final ArrayList f38564f;

    public uv0(dw0 dw0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList) {
        this.f38562b = dw0Var;
        this.f38563c = z10;
        this.d = pollAnswer;
        this.e = m2Var;
        this.f38564f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f38561a) {
            case 0:
                dw0 dw0Var = this.f38562b;
                dw0Var.getClass();
                boolean z10 = this.f38563c;
                org.telegram.ui.ActionBar.m2 m2Var = this.e;
                if (!z10) {
                    m2Var.getSendMessagesHelper().sendVote(dw0Var.H, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f38564f;
                    arrayList.remove(this.d);
                    m2Var.getSendMessagesHelper().sendVote(dw0Var.H, arrayList, null);
                }
                dw0Var.c(true);
                return;
            default:
                dw0 dw0Var2 = this.f38562b;
                dw0Var2.getClass();
                boolean z11 = this.f38563c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.m2 m2Var2 = this.e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    m2Var2.getSendMessagesHelper().sendVote(dw0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f38564f;
                    arrayList3.add(pollAnswer);
                    m2Var2.getSendMessagesHelper().sendVote(dw0Var2.H, arrayList3, null);
                }
                dw0Var2.c(true);
                return;
        }
    }

    public uv0(dw0 dw0Var, boolean z10, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f38562b = dw0Var;
        this.f38563c = z10;
        this.e = m2Var;
        this.f38564f = arrayList;
        this.d = pollAnswer;
    }
}
