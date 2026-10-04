package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends og.a {
    public CharSequence f47629c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f47630e;
    public Object f47631f;
    public boolean f47632g;
    public long h;
    public int f47633i;
    public int f47634j;
    public List f47635k;
    public int f47636l;
    public TLObject f47637m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new og.a(9, false);
        aVar.f47630e = chat;
        aVar.d = null;
        aVar.f47632g = z10;
        aVar.f47633i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new og.a(7, false);
        aVar.f47629c = charSequence;
        aVar.f47632g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new og.a(17, z10);
        aVar.f47633i = i10;
        aVar.h = j3;
        aVar.f47637m = tL_starsGiveawayOption;
        aVar.f47632g = z11;
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
        aVar.f47636l = i10;
        aVar.f47632g = z10;
        aVar.f47631f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new og.a(6, false);
        aVar.f47629c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f17183a) == (i11 = this.f17183a)) {
                if (i11 == 0) {
                    if (this.f47632g == aVar2.f47632g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f47633i == aVar2.f47633i && this.h == aVar2.h && this.f47637m == aVar2.f47637m && this.f47632g == aVar2.f47632g && this.f17184b == aVar2.f17184b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f47633i == aVar2.f47633i && g(this.f47635k, aVar2.f47635k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f47633i == aVar2.f47633i && TextUtils.equals(this.f47629c, aVar2.f47629c)) {
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
                int i10 = this.f17183a;
                if (i10 == aVar.f17183a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f47633i == aVar.f47633i && this.f47637m == aVar.f47637m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f47635k, aVar.f47635k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f47629c, aVar.f47629c);
                            }
                            if (this.f47630e == aVar.f47630e && this.f47631f == aVar.f47631f && this.d == aVar.d && this.f47637m == aVar.f47637m && this.f47632g == aVar.f47632g && this.f47633i == aVar.f47633i && this.f47634j == aVar.f47634j && this.h == aVar.h && this.f47636l == aVar.f47636l && TextUtils.equals(this.f47629c, aVar.f47629c)) {
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
