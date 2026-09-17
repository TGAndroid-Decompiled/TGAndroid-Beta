package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class w00 extends pg.a {
    public View.OnClickListener f41733c;
    public CharSequence d;
    public String f41734e;
    public boolean f41735f;
    public boolean f41736g;
    public long h;
    public String f41737i;
    public int f41738j;
    public int f41739k;
    public boolean f41740l;
    public TL_chatlists.TL_exportedChatlistInvite f41741m;

    public static w00 b(int i10, String str, boolean z10) {
        ?? aVar = new pg.a(4, false);
        aVar.f41739k = i10;
        aVar.d = str;
        aVar.f41740l = z10;
        return aVar;
    }

    public static w00 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new pg.a(1, false);
        aVar.f41736g = z10;
        aVar.d = str;
        aVar.f41737i = str2;
        aVar.f41738j = i10;
        return aVar;
    }

    public static w00 d(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            i10 = 3;
        } else {
            i10 = 6;
        }
        ?? aVar = new pg.a(i10, false);
        aVar.d = str;
        return aVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj != null && w00.class == obj.getClass()) {
                w00 w00Var = (w00) obj;
                int i10 = this.f44072a;
                if (i10 == w00Var.f44072a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, w00Var.d) || !TextUtils.equals(this.f41734e, w00Var.f41734e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, w00Var.d)) {
                        int i11 = this.f44072a;
                        if (i11 == 0) {
                            if (this.f41735f != w00Var.f41735f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != w00Var.h || !TextUtils.equals(this.f41737i, w00Var.f41737i) || this.f41738j != w00Var.f41738j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f41741m) != (tL_exportedChatlistInvite2 = w00Var.f41741m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f41741m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = w00Var.f41741m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f41741m.peers.size() != w00Var.f41741m.peers.size()) {
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
