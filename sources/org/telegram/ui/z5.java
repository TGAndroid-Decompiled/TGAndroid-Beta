package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class z5 implements y70 {
    public final int f46175a;
    public final c6 f46176b;
    public final CacheByChatsController.KeepMediaException f46177c;

    public z5(c6 c6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f46175a = i10;
        this.f46176b = c6Var;
        this.f46177c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f46175a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                c6 c6Var = this.f46176b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f46177c;
                if (i10 == i11) {
                    c6Var.d.remove(keepMediaException);
                    c6Var.V();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(c6Var.f38271b);
                }
                c6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(c6Var.e, c6Var.d);
                return;
            default:
                this.f46177c.keepMedia = i10;
                c6 c6Var2 = this.f46176b;
                c6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(c6Var2.e, c6Var2.d);
                AndroidUtilities.updateVisibleRows(c6Var2.f38271b);
                return;
        }
    }
}
