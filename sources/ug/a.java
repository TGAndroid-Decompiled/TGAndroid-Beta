package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends og.a {
    public CharSequence f44025c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f44026f;
    public boolean f44027g;
    public long h;
    public int f44028i;
    public int f44029j;
    public List f44030k;
    public int f44031l;
    public TLObject f44032m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new og.a(9, false);
        aVar.e = chat;
        aVar.d = null;
        aVar.f44027g = z10;
        aVar.f44028i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new og.a(7, false);
        aVar.f44025c = charSequence;
        aVar.f44027g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new og.a(17, z10);
        aVar.f44028i = i10;
        aVar.h = j3;
        aVar.f44032m = tL_starsGiveawayOption;
        aVar.f44027g = z11;
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
        aVar.f44031l = i10;
        aVar.f44027g = z10;
        aVar.f44026f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new og.a(6, false);
        aVar.f44025c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f15719a) == (i11 = this.f15719a)) {
                if (i11 == 0) {
                    if (this.f44027g == aVar2.f44027g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f44028i == aVar2.f44028i && this.h == aVar2.h && this.f44032m == aVar2.f44032m && this.f44027g == aVar2.f44027g && this.f15720b == aVar2.f15720b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f44028i == aVar2.f44028i && g(this.f44030k, aVar2.f44030k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f44028i == aVar2.f44028i && TextUtils.equals(this.f44025c, aVar2.f44025c)) {
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
                int i10 = this.f15719a;
                if (i10 == aVar.f15719a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f44028i == aVar.f44028i && this.f44032m == aVar.f44032m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f44030k, aVar.f44030k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f44025c, aVar.f44025c);
                            }
                            if (this.e == aVar.e && this.f44026f == aVar.f44026f && this.d == aVar.d && this.f44032m == aVar.f44032m && this.f44027g == aVar.f44027g && this.f44028i == aVar.f44028i && this.f44029j == aVar.f44029j && this.h == aVar.h && this.f44031l == aVar.f44031l && TextUtils.equals(this.f44025c, aVar.f44025c)) {
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
