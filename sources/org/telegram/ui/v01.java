package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class v01 {
    public final String f44152a;
    public final Runnable f44153b;
    public final String f44154c;
    public final String[] d;
    public final int e;
    public final int f44155f;
    public int f44156g;
    public String h;

    public v01(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof v01) && this.f44155f == ((v01) obj).f44155f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f44156g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f44155f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public v01(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public v01(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public v01(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f44155f = i10;
        this.f44152a = str;
        this.f44154c = str2;
        this.f44153b = runnable;
        this.e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
