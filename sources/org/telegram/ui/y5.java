package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class y5 implements k80 {
    public final int f39725a;
    public final b6 f39726b;
    public final CacheByChatsController.KeepMediaException f39727c;

    public y5(b6 b6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f39725a = i10;
        this.f39726b = b6Var;
        this.f39727c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f39725a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                b6 b6Var = this.f39726b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f39727c;
                if (i10 == i11) {
                    b6Var.d.remove(keepMediaException);
                    b6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(b6Var.f31970b);
                }
                b6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(b6Var.e, b6Var.d);
                return;
            default:
                this.f39727c.keepMedia = i10;
                b6 b6Var2 = this.f39726b;
                b6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(b6Var2.e, b6Var2.d);
                AndroidUtilities.updateVisibleRows(b6Var2.f31970b);
                return;
        }
    }
}
