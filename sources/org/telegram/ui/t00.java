package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class t00 extends og.a {
    public View.OnClickListener f37477c;
    public CharSequence d;
    public String e;
    public boolean f37478f;
    public boolean f37479g;
    public long h;
    public String f37480i;
    public int f37481j;
    public int f37482k;
    public boolean f37483l;
    public TL_chatlists.TL_exportedChatlistInvite f37484m;

    public static t00 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(4, false);
        aVar.f37482k = i10;
        aVar.d = str;
        aVar.f37483l = z10;
        return aVar;
    }

    public static t00 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new og.a(1, false);
        aVar.f37479g = z10;
        aVar.d = str;
        aVar.f37480i = str2;
        aVar.f37481j = i10;
        return aVar;
    }

    public static t00 d(String str) {
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
            if (obj != null && t00.class == obj.getClass()) {
                t00 t00Var = (t00) obj;
                int i10 = this.f15508a;
                if (i10 == t00Var.f15508a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, t00Var.d) || !TextUtils.equals(this.e, t00Var.e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, t00Var.d)) {
                        int i11 = this.f15508a;
                        if (i11 == 0) {
                            if (this.f37478f != t00Var.f37478f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != t00Var.h || !TextUtils.equals(this.f37480i, t00Var.f37480i) || this.f37481j != t00Var.f37481j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f37484m) != (tL_exportedChatlistInvite2 = t00Var.f37484m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f37484m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = t00Var.f37484m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f37484m.peers.size() != t00Var.f37484m.peers.size()) {
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
