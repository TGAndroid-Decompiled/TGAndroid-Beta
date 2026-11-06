package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class yy extends rg.a {
    public View.OnClickListener f52362c;
    public CharSequence d;
    public String f52363e;
    public boolean f52364f;
    public boolean f52365g;
    public long h;
    public String f52366i;
    public int f52367j;
    public int f52368k;
    public boolean f52369l;
    public TL_chatlists.TL_exportedChatlistInvite f52370m;

    public static yy b(int i7, String str, boolean z9) {
        ?? aVar = new rg.a(4, false);
        aVar.f52368k = i7;
        aVar.d = str;
        aVar.f52369l = z9;
        return aVar;
    }

    public static yy c(int i7, String str, String str2, boolean z9) {
        ?? aVar = new rg.a(1, false);
        aVar.f52365g = z9;
        aVar.d = str;
        aVar.f52366i = str2;
        aVar.f52367j = i7;
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
                int i7 = this.f54415a;
                if (i7 == yyVar.f54415a) {
                    if (i7 == 11) {
                        if (!TextUtils.equals(this.d, yyVar.d) || !TextUtils.equals(this.f52363e, yyVar.f52363e)) {
                            return false;
                        }
                    } else if ((i7 != 0 && i7 != 1 && i7 != 3 && i7 != 4) || TextUtils.equals(this.d, yyVar.d)) {
                        int i10 = this.f54415a;
                        if (i10 == 0) {
                            if (this.f52364f != yyVar.f52364f) {
                                return false;
                            }
                        } else if (i10 == 1) {
                            if (this.h != yyVar.h || !TextUtils.equals(this.f52366i, yyVar.f52366i) || this.f52367j != yyVar.f52367j) {
                                return false;
                            }
                        } else if (i10 == 7 && (tL_exportedChatlistInvite = this.f52370m) != (tL_exportedChatlistInvite2 = yyVar.f52370m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f52370m;
                                boolean z9 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = yyVar.f52370m;
                                if (z9 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f52370m.peers.size() != yyVar.f52370m.peers.size()) {
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
