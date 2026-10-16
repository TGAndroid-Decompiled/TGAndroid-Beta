package vg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends pg.a {
    public CharSequence f46954c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f46955f;
    public boolean f46956g;
    public long h;
    public int f46957i;
    public int f46958j;
    public List f46959k;
    public int f46960l;
    public TLObject f46961m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new pg.a(9, false);
        aVar.e = chat;
        aVar.d = null;
        aVar.f46956g = z10;
        aVar.f46957i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new pg.a(7, false);
        aVar.f46954c = charSequence;
        aVar.f46956g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j10, boolean z10, boolean z11) {
        ?? aVar = new pg.a(17, z10);
        aVar.f46957i = i10;
        aVar.h = j10;
        aVar.f46961m = tL_starsGiveawayOption;
        aVar.f46956g = z11;
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
        aVar.f46960l = i10;
        aVar.f46956g = z10;
        aVar.f46955f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new pg.a(6, false);
        aVar.f46954c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f42904a) == (i11 = this.f42904a)) {
                if (i11 == 0) {
                    if (this.f46956g == aVar2.f46956g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f46957i == aVar2.f46957i && this.h == aVar2.h && this.f46961m == aVar2.f46961m && this.f46956g == aVar2.f46956g && this.f42905b == aVar2.f42905b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f46957i == aVar2.f46957i && g(this.f46959k, aVar2.f46959k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f46957i == aVar2.f46957i && TextUtils.equals(this.f46954c, aVar2.f46954c)) {
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
                int i10 = this.f42904a;
                if (i10 == aVar.f42904a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f46957i == aVar.f46957i && this.f46961m == aVar.f46961m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f46959k, aVar.f46959k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f46954c, aVar.f46954c);
                            }
                            if (this.e == aVar.e && this.f46955f == aVar.f46955f && this.d == aVar.d && this.f46961m == aVar.f46961m && this.f46956g == aVar.f46956g && this.f46957i == aVar.f46957i && this.f46958j == aVar.f46958j && this.h == aVar.h && this.f46960l == aVar.f46960l && TextUtils.equals(this.f46954c, aVar.f46954c)) {
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
