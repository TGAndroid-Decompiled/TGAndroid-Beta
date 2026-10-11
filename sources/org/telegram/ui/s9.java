package org.telegram.ui;

import android.content.Intent;
import android.graphics.Point;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SendMessagesHelper;
public final class s9 implements iq0 {
    public final u9 f41644a;

    public s9(u9 u9Var) {
        this.f41644a = u9Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        u9 u9Var = this.f41644a;
        try {
            if (!arrayList.isEmpty()) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
                if (sendingMediaInfo.path != null) {
                    Point realScreenSize = AndroidUtilities.getRealScreenSize();
                    la.h g02 = u9Var.g0(null, 0, 0, 0, ImageLoader.loadBitmap(sendingMediaInfo.path, null, realScreenSize.x, realScreenSize.y, true));
                    if (g02 != null) {
                        t9 t9Var = u9Var.M;
                        if (t9Var != null) {
                            t9Var.K((String) g02.f15465b);
                        }
                        u9Var.removeSelfFromStack();
                    }
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            this.f41644a.getParentActivity().startActivityForResult(intent, 11);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
