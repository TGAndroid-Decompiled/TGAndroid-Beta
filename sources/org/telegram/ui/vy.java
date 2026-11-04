package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class vy extends sg.a {
    public View.OnClickListener f50632c;
    public CharSequence d;
    public String f50633e;
    public boolean f50634f;
    public boolean f50635g;
    public long h;
    public String f50636i;
    public int f50637j;
    public int f50638k;
    public boolean f50639l;
    public TL_chatlists.TL_exportedChatlistInvite f50640m;

    public static vy b(int i3, String str, boolean z10) {
        ?? aVar = new sg.a(4, false);
        aVar.f50638k = i3;
        aVar.d = str;
        aVar.f50639l = z10;
        return aVar;
    }

    public static vy c(int i3, String str, String str2, boolean z10) {
        ?? aVar = new sg.a(1, false);
        aVar.f50635g = z10;
        aVar.d = str;
        aVar.f50636i = str2;
        aVar.f50637j = i3;
        return aVar;
    }

    public static vy d(String str) {
        int i3;
        if (TextUtils.isEmpty(str)) {
            i3 = 3;
        } else {
            i3 = 6;
        }
        ?? aVar = new sg.a(i3, false);
        aVar.d = str;
        return aVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj != null && vy.class == obj.getClass()) {
                vy vyVar = (vy) obj;
                int i3 = this.f54715a;
                if (i3 == vyVar.f54715a) {
                    if (i3 == 11) {
                        if (!TextUtils.equals(this.d, vyVar.d) || !TextUtils.equals(this.f50633e, vyVar.f50633e)) {
                            return false;
                        }
                    } else if ((i3 != 0 && i3 != 1 && i3 != 3 && i3 != 4) || TextUtils.equals(this.d, vyVar.d)) {
                        int i10 = this.f54715a;
                        if (i10 == 0) {
                            if (this.f50634f != vyVar.f50634f) {
                                return false;
                            }
                        } else if (i10 == 1) {
                            if (this.h != vyVar.h || !TextUtils.equals(this.f50636i, vyVar.f50636i) || this.f50637j != vyVar.f50637j) {
                                return false;
                            }
                        } else if (i10 == 7 && (tL_exportedChatlistInvite = this.f50640m) != (tL_exportedChatlistInvite2 = vyVar.f50640m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.f50640m;
                                boolean z10 = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = vyVar.f50640m;
                                if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.f50640m.peers.size() != vyVar.f50640m.peers.size()) {
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
