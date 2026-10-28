package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class z5 implements a80 {
    public final int f46163a;
    public final c6 f46164b;
    public final CacheByChatsController.KeepMediaException f46165c;

    public z5(c6 c6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f46163a = i10;
        this.f46164b = c6Var;
        this.f46165c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f46163a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                c6 c6Var = this.f46164b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f46165c;
                if (i10 == i11) {
                    c6Var.d.remove(keepMediaException);
                    c6Var.V();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(c6Var.f38179b);
                }
                c6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(c6Var.e, c6Var.d);
                return;
            default:
                this.f46165c.keepMedia = i10;
                c6 c6Var2 = this.f46164b;
                c6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(c6Var2.e, c6Var2.d);
                AndroidUtilities.updateVisibleRows(c6Var2.f38179b);
                return;
        }
    }
}
