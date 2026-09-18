package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class y00 extends og.a {
    public View.OnClickListener f39747c;
    public CharSequence d;
    public String e;
    public boolean f39748f;
    public boolean f39749g;
    public long h;
    public String f39750i;
    public int f39751j;
    public int f39752k;
    public boolean f39753l;
    public TL_chatlists.TL_exportedChatlistInvite f39754m;

    public static y00 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(4, false);
        aVar.f39752k = i10;
        aVar.d = str;
        aVar.f39753l = z10;
        return aVar;
    }

    public static y00 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new og.a(1, false);
        aVar.f39749g = z10;
        aVar.d = str;
        aVar.f39750i = str2;
        aVar.f39751j = i10;
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
                            if (this.f39748f != y00Var.f39748f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != y00Var.h || !TextUtils.equals(this.f39750i, y00Var.f39750i) || this.f39751j != y00Var.f39751j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f39754m) != (tL_exportedChatlistInvite2 = y00Var.f39754m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f39754m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = y00Var.f39754m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f39754m.peers.size() != y00Var.f39754m.peers.size()) {
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
