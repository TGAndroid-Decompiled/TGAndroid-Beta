package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends og.a {
    public CharSequence f48902c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f48903e;
    public Object f48904f;
    public boolean f48905g;
    public long h;
    public int f48906i;
    public int f48907j;
    public List f48908k;
    public int f48909l;
    public TLObject f48910m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new og.a(9, false);
        aVar.f48903e = chat;
        aVar.d = null;
        aVar.f48905g = z10;
        aVar.f48906i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new og.a(7, false);
        aVar.f48902c = charSequence;
        aVar.f48905g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new og.a(17, z10);
        aVar.f48906i = i10;
        aVar.h = j3;
        aVar.f48910m = tL_starsGiveawayOption;
        aVar.f48905g = z11;
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
        aVar.f48909l = i10;
        aVar.f48905g = z10;
        aVar.f48904f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new og.a(6, false);
        aVar.f48902c = str;
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
                    if (this.f48905g == aVar2.f48905g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f48906i == aVar2.f48906i && this.h == aVar2.h && this.f48910m == aVar2.f48910m && this.f48905g == aVar2.f48905g && this.f17126b == aVar2.f17126b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f48906i == aVar2.f48906i && g(this.f48908k, aVar2.f48908k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f48906i == aVar2.f48906i && TextUtils.equals(this.f48902c, aVar2.f48902c)) {
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
                            if (this.f48906i == aVar.f48906i && this.f48910m == aVar.f48910m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f48908k, aVar.f48908k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f48902c, aVar.f48902c);
                            }
                            if (this.f48903e == aVar.f48903e && this.f48904f == aVar.f48904f && this.d == aVar.d && this.f48910m == aVar.f48910m && this.f48905g == aVar.f48905g && this.f48906i == aVar.f48906i && this.f48907j == aVar.f48907j && this.h == aVar.h && this.f48909l == aVar.f48909l && TextUtils.equals(this.f48902c, aVar.f48902c)) {
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
