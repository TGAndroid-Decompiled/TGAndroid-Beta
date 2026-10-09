package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class x5 implements n80 {
    public final int f43826a;
    public final a6 f43827b;
    public final CacheByChatsController.KeepMediaException f43828c;

    public x5(a6 a6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f43826a = i10;
        this.f43827b = a6Var;
        this.f43828c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f43826a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                a6 a6Var = this.f43827b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f43828c;
                if (i10 == i11) {
                    a6Var.d.remove(keepMediaException);
                    a6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(a6Var.f35840b);
                }
                a6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var.f35842e, a6Var.d);
                return;
            default:
                this.f43828c.keepMedia = i10;
                a6 a6Var2 = this.f43827b;
                a6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var2.f35842e, a6Var2.d);
                AndroidUtilities.updateVisibleRows(a6Var2.f35840b);
                return;
        }
    }
}
