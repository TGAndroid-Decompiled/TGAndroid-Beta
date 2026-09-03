package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class t00 extends bg.b {
    public View.OnClickListener f38343c;
    public CharSequence d;
    public String e;
    public boolean f38344f;
    public boolean f38345g;
    public long h;
    public String f38346i;
    public int f38347j;
    public int f38348k;
    public boolean f38349l;
    public TL_chatlists.TL_exportedChatlistInvite f38350m;

    public static t00 b(int i10, String str, boolean z4) {
        ?? bVar = new bg.b(4, false);
        bVar.f38348k = i10;
        bVar.d = str;
        bVar.f38349l = z4;
        return bVar;
    }

    public static t00 c(int i10, String str, String str2, boolean z4) {
        ?? bVar = new bg.b(1, false);
        bVar.f38345g = z4;
        bVar.d = str;
        bVar.f38346i = str2;
        bVar.f38347j = i10;
        return bVar;
    }

    public static t00 d(String str) {
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
            if (obj != null && t00.class == obj.getClass()) {
                t00 t00Var = (t00) obj;
                int i10 = this.f1830a;
                if (i10 == t00Var.f1830a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, t00Var.d) || !TextUtils.equals(this.e, t00Var.e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, t00Var.d)) {
                        int i11 = this.f1830a;
                        if (i11 == 0) {
                            if (this.f38344f != t00Var.f38344f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != t00Var.h || !TextUtils.equals(this.f38346i, t00Var.f38346i) || this.f38347j != t00Var.f38347j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f38350m) != (tL_exportedChatlistInvite2 = t00Var.f38350m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f38350m;
                                boolean z4 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = t00Var.f38350m;
                                if (z4 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f38350m.peers.size() != t00Var.f38350m.peers.size()) {
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
