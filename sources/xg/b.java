package xg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class b extends rg.a {
    public CharSequence f58704c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f58705e;
    public Object f58706f;
    public boolean f58707g;
    public long h;
    public int f58708i;
    public int f58709j;
    public List f58710k;
    public int f58711l;
    public TLObject f58712m;

    public static b b(int i7, TLRPC.Chat chat, boolean z9) {
        ?? aVar = new rg.a(9, false);
        aVar.f58705e = chat;
        aVar.d = null;
        aVar.f58707g = z9;
        aVar.f58708i = i7;
        return aVar;
    }

    public static b c(CharSequence charSequence, boolean z9) {
        ?? aVar = new rg.a(7, false);
        aVar.f58704c = charSequence;
        aVar.f58707g = z9;
        return aVar;
    }

    public static b d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i7, long j3, boolean z9, boolean z10) {
        ?? aVar = new rg.a(17, z9);
        aVar.f58708i = i7;
        aVar.h = j3;
        aVar.f58712m = tL_starsGiveawayOption;
        aVar.f58707g = z10;
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
        aVar.f58711l = i7;
        aVar.f58707g = z9;
        aVar.f58706f = arrayList;
        return aVar;
    }

    public static b f(String str) {
        ?? aVar = new rg.a(6, false);
        aVar.f58704c = str;
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
            if (b.class == aVar.getClass() && (i7 = (bVar = (b) aVar).f54531a) == (i10 = this.f54531a)) {
                if (i10 == 0) {
                    if (this.f58707g == bVar.f58707g) {
                        return true;
                    }
                    return false;
                } else if (i7 == 17) {
                    if (this.f58708i == bVar.f58708i && this.h == bVar.h && this.f58712m == bVar.f58712m && this.f58707g == bVar.f58707g && this.f54532b == bVar.f54532b) {
                        return true;
                    }
                    return false;
                } else if (i10 == 5) {
                    if (this.f58708i == bVar.f58708i && g(this.f58710k, bVar.f58710k)) {
                        return true;
                    }
                    return false;
                } else if (i10 == 13 && this.f58708i == bVar.f58708i && TextUtils.equals(this.f58704c, bVar.f58704c)) {
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
                int i7 = this.f54531a;
                if (i7 == bVar.f54531a) {
                    if (i7 != 0) {
                        if (i7 == 17) {
                            if (this.f58708i == bVar.f58708i && this.f58712m == bVar.f58712m) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 5) {
                            return g(this.f58710k, bVar.f58710k);
                        } else {
                            if (i7 == 13) {
                                return TextUtils.equals(this.f58704c, bVar.f58704c);
                            }
                            if (this.f58705e == bVar.f58705e && this.f58706f == bVar.f58706f && this.d == bVar.d && this.f58712m == bVar.f58712m && this.f58707g == bVar.f58707g && this.f58708i == bVar.f58708i && this.f58709j == bVar.f58709j && this.h == bVar.h && this.f58711l == bVar.f58711l && TextUtils.equals(this.f58704c, bVar.f58704c)) {
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
