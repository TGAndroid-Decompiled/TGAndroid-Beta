package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class w5 implements m80 {
    public final int f43211a;
    public final z5 f43212b;
    public final CacheByChatsController.KeepMediaException f43213c;

    public w5(z5 z5Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f43211a = i10;
        this.f43212b = z5Var;
        this.f43213c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f43211a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                z5 z5Var = this.f43212b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f43213c;
                if (i10 == i11) {
                    z5Var.d.remove(keepMediaException);
                    z5Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(z5Var.f44582b);
                }
                z5Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(z5Var.f44584e, z5Var.d);
                return;
            default:
                this.f43213c.keepMedia = i10;
                z5 z5Var2 = this.f43212b;
                z5Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(z5Var2.f44584e, z5Var2.d);
                AndroidUtilities.updateVisibleRows(z5Var2.f44582b);
                return;
        }
    }
}
