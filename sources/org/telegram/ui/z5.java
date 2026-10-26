package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class z5 implements y70 {
    public final int f46178a;
    public final c6 f46179b;
    public final CacheByChatsController.KeepMediaException f46180c;

    public z5(c6 c6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f46178a = i10;
        this.f46179b = c6Var;
        this.f46180c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f46178a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                c6 c6Var = this.f46179b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f46180c;
                if (i10 == i11) {
                    c6Var.d.remove(keepMediaException);
                    c6Var.V();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(c6Var.f38274b);
                }
                c6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(c6Var.e, c6Var.d);
                return;
            default:
                this.f46180c.keepMedia = i10;
                c6 c6Var2 = this.f46179b;
                c6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(c6Var2.e, c6Var2.d);
                AndroidUtilities.updateVisibleRows(c6Var2.f38274b);
                return;
        }
    }
}
