package qh;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.wj;
public final class m implements wj {
    public final ki f46517a;
    public final p f46518b;

    public m(p pVar, ki kiVar) {
        this.f46518b = pVar;
        this.f46517a = kiVar;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i9, long j10, boolean z11, long j11) {
        String str2;
        o3 o3Var = this.f46518b.f46606r;
        if (!arrayList.isEmpty()) {
            o3Var.c2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            MessageObject messageObject = (MessageObject) arrayList3.get(0);
            o3Var.getClass();
            if (messageObject != null && messageObject.getDocument() != null) {
                TLRPC.Document document = messageObject.getDocument();
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                o3Var.d2(document, str2);
            }
        }
        this.f46517a.dismiss(true);
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f46518b.f27493b.f30099b0.startActivityForResult(intent, 21);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void N() {
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i9) {
    }
}
