package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class s00 extends bg.b {
    public View.OnClickListener f38157c;
    public CharSequence d;
    public String e;
    public boolean f38158f;
    public boolean f38159g;
    public long h;
    public String f38160i;
    public int f38161j;
    public int f38162k;
    public boolean f38163l;
    public TL_chatlists.TL_exportedChatlistInvite f38164m;

    public static s00 b(int i10, String str, boolean z4) {
        ?? bVar = new bg.b(4, false);
        bVar.f38162k = i10;
        bVar.d = str;
        bVar.f38163l = z4;
        return bVar;
    }

    public static s00 c(int i10, String str, String str2, boolean z4) {
        ?? bVar = new bg.b(1, false);
        bVar.f38159g = z4;
        bVar.d = str;
        bVar.f38160i = str2;
        bVar.f38161j = i10;
        return bVar;
    }

    public static s00 d(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            i10 = 3;
        } else {
            i10 = 6;
        }
        ?? bVar = new bg.b(i10, false);
        bVar.d = str;
        return bVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj != null && s00.class == obj.getClass()) {
                s00 s00Var = (s00) obj;
                int i10 = this.f1808a;
                if (i10 == s00Var.f1808a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, s00Var.d) || !TextUtils.equals(this.e, s00Var.e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, s00Var.d)) {
                        int i11 = this.f1808a;
                        if (i11 == 0) {
                            if (this.f38158f != s00Var.f38158f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != s00Var.h || !TextUtils.equals(this.f38160i, s00Var.f38160i) || this.f38161j != s00Var.f38161j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f38164m) != (tL_exportedChatlistInvite2 = s00Var.f38164m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f38164m;
                                boolean z4 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = s00Var.f38164m;
                                if (z4 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f38164m.peers.size() != s00Var.f38164m.peers.size()) {
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
