package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class rw0 {
    public final String f51039a;
    public final Runnable f51040b;
    public final String f51041c;
    public final String[] d;
    public final int f51042e;
    public final int f51043f;
    public int f51044g;
    public String h;

    public rw0(int i7, String str, int i10, Runnable runnable) {
        this(i7, str, null, null, null, i10, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof rw0) && this.f51043f == ((rw0) obj).f51043f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f51044g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f51043f);
        return Utilities.f(serializedData.toByteArray());
    }

    public rw0(int i7, String str, String str2, int i10, Runnable runnable) {
        this(i7, str, null, str2, null, i10, runnable);
    }

    public rw0(int i7, String str, String str2, String str3, int i10, Runnable runnable) {
        this(i7, str, str2, str3, null, i10, runnable);
    }

    public rw0(int i7, String str, String str2, String str3, String str4, int i10, Runnable runnable) {
        this.f51043f = i7;
        this.f51039a = str;
        this.f51041c = str2;
        this.f51040b = runnable;
        this.f51042e = i10;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
