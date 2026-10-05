package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends og.a {
    public CharSequence f47644c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f47645e;
    public Object f47646f;
    public boolean f47647g;
    public long h;
    public int f47648i;
    public int f47649j;
    public List f47650k;
    public int f47651l;
    public TLObject f47652m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new og.a(9, false);
        aVar.f47645e = chat;
        aVar.d = null;
        aVar.f47647g = z10;
        aVar.f47648i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new og.a(7, false);
        aVar.f47644c = charSequence;
        aVar.f47647g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new og.a(17, z10);
        aVar.f47648i = i10;
        aVar.h = j3;
        aVar.f47652m = tL_starsGiveawayOption;
        aVar.f47647g = z11;
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
        aVar.f47651l = i10;
        aVar.f47647g = z10;
        aVar.f47646f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new og.a(6, false);
        aVar.f47644c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f17192a) == (i11 = this.f17192a)) {
                if (i11 == 0) {
                    if (this.f47647g == aVar2.f47647g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f47648i == aVar2.f47648i && this.h == aVar2.h && this.f47652m == aVar2.f47652m && this.f47647g == aVar2.f47647g && this.f17193b == aVar2.f17193b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f47648i == aVar2.f47648i && g(this.f47650k, aVar2.f47650k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f47648i == aVar2.f47648i && TextUtils.equals(this.f47644c, aVar2.f47644c)) {
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
                int i10 = this.f17192a;
                if (i10 == aVar.f17192a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f47648i == aVar.f47648i && this.f47652m == aVar.f47652m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f47650k, aVar.f47650k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f47644c, aVar.f47644c);
                            }
                            if (this.f47645e == aVar.f47645e && this.f47646f == aVar.f47646f && this.d == aVar.d && this.f47652m == aVar.f47652m && this.f47647g == aVar.f47647g && this.f47648i == aVar.f47648i && this.f47649j == aVar.f47649j && this.h == aVar.h && this.f47651l == aVar.f47651l && TextUtils.equals(this.f47644c, aVar.f47644c)) {
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
