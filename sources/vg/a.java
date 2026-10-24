package vg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends pg.a {
    public CharSequence f48787c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f48788f;
    public boolean f48789g;
    public long h;
    public int f48790i;
    public int f48791j;
    public List f48792k;
    public int f48793l;
    public TLObject f48794m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new pg.a(9, false);
        aVar.e = chat;
        aVar.d = null;
        aVar.f48789g = z10;
        aVar.f48790i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new pg.a(7, false);
        aVar.f48787c = charSequence;
        aVar.f48789g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j10, boolean z10, boolean z11) {
        ?? aVar = new pg.a(17, z10);
        aVar.f48790i = i10;
        aVar.h = j10;
        aVar.f48794m = tL_starsGiveawayOption;
        aVar.f48789g = z11;
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
        aVar.f48793l = i10;
        aVar.f48789g = z10;
        aVar.f48788f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new pg.a(6, false);
        aVar.f48787c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f44712a) == (i11 = this.f44712a)) {
                if (i11 == 0) {
                    if (this.f48789g == aVar2.f48789g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f48790i == aVar2.f48790i && this.h == aVar2.h && this.f48794m == aVar2.f48794m && this.f48789g == aVar2.f48789g && this.f44713b == aVar2.f44713b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f48790i == aVar2.f48790i && g(this.f48792k, aVar2.f48792k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f48790i == aVar2.f48790i && TextUtils.equals(this.f48787c, aVar2.f48787c)) {
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
                int i10 = this.f44712a;
                if (i10 == aVar.f44712a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f48790i == aVar.f48790i && this.f48794m == aVar.f48794m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f48792k, aVar.f48792k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f48787c, aVar.f48787c);
                            }
                            if (this.e == aVar.e && this.f48788f == aVar.f48788f && this.d == aVar.d && this.f48794m == aVar.f48794m && this.f48789g == aVar.f48789g && this.f48790i == aVar.f48790i && this.f48791j == aVar.f48791j && this.h == aVar.h && this.f48793l == aVar.f48793l && TextUtils.equals(this.f48787c, aVar.f48787c)) {
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
