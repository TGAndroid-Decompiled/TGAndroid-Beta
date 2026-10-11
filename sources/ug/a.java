package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends og.a {
    public CharSequence f49023c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f49024e;
    public Object f49025f;
    public boolean f49026g;
    public long h;
    public int f49027i;
    public int f49028j;
    public List f49029k;
    public int f49030l;
    public TLObject f49031m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new og.a(9, false);
        aVar.f49024e = chat;
        aVar.d = null;
        aVar.f49026g = z10;
        aVar.f49027i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new og.a(7, false);
        aVar.f49023c = charSequence;
        aVar.f49026g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new og.a(17, z10);
        aVar.f49027i = i10;
        aVar.h = j3;
        aVar.f49031m = tL_starsGiveawayOption;
        aVar.f49026g = z11;
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
        aVar.f49030l = i10;
        aVar.f49026g = z10;
        aVar.f49025f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new og.a(6, false);
        aVar.f49023c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f17211a) == (i11 = this.f17211a)) {
                if (i11 == 0) {
                    if (this.f49026g == aVar2.f49026g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f49027i == aVar2.f49027i && this.h == aVar2.h && this.f49031m == aVar2.f49031m && this.f49026g == aVar2.f49026g && this.f17212b == aVar2.f17212b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f49027i == aVar2.f49027i && g(this.f49029k, aVar2.f49029k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f49027i == aVar2.f49027i && TextUtils.equals(this.f49023c, aVar2.f49023c)) {
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
                int i10 = this.f17211a;
                if (i10 == aVar.f17211a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f49027i == aVar.f49027i && this.f49031m == aVar.f49031m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f49029k, aVar.f49029k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f49023c, aVar.f49023c);
                            }
                            if (this.f49024e == aVar.f49024e && this.f49025f == aVar.f49025f && this.d == aVar.d && this.f49031m == aVar.f49031m && this.f49026g == aVar.f49026g && this.f49027i == aVar.f49027i && this.f49028j == aVar.f49028j && this.h == aVar.h && this.f49030l == aVar.f49030l && TextUtils.equals(this.f49023c, aVar.f49023c)) {
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
