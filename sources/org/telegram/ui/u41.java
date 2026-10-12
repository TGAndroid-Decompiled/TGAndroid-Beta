package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class u41 extends og.a {
    public final SaveToGallerySettingsHelper.DialogException f42363c;
    public final String d;

    public u41(int i10) {
        super(i10, false);
        this.f42363c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || u41.class != obj.getClass()) {
            return false;
        }
        u41 u41Var = (u41) obj;
        if (this.f16876a != u41Var.f16876a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, u41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f42363c;
        if (dialogException2 == null || (dialogException = u41Var.f42363c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public u41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f42363c = dialogException;
    }

    public u41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f42363c = null;
    }
}
