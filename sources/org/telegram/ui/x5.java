package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class x5 implements n80 {
    public final int f42621a;
    public final a6 f42622b;
    public final CacheByChatsController.KeepMediaException f42623c;

    public x5(a6 a6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f42621a = i10;
        this.f42622b = a6Var;
        this.f42623c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f42621a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                a6 a6Var = this.f42622b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f42623c;
                if (i10 == i11) {
                    a6Var.d.remove(keepMediaException);
                    a6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(a6Var.f34366b);
                }
                a6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var.f34368e, a6Var.d);
                return;
            default:
                this.f42623c.keepMedia = i10;
                a6 a6Var2 = this.f42622b;
                a6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var2.f34368e, a6Var2.d);
                AndroidUtilities.updateVisibleRows(a6Var2.f34366b);
                return;
        }
    }
}
