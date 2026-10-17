package vg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends pg.a {
    public CharSequence f48361c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f48362f;
    public boolean f48363g;
    public long h;
    public int f48364i;
    public int f48365j;
    public List f48366k;
    public int f48367l;
    public TLObject f48368m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new pg.a(9, false);
        aVar.e = chat;
        aVar.d = null;
        aVar.f48363g = z10;
        aVar.f48364i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new pg.a(7, false);
        aVar.f48361c = charSequence;
        aVar.f48363g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j10, boolean z10, boolean z11) {
        ?? aVar = new pg.a(17, z10);
        aVar.f48364i = i10;
        aVar.h = j10;
        aVar.f48368m = tL_starsGiveawayOption;
        aVar.f48363g = z11;
        return aVar;
    }

    public static a e(int i10, int i11, boolean z10, ArrayList arrayList) {
        boolean z11;
        if (i11 == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        ?? aVar = new pg.a(11, z11);
        aVar.f48367l = i10;
        aVar.f48363g = z10;
        aVar.f48362f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new pg.a(6, false);
        aVar.f48361c = str;
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
    public final boolean a(pg.a aVar) {
        a aVar2;
        int i10;
        int i11;
        if (this != aVar) {
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f44314a) == (i11 = this.f44314a)) {
                if (i11 == 0) {
                    if (this.f48363g == aVar2.f48363g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f48364i == aVar2.f48364i && this.h == aVar2.h && this.f48368m == aVar2.f48368m && this.f48363g == aVar2.f48363g && this.f44315b == aVar2.f44315b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f48364i == aVar2.f48364i && g(this.f48366k, aVar2.f48366k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f48364i == aVar2.f48364i && TextUtils.equals(this.f48361c, aVar2.f48361c)) {
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
                int i10 = this.f44314a;
                if (i10 == aVar.f44314a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f48364i == aVar.f48364i && this.f48368m == aVar.f48368m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f48366k, aVar.f48366k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f48361c, aVar.f48361c);
                            }
                            if (this.e == aVar.e && this.f48362f == aVar.f48362f && this.d == aVar.d && this.f48368m == aVar.f48368m && this.f48363g == aVar.f48363g && this.f48364i == aVar.f48364i && this.f48365j == aVar.f48365j && this.h == aVar.h && this.f48367l == aVar.f48367l && TextUtils.equals(this.f48361c, aVar.f48361c)) {
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
