package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends og.a {
    public CharSequence f48900c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f48901e;
    public Object f48902f;
    public boolean f48903g;
    public long h;
    public int f48904i;
    public int f48905j;
    public List f48906k;
    public int f48907l;
    public TLObject f48908m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new og.a(9, false);
        aVar.f48901e = chat;
        aVar.d = null;
        aVar.f48903g = z10;
        aVar.f48904i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new og.a(7, false);
        aVar.f48900c = charSequence;
        aVar.f48903g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new og.a(17, z10);
        aVar.f48904i = i10;
        aVar.h = j3;
        aVar.f48908m = tL_starsGiveawayOption;
        aVar.f48903g = z11;
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
        aVar.f48907l = i10;
        aVar.f48903g = z10;
        aVar.f48902f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new og.a(6, false);
        aVar.f48900c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f17125a) == (i11 = this.f17125a)) {
                if (i11 == 0) {
                    if (this.f48903g == aVar2.f48903g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f48904i == aVar2.f48904i && this.h == aVar2.h && this.f48908m == aVar2.f48908m && this.f48903g == aVar2.f48903g && this.f17126b == aVar2.f17126b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f48904i == aVar2.f48904i && g(this.f48906k, aVar2.f48906k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f48904i == aVar2.f48904i && TextUtils.equals(this.f48900c, aVar2.f48900c)) {
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
                int i10 = this.f17125a;
                if (i10 == aVar.f17125a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f48904i == aVar.f48904i && this.f48908m == aVar.f48908m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f48906k, aVar.f48906k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f48900c, aVar.f48900c);
                            }
                            if (this.f48901e == aVar.f48901e && this.f48902f == aVar.f48902f && this.d == aVar.d && this.f48908m == aVar.f48908m && this.f48903g == aVar.f48903g && this.f48904i == aVar.f48904i && this.f48905j == aVar.f48905j && this.h == aVar.h && this.f48907l == aVar.f48907l && TextUtils.equals(this.f48900c, aVar.f48900c)) {
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
