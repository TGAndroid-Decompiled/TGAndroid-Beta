package org.telegram.ui;

import android.text.TextUtils;
public final class qu extends og.a {
    public final int f36937c;
    public final int d;
    public final int e;
    public final CharSequence f36938f;
    public final CharSequence f36939g;
    public final int h;

    public qu(int i10, String str) {
        super(i10, false);
        this.f36938f = str;
    }

    public static qu b(CharSequence charSequence, String str) {
        return new qu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qu)) {
            return false;
        }
        qu quVar = (qu) obj;
        CharSequence charSequence = quVar.f36938f;
        int i10 = quVar.f15533a;
        int i11 = this.f15533a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f36938f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (quVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || quVar.d != this.d || quVar.e != this.e || quVar.f36937c != this.f36937c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public qu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f36937c = i11;
        this.d = i12;
        this.e = i13;
        this.f36938f = charSequence;
        this.f36939g = charSequence2;
    }
}
