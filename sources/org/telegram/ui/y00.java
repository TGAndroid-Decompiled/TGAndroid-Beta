package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class y00 extends og.a {
    public View.OnClickListener f44220c;
    public CharSequence d;
    public String f44221e;
    public boolean f44222f;
    public boolean f44223g;
    public long h;
    public String f44224i;
    public int f44225j;
    public int f44226k;
    public boolean f44227l;
    public TL_chatlists.TL_exportedChatlistInvite f44228m;

    public static y00 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(4, false);
        aVar.f44226k = i10;
        aVar.d = str;
        aVar.f44227l = z10;
        return aVar;
    }

    public static y00 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new og.a(1, false);
        aVar.f44223g = z10;
        aVar.d = str;
        aVar.f44224i = str2;
        aVar.f44225j = i10;
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
                int i10 = this.f16876a;
                if (i10 == y00Var.f16876a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, y00Var.d) || !TextUtils.equals(this.f44221e, y00Var.f44221e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, y00Var.d)) {
                        int i11 = this.f16876a;
                        if (i11 == 0) {
                            if (this.f44222f != y00Var.f44222f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != y00Var.h || !TextUtils.equals(this.f44224i, y00Var.f44224i) || this.f44225j != y00Var.f44225j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f44228m) != (tL_exportedChatlistInvite2 = y00Var.f44228m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f44228m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = y00Var.f44228m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f44228m.peers.size() != y00Var.f44228m.peers.size()) {
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
