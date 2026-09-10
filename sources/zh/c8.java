package zh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.bb;
import org.telegram.ui.Components.ha;
public final class c8 {
    public static final c8[] f48331f = new c8[4];
    public final int f48332a;
    public final LongSparseLongArray f48333b = new LongSparseLongArray();
    public final ArrayList f48334c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final b8 e;

    public c8(int i10) {
        new ArrayList();
        this.e = new b8(this);
        this.f48332a = i10;
    }

    public final void a(ha haVar) {
        long j3;
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.f48334c;
        arrayList.clear();
        for (int i10 = 0; i10 < haVar.getChildCount(); i10++) {
            View childAt = haVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r2) {
                j3 = ((org.telegram.ui.Cells.r2) childAt).getDialogId();
            } else if (childAt instanceof bb) {
                j3 = ((bb) childAt).getDialogId();
            } else {
                j3 = 0;
            }
            int i11 = this.f48332a;
            LongSparseLongArray longSparseLongArray = this.f48333b;
            if (j3 > 0) {
                TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
                if (user != null && !user.bot && !user.self && !user.contact && (userStatus = user.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(j3, 0L) > 3600000) {
                    longSparseLongArray.put(j3, currentTimeMillis);
                    arrayList.add(Long.valueOf(j3));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j3));
                if (ChatObject.isChannel(chat) && !ChatObject.isMonoForum(chat) && currentTimeMillis - longSparseLongArray.get(j3, 0L) > 3600000) {
                    longSparseLongArray.put(j3, currentTimeMillis);
                    arrayList.add(Long.valueOf(j3));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.d.addAll(arrayList);
            b8 b8Var = this.e;
            AndroidUtilities.cancelRunOnUIThread(b8Var);
            AndroidUtilities.runOnUIThread(b8Var, 300L);
        }
    }
}
