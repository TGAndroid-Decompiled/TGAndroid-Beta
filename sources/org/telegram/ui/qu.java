package org.telegram.ui;

import android.text.TextUtils;
public final class qu extends og.a {
    public final int f36939c;
    public final int d;
    public final int e;
    public final CharSequence f36940f;
    public final CharSequence f36941g;
    public final int h;

    public qu(int i10, String str) {
        super(i10, false);
        this.f36940f = str;
    }

    public static qu b(CharSequence charSequence, String str) {
        return new qu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qu)) {
            return false;
        }
        qu quVar = (qu) obj;
        CharSequence charSequence = quVar.f36940f;
        int i10 = quVar.f15531a;
        int i11 = this.f15531a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f36940f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (quVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || quVar.d != this.d || quVar.e != this.e || quVar.f36939c != this.f36939c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public qu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f36939c = i11;
        this.d = i12;
        this.e = i13;
        this.f36940f = charSequence;
        this.f36941g = charSequence2;
    }
}
