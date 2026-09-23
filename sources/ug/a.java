package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends og.a {
    public CharSequence f43650c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f43651f;
    public boolean f43652g;
    public long h;
    public int f43653i;
    public int f43654j;
    public List f43655k;
    public int f43656l;
    public TLObject f43657m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new og.a(9, false);
        aVar.e = chat;
        aVar.d = null;
        aVar.f43652g = z10;
        aVar.f43653i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new og.a(7, false);
        aVar.f43650c = charSequence;
        aVar.f43652g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new og.a(17, z10);
        aVar.f43653i = i10;
        aVar.h = j3;
        aVar.f43657m = tL_starsGiveawayOption;
        aVar.f43652g = z11;
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
        aVar.f43656l = i10;
        aVar.f43652g = z10;
        aVar.f43651f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new og.a(6, false);
        aVar.f43650c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f15508a) == (i11 = this.f15508a)) {
                if (i11 == 0) {
                    if (this.f43652g == aVar2.f43652g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f43653i == aVar2.f43653i && this.h == aVar2.h && this.f43657m == aVar2.f43657m && this.f43652g == aVar2.f43652g && this.f15509b == aVar2.f15509b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f43653i == aVar2.f43653i && g(this.f43655k, aVar2.f43655k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f43653i == aVar2.f43653i && TextUtils.equals(this.f43650c, aVar2.f43650c)) {
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
                int i10 = this.f15508a;
                if (i10 == aVar.f15508a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f43653i == aVar.f43653i && this.f43657m == aVar.f43657m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f43655k, aVar.f43655k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f43650c, aVar.f43650c);
                            }
                            if (this.e == aVar.e && this.f43651f == aVar.f43651f && this.d == aVar.d && this.f43657m == aVar.f43657m && this.f43652g == aVar.f43652g && this.f43653i == aVar.f43653i && this.f43654j == aVar.f43654j && this.h == aVar.h && this.f43656l == aVar.f43656l && TextUtils.equals(this.f43650c, aVar.f43650c)) {
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
