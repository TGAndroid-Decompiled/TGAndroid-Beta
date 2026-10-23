package vg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends pg.a {
    public CharSequence f48350c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f48351f;
    public boolean f48352g;
    public long h;
    public int f48353i;
    public int f48354j;
    public List f48355k;
    public int f48356l;
    public TLObject f48357m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new pg.a(9, false);
        aVar.e = chat;
        aVar.d = null;
        aVar.f48352g = z10;
        aVar.f48353i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new pg.a(7, false);
        aVar.f48350c = charSequence;
        aVar.f48352g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j10, boolean z10, boolean z11) {
        ?? aVar = new pg.a(17, z10);
        aVar.f48353i = i10;
        aVar.h = j10;
        aVar.f48357m = tL_starsGiveawayOption;
        aVar.f48352g = z11;
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
        aVar.f48356l = i10;
        aVar.f48352g = z10;
        aVar.f48351f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new pg.a(6, false);
        aVar.f48350c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f44300a) == (i11 = this.f44300a)) {
                if (i11 == 0) {
                    if (this.f48352g == aVar2.f48352g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f48353i == aVar2.f48353i && this.h == aVar2.h && this.f48357m == aVar2.f48357m && this.f48352g == aVar2.f48352g && this.f44301b == aVar2.f44301b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f48353i == aVar2.f48353i && g(this.f48355k, aVar2.f48355k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f48353i == aVar2.f48353i && TextUtils.equals(this.f48350c, aVar2.f48350c)) {
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
                int i10 = this.f44300a;
                if (i10 == aVar.f44300a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f48353i == aVar.f48353i && this.f48357m == aVar.f48357m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f48355k, aVar.f48355k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f48350c, aVar.f48350c);
                            }
                            if (this.e == aVar.e && this.f48351f == aVar.f48351f && this.d == aVar.d && this.f48357m == aVar.f48357m && this.f48352g == aVar.f48352g && this.f48353i == aVar.f48353i && this.f48354j == aVar.f48354j && this.h == aVar.h && this.f48356l == aVar.f48356l && TextUtils.equals(this.f48350c, aVar.f48350c)) {
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
