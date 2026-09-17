package org.telegram.ui;

import android.text.TextUtils;
public final class ru extends pg.a {
    public final int f40262c;
    public final int d;
    public final int f40263e;
    public final CharSequence f40264f;
    public final CharSequence f40265g;
    public final int h;

    public ru(int i10, String str) {
        super(i10, false);
        this.f40264f = str;
    }

    public static ru b(CharSequence charSequence, String str) {
        return new ru(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ru)) {
            return false;
        }
        ru ruVar = (ru) obj;
        CharSequence charSequence = ruVar.f40264f;
        int i10 = ruVar.f44099a;
        int i11 = this.f44099a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f40264f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (ruVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || ruVar.d != this.d || ruVar.f40263e != this.f40263e || ruVar.f40262c != this.f40262c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public ru(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f40262c = i11;
        this.d = i12;
        this.f40263e = i13;
        this.f40264f = charSequence;
        this.f40265g = charSequence2;
    }
}
