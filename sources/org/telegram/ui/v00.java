package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class v00 extends og.a {
    public View.OnClickListener f42847c;
    public CharSequence d;
    public String f42848e;
    public boolean f42849f;
    public boolean f42850g;
    public long h;
    public String f42851i;
    public int f42852j;
    public int f42853k;
    public boolean f42854l;
    public TL_chatlists.TL_exportedChatlistInvite f42855m;

    public static v00 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(4, false);
        aVar.f42853k = i10;
        aVar.d = str;
        aVar.f42854l = z10;
        return aVar;
    }

    public static v00 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new og.a(1, false);
        aVar.f42850g = z10;
        aVar.d = str;
        aVar.f42851i = str2;
        aVar.f42852j = i10;
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
                int i10 = this.f17211a;
                if (i10 == v00Var.f17211a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, v00Var.d) || !TextUtils.equals(this.f42848e, v00Var.f42848e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, v00Var.d)) {
                        int i11 = this.f17211a;
                        if (i11 == 0) {
                            if (this.f42849f != v00Var.f42849f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != v00Var.h || !TextUtils.equals(this.f42851i, v00Var.f42851i) || this.f42852j != v00Var.f42852j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f42855m) != (tL_exportedChatlistInvite2 = v00Var.f42855m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f42855m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = v00Var.f42855m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f42855m.peers.size() != v00Var.f42855m.peers.size()) {
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
