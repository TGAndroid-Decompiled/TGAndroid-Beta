package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class s00 extends cg.b {
    public View.OnClickListener f41085c;
    public CharSequence d;
    public String f41086e;
    public boolean f41087f;
    public boolean f41088g;
    public long h;
    public String f41089i;
    public int f41090j;
    public int f41091k;
    public boolean f41092l;
    public TL_chatlists.TL_exportedChatlistInvite f41093m;

    public static s00 b(int i10, String str, boolean z4) {
        ?? bVar = new cg.b(4, false);
        bVar.f41091k = i10;
        bVar.d = str;
        bVar.f41092l = z4;
        return bVar;
    }

    public static s00 c(int i10, String str, String str2, boolean z4) {
        ?? bVar = new cg.b(1, false);
        bVar.f41088g = z4;
        bVar.d = str;
        bVar.f41089i = str2;
        bVar.f41090j = i10;
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
                        if (!TextUtils.equals(this.d, s00Var.d) || !TextUtils.equals(this.f41086e, s00Var.f41086e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, s00Var.d)) {
                        int i11 = this.f2505a;
                        if (i11 == 0) {
                            if (this.f41087f != s00Var.f41087f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != s00Var.h || !TextUtils.equals(this.f41089i, s00Var.f41089i) || this.f41090j != s00Var.f41090j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f41093m) != (tL_exportedChatlistInvite2 = s00Var.f41093m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f41093m;
                                boolean z4 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = s00Var.f41093m;
                                if (z4 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f41093m.peers.size() != s00Var.f41093m.peers.size()) {
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
