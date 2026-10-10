package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends og.a {
    public CharSequence f48946c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f48947e;
    public Object f48948f;
    public boolean f48949g;
    public long h;
    public int f48950i;
    public int f48951j;
    public List f48952k;
    public int f48953l;
    public TLObject f48954m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new og.a(9, false);
        aVar.f48947e = chat;
        aVar.d = null;
        aVar.f48949g = z10;
        aVar.f48950i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new og.a(7, false);
        aVar.f48946c = charSequence;
        aVar.f48949g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new og.a(17, z10);
        aVar.f48950i = i10;
        aVar.h = j3;
        aVar.f48954m = tL_starsGiveawayOption;
        aVar.f48949g = z11;
        return aVar;
    }

    public static a e(int i10, int i11, boolean z10, ArrayList arrayList) {
        boolean z11;
        if (i11 == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        ?? aVar = new og.a(11, z11);
        aVar.f48953l = i10;
        aVar.f48949g = z10;
        aVar.f48948f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new og.a(6, false);
        aVar.f48946c = str;
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
    public final boolean a(og.a aVar) {
        a aVar2;
        int i10;
        int i11;
        if (this != aVar) {
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f17129a) == (i11 = this.f17129a)) {
                if (i11 == 0) {
                    if (this.f48949g == aVar2.f48949g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f48950i == aVar2.f48950i && this.h == aVar2.h && this.f48954m == aVar2.f48954m && this.f48949g == aVar2.f48949g && this.f17130b == aVar2.f17130b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f48950i == aVar2.f48950i && g(this.f48952k, aVar2.f48952k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f48950i == aVar2.f48950i && TextUtils.equals(this.f48946c, aVar2.f48946c)) {
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
                int i10 = this.f17129a;
                if (i10 == aVar.f17129a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f48950i == aVar.f48950i && this.f48954m == aVar.f48954m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f48952k, aVar.f48952k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f48946c, aVar.f48946c);
                            }
                            if (this.f48947e == aVar.f48947e && this.f48948f == aVar.f48948f && this.d == aVar.d && this.f48954m == aVar.f48954m && this.f48949g == aVar.f48949g && this.f48950i == aVar.f48950i && this.f48951j == aVar.f48951j && this.h == aVar.h && this.f48953l == aVar.f48953l && TextUtils.equals(this.f48946c, aVar.f48946c)) {
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
