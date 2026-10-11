package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class r41 extends og.a {
    public final SaveToGallerySettingsHelper.DialogException f41353c;
    public final String d;

    public r41(int i10) {
        super(i10, false);
        this.f41353c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || r41.class != obj.getClass()) {
            return false;
        }
        r41 r41Var = (r41) obj;
        if (this.f17211a != r41Var.f17211a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, r41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f41353c;
        if (dialogException2 == null || (dialogException = r41Var.f41353c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public r41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f41353c = dialogException;
    }

    public r41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f41353c = null;
    }
}
