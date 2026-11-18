package xg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends rg.a {
    public CharSequence f60463c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f60464e;
    public Object f60465f;
    public boolean f60466g;
    public long h;
    public int f60467i;
    public int f60468j;
    public List f60469k;
    public int f60470l;
    public TLObject f60471m;

    public static a b(int i7, TLRPC.Chat chat, boolean z10) {
        ?? aVar = new rg.a(9, false);
        aVar.f60464e = chat;
        aVar.d = null;
        aVar.f60466g = z10;
        aVar.f60467i = i7;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new rg.a(7, false);
        aVar.f60463c = charSequence;
        aVar.f60466g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i7, long j3, boolean z10, boolean z11) {
        ?? aVar = new rg.a(17, z10);
        aVar.f60467i = i7;
        aVar.h = j3;
        aVar.f60471m = tL_starsGiveawayOption;
        aVar.f60466g = z11;
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
        aVar.f60470l = i7;
        aVar.f60466g = z10;
        aVar.f60465f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new rg.a(6, false);
        aVar.f60463c = str;
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
            if (a.class == aVar.getClass() && (i7 = (aVar2 = (a) aVar).f56589a) == (i10 = this.f56589a)) {
                if (i10 == 0) {
                    if (this.f60466g == aVar2.f60466g) {
                        return true;
                    }
                    return false;
                } else if (i7 == 17) {
                    if (this.f60467i == aVar2.f60467i && this.h == aVar2.h && this.f60471m == aVar2.f60471m && this.f60466g == aVar2.f60466g && this.f56590b == aVar2.f56590b) {
                        return true;
                    }
                    return false;
                } else if (i10 == 5) {
                    if (this.f60467i == aVar2.f60467i && g(this.f60469k, aVar2.f60469k)) {
                        return true;
                    }
                    return false;
                } else if (i10 == 13 && this.f60467i == aVar2.f60467i && TextUtils.equals(this.f60463c, aVar2.f60463c)) {
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
                int i7 = this.f56589a;
                if (i7 == aVar.f56589a) {
                    if (i7 != 0) {
                        if (i7 == 17) {
                            if (this.f60467i == aVar.f60467i && this.f60471m == aVar.f60471m) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 5) {
                            return g(this.f60469k, aVar.f60469k);
                        } else {
                            if (i7 == 13) {
                                return TextUtils.equals(this.f60463c, aVar.f60463c);
                            }
                            if (this.f60464e == aVar.f60464e && this.f60465f == aVar.f60465f && this.d == aVar.d && this.f60471m == aVar.f60471m && this.f60466g == aVar.f60466g && this.f60467i == aVar.f60467i && this.f60468j == aVar.f60468j && this.h == aVar.h && this.f60470l == aVar.f60470l && TextUtils.equals(this.f60463c, aVar.f60463c)) {
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
