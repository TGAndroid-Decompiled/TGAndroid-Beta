package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class z41 extends pg.a {
    public final SaveToGallerySettingsHelper.DialogException f42152c;
    public final String d;

    public z41(int i10) {
        super(i10, false);
        this.f42152c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || z41.class != obj.getClass()) {
            return false;
        }
        z41 z41Var = (z41) obj;
        if (this.f42904a != z41Var.f42904a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, z41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f42152c;
        if (dialogException2 == null || (dialogException = z41Var.f42152c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public z41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f42152c = dialogException;
    }

    public z41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f42152c = null;
    }
}
