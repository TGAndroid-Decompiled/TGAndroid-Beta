package rh;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.sj;

public final class m implements sj {

    public final gi f47263a;

    public final p f47264b;

    public m(p pVar, gi giVar) {
        this.f47264b = pVar;
        this.f47263a = giVar;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        p3 p3Var = this.f47264b.f47324r;
        if (!arrayList.isEmpty()) {
            p3Var.c2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            MessageObject messageObject = (MessageObject) arrayList3.get(0);
            p3Var.getClass();
            if (messageObject != null && messageObject.getDocument() != null) {
                TLRPC.Document document = messageObject.getDocument();
                TLRPC.Message message = messageObject.messageOwner;
                p3Var.d2(document, message != null ? message.attachPath : null);
            }
        }
        this.f47263a.dismiss(true);
    }

    @Override
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f47264b.f34900b.f28635b0.startActivityForResult(intent, 21);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void O() {
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
    }
}
