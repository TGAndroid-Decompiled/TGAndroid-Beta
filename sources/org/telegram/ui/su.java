package org.telegram.ui;

import android.text.TextUtils;
public final class su extends ng.a {
    public final int f36756c;
    public final int d;
    public final int e;
    public final CharSequence f36757f;
    public final CharSequence f36758g;
    public final int h;

    public su(int i10, String str) {
        super(i10, false);
        this.f36757f = str;
    }

    public static su b(CharSequence charSequence, String str) {
        return new su(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof su)) {
            return false;
        }
        su suVar = (su) obj;
        CharSequence charSequence = suVar.f36757f;
        int i10 = suVar.f14046a;
        int i11 = this.f14046a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f36757f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (suVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || suVar.d != this.d || suVar.e != this.e || suVar.f36756c != this.f36756c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public su(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f36756c = i11;
        this.d = i12;
        this.e = i13;
        this.f36757f = charSequence;
        this.f36758g = charSequence2;
    }
}
