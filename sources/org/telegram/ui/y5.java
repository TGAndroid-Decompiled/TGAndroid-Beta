package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;
public final class y5 extends wf.a {
    public final CacheByChatsController.KeepMediaException f44726c;

    public y5(int i9, CacheByChatsController.KeepMediaException keepMediaException) {
        super(i9, false);
        this.f44726c = keepMediaException;
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
        if (this.f48814a != y5Var.f48814a) {
            return false;
        }
        CacheByChatsController.KeepMediaException keepMediaException2 = this.f44726c;
        if (keepMediaException2 == null || (keepMediaException = y5Var.f44726c) == null || keepMediaException2.dialogId == keepMediaException.dialogId) {
            return true;
        }
        return false;
    }
}
