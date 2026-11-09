package xg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class b extends rg.a {
    public CharSequence f58714c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f58715e;
    public Object f58716f;
    public boolean f58717g;
    public long h;
    public int f58718i;
    public int f58719j;
    public List f58720k;
    public int f58721l;
    public TLObject f58722m;

    public static b b(int i7, TLRPC.Chat chat, boolean z9) {
        ?? aVar = new rg.a(9, false);
        aVar.f58715e = chat;
        aVar.d = null;
        aVar.f58717g = z9;
        aVar.f58718i = i7;
        return aVar;
    }

    public static b c(CharSequence charSequence, boolean z9) {
        ?? aVar = new rg.a(7, false);
        aVar.f58714c = charSequence;
        aVar.f58717g = z9;
        return aVar;
    }

    public static b d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i7, long j3, boolean z9, boolean z10) {
        ?? aVar = new rg.a(17, z9);
        aVar.f58718i = i7;
        aVar.h = j3;
        aVar.f58722m = tL_starsGiveawayOption;
        aVar.f58717g = z10;
        return aVar;
    }

    public static b e(int i7, int i10, boolean z9, ArrayList arrayList) {
        boolean z10;
        if (i10 == i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        ?? aVar = new rg.a(11, z10);
        aVar.f58721l = i7;
        aVar.f58717g = z9;
        aVar.f58716f = arrayList;
        return aVar;
    }

    public static b f(String str) {
        ?? aVar = new rg.a(6, false);
        aVar.f58714c = str;
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
        b bVar;
        int i7;
        int i10;
        if (this != aVar) {
            if (b.class == aVar.getClass() && (i7 = (bVar = (b) aVar).f54544a) == (i10 = this.f54544a)) {
                if (i10 == 0) {
                    if (this.f58717g == bVar.f58717g) {
                        return true;
                    }
                    return false;
                } else if (i7 == 17) {
                    if (this.f58718i == bVar.f58718i && this.h == bVar.h && this.f58722m == bVar.f58722m && this.f58717g == bVar.f58717g && this.f54545b == bVar.f54545b) {
                        return true;
                    }
                    return false;
                } else if (i10 == 5) {
                    if (this.f58718i == bVar.f58718i && g(this.f58720k, bVar.f58720k)) {
                        return true;
                    }
                    return false;
                } else if (i10 == 13 && this.f58718i == bVar.f58718i && TextUtils.equals(this.f58714c, bVar.f58714c)) {
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
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                int i7 = this.f54544a;
                if (i7 == bVar.f54544a) {
                    if (i7 != 0) {
                        if (i7 == 17) {
                            if (this.f58718i == bVar.f58718i && this.f58722m == bVar.f58722m) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 5) {
                            return g(this.f58720k, bVar.f58720k);
                        } else {
                            if (i7 == 13) {
                                return TextUtils.equals(this.f58714c, bVar.f58714c);
                            }
                            if (this.f58715e == bVar.f58715e && this.f58716f == bVar.f58716f && this.d == bVar.d && this.f58722m == bVar.f58722m && this.f58717g == bVar.f58717g && this.f58718i == bVar.f58718i && this.f58719j == bVar.f58719j && this.h == bVar.h && this.f58721l == bVar.f58721l && TextUtils.equals(this.f58714c, bVar.f58714c)) {
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
