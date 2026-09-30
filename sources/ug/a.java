package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends og.a {
    public CharSequence f44095c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f44096f;
    public boolean f44097g;
    public long h;
    public int f44098i;
    public int f44099j;
    public List f44100k;
    public int f44101l;
    public TLObject f44102m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new og.a(9, false);
        aVar.e = chat;
        aVar.d = null;
        aVar.f44097g = z10;
        aVar.f44098i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new og.a(7, false);
        aVar.f44095c = charSequence;
        aVar.f44097g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new og.a(17, z10);
        aVar.f44098i = i10;
        aVar.h = j3;
        aVar.f44102m = tL_starsGiveawayOption;
        aVar.f44097g = z11;
        return aVar;
    }

    public static a e(int i10, int i11, boolean z10, ArrayList arrayList) {
        boolean z11;
        if (i11 == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        ?? aVar = new og.a(11, z11);
        aVar.f44101l = i10;
        aVar.f44097g = z10;
        aVar.f44096f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new og.a(6, false);
        aVar.f44095c = str;
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
    public final boolean a(og.a aVar) {
        a aVar2;
        int i10;
        int i11;
        if (this != aVar) {
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f15731a) == (i11 = this.f15731a)) {
                if (i11 == 0) {
                    if (this.f44097g == aVar2.f44097g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f44098i == aVar2.f44098i && this.h == aVar2.h && this.f44102m == aVar2.f44102m && this.f44097g == aVar2.f44097g && this.f15732b == aVar2.f15732b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f44098i == aVar2.f44098i && g(this.f44100k, aVar2.f44100k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f44098i == aVar2.f44098i && TextUtils.equals(this.f44095c, aVar2.f44095c)) {
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
                int i10 = this.f15731a;
                if (i10 == aVar.f15731a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f44098i == aVar.f44098i && this.f44102m == aVar.f44102m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f44100k, aVar.f44100k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f44095c, aVar.f44095c);
                            }
                            if (this.e == aVar.e && this.f44096f == aVar.f44096f && this.d == aVar.d && this.f44102m == aVar.f44102m && this.f44097g == aVar.f44097g && this.f44098i == aVar.f44098i && this.f44099j == aVar.f44099j && this.h == aVar.h && this.f44101l == aVar.f44101l && TextUtils.equals(this.f44095c, aVar.f44095c)) {
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
