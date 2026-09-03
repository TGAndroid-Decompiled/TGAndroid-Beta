package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class s00 extends cg.b {
    public View.OnClickListener f40972c;
    public CharSequence d;
    public String f40973e;
    public boolean f40974f;
    public boolean f40975g;
    public long h;
    public String f40976i;
    public int f40977j;
    public int f40978k;
    public boolean f40979l;
    public TL_chatlists.TL_exportedChatlistInvite f40980m;

    public static s00 b(int i10, String str, boolean z4) {
        ?? bVar = new cg.b(4, false);
        bVar.f40978k = i10;
        bVar.d = str;
        bVar.f40979l = z4;
        return bVar;
    }

    public static s00 c(int i10, String str, String str2, boolean z4) {
        ?? bVar = new cg.b(1, false);
        bVar.f40975g = z4;
        bVar.d = str;
        bVar.f40976i = str2;
        bVar.f40977j = i10;
        return bVar;
    }

    public static s00 d(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            i10 = 3;
        } else {
            i10 = 6;
        }
        ?? bVar = new cg.b(i10, false);
        bVar.d = str;
        return bVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj != null && s00.class == obj.getClass()) {
                s00 s00Var = (s00) obj;
                int i10 = this.f2505a;
                if (i10 == s00Var.f2505a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, s00Var.d) || !TextUtils.equals(this.f40973e, s00Var.f40973e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, s00Var.d)) {
                        int i11 = this.f2505a;
                        if (i11 == 0) {
                            if (this.f40974f != s00Var.f40974f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != s00Var.h || !TextUtils.equals(this.f40976i, s00Var.f40976i) || this.f40977j != s00Var.f40977j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f40980m) != (tL_exportedChatlistInvite2 = s00Var.f40980m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f40980m;
                                boolean z4 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = s00Var.f40980m;
                                if (z4 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f40980m.peers.size() != s00Var.f40980m.peers.size()) {
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
