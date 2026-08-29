package th;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.zj;
public final class o1 implements zj {
    public final ni f48600a;
    public final x1 f48601b;

    public o1(x1 x1Var, ni niVar) {
        this.f48601b = x1Var;
        this.f48600a = niVar;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        String str2;
        boolean isEmpty = arrayList.isEmpty();
        x1 x1Var = this.f48601b;
        if (!isEmpty) {
            x1Var.L.c2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            p3 p3Var = x1Var.L;
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
        this.f48600a.dismiss(true);
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f48601b.startActivityForResult(intent, 21);
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
