package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class tw0 {
    public final String f52489a;
    public final Runnable f52490b;
    public final String f52491c;
    public final String[] d;
    public final int f52492e;
    public final int f52493f;
    public int f52494g;
    public String h;

    public tw0(int i7, String str, int i10, Runnable runnable) {
        this(i7, str, null, null, null, i10, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof tw0) && this.f52493f == ((tw0) obj).f52493f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f52494g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f52493f);
        return Utilities.f(serializedData.toByteArray());
    }

    public tw0(int i7, String str, String str2, int i10, Runnable runnable) {
        this(i7, str, null, str2, null, i10, runnable);
    }

    public tw0(int i7, String str, String str2, String str3, int i10, Runnable runnable) {
        this(i7, str, str2, str3, null, i10, runnable);
    }

    public tw0(int i7, String str, String str2, String str3, String str4, int i10, Runnable runnable) {
        this.f52493f = i7;
        this.f52489a = str;
        this.f52491c = str2;
        this.f52490b = runnable;
        this.f52492e = i10;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
