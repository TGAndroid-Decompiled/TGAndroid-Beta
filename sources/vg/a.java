package vg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends pg.a {
    public CharSequence f47785c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f47786e;
    public Object f47787f;
    public boolean f47788g;
    public long h;
    public int f47789i;
    public int f47790j;
    public List f47791k;
    public int f47792l;
    public TLObject f47793m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new pg.a(9, false);
        aVar.f47786e = chat;
        aVar.d = null;
        aVar.f47788g = z10;
        aVar.f47789i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new pg.a(7, false);
        aVar.f47785c = charSequence;
        aVar.f47788g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new pg.a(17, z10);
        aVar.f47789i = i10;
        aVar.h = j3;
        aVar.f47793m = tL_starsGiveawayOption;
        aVar.f47788g = z11;
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
        aVar.f47792l = i10;
        aVar.f47788g = z10;
        aVar.f47787f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new pg.a(6, false);
        aVar.f47785c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f44071a) == (i11 = this.f44071a)) {
                if (i11 == 0) {
                    if (this.f47788g == aVar2.f47788g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f47789i == aVar2.f47789i && this.h == aVar2.h && this.f47793m == aVar2.f47793m && this.f47788g == aVar2.f47788g && this.f44072b == aVar2.f44072b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f47789i == aVar2.f47789i && g(this.f47791k, aVar2.f47791k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f47789i == aVar2.f47789i && TextUtils.equals(this.f47785c, aVar2.f47785c)) {
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
                int i10 = this.f44071a;
                if (i10 == aVar.f44071a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f47789i == aVar.f47789i && this.f47793m == aVar.f47793m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f47791k, aVar.f47791k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f47785c, aVar.f47785c);
                            }
                            if (this.f47786e == aVar.f47786e && this.f47787f == aVar.f47787f && this.d == aVar.d && this.f47793m == aVar.f47793m && this.f47788g == aVar.f47788g && this.f47789i == aVar.f47789i && this.f47790j == aVar.f47790j && this.h == aVar.h && this.f47792l == aVar.f47792l && TextUtils.equals(this.f47785c, aVar.f47785c)) {
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
