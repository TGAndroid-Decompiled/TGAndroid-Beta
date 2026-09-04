package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;
public final class z5 extends pg.a {
    public final CacheByChatsController.KeepMediaException f43294c;

    public z5(int i10, CacheByChatsController.KeepMediaException keepMediaException) {
        super(i10, false);
        this.f43294c = keepMediaException;
    }

    public final boolean equals(Object obj) {
        CacheByChatsController.KeepMediaException keepMediaException;
        if (this == obj) {
            return true;
        }
        if (obj == null || z5.class != obj.getClass()) {
            return false;
        }
        z5 z5Var = (z5) obj;
        if (this.f44071a != z5Var.f44071a) {
            return false;
        }
        CacheByChatsController.KeepMediaException keepMediaException2 = this.f43294c;
        if (keepMediaException2 == null || (keepMediaException = z5Var.f43294c) == null || keepMediaException2.dialogId == keepMediaException.dialogId) {
            return true;
        }
        return false;
    }
}
