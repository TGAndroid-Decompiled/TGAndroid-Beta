package wh;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.zj;
public final class n implements zj {
    public final mi f49920a;
    public final q f49921b;

    public n(q qVar, mi miVar) {
        this.f49921b = qVar;
        this.f49920a = miVar;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z4, int i10, long j10, boolean z10, long j11) {
        String str2;
        r3 r3Var = this.f49921b.f49966r;
        if (!arrayList.isEmpty()) {
            r3Var.b2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            MessageObject messageObject = (MessageObject) arrayList3.get(0);
            r3Var.getClass();
            if (messageObject != null && messageObject.getDocument() != null) {
                TLRPC.Document document = messageObject.getDocument();
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                r3Var.c2(document, str2);
            }
        }
        this.f49920a.dismiss(true);
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f49921b.f26590b.f29058c0.startActivityForResult(intent, 21);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void O() {
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z4, int i10) {
    }
}
