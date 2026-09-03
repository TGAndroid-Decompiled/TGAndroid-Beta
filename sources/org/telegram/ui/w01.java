package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class w01 {
    public final String f42240a;
    public final Runnable f42241b;
    public final String f42242c;
    public final String[] d;
    public final int f42243e;
    public final int f42244f;
    public int f42245g;
    public String h;

    public w01(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof w01) && this.f42244f == ((w01) obj).f42244f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f42245g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f42244f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public w01(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public w01(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public w01(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f42244f = i10;
        this.f42240a = str;
        this.f42242c = str2;
        this.f42241b = runnable;
        this.f42243e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
