package vg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends pg.a {
    public CharSequence f48349c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f48350f;
    public boolean f48351g;
    public long h;
    public int f48352i;
    public int f48353j;
    public List f48354k;
    public int f48355l;
    public TLObject f48356m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new pg.a(9, false);
        aVar.e = chat;
        aVar.d = null;
        aVar.f48351g = z10;
        aVar.f48352i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new pg.a(7, false);
        aVar.f48349c = charSequence;
        aVar.f48351g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j10, boolean z10, boolean z11) {
        ?? aVar = new pg.a(17, z10);
        aVar.f48352i = i10;
        aVar.h = j10;
        aVar.f48356m = tL_starsGiveawayOption;
        aVar.f48351g = z11;
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
        aVar.f48355l = i10;
        aVar.f48351g = z10;
        aVar.f48350f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new pg.a(6, false);
        aVar.f48349c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f44299a) == (i11 = this.f44299a)) {
                if (i11 == 0) {
                    if (this.f48351g == aVar2.f48351g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f48352i == aVar2.f48352i && this.h == aVar2.h && this.f48356m == aVar2.f48356m && this.f48351g == aVar2.f48351g && this.f44300b == aVar2.f44300b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f48352i == aVar2.f48352i && g(this.f48354k, aVar2.f48354k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f48352i == aVar2.f48352i && TextUtils.equals(this.f48349c, aVar2.f48349c)) {
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
                int i10 = this.f44299a;
                if (i10 == aVar.f44299a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f48352i == aVar.f48352i && this.f48356m == aVar.f48356m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f48354k, aVar.f48354k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f48349c, aVar.f48349c);
                            }
                            if (this.e == aVar.e && this.f48350f == aVar.f48350f && this.d == aVar.d && this.f48356m == aVar.f48356m && this.f48351g == aVar.f48351g && this.f48352i == aVar.f48352i && this.f48353j == aVar.f48353j && this.h == aVar.h && this.f48355l == aVar.f48355l && TextUtils.equals(this.f48349c, aVar.f48349c)) {
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
