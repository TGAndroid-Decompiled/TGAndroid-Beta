package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class w00 extends og.a {
    public View.OnClickListener f43025c;
    public CharSequence d;
    public String f43026e;
    public boolean f43027f;
    public boolean f43028g;
    public long h;
    public String f43029i;
    public int f43030j;
    public int f43031k;
    public boolean f43032l;
    public TL_chatlists.TL_exportedChatlistInvite f43033m;

    public static w00 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(4, false);
        aVar.f43031k = i10;
        aVar.d = str;
        aVar.f43032l = z10;
        return aVar;
    }

    public static w00 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new og.a(1, false);
        aVar.f43028g = z10;
        aVar.d = str;
        aVar.f43029i = str2;
        aVar.f43030j = i10;
        return aVar;
    }

    public static w00 d(String str) {
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
            if (obj != null && w00.class == obj.getClass()) {
                w00 w00Var = (w00) obj;
                int i10 = this.f17125a;
                if (i10 == w00Var.f17125a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, w00Var.d) || !TextUtils.equals(this.f43026e, w00Var.f43026e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, w00Var.d)) {
                        int i11 = this.f17125a;
                        if (i11 == 0) {
                            if (this.f43027f != w00Var.f43027f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != w00Var.h || !TextUtils.equals(this.f43029i, w00Var.f43029i) || this.f43030j != w00Var.f43030j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f43033m) != (tL_exportedChatlistInvite2 = w00Var.f43033m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f43033m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = w00Var.f43033m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f43033m.peers.size() != w00Var.f43033m.peers.size()) {
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
