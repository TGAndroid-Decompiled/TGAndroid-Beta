package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class v41 extends ng.a {
    public final SaveToGallerySettingsHelper.DialogException f37409c;
    public final String d;

    public v41(int i10) {
        super(i10, false);
        this.f37409c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || v41.class != obj.getClass()) {
            return false;
        }
        v41 v41Var = (v41) obj;
        if (this.f14046a != v41Var.f14046a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, v41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f37409c;
        if (dialogException2 == null || (dialogException = v41Var.f37409c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public v41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f37409c = dialogException;
    }

    public v41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f37409c = null;
    }
}
