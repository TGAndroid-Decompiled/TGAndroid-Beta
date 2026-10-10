package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class w00 extends og.a {
    public View.OnClickListener f43071c;
    public CharSequence d;
    public String f43072e;
    public boolean f43073f;
    public boolean f43074g;
    public long h;
    public String f43075i;
    public int f43076j;
    public int f43077k;
    public boolean f43078l;
    public TL_chatlists.TL_exportedChatlistInvite f43079m;

    public static w00 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(4, false);
        aVar.f43077k = i10;
        aVar.d = str;
        aVar.f43078l = z10;
        return aVar;
    }

    public static w00 c(int i10, String str, String str2, boolean z10) {
        ?? aVar = new og.a(1, false);
        aVar.f43074g = z10;
        aVar.d = str;
        aVar.f43075i = str2;
        aVar.f43076j = i10;
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
                int i10 = this.f17129a;
                if (i10 == w00Var.f17129a) {
                    if (i10 == 11) {
                        if (!TextUtils.equals(this.d, w00Var.d) || !TextUtils.equals(this.f43072e, w00Var.f43072e)) {
                            return false;
                        }
                    } else if ((i10 != 0 && i10 != 1 && i10 != 3 && i10 != 4) || TextUtils.equals(this.d, w00Var.d)) {
                        int i11 = this.f17129a;
                        if (i11 == 0) {
                            if (this.f43073f != w00Var.f43073f) {
                                return false;
                            }
                        } else if (i11 == 1) {
                            if (this.h != w00Var.h || !TextUtils.equals(this.f43075i, w00Var.f43075i) || this.f43076j != w00Var.f43076j) {
                                return false;
                            }
                        } else if (i11 == 7 && (tL_exportedChatlistInvite = this.f43079m) != (tL_exportedChatlistInvite2 = w00Var.f43079m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f43079m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = w00Var.f43079m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f43079m.peers.size() != w00Var.f43079m.peers.size()) {
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
