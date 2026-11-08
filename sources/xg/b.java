package xg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class b extends rg.a {
    public CharSequence f58705c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f58706e;
    public Object f58707f;
    public boolean f58708g;
    public long h;
    public int f58709i;
    public int f58710j;
    public List f58711k;
    public int f58712l;
    public TLObject f58713m;

    public static b b(int i7, TLRPC.Chat chat, boolean z9) {
        ?? aVar = new rg.a(9, false);
        aVar.f58706e = chat;
        aVar.d = null;
        aVar.f58708g = z9;
        aVar.f58709i = i7;
        return aVar;
    }

    public static b c(CharSequence charSequence, boolean z9) {
        ?? aVar = new rg.a(7, false);
        aVar.f58705c = charSequence;
        aVar.f58708g = z9;
        return aVar;
    }

    public static b d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i7, long j3, boolean z9, boolean z10) {
        ?? aVar = new rg.a(17, z9);
        aVar.f58709i = i7;
        aVar.h = j3;
        aVar.f58713m = tL_starsGiveawayOption;
        aVar.f58708g = z10;
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
        aVar.f58712l = i7;
        aVar.f58708g = z9;
        aVar.f58707f = arrayList;
        return aVar;
    }

    public static b f(String str) {
        ?? aVar = new rg.a(6, false);
        aVar.f58705c = str;
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
            if (b.class == aVar.getClass() && (i7 = (bVar = (b) aVar).f54532a) == (i10 = this.f54532a)) {
                if (i10 == 0) {
                    if (this.f58708g == bVar.f58708g) {
                        return true;
                    }
                    return false;
                } else if (i7 == 17) {
                    if (this.f58709i == bVar.f58709i && this.h == bVar.h && this.f58713m == bVar.f58713m && this.f58708g == bVar.f58708g && this.f54533b == bVar.f54533b) {
                        return true;
                    }
                    return false;
                } else if (i10 == 5) {
                    if (this.f58709i == bVar.f58709i && g(this.f58711k, bVar.f58711k)) {
                        return true;
                    }
                    return false;
                } else if (i10 == 13 && this.f58709i == bVar.f58709i && TextUtils.equals(this.f58705c, bVar.f58705c)) {
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
                int i7 = this.f54532a;
                if (i7 == bVar.f54532a) {
                    if (i7 != 0) {
                        if (i7 == 17) {
                            if (this.f58709i == bVar.f58709i && this.f58713m == bVar.f58713m) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 5) {
                            return g(this.f58711k, bVar.f58711k);
                        } else {
                            if (i7 == 13) {
                                return TextUtils.equals(this.f58705c, bVar.f58705c);
                            }
                            if (this.f58706e == bVar.f58706e && this.f58707f == bVar.f58707f && this.d == bVar.d && this.f58713m == bVar.f58713m && this.f58708g == bVar.f58708g && this.f58709i == bVar.f58709i && this.f58710j == bVar.f58710j && this.h == bVar.h && this.f58712l == bVar.f58712l && TextUtils.equals(this.f58705c, bVar.f58705c)) {
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
