package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class vw0 {
    public final String f50791a;
    public final Runnable f50792b;
    public final String f50793c;
    public final String[] d;
    public final int f50794e;
    public final int f50795f;
    public int f50796g;
    public String h;

    public vw0(int i7, String str, int i10, Runnable runnable) {
        this(i7, str, null, null, null, i10, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof vw0) && this.f50795f == ((vw0) obj).f50795f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f50796g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f50795f);
        return Utilities.f(serializedData.toByteArray());
    }

    public vw0(int i7, String str, String str2, int i10, Runnable runnable) {
        this(i7, str, null, str2, null, i10, runnable);
    }

    public vw0(int i7, String str, String str2, String str3, int i10, Runnable runnable) {
        this(i7, str, str2, str3, null, i10, runnable);
    }

    public vw0(int i7, String str, String str2, String str3, String str4, int i10, Runnable runnable) {
        this.f50795f = i7;
        this.f50791a = str;
        this.f50793c = str2;
        this.f50792b = runnable;
        this.f50794e = i10;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
