package xg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends rg.a {
    public CharSequence f60474c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f60475e;
    public Object f60476f;
    public boolean f60477g;
    public long h;
    public int f60478i;
    public int f60479j;
    public List f60480k;
    public int f60481l;
    public TLObject f60482m;

    public static a b(int i7, TLRPC.Chat chat, boolean z10) {
        ?? aVar = new rg.a(9, false);
        aVar.f60475e = chat;
        aVar.d = null;
        aVar.f60477g = z10;
        aVar.f60478i = i7;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new rg.a(7, false);
        aVar.f60474c = charSequence;
        aVar.f60477g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i7, long j3, boolean z10, boolean z11) {
        ?? aVar = new rg.a(17, z10);
        aVar.f60478i = i7;
        aVar.h = j3;
        aVar.f60482m = tL_starsGiveawayOption;
        aVar.f60477g = z11;
        return aVar;
    }

    public static a e(int i7, int i10, boolean z10, ArrayList arrayList) {
        boolean z11;
        if (i10 == i7) {
            z11 = true;
        } else {
            z11 = false;
        }
        ?? aVar = new rg.a(11, z11);
        aVar.f60481l = i7;
        aVar.f60477g = z10;
        aVar.f60476f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new rg.a(6, false);
        aVar.f60474c = str;
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
        a aVar2;
        int i7;
        int i10;
        if (this != aVar) {
            if (a.class == aVar.getClass() && (i7 = (aVar2 = (a) aVar).f56599a) == (i10 = this.f56599a)) {
                if (i10 == 0) {
                    if (this.f60477g == aVar2.f60477g) {
                        return true;
                    }
                    return false;
                } else if (i7 == 17) {
                    if (this.f60478i == aVar2.f60478i && this.h == aVar2.h && this.f60482m == aVar2.f60482m && this.f60477g == aVar2.f60477g && this.f56600b == aVar2.f56600b) {
                        return true;
                    }
                    return false;
                } else if (i10 == 5) {
                    if (this.f60478i == aVar2.f60478i && g(this.f60480k, aVar2.f60480k)) {
                        return true;
                    }
                    return false;
                } else if (i10 == 13 && this.f60478i == aVar2.f60478i && TextUtils.equals(this.f60474c, aVar2.f60474c)) {
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
                int i7 = this.f56599a;
                if (i7 == aVar.f56599a) {
                    if (i7 != 0) {
                        if (i7 == 17) {
                            if (this.f60478i == aVar.f60478i && this.f60482m == aVar.f60482m) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 5) {
                            return g(this.f60480k, aVar.f60480k);
                        } else {
                            if (i7 == 13) {
                                return TextUtils.equals(this.f60474c, aVar.f60474c);
                            }
                            if (this.f60475e == aVar.f60475e && this.f60476f == aVar.f60476f && this.d == aVar.d && this.f60482m == aVar.f60482m && this.f60477g == aVar.f60477g && this.f60478i == aVar.f60478i && this.f60479j == aVar.f60479j && this.h == aVar.h && this.f60481l == aVar.f60481l && TextUtils.equals(this.f60474c, aVar.f60474c)) {
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
