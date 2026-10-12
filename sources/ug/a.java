package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends og.a {
    public CharSequence f49130c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f49131e;
    public Object f49132f;
    public boolean f49133g;
    public long h;
    public int f49134i;
    public int f49135j;
    public List f49136k;
    public int f49137l;
    public TLObject f49138m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new og.a(9, false);
        aVar.f49131e = chat;
        aVar.d = null;
        aVar.f49133g = z10;
        aVar.f49134i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new og.a(7, false);
        aVar.f49130c = charSequence;
        aVar.f49133g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new og.a(17, z10);
        aVar.f49134i = i10;
        aVar.h = j3;
        aVar.f49138m = tL_starsGiveawayOption;
        aVar.f49133g = z11;
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
        aVar.f49137l = i10;
        aVar.f49133g = z10;
        aVar.f49132f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new og.a(6, false);
        aVar.f49130c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f16876a) == (i11 = this.f16876a)) {
                if (i11 == 0) {
                    if (this.f49133g == aVar2.f49133g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f49134i == aVar2.f49134i && this.h == aVar2.h && this.f49138m == aVar2.f49138m && this.f49133g == aVar2.f49133g && this.f16877b == aVar2.f16877b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f49134i == aVar2.f49134i && g(this.f49136k, aVar2.f49136k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f49134i == aVar2.f49134i && TextUtils.equals(this.f49130c, aVar2.f49130c)) {
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
                int i10 = this.f16876a;
                if (i10 == aVar.f16876a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f49134i == aVar.f49134i && this.f49138m == aVar.f49138m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f49136k, aVar.f49136k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f49130c, aVar.f49130c);
                            }
                            if (this.f49131e == aVar.f49131e && this.f49132f == aVar.f49132f && this.d == aVar.d && this.f49138m == aVar.f49138m && this.f49133g == aVar.f49133g && this.f49134i == aVar.f49134i && this.f49135j == aVar.f49135j && this.h == aVar.h && this.f49137l == aVar.f49137l && TextUtils.equals(this.f49130c, aVar.f49130c)) {
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
