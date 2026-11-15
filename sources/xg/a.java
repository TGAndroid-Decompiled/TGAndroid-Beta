package xg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends rg.a {
    public CharSequence f59894c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f59895e;
    public Object f59896f;
    public boolean f59897g;
    public long h;
    public int f59898i;
    public int f59899j;
    public List f59900k;
    public int f59901l;
    public TLObject f59902m;

    public static a b(int i7, TLRPC.Chat chat, boolean z10) {
        ?? aVar = new rg.a(9, false);
        aVar.f59895e = chat;
        aVar.d = null;
        aVar.f59897g = z10;
        aVar.f59898i = i7;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new rg.a(7, false);
        aVar.f59894c = charSequence;
        aVar.f59897g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i7, long j3, boolean z10, boolean z11) {
        ?? aVar = new rg.a(17, z10);
        aVar.f59898i = i7;
        aVar.h = j3;
        aVar.f59902m = tL_starsGiveawayOption;
        aVar.f59897g = z11;
        return aVar;
    }

    public static a e(int i7, int i10, boolean z10, ArrayList arrayList) {
        boolean z11;
        if (i10 == i7) {
            z11 = true;
        } else {
            z11 = false;
        }
        ?? aVar = new rg.a(11, z11);
        aVar.f59901l = i7;
        aVar.f59897g = z10;
        aVar.f59896f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new rg.a(6, false);
        aVar.f59894c = str;
        return aVar;
    }

    public static boolean g(List list, List list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (((Integer) list.get(i7)).intValue() != ((Integer) list2.get(i7)).intValue()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean a(rg.a aVar) {
        a aVar2;
        int i7;
        int i10;
        if (this != aVar) {
            if (a.class == aVar.getClass() && (i7 = (aVar2 = (a) aVar).f56015a) == (i10 = this.f56015a)) {
                if (i10 == 0) {
                    if (this.f59897g == aVar2.f59897g) {
                        return true;
                    }
                    return false;
                } else if (i7 == 17) {
                    if (this.f59898i == aVar2.f59898i && this.h == aVar2.h && this.f59902m == aVar2.f59902m && this.f59897g == aVar2.f59897g && this.f56016b == aVar2.f56016b) {
                        return true;
                    }
                    return false;
                } else if (i10 == 5) {
                    if (this.f59898i == aVar2.f59898i && g(this.f59900k, aVar2.f59900k)) {
                        return true;
                    }
                    return false;
                } else if (i10 == 13 && this.f59898i == aVar2.f59898i && TextUtils.equals(this.f59894c, aVar2.f59894c)) {
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
                int i7 = this.f56015a;
                if (i7 == aVar.f56015a) {
                    if (i7 != 0) {
                        if (i7 == 17) {
                            if (this.f59898i == aVar.f59898i && this.f59902m == aVar.f59902m) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 5) {
                            return g(this.f59900k, aVar.f59900k);
                        } else {
                            if (i7 == 13) {
                                return TextUtils.equals(this.f59894c, aVar.f59894c);
                            }
                            if (this.f59895e == aVar.f59895e && this.f59896f == aVar.f59896f && this.d == aVar.d && this.f59902m == aVar.f59902m && this.f59897g == aVar.f59897g && this.f59898i == aVar.f59898i && this.f59899j == aVar.f59899j && this.h == aVar.h && this.f59901l == aVar.f59901l && TextUtils.equals(this.f59894c, aVar.f59894c)) {
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
