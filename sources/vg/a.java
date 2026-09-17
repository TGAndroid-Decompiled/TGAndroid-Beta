package vg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends pg.a {
    public CharSequence f47786c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f47787e;
    public Object f47788f;
    public boolean f47789g;
    public long h;
    public int f47790i;
    public int f47791j;
    public List f47792k;
    public int f47793l;
    public TLObject f47794m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new pg.a(9, false);
        aVar.f47787e = chat;
        aVar.d = null;
        aVar.f47789g = z10;
        aVar.f47790i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new pg.a(7, false);
        aVar.f47786c = charSequence;
        aVar.f47789g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new pg.a(17, z10);
        aVar.f47790i = i10;
        aVar.h = j3;
        aVar.f47794m = tL_starsGiveawayOption;
        aVar.f47789g = z11;
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
        aVar.f47793l = i10;
        aVar.f47789g = z10;
        aVar.f47788f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new pg.a(6, false);
        aVar.f47786c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f44072a) == (i11 = this.f44072a)) {
                if (i11 == 0) {
                    if (this.f47789g == aVar2.f47789g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f47790i == aVar2.f47790i && this.h == aVar2.h && this.f47794m == aVar2.f47794m && this.f47789g == aVar2.f47789g && this.f44073b == aVar2.f44073b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f47790i == aVar2.f47790i && g(this.f47792k, aVar2.f47792k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f47790i == aVar2.f47790i && TextUtils.equals(this.f47786c, aVar2.f47786c)) {
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
                int i10 = this.f44072a;
                if (i10 == aVar.f44072a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f47790i == aVar.f47790i && this.f47794m == aVar.f47794m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f47792k, aVar.f47792k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f47786c, aVar.f47786c);
                            }
                            if (this.f47787e == aVar.f47787e && this.f47788f == aVar.f47788f && this.d == aVar.d && this.f47794m == aVar.f47794m && this.f47789g == aVar.f47789g && this.f47790i == aVar.f47790i && this.f47791j == aVar.f47791j && this.h == aVar.h && this.f47793l == aVar.f47793l && TextUtils.equals(this.f47786c, aVar.f47786c)) {
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
