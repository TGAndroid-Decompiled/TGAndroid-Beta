package wg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends qg.a {
    public CharSequence f51163c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f51164f;
    public boolean f51165g;
    public long h;
    public int f51166i;
    public int f51167j;
    public List f51168k;
    public int f51169l;
    public TLObject f51170m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new qg.a(9, false);
        aVar.e = chat;
        aVar.d = null;
        aVar.f51165g = z10;
        aVar.f51166i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new qg.a(7, false);
        aVar.f51163c = charSequence;
        aVar.f51165g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j10, boolean z10, boolean z11) {
        ?? aVar = new qg.a(17, z10);
        aVar.f51166i = i10;
        aVar.h = j10;
        aVar.f51170m = tL_starsGiveawayOption;
        aVar.f51165g = z11;
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
        aVar.f51169l = i10;
        aVar.f51165g = z10;
        aVar.f51164f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new qg.a(6, false);
        aVar.f51163c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f47040a) == (i11 = this.f47040a)) {
                if (i11 == 0) {
                    if (this.f51165g == aVar2.f51165g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f51166i == aVar2.f51166i && this.h == aVar2.h && this.f51170m == aVar2.f51170m && this.f51165g == aVar2.f51165g && this.f47041b == aVar2.f47041b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f51166i == aVar2.f51166i && g(this.f51168k, aVar2.f51168k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f51166i == aVar2.f51166i && TextUtils.equals(this.f51163c, aVar2.f51163c)) {
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
                int i10 = this.f47040a;
                if (i10 == aVar.f47040a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f51166i == aVar.f51166i && this.f51170m == aVar.f51170m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f51168k, aVar.f51168k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f51163c, aVar.f51163c);
                            }
                            if (this.e == aVar.e && this.f51164f == aVar.f51164f && this.d == aVar.d && this.f51170m == aVar.f51170m && this.f51165g == aVar.f51165g && this.f51166i == aVar.f51166i && this.f51167j == aVar.f51167j && this.h == aVar.h && this.f51169l == aVar.f51169l && TextUtils.equals(this.f51163c, aVar.f51163c)) {
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
