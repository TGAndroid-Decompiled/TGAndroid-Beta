package org.telegram.ui;

import android.text.TextUtils;
public final class ru extends pg.a {
    public final int f40261c;
    public final int d;
    public final int f40262e;
    public final CharSequence f40263f;
    public final CharSequence f40264g;
    public final int h;

    public ru(int i10, String str) {
        super(i10, false);
        this.f40263f = str;
    }

    public static ru b(CharSequence charSequence, String str) {
        return new ru(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ru)) {
            return false;
        }
        ru ruVar = (ru) obj;
        CharSequence charSequence = ruVar.f40263f;
        int i10 = ruVar.f44098a;
        int i11 = this.f44098a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f40263f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (ruVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || ruVar.d != this.d || ruVar.f40262e != this.f40262e || ruVar.f40261c != this.f40261c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public ru(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f40261c = i11;
        this.d = i12;
        this.f40262e = i13;
        this.f40263f = charSequence;
        this.f40264g = charSequence2;
    }
}
