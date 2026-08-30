package vh;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.xj;
public final class o1 implements xj {
    public final li f46035a;
    public final y1 f46036b;

    public o1(y1 y1Var, li liVar) {
        this.f46036b = y1Var;
        this.f46035a = liVar;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z4, int i10, long j10, boolean z10, long j11) {
        String str2;
        boolean isEmpty = arrayList.isEmpty();
        y1 y1Var = this.f46036b;
        if (!isEmpty) {
            y1Var.M.c2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            r3 r3Var = y1Var.M;
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
                r3Var.d2(document, str2);
            }
        }
        this.f46035a.dismiss(true);
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f46036b.startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void O() {
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z4, int i10) {
    }
}
