package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;
public final class y5 extends og.a {
    public final CacheByChatsController.KeepMediaException f44259c;

    public y5(int i10, CacheByChatsController.KeepMediaException keepMediaException) {
        super(i10, false);
        this.f44259c = keepMediaException;
    }

    public final boolean equals(Object obj) {
        CacheByChatsController.KeepMediaException keepMediaException;
        if (this == obj) {
            return true;
        }
        if (obj == null || y5.class != obj.getClass()) {
            return false;
        }
        y5 y5Var = (y5) obj;
        if (this.f17175a != y5Var.f17175a) {
            return false;
        }
        CacheByChatsController.KeepMediaException keepMediaException2 = this.f44259c;
        if (keepMediaException2 == null || (keepMediaException = y5Var.f44259c) == null || keepMediaException2.dialogId == keepMediaException.dialogId) {
            return true;
        }
        return false;
    }
}
