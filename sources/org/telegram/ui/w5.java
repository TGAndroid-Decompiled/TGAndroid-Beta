package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class w5 implements m80 {
    public final int f43245a;
    public final z5 f43246b;
    public final CacheByChatsController.KeepMediaException f43247c;

    public w5(z5 z5Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f43245a = i10;
        this.f43246b = z5Var;
        this.f43247c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f43245a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                z5 z5Var = this.f43246b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f43247c;
                if (i10 == i11) {
                    z5Var.d.remove(keepMediaException);
                    z5Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(z5Var.f44616b);
                }
                z5Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(z5Var.f44618e, z5Var.d);
                return;
            default:
                this.f43247c.keepMedia = i10;
                z5 z5Var2 = this.f43246b;
                z5Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(z5Var2.f44618e, z5Var2.d);
                AndroidUtilities.updateVisibleRows(z5Var2.f44616b);
                return;
        }
    }
}
