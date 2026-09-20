package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class s41 extends og.a {
    public final SaveToGallerySettingsHelper.DialogException f37295c;
    public final String d;

    public s41(int i10) {
        super(i10, false);
        this.f37295c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || s41.class != obj.getClass()) {
            return false;
        }
        s41 s41Var = (s41) obj;
        if (this.f15704a != s41Var.f15704a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, s41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f37295c;
        if (dialogException2 == null || (dialogException = s41Var.f37295c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public s41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f37295c = dialogException;
    }

    public s41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f37295c = null;
    }
}
