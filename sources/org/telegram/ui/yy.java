package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class yy extends rg.a {
    public View.OnClickListener f52369c;
    public CharSequence d;
    public String f52370e;
    public boolean f52371f;
    public boolean f52372g;
    public long h;
    public String f52373i;
    public int f52374j;
    public int f52375k;
    public boolean f52376l;
    public TL_chatlists.TL_exportedChatlistInvite f52377m;

    public static yy b(int i7, String str, boolean z9) {
        ?? aVar = new rg.a(4, false);
        aVar.f52375k = i7;
        aVar.d = str;
        aVar.f52376l = z9;
        return aVar;
    }

    public static yy c(int i7, String str, String str2, boolean z9) {
        ?? aVar = new rg.a(1, false);
        aVar.f52372g = z9;
        aVar.d = str;
        aVar.f52373i = str2;
        aVar.f52374j = i7;
        return aVar;
    }

    public static yy d(String str) {
        int i7;
        if (TextUtils.isEmpty(str)) {
            i7 = 3;
        } else {
            i7 = 6;
        }
        ?? aVar = new rg.a(i7, false);
        aVar.d = str;
        return aVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj != null && yy.class == obj.getClass()) {
                yy yyVar = (yy) obj;
                int i7 = this.f54440a;
                if (i7 == yyVar.f54440a) {
                    if (i7 == 11) {
                        if (!TextUtils.equals(this.d, yyVar.d) || !TextUtils.equals(this.f52370e, yyVar.f52370e)) {
                            return false;
                        }
                    } else if ((i7 != 0 && i7 != 1 && i7 != 3 && i7 != 4) || TextUtils.equals(this.d, yyVar.d)) {
                        int i10 = this.f54440a;
                        if (i10 == 0) {
                            if (this.f52371f != yyVar.f52371f) {
                                return false;
                            }
                        } else if (i10 == 1) {
                            if (this.h != yyVar.h || !TextUtils.equals(this.f52373i, yyVar.f52373i) || this.f52374j != yyVar.f52374j) {
                                return false;
                            }
                        } else if (i10 == 7 && (tL_exportedChatlistInvite = this.f52377m) != (tL_exportedChatlistInvite2 = yyVar.f52377m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f52377m;
                                boolean z9 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = yyVar.f52377m;
                                if (z9 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f52377m.peers.size() != yyVar.f52377m.peers.size()) {
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
