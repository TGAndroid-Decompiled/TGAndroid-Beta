package xg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class b extends rg.a {
    public CharSequence f58615c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f58616e;
    public Object f58617f;
    public boolean f58618g;
    public long h;
    public int f58619i;
    public int f58620j;
    public List f58621k;
    public int f58622l;
    public TLObject f58623m;

    public static b b(int i7, TLRPC.Chat chat, boolean z9) {
        ?? aVar = new rg.a(9, false);
        aVar.f58616e = chat;
        aVar.d = null;
        aVar.f58618g = z9;
        aVar.f58619i = i7;
        return aVar;
    }

    public static b c(CharSequence charSequence, boolean z9) {
        ?? aVar = new rg.a(7, false);
        aVar.f58615c = charSequence;
        aVar.f58618g = z9;
        return aVar;
    }

    public static b d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i7, long j3, boolean z9, boolean z10) {
        ?? aVar = new rg.a(17, z9);
        aVar.f58619i = i7;
        aVar.h = j3;
        aVar.f58623m = tL_starsGiveawayOption;
        aVar.f58618g = z10;
        return aVar;
    }

    public static b e(int i7, int i10, boolean z9, ArrayList arrayList) {
        boolean z10;
        if (i10 == i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        ?? aVar = new rg.a(11, z10);
        aVar.f58622l = i7;
        aVar.f58618g = z9;
        aVar.f58617f = arrayList;
        return aVar;
    }

    public static b f(String str) {
        ?? aVar = new rg.a(6, false);
        aVar.f58615c = str;
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
        b bVar;
        int i7;
        int i10;
        if (this != aVar) {
            if (b.class == aVar.getClass() && (i7 = (bVar = (b) aVar).f54439a) == (i10 = this.f54439a)) {
                if (i10 == 0) {
                    if (this.f58618g == bVar.f58618g) {
                        return true;
                    }
                    return false;
                } else if (i7 == 17) {
                    if (this.f58619i == bVar.f58619i && this.h == bVar.h && this.f58623m == bVar.f58623m && this.f58618g == bVar.f58618g && this.f54440b == bVar.f54440b) {
                        return true;
                    }
                    return false;
                } else if (i10 == 5) {
                    if (this.f58619i == bVar.f58619i && g(this.f58621k, bVar.f58621k)) {
                        return true;
                    }
                    return false;
                } else if (i10 == 13 && this.f58619i == bVar.f58619i && TextUtils.equals(this.f58615c, bVar.f58615c)) {
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
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                int i7 = this.f54439a;
                if (i7 == bVar.f54439a) {
                    if (i7 != 0) {
                        if (i7 == 17) {
                            if (this.f58619i == bVar.f58619i && this.f58623m == bVar.f58623m) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 5) {
                            return g(this.f58621k, bVar.f58621k);
                        } else {
                            if (i7 == 13) {
                                return TextUtils.equals(this.f58615c, bVar.f58615c);
                            }
                            if (this.f58616e == bVar.f58616e && this.f58617f == bVar.f58617f && this.d == bVar.d && this.f58623m == bVar.f58623m && this.f58618g == bVar.f58618g && this.f58619i == bVar.f58619i && this.f58620j == bVar.f58620j && this.h == bVar.h && this.f58622l == bVar.f58622l && TextUtils.equals(this.f58615c, bVar.f58615c)) {
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
