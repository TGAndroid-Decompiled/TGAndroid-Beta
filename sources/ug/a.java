package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends og.a {
    public CharSequence f48989c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f48990e;
    public Object f48991f;
    public boolean f48992g;
    public long h;
    public int f48993i;
    public int f48994j;
    public List f48995k;
    public int f48996l;
    public TLObject f48997m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new og.a(9, false);
        aVar.f48990e = chat;
        aVar.d = null;
        aVar.f48992g = z10;
        aVar.f48993i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new og.a(7, false);
        aVar.f48989c = charSequence;
        aVar.f48992g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new og.a(17, z10);
        aVar.f48993i = i10;
        aVar.h = j3;
        aVar.f48997m = tL_starsGiveawayOption;
        aVar.f48992g = z11;
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
        aVar.f48996l = i10;
        aVar.f48992g = z10;
        aVar.f48991f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new og.a(6, false);
        aVar.f48989c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f17175a) == (i11 = this.f17175a)) {
                if (i11 == 0) {
                    if (this.f48992g == aVar2.f48992g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f48993i == aVar2.f48993i && this.h == aVar2.h && this.f48997m == aVar2.f48997m && this.f48992g == aVar2.f48992g && this.f17176b == aVar2.f17176b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f48993i == aVar2.f48993i && g(this.f48995k, aVar2.f48995k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f48993i == aVar2.f48993i && TextUtils.equals(this.f48989c, aVar2.f48989c)) {
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
                int i10 = this.f17175a;
                if (i10 == aVar.f17175a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f48993i == aVar.f48993i && this.f48997m == aVar.f48997m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f48995k, aVar.f48995k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f48989c, aVar.f48989c);
                            }
                            if (this.f48990e == aVar.f48990e && this.f48991f == aVar.f48991f && this.d == aVar.d && this.f48997m == aVar.f48997m && this.f48992g == aVar.f48992g && this.f48993i == aVar.f48993i && this.f48994j == aVar.f48994j && this.h == aVar.h && this.f48996l == aVar.f48996l && TextUtils.equals(this.f48989c, aVar.f48989c)) {
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
