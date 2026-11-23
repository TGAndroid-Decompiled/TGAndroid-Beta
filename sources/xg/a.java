package xg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends rg.a {
    public CharSequence f60592c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f60593e;
    public Object f60594f;
    public boolean f60595g;
    public long h;
    public int f60596i;
    public int f60597j;
    public List f60598k;
    public int f60599l;
    public TLObject f60600m;

    public static a b(int i7, TLRPC.Chat chat, boolean z10) {
        ?? aVar = new rg.a(9, false);
        aVar.f60593e = chat;
        aVar.d = null;
        aVar.f60595g = z10;
        aVar.f60596i = i7;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new rg.a(7, false);
        aVar.f60592c = charSequence;
        aVar.f60595g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i7, long j3, boolean z10, boolean z11) {
        ?? aVar = new rg.a(17, z10);
        aVar.f60596i = i7;
        aVar.h = j3;
        aVar.f60600m = tL_starsGiveawayOption;
        aVar.f60595g = z11;
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
        aVar.f60599l = i7;
        aVar.f60595g = z10;
        aVar.f60594f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new rg.a(6, false);
        aVar.f60592c = str;
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
            if (a.class == aVar.getClass() && (i7 = (aVar2 = (a) aVar).f56712a) == (i10 = this.f56712a)) {
                if (i10 == 0) {
                    if (this.f60595g == aVar2.f60595g) {
                        return true;
                    }
                    return false;
                } else if (i7 == 17) {
                    if (this.f60596i == aVar2.f60596i && this.h == aVar2.h && this.f60600m == aVar2.f60600m && this.f60595g == aVar2.f60595g && this.f56713b == aVar2.f56713b) {
                        return true;
                    }
                    return false;
                } else if (i10 == 5) {
                    if (this.f60596i == aVar2.f60596i && g(this.f60598k, aVar2.f60598k)) {
                        return true;
                    }
                    return false;
                } else if (i10 == 13 && this.f60596i == aVar2.f60596i && TextUtils.equals(this.f60592c, aVar2.f60592c)) {
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
                int i7 = this.f56712a;
                if (i7 == aVar.f56712a) {
                    if (i7 != 0) {
                        if (i7 == 17) {
                            if (this.f60596i == aVar.f60596i && this.f60600m == aVar.f60600m) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 5) {
                            return g(this.f60598k, aVar.f60598k);
                        } else {
                            if (i7 == 13) {
                                return TextUtils.equals(this.f60592c, aVar.f60592c);
                            }
                            if (this.f60593e == aVar.f60593e && this.f60594f == aVar.f60594f && this.d == aVar.d && this.f60600m == aVar.f60600m && this.f60595g == aVar.f60595g && this.f60596i == aVar.f60596i && this.f60597j == aVar.f60597j && this.h == aVar.h && this.f60599l == aVar.f60599l && TextUtils.equals(this.f60592c, aVar.f60592c)) {
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
