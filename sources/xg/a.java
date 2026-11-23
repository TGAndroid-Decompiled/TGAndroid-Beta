package xg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends rg.a {
    public CharSequence f60509c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f60510e;
    public Object f60511f;
    public boolean f60512g;
    public long h;
    public int f60513i;
    public int f60514j;
    public List f60515k;
    public int f60516l;
    public TLObject f60517m;

    public static a b(int i7, TLRPC.Chat chat, boolean z10) {
        ?? aVar = new rg.a(9, false);
        aVar.f60510e = chat;
        aVar.d = null;
        aVar.f60512g = z10;
        aVar.f60513i = i7;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new rg.a(7, false);
        aVar.f60509c = charSequence;
        aVar.f60512g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i7, long j3, boolean z10, boolean z11) {
        ?? aVar = new rg.a(17, z10);
        aVar.f60513i = i7;
        aVar.h = j3;
        aVar.f60517m = tL_starsGiveawayOption;
        aVar.f60512g = z11;
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
        aVar.f60516l = i7;
        aVar.f60512g = z10;
        aVar.f60511f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new rg.a(6, false);
        aVar.f60509c = str;
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
            if (a.class == aVar.getClass() && (i7 = (aVar2 = (a) aVar).f56634a) == (i10 = this.f56634a)) {
                if (i10 == 0) {
                    if (this.f60512g == aVar2.f60512g) {
                        return true;
                    }
                    return false;
                } else if (i7 == 17) {
                    if (this.f60513i == aVar2.f60513i && this.h == aVar2.h && this.f60517m == aVar2.f60517m && this.f60512g == aVar2.f60512g && this.f56635b == aVar2.f56635b) {
                        return true;
                    }
                    return false;
                } else if (i10 == 5) {
                    if (this.f60513i == aVar2.f60513i && g(this.f60515k, aVar2.f60515k)) {
                        return true;
                    }
                    return false;
                } else if (i10 == 13 && this.f60513i == aVar2.f60513i && TextUtils.equals(this.f60509c, aVar2.f60509c)) {
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
                int i7 = this.f56634a;
                if (i7 == aVar.f56634a) {
                    if (i7 != 0) {
                        if (i7 == 17) {
                            if (this.f60513i == aVar.f60513i && this.f60517m == aVar.f60517m) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 5) {
                            return g(this.f60515k, aVar.f60515k);
                        } else {
                            if (i7 == 13) {
                                return TextUtils.equals(this.f60509c, aVar.f60509c);
                            }
                            if (this.f60510e == aVar.f60510e && this.f60511f == aVar.f60511f && this.d == aVar.d && this.f60517m == aVar.f60517m && this.f60512g == aVar.f60512g && this.f60513i == aVar.f60513i && this.f60514j == aVar.f60514j && this.h == aVar.h && this.f60516l == aVar.f60516l && TextUtils.equals(this.f60509c, aVar.f60509c)) {
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
