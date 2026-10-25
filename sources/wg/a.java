package wg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends qg.a {
    public CharSequence f51160c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f51161f;
    public boolean f51162g;
    public long h;
    public int f51163i;
    public int f51164j;
    public List f51165k;
    public int f51166l;
    public TLObject f51167m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new qg.a(9, false);
        aVar.e = chat;
        aVar.d = null;
        aVar.f51162g = z10;
        aVar.f51163i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new qg.a(7, false);
        aVar.f51160c = charSequence;
        aVar.f51162g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j10, boolean z10, boolean z11) {
        ?? aVar = new qg.a(17, z10);
        aVar.f51163i = i10;
        aVar.h = j10;
        aVar.f51167m = tL_starsGiveawayOption;
        aVar.f51162g = z11;
        return aVar;
    }

    public static a e(int i10, int i11, boolean z10, ArrayList arrayList) {
        boolean z11;
        if (i11 == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        ?? aVar = new qg.a(11, z11);
        aVar.f51166l = i10;
        aVar.f51162g = z10;
        aVar.f51161f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new qg.a(6, false);
        aVar.f51160c = str;
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
    public final boolean a(qg.a aVar) {
        a aVar2;
        int i10;
        int i11;
        if (this != aVar) {
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f47037a) == (i11 = this.f47037a)) {
                if (i11 == 0) {
                    if (this.f51162g == aVar2.f51162g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f51163i == aVar2.f51163i && this.h == aVar2.h && this.f51167m == aVar2.f51167m && this.f51162g == aVar2.f51162g && this.f47038b == aVar2.f47038b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f51163i == aVar2.f51163i && g(this.f51165k, aVar2.f51165k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f51163i == aVar2.f51163i && TextUtils.equals(this.f51160c, aVar2.f51160c)) {
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
                int i10 = this.f47037a;
                if (i10 == aVar.f47037a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f51163i == aVar.f51163i && this.f51167m == aVar.f51167m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f51165k, aVar.f51165k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f51160c, aVar.f51160c);
                            }
                            if (this.e == aVar.e && this.f51161f == aVar.f51161f && this.d == aVar.d && this.f51167m == aVar.f51167m && this.f51162g == aVar.f51162g && this.f51163i == aVar.f51163i && this.f51164j == aVar.f51164j && this.h == aVar.h && this.f51166l == aVar.f51166l && TextUtils.equals(this.f51160c, aVar.f51160c)) {
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
