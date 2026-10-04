package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class w00 extends og.a {
    public View.OnClickListener f41880c;
    public CharSequence d;
    public String f41881e;
    public boolean f41882f;
    public boolean f41883g;
    public long h;
    public String f41884i;
    public int f41885j;
    public int f41886k;
    public boolean f41887l;
    public TL_chatlists.TL_exportedChatlistInvite f41888m;

    public static w00 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(4, false);
        aVar.f41886k = i10;
        aVar.d = str;
        aVar.f41887l = z10;
        return aVar;
    }

    public static w00 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new og.a(1, false);
        aVar.f41883g = z10;
        aVar.d = str;
        aVar.f41884i = str2;
        aVar.f41885j = i10;
        return aVar;
    }

    public static w00 d(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            i10 = 3;
        } else {
            i10 = 6;
        }
        ?? aVar = new og.a(i10, false);
        aVar.d = str;
        return aVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj != null && w00.class == obj.getClass()) {
                w00 w00Var = (w00) obj;
                int i10 = this.f17187a;
                if (i10 == w00Var.f17187a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, w00Var.d) || !TextUtils.equals(this.f41881e, w00Var.f41881e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, w00Var.d)) {
                        int i11 = this.f17187a;
                        if (i11 == 0) {
                            if (this.f41882f != w00Var.f41882f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != w00Var.h || !TextUtils.equals(this.f41884i, w00Var.f41884i) || this.f41885j != w00Var.f41885j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f41888m) != (tL_exportedChatlistInvite2 = w00Var.f41888m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f41888m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = w00Var.f41888m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f41888m.peers.size() != w00Var.f41888m.peers.size()) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
