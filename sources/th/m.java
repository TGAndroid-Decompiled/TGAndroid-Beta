package th;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.zj;
public final class m implements zj {
    public final ni f48563a;
    public final p f48564b;

    public m(p pVar, ni niVar) {
        this.f48564b = pVar;
        this.f48563a = niVar;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        String str2;
        p3 p3Var = this.f48564b.f48623r;
        if (!arrayList.isEmpty()) {
            p3Var.c2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            MessageObject messageObject = (MessageObject) arrayList3.get(0);
            p3Var.getClass();
            if (messageObject != null && messageObject.getDocument() != null) {
                TLRPC.Document document = messageObject.getDocument();
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                p3Var.d2(document, str2);
            }
        }
        this.f48563a.dismiss(true);
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f48564b.f28403b.f30990b0.startActivityForResult(intent, 21);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void O() {
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
    }
}
