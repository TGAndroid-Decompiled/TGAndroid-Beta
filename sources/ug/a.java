package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends og.a {
    public CharSequence f44004c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f44005f;
    public boolean f44006g;
    public long h;
    public int f44007i;
    public int f44008j;
    public List f44009k;
    public int f44010l;
    public TLObject f44011m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new og.a(9, false);
        aVar.e = chat;
        aVar.d = null;
        aVar.f44006g = z10;
        aVar.f44007i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new og.a(7, false);
        aVar.f44004c = charSequence;
        aVar.f44006g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        ?? aVar = new og.a(17, z10);
        aVar.f44007i = i10;
        aVar.h = j3;
        aVar.f44011m = tL_starsGiveawayOption;
        aVar.f44006g = z11;
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
        aVar.f44010l = i10;
        aVar.f44006g = z10;
        aVar.f44005f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new og.a(6, false);
        aVar.f44004c = str;
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
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f15704a) == (i11 = this.f15704a)) {
                if (i11 == 0) {
                    if (this.f44006g == aVar2.f44006g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f44007i == aVar2.f44007i && this.h == aVar2.h && this.f44011m == aVar2.f44011m && this.f44006g == aVar2.f44006g && this.f15705b == aVar2.f15705b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f44007i == aVar2.f44007i && g(this.f44009k, aVar2.f44009k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f44007i == aVar2.f44007i && TextUtils.equals(this.f44004c, aVar2.f44004c)) {
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
                int i10 = this.f15704a;
                if (i10 == aVar.f15704a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f44007i == aVar.f44007i && this.f44011m == aVar.f44011m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f44009k, aVar.f44009k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f44004c, aVar.f44004c);
                            }
                            if (this.e == aVar.e && this.f44005f == aVar.f44005f && this.d == aVar.d && this.f44011m == aVar.f44011m && this.f44006g == aVar.f44006g && this.f44007i == aVar.f44007i && this.f44008j == aVar.f44008j && this.h == aVar.h && this.f44010l == aVar.f44010l && TextUtils.equals(this.f44004c, aVar.f44004c)) {
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
