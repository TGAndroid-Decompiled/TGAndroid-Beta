package org.telegram.ui;

import android.content.Intent;
import android.graphics.Point;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SendMessagesHelper;
public final class x9 implements pq0 {
    public final z9 f41779a;

    public x9(z9 z9Var) {
        this.f41779a = z9Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        z9 z9Var = this.f41779a;
        try {
            if (!arrayList.isEmpty()) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
                if (sendingMediaInfo.path != null) {
                    Point realScreenSize = AndroidUtilities.getRealScreenSize();
                    li.k g02 = z9Var.g0(null, 0, 0, 0, ImageLoader.loadBitmap(sendingMediaInfo.path, null, realScreenSize.x, realScreenSize.y, true));
                    if (g02 != null) {
                        y9 y9Var = z9Var.M;
                        if (y9Var != null) {
                            y9Var.K((String) g02.f14820b);
                        }
                        z9Var.removeSelfFromStack();
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
            this.f41779a.getParentActivity().startActivityForResult(intent, 11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
