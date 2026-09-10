package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class y00 extends ng.a {
    public View.OnClickListener f38857c;
    public CharSequence d;
    public String e;
    public boolean f38858f;
    public boolean f38859g;
    public long h;
    public String f38860i;
    public int f38861j;
    public int f38862k;
    public boolean f38863l;
    public TL_chatlists.TL_exportedChatlistInvite f38864m;

    public static y00 b(int i10, String str, boolean z10) {
        ?? aVar = new ng.a(4, false);
        aVar.f38862k = i10;
        aVar.d = str;
        aVar.f38863l = z10;
        return aVar;
    }

    public static y00 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new ng.a(1, false);
        aVar.f38859g = z10;
        aVar.d = str;
        aVar.f38860i = str2;
        aVar.f38861j = i10;
        return aVar;
    }

    public static y00 d(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            i10 = 3;
        } else {
            i10 = 6;
        }
        ?? aVar = new ng.a(i10, false);
        aVar.d = str;
        return aVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj != null && y00.class == obj.getClass()) {
                y00 y00Var = (y00) obj;
                int i10 = this.f14046a;
                if (i10 == y00Var.f14046a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, y00Var.d) || !TextUtils.equals(this.e, y00Var.e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, y00Var.d)) {
                        int i11 = this.f14046a;
                        if (i11 == 0) {
                            if (this.f38858f != y00Var.f38858f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != y00Var.h || !TextUtils.equals(this.f38860i, y00Var.f38860i) || this.f38861j != y00Var.f38861j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f38864m) != (tL_exportedChatlistInvite2 = y00Var.f38864m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f38864m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = y00Var.f38864m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f38864m.peers.size() != y00Var.f38864m.peers.size()) {
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
