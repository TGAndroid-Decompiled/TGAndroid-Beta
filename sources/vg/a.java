package vg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends pg.a {
    public CharSequence f48341c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f48342f;
    public boolean f48343g;
    public long h;
    public int f48344i;
    public int f48345j;
    public List f48346k;
    public int f48347l;
    public TLObject f48348m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new pg.a(9, false);
        aVar.e = chat;
        aVar.d = null;
        aVar.f48343g = z10;
        aVar.f48344i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new pg.a(7, false);
        aVar.f48341c = charSequence;
        aVar.f48343g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j10, boolean z10, boolean z11) {
        ?? aVar = new pg.a(17, z10);
        aVar.f48344i = i10;
        aVar.h = j10;
        aVar.f48348m = tL_starsGiveawayOption;
        aVar.f48343g = z11;
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
        aVar.f48347l = i10;
        aVar.f48343g = z10;
        aVar.f48342f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new pg.a(6, false);
        aVar.f48341c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f44288a) == (i11 = this.f44288a)) {
                if (i11 == 0) {
                    if (this.f48343g == aVar2.f48343g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f48344i == aVar2.f48344i && this.h == aVar2.h && this.f48348m == aVar2.f48348m && this.f48343g == aVar2.f48343g && this.f44289b == aVar2.f44289b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f48344i == aVar2.f48344i && g(this.f48346k, aVar2.f48346k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f48344i == aVar2.f48344i && TextUtils.equals(this.f48341c, aVar2.f48341c)) {
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
                int i10 = this.f44288a;
                if (i10 == aVar.f44288a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f48344i == aVar.f48344i && this.f48348m == aVar.f48348m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f48346k, aVar.f48346k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f48341c, aVar.f48341c);
                            }
                            if (this.e == aVar.e && this.f48342f == aVar.f48342f && this.d == aVar.d && this.f48348m == aVar.f48348m && this.f48343g == aVar.f48343g && this.f48344i == aVar.f48344i && this.f48345j == aVar.f48345j && this.h == aVar.h && this.f48347l == aVar.f48347l && TextUtils.equals(this.f48341c, aVar.f48341c)) {
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
