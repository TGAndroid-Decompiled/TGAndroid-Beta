package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class v00 extends og.a {
    public View.OnClickListener f38397c;
    public CharSequence d;
    public String e;
    public boolean f38398f;
    public boolean f38399g;
    public long h;
    public String f38400i;
    public int f38401j;
    public int f38402k;
    public boolean f38403l;
    public TL_chatlists.TL_exportedChatlistInvite f38404m;

    public static v00 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(4, false);
        aVar.f38402k = i10;
        aVar.d = str;
        aVar.f38403l = z10;
        return aVar;
    }

    public static v00 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new og.a(1, false);
        aVar.f38399g = z10;
        aVar.d = str;
        aVar.f38400i = str2;
        aVar.f38401j = i10;
        return aVar;
    }

    public static v00 d(String str) {
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
            if (obj != null && v00.class == obj.getClass()) {
                v00 v00Var = (v00) obj;
                int i10 = this.f15754a;
                if (i10 == v00Var.f15754a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, v00Var.d) || !TextUtils.equals(this.e, v00Var.e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, v00Var.d)) {
                        int i11 = this.f15754a;
                        if (i11 == 0) {
                            if (this.f38398f != v00Var.f38398f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != v00Var.h || !TextUtils.equals(this.f38400i, v00Var.f38400i) || this.f38401j != v00Var.f38401j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f38404m) != (tL_exportedChatlistInvite2 = v00Var.f38404m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f38404m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = v00Var.f38404m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f38404m.peers.size() != v00Var.f38404m.peers.size()) {
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
