package wg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends qg.a {
    public CharSequence f51221c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f51222f;
    public boolean f51223g;
    public long h;
    public int f51224i;
    public int f51225j;
    public List f51226k;
    public int f51227l;
    public TLObject f51228m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new qg.a(9, false);
        aVar.e = chat;
        aVar.d = null;
        aVar.f51223g = z10;
        aVar.f51224i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new qg.a(7, false);
        aVar.f51221c = charSequence;
        aVar.f51223g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j10, boolean z10, boolean z11) {
        ?? aVar = new qg.a(17, z10);
        aVar.f51224i = i10;
        aVar.h = j10;
        aVar.f51228m = tL_starsGiveawayOption;
        aVar.f51223g = z11;
        return aVar;
    }

    public static a e(int i10, int i11, boolean z10, ArrayList arrayList) {
        boolean z11;
        if (i11 == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        ?? aVar = new qg.a(11, z11);
        aVar.f51227l = i10;
        aVar.f51223g = z10;
        aVar.f51222f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new qg.a(6, false);
        aVar.f51221c = str;
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
    public final boolean a(qg.a aVar) {
        a aVar2;
        int i10;
        int i11;
        if (this != aVar) {
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f47075a) == (i11 = this.f47075a)) {
                if (i11 == 0) {
                    if (this.f51223g == aVar2.f51223g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f51224i == aVar2.f51224i && this.h == aVar2.h && this.f51228m == aVar2.f51228m && this.f51223g == aVar2.f51223g && this.f47076b == aVar2.f47076b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f51224i == aVar2.f51224i && g(this.f51226k, aVar2.f51226k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f51224i == aVar2.f51224i && TextUtils.equals(this.f51221c, aVar2.f51221c)) {
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
                int i10 = this.f47075a;
                if (i10 == aVar.f47075a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f51224i == aVar.f51224i && this.f51228m == aVar.f51228m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f51226k, aVar.f51226k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f51221c, aVar.f51221c);
                            }
                            if (this.e == aVar.e && this.f51222f == aVar.f51222f && this.d == aVar.d && this.f51228m == aVar.f51228m && this.f51223g == aVar.f51223g && this.f51224i == aVar.f51224i && this.f51225j == aVar.f51225j && this.h == aVar.h && this.f51227l == aVar.f51227l && TextUtils.equals(this.f51221c, aVar.f51221c)) {
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
