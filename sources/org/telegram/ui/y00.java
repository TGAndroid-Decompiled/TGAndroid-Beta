package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class y00 extends og.a {
    public View.OnClickListener f39742c;
    public CharSequence d;
    public String e;
    public boolean f39743f;
    public boolean f39744g;
    public long h;
    public String f39745i;
    public int f39746j;
    public int f39747k;
    public boolean f39748l;
    public TL_chatlists.TL_exportedChatlistInvite f39749m;

    public static y00 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(4, false);
        aVar.f39747k = i10;
        aVar.d = str;
        aVar.f39748l = z10;
        return aVar;
    }

    public static y00 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new og.a(1, false);
        aVar.f39744g = z10;
        aVar.d = str;
        aVar.f39745i = str2;
        aVar.f39746j = i10;
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
                int i10 = this.f15543a;
                if (i10 == y00Var.f15543a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, y00Var.d) || !TextUtils.equals(this.e, y00Var.e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, y00Var.d)) {
                        int i11 = this.f15543a;
                        if (i11 == 0) {
                            if (this.f39743f != y00Var.f39743f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != y00Var.h || !TextUtils.equals(this.f39745i, y00Var.f39745i) || this.f39746j != y00Var.f39746j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f39749m) != (tL_exportedChatlistInvite2 = y00Var.f39749m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f39749m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = y00Var.f39749m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f39749m.peers.size() != y00Var.f39749m.peers.size()) {
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
