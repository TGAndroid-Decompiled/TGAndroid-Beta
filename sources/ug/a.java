package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends og.a {
    public CharSequence f47628c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f47629e;
    public Object f47630f;
    public boolean f47631g;
    public long h;
    public int f47632i;
    public int f47633j;
    public List f47634k;
    public int f47635l;
    public TLObject f47636m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new og.a(9, false);
        aVar.f47629e = chat;
        aVar.d = null;
        aVar.f47631g = z10;
        aVar.f47632i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new og.a(7, false);
        aVar.f47628c = charSequence;
        aVar.f47631g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new og.a(17, z10);
        aVar.f47632i = i10;
        aVar.h = j3;
        aVar.f47636m = tL_starsGiveawayOption;
        aVar.f47631g = z11;
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
        aVar.f47635l = i10;
        aVar.f47631g = z10;
        aVar.f47630f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new og.a(6, false);
        aVar.f47628c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f17182a) == (i11 = this.f17182a)) {
                if (i11 == 0) {
                    if (this.f47631g == aVar2.f47631g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f47632i == aVar2.f47632i && this.h == aVar2.h && this.f47636m == aVar2.f47636m && this.f47631g == aVar2.f47631g && this.f17183b == aVar2.f17183b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f47632i == aVar2.f47632i && g(this.f47634k, aVar2.f47634k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f47632i == aVar2.f47632i && TextUtils.equals(this.f47628c, aVar2.f47628c)) {
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
                int i10 = this.f17182a;
                if (i10 == aVar.f17182a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f47632i == aVar.f47632i && this.f47636m == aVar.f47636m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f47634k, aVar.f47634k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f47628c, aVar.f47628c);
                            }
                            if (this.f47629e == aVar.f47629e && this.f47630f == aVar.f47630f && this.d == aVar.d && this.f47636m == aVar.f47636m && this.f47631g == aVar.f47631g && this.f47632i == aVar.f47632i && this.f47633j == aVar.f47633j && this.h == aVar.h && this.f47635l == aVar.f47635l && TextUtils.equals(this.f47628c, aVar.f47628c)) {
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
