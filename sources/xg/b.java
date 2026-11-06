package xg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class b extends rg.a {
    public CharSequence f58610c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f58611e;
    public Object f58612f;
    public boolean f58613g;
    public long h;
    public int f58614i;
    public int f58615j;
    public List f58616k;
    public int f58617l;
    public TLObject f58618m;

    public static b b(int i7, TLRPC.Chat chat, boolean z9) {
        ?? aVar = new rg.a(9, false);
        aVar.f58611e = chat;
        aVar.d = null;
        aVar.f58613g = z9;
        aVar.f58614i = i7;
        return aVar;
    }

    public static b c(CharSequence charSequence, boolean z9) {
        ?? aVar = new rg.a(7, false);
        aVar.f58610c = charSequence;
        aVar.f58613g = z9;
        return aVar;
    }

    public static b d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i7, long j3, boolean z9, boolean z10) {
        ?? aVar = new rg.a(17, z9);
        aVar.f58614i = i7;
        aVar.h = j3;
        aVar.f58618m = tL_starsGiveawayOption;
        aVar.f58613g = z10;
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
        aVar.f58617l = i7;
        aVar.f58613g = z9;
        aVar.f58612f = arrayList;
        return aVar;
    }

    public static b f(String str) {
        ?? aVar = new rg.a(6, false);
        aVar.f58610c = str;
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
            if (b.class == aVar.getClass() && (i7 = (bVar = (b) aVar).f54440a) == (i10 = this.f54440a)) {
                if (i10 == 0) {
                    if (this.f58613g == bVar.f58613g) {
                        return true;
                    }
                    return false;
                } else if (i7 == 17) {
                    if (this.f58614i == bVar.f58614i && this.h == bVar.h && this.f58618m == bVar.f58618m && this.f58613g == bVar.f58613g && this.f54441b == bVar.f54441b) {
                        return true;
                    }
                    return false;
                } else if (i10 == 5) {
                    if (this.f58614i == bVar.f58614i && g(this.f58616k, bVar.f58616k)) {
                        return true;
                    }
                    return false;
                } else if (i10 == 13 && this.f58614i == bVar.f58614i && TextUtils.equals(this.f58610c, bVar.f58610c)) {
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
                int i7 = this.f54440a;
                if (i7 == bVar.f54440a) {
                    if (i7 != 0) {
                        if (i7 == 17) {
                            if (this.f58614i == bVar.f58614i && this.f58618m == bVar.f58618m) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 5) {
                            return g(this.f58616k, bVar.f58616k);
                        } else {
                            if (i7 == 13) {
                                return TextUtils.equals(this.f58610c, bVar.f58610c);
                            }
                            if (this.f58611e == bVar.f58611e && this.f58612f == bVar.f58612f && this.d == bVar.d && this.f58618m == bVar.f58618m && this.f58613g == bVar.f58613g && this.f58614i == bVar.f58614i && this.f58615j == bVar.f58615j && this.h == bVar.h && this.f58617l == bVar.f58617l && TextUtils.equals(this.f58610c, bVar.f58610c)) {
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
