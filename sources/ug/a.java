package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends og.a {
    public CharSequence f49138c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f49139e;
    public Object f49140f;
    public boolean f49141g;
    public long h;
    public int f49142i;
    public int f49143j;
    public List f49144k;
    public int f49145l;
    public TLObject f49146m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new og.a(9, false);
        aVar.f49139e = chat;
        aVar.d = null;
        aVar.f49141g = z10;
        aVar.f49142i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new og.a(7, false);
        aVar.f49138c = charSequence;
        aVar.f49141g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new og.a(17, z10);
        aVar.f49142i = i10;
        aVar.h = j3;
        aVar.f49146m = tL_starsGiveawayOption;
        aVar.f49141g = z11;
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
        aVar.f49145l = i10;
        aVar.f49141g = z10;
        aVar.f49140f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new og.a(6, false);
        aVar.f49138c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f16877a) == (i11 = this.f16877a)) {
                if (i11 == 0) {
                    if (this.f49141g == aVar2.f49141g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f49142i == aVar2.f49142i && this.h == aVar2.h && this.f49146m == aVar2.f49146m && this.f49141g == aVar2.f49141g && this.f16878b == aVar2.f16878b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f49142i == aVar2.f49142i && g(this.f49144k, aVar2.f49144k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f49142i == aVar2.f49142i && TextUtils.equals(this.f49138c, aVar2.f49138c)) {
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
                int i10 = this.f16877a;
                if (i10 == aVar.f16877a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f49142i == aVar.f49142i && this.f49146m == aVar.f49146m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f49144k, aVar.f49144k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f49138c, aVar.f49138c);
                            }
                            if (this.f49139e == aVar.f49139e && this.f49140f == aVar.f49140f && this.d == aVar.d && this.f49146m == aVar.f49146m && this.f49141g == aVar.f49141g && this.f49142i == aVar.f49142i && this.f49143j == aVar.f49143j && this.h == aVar.h && this.f49145l == aVar.f49145l && TextUtils.equals(this.f49138c, aVar.f49138c)) {
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
