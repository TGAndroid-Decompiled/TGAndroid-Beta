package vg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends pg.a {
    public CharSequence f47813c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f47814e;
    public Object f47815f;
    public boolean f47816g;
    public long h;
    public int f47817i;
    public int f47818j;
    public List f47819k;
    public int f47820l;
    public TLObject f47821m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new pg.a(9, false);
        aVar.f47814e = chat;
        aVar.d = null;
        aVar.f47816g = z10;
        aVar.f47817i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new pg.a(7, false);
        aVar.f47813c = charSequence;
        aVar.f47816g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new pg.a(17, z10);
        aVar.f47817i = i10;
        aVar.h = j3;
        aVar.f47821m = tL_starsGiveawayOption;
        aVar.f47816g = z11;
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
        aVar.f47820l = i10;
        aVar.f47816g = z10;
        aVar.f47815f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new pg.a(6, false);
        aVar.f47813c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f44098a) == (i11 = this.f44098a)) {
                if (i11 == 0) {
                    if (this.f47816g == aVar2.f47816g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f47817i == aVar2.f47817i && this.h == aVar2.h && this.f47821m == aVar2.f47821m && this.f47816g == aVar2.f47816g && this.f44099b == aVar2.f44099b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f47817i == aVar2.f47817i && g(this.f47819k, aVar2.f47819k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f47817i == aVar2.f47817i && TextUtils.equals(this.f47813c, aVar2.f47813c)) {
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
                int i10 = this.f44098a;
                if (i10 == aVar.f44098a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f47817i == aVar.f47817i && this.f47821m == aVar.f47821m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f47819k, aVar.f47819k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f47813c, aVar.f47813c);
                            }
                            if (this.f47814e == aVar.f47814e && this.f47815f == aVar.f47815f && this.d == aVar.d && this.f47821m == aVar.f47821m && this.f47816g == aVar.f47816g && this.f47817i == aVar.f47817i && this.f47818j == aVar.f47818j && this.h == aVar.h && this.f47820l == aVar.f47820l && TextUtils.equals(this.f47813c, aVar.f47813c)) {
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
