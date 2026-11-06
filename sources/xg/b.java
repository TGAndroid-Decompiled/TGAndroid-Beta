package xg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class b extends rg.a {
    public CharSequence f58609c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f58610e;
    public Object f58611f;
    public boolean f58612g;
    public long h;
    public int f58613i;
    public int f58614j;
    public List f58615k;
    public int f58616l;
    public TLObject f58617m;

    public static b b(int i7, TLRPC.Chat chat, boolean z9) {
        ?? aVar = new rg.a(9, false);
        aVar.f58610e = chat;
        aVar.d = null;
        aVar.f58612g = z9;
        aVar.f58613i = i7;
        return aVar;
    }

    public static b c(CharSequence charSequence, boolean z9) {
        ?? aVar = new rg.a(7, false);
        aVar.f58609c = charSequence;
        aVar.f58612g = z9;
        return aVar;
    }

    public static b d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i7, long j3, boolean z9, boolean z10) {
        ?? aVar = new rg.a(17, z9);
        aVar.f58613i = i7;
        aVar.h = j3;
        aVar.f58617m = tL_starsGiveawayOption;
        aVar.f58612g = z10;
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
        aVar.f58616l = i7;
        aVar.f58612g = z9;
        aVar.f58611f = arrayList;
        return aVar;
    }

    public static b f(String str) {
        ?? aVar = new rg.a(6, false);
        aVar.f58609c = str;
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
            if (b.class == aVar.getClass() && (i7 = (bVar = (b) aVar).f54439a) == (i10 = this.f54439a)) {
                if (i10 == 0) {
                    if (this.f58612g == bVar.f58612g) {
                        return true;
                    }
                    return false;
                } else if (i7 == 17) {
                    if (this.f58613i == bVar.f58613i && this.h == bVar.h && this.f58617m == bVar.f58617m && this.f58612g == bVar.f58612g && this.f54440b == bVar.f54440b) {
                        return true;
                    }
                    return false;
                } else if (i10 == 5) {
                    if (this.f58613i == bVar.f58613i && g(this.f58615k, bVar.f58615k)) {
                        return true;
                    }
                    return false;
                } else if (i10 == 13 && this.f58613i == bVar.f58613i && TextUtils.equals(this.f58609c, bVar.f58609c)) {
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
                int i7 = this.f54439a;
                if (i7 == bVar.f54439a) {
                    if (i7 != 0) {
                        if (i7 == 17) {
                            if (this.f58613i == bVar.f58613i && this.f58617m == bVar.f58617m) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 5) {
                            return g(this.f58615k, bVar.f58615k);
                        } else {
                            if (i7 == 13) {
                                return TextUtils.equals(this.f58609c, bVar.f58609c);
                            }
                            if (this.f58610e == bVar.f58610e && this.f58611f == bVar.f58611f && this.d == bVar.d && this.f58617m == bVar.f58617m && this.f58612g == bVar.f58612g && this.f58613i == bVar.f58613i && this.f58614j == bVar.f58614j && this.h == bVar.h && this.f58616l == bVar.f58616l && TextUtils.equals(this.f58609c, bVar.f58609c)) {
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
