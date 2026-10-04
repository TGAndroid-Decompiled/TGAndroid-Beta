package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends og.a {
    public CharSequence f47637c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f47638e;
    public Object f47639f;
    public boolean f47640g;
    public long h;
    public int f47641i;
    public int f47642j;
    public List f47643k;
    public int f47644l;
    public TLObject f47645m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new og.a(9, false);
        aVar.f47638e = chat;
        aVar.d = null;
        aVar.f47640g = z10;
        aVar.f47641i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new og.a(7, false);
        aVar.f47637c = charSequence;
        aVar.f47640g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new og.a(17, z10);
        aVar.f47641i = i10;
        aVar.h = j3;
        aVar.f47645m = tL_starsGiveawayOption;
        aVar.f47640g = z11;
        return aVar;
    }

    public static a e(int i10, int i11, boolean z10, ArrayList arrayList) {
        boolean z11;
        if (i11 == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        ?? aVar = new og.a(11, z11);
        aVar.f47644l = i10;
        aVar.f47640g = z10;
        aVar.f47639f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new og.a(6, false);
        aVar.f47637c = str;
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
    public final boolean a(og.a aVar) {
        a aVar2;
        int i10;
        int i11;
        if (this != aVar) {
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f17187a) == (i11 = this.f17187a)) {
                if (i11 == 0) {
                    if (this.f47640g == aVar2.f47640g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f47641i == aVar2.f47641i && this.h == aVar2.h && this.f47645m == aVar2.f47645m && this.f47640g == aVar2.f47640g && this.f17188b == aVar2.f17188b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f47641i == aVar2.f47641i && g(this.f47643k, aVar2.f47643k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f47641i == aVar2.f47641i && TextUtils.equals(this.f47637c, aVar2.f47637c)) {
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
                int i10 = this.f17187a;
                if (i10 == aVar.f17187a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f47641i == aVar.f47641i && this.f47645m == aVar.f47645m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f47643k, aVar.f47643k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f47637c, aVar.f47637c);
                            }
                            if (this.f47638e == aVar.f47638e && this.f47639f == aVar.f47639f && this.d == aVar.d && this.f47645m == aVar.f47645m && this.f47640g == aVar.f47640g && this.f47641i == aVar.f47641i && this.f47642j == aVar.f47642j && this.h == aVar.h && this.f47644l == aVar.f47644l && TextUtils.equals(this.f47637c, aVar.f47637c)) {
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
