package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends og.a {
    public CharSequence f43960c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f43961f;
    public boolean f43962g;
    public long h;
    public int f43963i;
    public int f43964j;
    public List f43965k;
    public int f43966l;
    public TLObject f43967m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new og.a(9, false);
        aVar.e = chat;
        aVar.d = null;
        aVar.f43962g = z10;
        aVar.f43963i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new og.a(7, false);
        aVar.f43960c = charSequence;
        aVar.f43962g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new og.a(17, z10);
        aVar.f43963i = i10;
        aVar.h = j3;
        aVar.f43967m = tL_starsGiveawayOption;
        aVar.f43962g = z11;
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
        aVar.f43966l = i10;
        aVar.f43962g = z10;
        aVar.f43961f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new og.a(6, false);
        aVar.f43960c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f15672a) == (i11 = this.f15672a)) {
                if (i11 == 0) {
                    if (this.f43962g == aVar2.f43962g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f43963i == aVar2.f43963i && this.h == aVar2.h && this.f43967m == aVar2.f43967m && this.f43962g == aVar2.f43962g && this.f15673b == aVar2.f15673b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f43963i == aVar2.f43963i && g(this.f43965k, aVar2.f43965k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f43963i == aVar2.f43963i && TextUtils.equals(this.f43960c, aVar2.f43960c)) {
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
                int i10 = this.f15672a;
                if (i10 == aVar.f15672a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f43963i == aVar.f43963i && this.f43967m == aVar.f43967m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f43965k, aVar.f43965k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f43960c, aVar.f43960c);
                            }
                            if (this.e == aVar.e && this.f43961f == aVar.f43961f && this.d == aVar.d && this.f43967m == aVar.f43967m && this.f43962g == aVar.f43962g && this.f43963i == aVar.f43963i && this.f43964j == aVar.f43964j && this.h == aVar.h && this.f43966l == aVar.f43966l && TextUtils.equals(this.f43960c, aVar.f43960c)) {
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
