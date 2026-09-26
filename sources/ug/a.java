package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends og.a {
    public CharSequence f43986c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f43987f;
    public boolean f43988g;
    public long h;
    public int f43989i;
    public int f43990j;
    public List f43991k;
    public int f43992l;
    public TLObject f43993m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new og.a(9, false);
        aVar.e = chat;
        aVar.d = null;
        aVar.f43988g = z10;
        aVar.f43989i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new og.a(7, false);
        aVar.f43986c = charSequence;
        aVar.f43988g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new og.a(17, z10);
        aVar.f43989i = i10;
        aVar.h = j3;
        aVar.f43993m = tL_starsGiveawayOption;
        aVar.f43988g = z11;
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
        aVar.f43992l = i10;
        aVar.f43988g = z10;
        aVar.f43987f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new og.a(6, false);
        aVar.f43986c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f15715a) == (i11 = this.f15715a)) {
                if (i11 == 0) {
                    if (this.f43988g == aVar2.f43988g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f43989i == aVar2.f43989i && this.h == aVar2.h && this.f43993m == aVar2.f43993m && this.f43988g == aVar2.f43988g && this.f15716b == aVar2.f15716b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f43989i == aVar2.f43989i && g(this.f43991k, aVar2.f43991k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f43989i == aVar2.f43989i && TextUtils.equals(this.f43986c, aVar2.f43986c)) {
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
                int i10 = this.f15715a;
                if (i10 == aVar.f15715a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f43989i == aVar.f43989i && this.f43993m == aVar.f43993m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f43991k, aVar.f43991k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f43986c, aVar.f43986c);
                            }
                            if (this.e == aVar.e && this.f43987f == aVar.f43987f && this.d == aVar.d && this.f43993m == aVar.f43993m && this.f43988g == aVar.f43988g && this.f43989i == aVar.f43989i && this.f43990j == aVar.f43990j && this.h == aVar.h && this.f43992l == aVar.f43992l && TextUtils.equals(this.f43986c, aVar.f43986c)) {
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
