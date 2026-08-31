package wh;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.zj;
public final class p1 implements zj {
    public final mi f49922a;
    public final z1 f49923b;

    public p1(z1 z1Var, mi miVar) {
        this.f49923b = z1Var;
        this.f49922a = miVar;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z4, int i10, long j10, boolean z10, long j11) {
        String str2;
        boolean isEmpty = arrayList.isEmpty();
        z1 z1Var = this.f49923b;
        if (!isEmpty) {
            z1Var.M.c2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            r3 r3Var = z1Var.M;
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
        this.f49922a.dismiss(true);
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f49923b.startActivityForResult(intent, 21);
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
