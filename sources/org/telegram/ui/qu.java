package org.telegram.ui;

import android.text.TextUtils;
public final class qu extends og.a {
    public final int f39886c;
    public final int d;
    public final int f39887e;
    public final CharSequence f39888f;
    public final CharSequence f39889g;
    public final int h;

    public qu(int i10, String str) {
        super(i10, false);
        this.f39888f = str;
    }

    public static qu b(CharSequence charSequence, String str) {
        return new qu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qu)) {
            return false;
        }
        qu quVar = (qu) obj;
        CharSequence charSequence = quVar.f39888f;
        int i10 = quVar.f17192a;
        int i11 = this.f17192a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f39888f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (quVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || quVar.d != this.d || quVar.f39887e != this.f39887e || quVar.f39886c != this.f39886c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public qu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f39886c = i11;
        this.d = i12;
        this.f39887e = i13;
        this.f39888f = charSequence;
        this.f39889g = charSequence2;
    }
}
