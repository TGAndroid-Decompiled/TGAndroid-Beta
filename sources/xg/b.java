package xg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class b extends rg.a {
    public CharSequence f58585c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f58586e;
    public Object f58587f;
    public boolean f58588g;
    public long h;
    public int f58589i;
    public int f58590j;
    public List f58591k;
    public int f58592l;
    public TLObject f58593m;

    public static b b(int i7, TLRPC.Chat chat, boolean z9) {
        ?? aVar = new rg.a(9, false);
        aVar.f58586e = chat;
        aVar.d = null;
        aVar.f58588g = z9;
        aVar.f58589i = i7;
        return aVar;
    }

    public static b c(CharSequence charSequence, boolean z9) {
        ?? aVar = new rg.a(7, false);
        aVar.f58585c = charSequence;
        aVar.f58588g = z9;
        return aVar;
    }

    public static b d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i7, long j3, boolean z9, boolean z10) {
        ?? aVar = new rg.a(17, z9);
        aVar.f58589i = i7;
        aVar.h = j3;
        aVar.f58593m = tL_starsGiveawayOption;
        aVar.f58588g = z10;
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
        aVar.f58592l = i7;
        aVar.f58588g = z9;
        aVar.f58587f = arrayList;
        return aVar;
    }

    public static b f(String str) {
        ?? aVar = new rg.a(6, false);
        aVar.f58585c = str;
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
            if (b.class == aVar.getClass() && (i7 = (bVar = (b) aVar).f54415a) == (i10 = this.f54415a)) {
                if (i10 == 0) {
                    if (this.f58588g == bVar.f58588g) {
                        return true;
                    }
                    return false;
                } else if (i7 == 17) {
                    if (this.f58589i == bVar.f58589i && this.h == bVar.h && this.f58593m == bVar.f58593m && this.f58588g == bVar.f58588g && this.f54416b == bVar.f54416b) {
                        return true;
                    }
                    return false;
                } else if (i10 == 5) {
                    if (this.f58589i == bVar.f58589i && g(this.f58591k, bVar.f58591k)) {
                        return true;
                    }
                    return false;
                } else if (i10 == 13 && this.f58589i == bVar.f58589i && TextUtils.equals(this.f58585c, bVar.f58585c)) {
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
                int i7 = this.f54415a;
                if (i7 == bVar.f54415a) {
                    if (i7 != 0) {
                        if (i7 == 17) {
                            if (this.f58589i == bVar.f58589i && this.f58593m == bVar.f58593m) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 5) {
                            return g(this.f58591k, bVar.f58591k);
                        } else {
                            if (i7 == 13) {
                                return TextUtils.equals(this.f58585c, bVar.f58585c);
                            }
                            if (this.f58586e == bVar.f58586e && this.f58587f == bVar.f58587f && this.d == bVar.d && this.f58593m == bVar.f58593m && this.f58588g == bVar.f58588g && this.f58589i == bVar.f58589i && this.f58590j == bVar.f58590j && this.h == bVar.h && this.f58592l == bVar.f58592l && TextUtils.equals(this.f58585c, bVar.f58585c)) {
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
