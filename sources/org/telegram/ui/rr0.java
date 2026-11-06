package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class rr0 implements Runnable {
    public final int f49533a = 1;
    public final yr0 f49534b;
    public final boolean f49535c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.f2 f49536e;
    public final ArrayList f49537f;

    public rr0(yr0 yr0Var, boolean z9, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList) {
        this.f49534b = yr0Var;
        this.f49535c = z9;
        this.d = pollAnswer;
        this.f49536e = f2Var;
        this.f49537f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f49533a) {
            case 0:
                yr0 yr0Var = this.f49534b;
                yr0Var.getClass();
                boolean z9 = this.f49535c;
                org.telegram.ui.ActionBar.f2 f2Var = this.f49536e;
                if (!z9) {
                    f2Var.getSendMessagesHelper().w0(yr0Var.H, null, null);
                } else {
                    ArrayList arrayList = this.f49537f;
                    arrayList.remove(this.d);
                    f2Var.getSendMessagesHelper().w0(yr0Var.H, arrayList, null);
                }
                yr0Var.c(true);
                return;
            default:
                yr0 yr0Var2 = this.f49534b;
                yr0Var2.getClass();
                boolean z10 = this.f49535c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.f2 f2Var2 = this.f49536e;
                if (!z10) {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(pollAnswer);
                    f2Var2.getSendMessagesHelper().w0(yr0Var2.H, arrayList2, null);
                } else {
                    ArrayList arrayList3 = this.f49537f;
                    arrayList3.add(pollAnswer);
                    f2Var2.getSendMessagesHelper().w0(yr0Var2.H, arrayList3, null);
                }
                yr0Var2.c(true);
                return;
        }
    }

    public rr0(yr0 yr0Var, boolean z9, org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f49534b = yr0Var;
        this.f49535c = z9;
        this.f49536e = f2Var;
        this.f49537f = arrayList;
        this.d = pollAnswer;
    }
}
