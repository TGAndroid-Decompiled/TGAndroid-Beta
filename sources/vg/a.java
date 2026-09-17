package vg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends pg.a {
    public CharSequence f47814c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f47815e;
    public Object f47816f;
    public boolean f47817g;
    public long h;
    public int f47818i;
    public int f47819j;
    public List f47820k;
    public int f47821l;
    public TLObject f47822m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new pg.a(9, false);
        aVar.f47815e = chat;
        aVar.d = null;
        aVar.f47817g = z10;
        aVar.f47818i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new pg.a(7, false);
        aVar.f47814c = charSequence;
        aVar.f47817g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new pg.a(17, z10);
        aVar.f47818i = i10;
        aVar.h = j3;
        aVar.f47822m = tL_starsGiveawayOption;
        aVar.f47817g = z11;
        return aVar;
    }

    public static a e(int i10, int i11, boolean z10, ArrayList arrayList) {
        boolean z11;
        if (i11 == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        ?? aVar = new pg.a(11, z11);
        aVar.f47821l = i10;
        aVar.f47817g = z10;
        aVar.f47816f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new pg.a(6, false);
        aVar.f47814c = str;
        return aVar;
    }

    public static boolean g(List list, List list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((Integer) list.get(i10)).intValue() != ((Integer) list2.get(i10)).intValue()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean a(pg.a aVar) {
        a aVar2;
        int i10;
        int i11;
        if (this != aVar) {
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f44099a) == (i11 = this.f44099a)) {
                if (i11 == 0) {
                    if (this.f47817g == aVar2.f47817g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f47818i == aVar2.f47818i && this.h == aVar2.h && this.f47822m == aVar2.f47822m && this.f47817g == aVar2.f47817g && this.f44100b == aVar2.f44100b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f47818i == aVar2.f47818i && g(this.f47820k, aVar2.f47820k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f47818i == aVar2.f47818i && TextUtils.equals(this.f47814c, aVar2.f47814c)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                int i10 = this.f44099a;
                if (i10 == aVar.f44099a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f47818i == aVar.f47818i && this.f47822m == aVar.f47822m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f47820k, aVar.f47820k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f47814c, aVar.f47814c);
                            }
                            if (this.f47815e == aVar.f47815e && this.f47816f == aVar.f47816f && this.d == aVar.d && this.f47822m == aVar.f47822m && this.f47817g == aVar.f47817g && this.f47818i == aVar.f47818i && this.f47819j == aVar.f47819j && this.h == aVar.h && this.f47821l == aVar.f47821l && TextUtils.equals(this.f47814c, aVar.f47814c)) {
                                return true;
                            }
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
