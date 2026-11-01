package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class zz extends hg.b {
    public View.OnClickListener f44256c;
    public CharSequence d;
    public String e;
    public boolean f44257f;
    public boolean f44258g;
    public long h;
    public String f44259i;
    public int f44260j;
    public int f44261k;
    public boolean f44262l;
    public TL_chatlists.TL_exportedChatlistInvite f44263m;

    public static zz b(int i10, String str, boolean z10) {
        ?? bVar = new hg.b(4, false);
        bVar.f44261k = i10;
        bVar.d = str;
        bVar.f44262l = z10;
        return bVar;
    }

    public static zz c(int i10, String str, String str2, boolean z10) {
        ?? bVar = new hg.b(1, false);
        bVar.f44258g = z10;
        bVar.d = str;
        bVar.f44259i = str2;
        bVar.f44260j = i10;
        return bVar;
    }

    public static zz d(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            i10 = 3;
        } else {
            i10 = 6;
        }
        ?? bVar = new hg.b(i10, false);
        bVar.d = str;
        return bVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj != null && zz.class == obj.getClass()) {
                zz zzVar = (zz) obj;
                int i10 = this.f7681a;
                if (i10 == zzVar.f7681a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, zzVar.d) || !TextUtils.equals(this.e, zzVar.e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, zzVar.d)) {
                        int i11 = this.f7681a;
                        if (i11 == 0) {
                            if (this.f44257f != zzVar.f44257f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != zzVar.h || !TextUtils.equals(this.f44259i, zzVar.f44259i) || this.f44260j != zzVar.f44260j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f44263m) != (tL_exportedChatlistInvite2 = zzVar.f44263m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f44263m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = zzVar.f44263m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f44263m.peers.size() != zzVar.f44263m.peers.size()) {
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
