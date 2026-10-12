package org.telegram.ui;

import android.text.TextUtils;
public final class vu extends pg.a {
    public final int f41069c;
    public final int d;
    public final int e;
    public final CharSequence f41070f;
    public final CharSequence f41071g;
    public final int h;

    public vu(int i10, String str) {
        super(i10, false);
        this.f41070f = str;
    }

    public static vu b(CharSequence charSequence, String str) {
        return new vu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vu)) {
            return false;
        }
        vu vuVar = (vu) obj;
        CharSequence charSequence = vuVar.f41070f;
        int i10 = vuVar.f43203a;
        int i11 = this.f43203a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f41070f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (vuVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || vuVar.d != this.d || vuVar.e != this.e || vuVar.f41069c != this.f41069c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public vu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f41069c = i11;
        this.d = i12;
        this.e = i13;
        this.f41070f = charSequence;
        this.f41071g = charSequence2;
    }
}
