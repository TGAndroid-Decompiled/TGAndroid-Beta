package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class x31 extends bg.b {
    public final SaveToGallerySettingsHelper.DialogException f39852c;
    public final String d;

    public x31(int i10) {
        super(i10, false);
        this.f39852c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || x31.class != obj.getClass()) {
            return false;
        }
        x31 x31Var = (x31) obj;
        if (this.f1808a != x31Var.f1808a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, x31Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f39852c;
        if (dialogException2 == null || (dialogException = x31Var.f39852c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public x31(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f39852c = dialogException;
    }

    public x31(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f39852c = null;
    }
}
