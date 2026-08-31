package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class z31 extends cg.b {
    public final SaveToGallerySettingsHelper.DialogException f43805c;
    public final String d;

    public z31(int i10) {
        super(i10, false);
        this.f43805c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || z31.class != obj.getClass()) {
            return false;
        }
        z31 z31Var = (z31) obj;
        if (this.f2505a != z31Var.f2505a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, z31Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f43805c;
        if (dialogException2 == null || (dialogException = z31Var.f43805c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public z31(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f43805c = dialogException;
    }

    public z31(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f43805c = null;
    }
}
