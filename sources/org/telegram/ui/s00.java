package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class s00 extends og.a {
    public View.OnClickListener f37540c;
    public CharSequence d;
    public String e;
    public boolean f37541f;
    public boolean f37542g;
    public long h;
    public String f37543i;
    public int f37544j;
    public int f37545k;
    public boolean f37546l;
    public TL_chatlists.TL_exportedChatlistInvite f37547m;

    public static s00 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(4, false);
        aVar.f37545k = i10;
        aVar.d = str;
        aVar.f37546l = z10;
        return aVar;
    }

    public static s00 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new og.a(1, false);
        aVar.f37542g = z10;
        aVar.d = str;
        aVar.f37543i = str2;
        aVar.f37544j = i10;
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
                int i10 = this.f15700a;
                if (i10 == s00Var.f15700a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, s00Var.d) || !TextUtils.equals(this.e, s00Var.e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, s00Var.d)) {
                        int i11 = this.f15700a;
                        if (i11 == 0) {
                            if (this.f37541f != s00Var.f37541f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != s00Var.h || !TextUtils.equals(this.f37543i, s00Var.f37543i) || this.f37544j != s00Var.f37544j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f37547m) != (tL_exportedChatlistInvite2 = s00Var.f37547m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f37547m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = s00Var.f37547m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f37547m.peers.size() != s00Var.f37547m.peers.size()) {
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
