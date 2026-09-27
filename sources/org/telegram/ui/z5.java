package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class z5 implements l80 {
    public final int f40403a;
    public final c6 f40404b;
    public final CacheByChatsController.KeepMediaException f40405c;

    public z5(c6 c6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f40403a = i10;
        this.f40404b = c6Var;
        this.f40405c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f40403a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                c6 c6Var = this.f40404b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f40405c;
                if (i10 == i11) {
                    c6Var.d.remove(keepMediaException);
                    c6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(c6Var.f32528b);
                }
                c6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(c6Var.e, c6Var.d);
                return;
            default:
                this.f40405c.keepMedia = i10;
                c6 c6Var2 = this.f40404b;
                c6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(c6Var2.e, c6Var2.d);
                AndroidUtilities.updateVisibleRows(c6Var2.f32528b);
                return;
        }
    }
}
