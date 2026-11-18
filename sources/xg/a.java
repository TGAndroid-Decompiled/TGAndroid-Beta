package xg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends rg.a {
    public CharSequence f60464c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f60465e;
    public Object f60466f;
    public boolean f60467g;
    public long h;
    public int f60468i;
    public int f60469j;
    public List f60470k;
    public int f60471l;
    public TLObject f60472m;

    public static a b(int i7, TLRPC.Chat chat, boolean z10) {
        ?? aVar = new rg.a(9, false);
        aVar.f60465e = chat;
        aVar.d = null;
        aVar.f60467g = z10;
        aVar.f60468i = i7;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new rg.a(7, false);
        aVar.f60464c = charSequence;
        aVar.f60467g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i7, long j3, boolean z10, boolean z11) {
        ?? aVar = new rg.a(17, z10);
        aVar.f60468i = i7;
        aVar.h = j3;
        aVar.f60472m = tL_starsGiveawayOption;
        aVar.f60467g = z11;
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
        aVar.f60471l = i7;
        aVar.f60467g = z10;
        aVar.f60466f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new rg.a(6, false);
        aVar.f60464c = str;
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
            if (a.class == aVar.getClass() && (i7 = (aVar2 = (a) aVar).f56589a) == (i10 = this.f56589a)) {
                if (i10 == 0) {
                    if (this.f60467g == aVar2.f60467g) {
                        return true;
                    }
                    return false;
                } else if (i7 == 17) {
                    if (this.f60468i == aVar2.f60468i && this.h == aVar2.h && this.f60472m == aVar2.f60472m && this.f60467g == aVar2.f60467g && this.f56590b == aVar2.f56590b) {
                        return true;
                    }
                    return false;
                } else if (i10 == 5) {
                    if (this.f60468i == aVar2.f60468i && g(this.f60470k, aVar2.f60470k)) {
                        return true;
                    }
                    return false;
                } else if (i10 == 13 && this.f60468i == aVar2.f60468i && TextUtils.equals(this.f60464c, aVar2.f60464c)) {
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
                int i7 = this.f56589a;
                if (i7 == aVar.f56589a) {
                    if (i7 != 0) {
                        if (i7 == 17) {
                            if (this.f60468i == aVar.f60468i && this.f60472m == aVar.f60472m) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 5) {
                            return g(this.f60470k, aVar.f60470k);
                        } else {
                            if (i7 == 13) {
                                return TextUtils.equals(this.f60464c, aVar.f60464c);
                            }
                            if (this.f60465e == aVar.f60465e && this.f60466f == aVar.f60466f && this.d == aVar.d && this.f60472m == aVar.f60472m && this.f60467g == aVar.f60467g && this.f60468i == aVar.f60468i && this.f60469j == aVar.f60469j && this.h == aVar.h && this.f60471l == aVar.f60471l && TextUtils.equals(this.f60464c, aVar.f60464c)) {
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
