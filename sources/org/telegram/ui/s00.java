package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class s00 extends og.a {
    public View.OnClickListener f37651c;
    public CharSequence d;
    public String e;
    public boolean f37652f;
    public boolean f37653g;
    public long h;
    public String f37654i;
    public int f37655j;
    public int f37656k;
    public boolean f37657l;
    public TL_chatlists.TL_exportedChatlistInvite f37658m;

    public static s00 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(4, false);
        aVar.f37656k = i10;
        aVar.d = str;
        aVar.f37657l = z10;
        return aVar;
    }

    public static s00 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new og.a(1, false);
        aVar.f37653g = z10;
        aVar.d = str;
        aVar.f37654i = str2;
        aVar.f37655j = i10;
        return aVar;
    }

    public static s00 d(String str) {
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
            if (obj != null && s00.class == obj.getClass()) {
                s00 s00Var = (s00) obj;
                int i10 = this.f15731a;
                if (i10 == s00Var.f15731a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, s00Var.d) || !TextUtils.equals(this.e, s00Var.e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, s00Var.d)) {
                        int i11 = this.f15731a;
                        if (i11 == 0) {
                            if (this.f37652f != s00Var.f37652f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != s00Var.h || !TextUtils.equals(this.f37654i, s00Var.f37654i) || this.f37655j != s00Var.f37655j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f37658m) != (tL_exportedChatlistInvite2 = s00Var.f37658m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f37658m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = s00Var.f37658m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f37658m.peers.size() != s00Var.f37658m.peers.size()) {
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
