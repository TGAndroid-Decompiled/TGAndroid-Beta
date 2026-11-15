package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class zy extends rg.a {
    public View.OnClickListener f54060c;
    public CharSequence d;
    public String f54061e;
    public boolean f54062f;
    public boolean f54063g;
    public long h;
    public String f54064i;
    public int f54065j;
    public int f54066k;
    public boolean f54067l;
    public TL_chatlists.TL_exportedChatlistInvite f54068m;

    public static zy b(int i7, String str, boolean z10) {
        ?? aVar = new rg.a(4, false);
        aVar.f54066k = i7;
        aVar.d = str;
        aVar.f54067l = z10;
        return aVar;
    }

    public static zy c(int i7, String str, String str2, boolean z10) {
        ?? aVar = new rg.a(1, false);
        aVar.f54063g = z10;
        aVar.d = str;
        aVar.f54064i = str2;
        aVar.f54065j = i7;
        return aVar;
    }

    public static zy d(String str) {
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
            if (obj != null && zy.class == obj.getClass()) {
                zy zyVar = (zy) obj;
                int i7 = this.f56015a;
                if (i7 == zyVar.f56015a) {
                    if (i7 == 11) {
                        if (!TextUtils.equals(this.d, zyVar.d) || !TextUtils.equals(this.f54061e, zyVar.f54061e)) {
                            return false;
                        }
                    } else if ((i7 != 0 && i7 != 1 && i7 != 3 && i7 != 4) || TextUtils.equals(this.d, zyVar.d)) {
                        int i10 = this.f56015a;
                        if (i10 == 0) {
                            if (this.f54062f != zyVar.f54062f) {
                                return false;
                            }
                        } else if (i10 == 1) {
                            if (this.h != zyVar.h || !TextUtils.equals(this.f54064i, zyVar.f54064i) || this.f54065j != zyVar.f54065j) {
                                return false;
                            }
                        } else if (i10 == 7 && (tL_exportedChatlistInvite = this.f54068m) != (tL_exportedChatlistInvite2 = zyVar.f54068m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f54068m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = zyVar.f54068m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f54068m.peers.size() != zyVar.f54068m.peers.size()) {
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
