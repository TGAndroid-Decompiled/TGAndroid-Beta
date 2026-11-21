package xg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends rg.a {
    public CharSequence f60505c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f60506e;
    public Object f60507f;
    public boolean f60508g;
    public long h;
    public int f60509i;
    public int f60510j;
    public List f60511k;
    public int f60512l;
    public TLObject f60513m;

    public static a b(int i7, TLRPC.Chat chat, boolean z10) {
        ?? aVar = new rg.a(9, false);
        aVar.f60506e = chat;
        aVar.d = null;
        aVar.f60508g = z10;
        aVar.f60509i = i7;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new rg.a(7, false);
        aVar.f60505c = charSequence;
        aVar.f60508g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i7, long j3, boolean z10, boolean z11) {
        ?? aVar = new rg.a(17, z10);
        aVar.f60509i = i7;
        aVar.h = j3;
        aVar.f60513m = tL_starsGiveawayOption;
        aVar.f60508g = z11;
        return aVar;
    }

    public static a e(int i7, int i10, boolean z10, ArrayList arrayList) {
        boolean z11;
        if (i10 == i7) {
            z11 = true;
        } else {
            z11 = false;
        }
        ?? aVar = new rg.a(11, z11);
        aVar.f60512l = i7;
        aVar.f60508g = z10;
        aVar.f60507f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new rg.a(6, false);
        aVar.f60505c = str;
        return aVar;
    }

    public static boolean g(List list, List list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (((Integer) list.get(i7)).intValue() != ((Integer) list2.get(i7)).intValue()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean a(rg.a aVar) {
        a aVar2;
        int i7;
        int i10;
        if (this != aVar) {
            if (a.class == aVar.getClass() && (i7 = (aVar2 = (a) aVar).f56630a) == (i10 = this.f56630a)) {
                if (i10 == 0) {
                    if (this.f60508g == aVar2.f60508g) {
                        return true;
                    }
                    return false;
                } else if (i7 == 17) {
                    if (this.f60509i == aVar2.f60509i && this.h == aVar2.h && this.f60513m == aVar2.f60513m && this.f60508g == aVar2.f60508g && this.f56631b == aVar2.f56631b) {
                        return true;
                    }
                    return false;
                } else if (i10 == 5) {
                    if (this.f60509i == aVar2.f60509i && g(this.f60511k, aVar2.f60511k)) {
                        return true;
                    }
                    return false;
                } else if (i10 == 13 && this.f60509i == aVar2.f60509i && TextUtils.equals(this.f60505c, aVar2.f60505c)) {
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
                int i7 = this.f56630a;
                if (i7 == aVar.f56630a) {
                    if (i7 != 0) {
                        if (i7 == 17) {
                            if (this.f60509i == aVar.f60509i && this.f60513m == aVar.f60513m) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 5) {
                            return g(this.f60511k, aVar.f60511k);
                        } else {
                            if (i7 == 13) {
                                return TextUtils.equals(this.f60505c, aVar.f60505c);
                            }
                            if (this.f60506e == aVar.f60506e && this.f60507f == aVar.f60507f && this.d == aVar.d && this.f60513m == aVar.f60513m && this.f60508g == aVar.f60508g && this.f60509i == aVar.f60509i && this.f60510j == aVar.f60510j && this.h == aVar.h && this.f60512l == aVar.f60512l && TextUtils.equals(this.f60505c, aVar.f60505c)) {
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
