package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class y00 extends og.a {
    public View.OnClickListener f44225c;
    public CharSequence d;
    public String f44226e;
    public boolean f44227f;
    public boolean f44228g;
    public long h;
    public String f44229i;
    public int f44230j;
    public int f44231k;
    public boolean f44232l;
    public TL_chatlists.TL_exportedChatlistInvite f44233m;

    public static y00 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(4, false);
        aVar.f44231k = i10;
        aVar.d = str;
        aVar.f44232l = z10;
        return aVar;
    }

    public static y00 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new og.a(1, false);
        aVar.f44228g = z10;
        aVar.d = str;
        aVar.f44229i = str2;
        aVar.f44230j = i10;
        return aVar;
    }

    public static y00 d(String str) {
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
            if (obj != null && y00.class == obj.getClass()) {
                y00 y00Var = (y00) obj;
                int i10 = this.f16877a;
                if (i10 == y00Var.f16877a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, y00Var.d) || !TextUtils.equals(this.f44226e, y00Var.f44226e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, y00Var.d)) {
                        int i11 = this.f16877a;
                        if (i11 == 0) {
                            if (this.f44227f != y00Var.f44227f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != y00Var.h || !TextUtils.equals(this.f44229i, y00Var.f44229i) || this.f44230j != y00Var.f44230j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f44233m) != (tL_exportedChatlistInvite2 = y00Var.f44233m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f44233m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = y00Var.f44233m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f44233m.peers.size() != y00Var.f44233m.peers.size()) {
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
