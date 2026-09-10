package tg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends ng.a {
    public CharSequence f42137c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f42138f;
    public boolean f42139g;
    public long h;
    public int f42140i;
    public int f42141j;
    public List f42142k;
    public int f42143l;
    public TLObject f42144m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new ng.a(9, false);
        aVar.e = chat;
        aVar.d = null;
        aVar.f42139g = z10;
        aVar.f42140i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new ng.a(7, false);
        aVar.f42137c = charSequence;
        aVar.f42139g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new ng.a(17, z10);
        aVar.f42140i = i10;
        aVar.h = j3;
        aVar.f42144m = tL_starsGiveawayOption;
        aVar.f42139g = z11;
        return aVar;
    }

    public static a e(int i10, int i11, boolean z10, ArrayList arrayList) {
        boolean z11;
        if (i11 == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        ?? aVar = new ng.a(11, z11);
        aVar.f42143l = i10;
        aVar.f42139g = z10;
        aVar.f42138f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new ng.a(6, false);
        aVar.f42137c = str;
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
    public final boolean a(ng.a aVar) {
        a aVar2;
        int i10;
        int i11;
        if (this != aVar) {
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f14046a) == (i11 = this.f14046a)) {
                if (i11 == 0) {
                    if (this.f42139g == aVar2.f42139g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f42140i == aVar2.f42140i && this.h == aVar2.h && this.f42144m == aVar2.f42144m && this.f42139g == aVar2.f42139g && this.f14047b == aVar2.f14047b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f42140i == aVar2.f42140i && g(this.f42142k, aVar2.f42142k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f42140i == aVar2.f42140i && TextUtils.equals(this.f42137c, aVar2.f42137c)) {
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
                int i10 = this.f14046a;
                if (i10 == aVar.f14046a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f42140i == aVar.f42140i && this.f42144m == aVar.f42144m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f42142k, aVar.f42142k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f42137c, aVar.f42137c);
                            }
                            if (this.e == aVar.e && this.f42138f == aVar.f42138f && this.d == aVar.d && this.f42144m == aVar.f42144m && this.f42139g == aVar.f42139g && this.f42140i == aVar.f42140i && this.f42141j == aVar.f42141j && this.h == aVar.h && this.f42143l == aVar.f42143l && TextUtils.equals(this.f42137c, aVar.f42137c)) {
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
