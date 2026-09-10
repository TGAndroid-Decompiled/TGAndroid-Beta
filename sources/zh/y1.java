package zh;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.kk;
import org.telegram.ui.tn;
public final class y1 implements kk {
    public final a3 f49072a;

    public y1(a3 a3Var) {
        this.f49072a = a3Var;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        AccountInstance accountInstance;
        boolean z12;
        a3 a3Var = this.f49072a;
        TL_stories.StoryItem storyItem = a3Var.O1.f49129a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = a3Var.getAccountInstance();
            SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) arrayList, (ArrayList<String>) arrayList, (ArrayList<Uri>) null, str, (String) null, a3Var.B1, (MessageObject) null, (MessageObject) null, storyItem, (tn) null, (MessageObject) null, z10, i10, (t0.i) null, (SendMessageChatArguments) null, 0L, false, j10);
            if (j10 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            a3Var.k0(z12);
        }
    }

    @Override
    public final void w() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.p2 p2Var = this.f49072a.J0.f48931f;
            if (p2Var.getParentActivity() == null) {
                return;
            }
            p2Var.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void O() {
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
    }
}
