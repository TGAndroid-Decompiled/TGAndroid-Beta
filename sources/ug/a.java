package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends og.a {
    public CharSequence f43989c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f43990f;
    public boolean f43991g;
    public long h;
    public int f43992i;
    public int f43993j;
    public List f43994k;
    public int f43995l;
    public TLObject f43996m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new og.a(9, false);
        aVar.e = chat;
        aVar.d = null;
        aVar.f43991g = z10;
        aVar.f43992i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new og.a(7, false);
        aVar.f43989c = charSequence;
        aVar.f43991g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new og.a(17, z10);
        aVar.f43992i = i10;
        aVar.h = j3;
        aVar.f43996m = tL_starsGiveawayOption;
        aVar.f43991g = z11;
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
        aVar.f43995l = i10;
        aVar.f43991g = z10;
        aVar.f43990f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new og.a(6, false);
        aVar.f43989c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f15716a) == (i11 = this.f15716a)) {
                if (i11 == 0) {
                    if (this.f43991g == aVar2.f43991g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f43992i == aVar2.f43992i && this.h == aVar2.h && this.f43996m == aVar2.f43996m && this.f43991g == aVar2.f43991g && this.f15717b == aVar2.f15717b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f43992i == aVar2.f43992i && g(this.f43994k, aVar2.f43994k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f43992i == aVar2.f43992i && TextUtils.equals(this.f43989c, aVar2.f43989c)) {
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
                int i10 = this.f15716a;
                if (i10 == aVar.f15716a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f43992i == aVar.f43992i && this.f43996m == aVar.f43996m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f43994k, aVar.f43994k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f43989c, aVar.f43989c);
                            }
                            if (this.e == aVar.e && this.f43990f == aVar.f43990f && this.d == aVar.d && this.f43996m == aVar.f43996m && this.f43991g == aVar.f43991g && this.f43992i == aVar.f43992i && this.f43993j == aVar.f43993j && this.h == aVar.h && this.f43995l == aVar.f43995l && TextUtils.equals(this.f43989c, aVar.f43989c)) {
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
