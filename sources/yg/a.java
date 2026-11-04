package yg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends sg.a {
    public CharSequence f59422c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f59423e;
    public Object f59424f;
    public boolean f59425g;
    public long h;
    public int f59426i;
    public int f59427j;
    public List f59428k;
    public int f59429l;
    public TLObject f59430m;

    public static a b(int i3, TLRPC.Chat chat, boolean z10) {
        ?? aVar = new sg.a(9, false);
        aVar.f59423e = chat;
        aVar.d = null;
        aVar.f59425g = z10;
        aVar.f59426i = i3;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new sg.a(7, false);
        aVar.f59422c = charSequence;
        aVar.f59425g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i3, long j10, boolean z10, boolean z11) {
        ?? aVar = new sg.a(17, z10);
        aVar.f59426i = i3;
        aVar.h = j10;
        aVar.f59430m = tL_starsGiveawayOption;
        aVar.f59425g = z11;
        return aVar;
    }

    public static a e(int i3, int i10, boolean z10, ArrayList arrayList) {
        boolean z11;
        if (i10 == i3) {
            z11 = true;
        } else {
            z11 = false;
        }
        ?? aVar = new sg.a(11, z11);
        aVar.f59429l = i3;
        aVar.f59425g = z10;
        aVar.f59424f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new sg.a(6, false);
        aVar.f59422c = str;
        return aVar;
    }

    public static boolean g(List list, List list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (((Integer) list.get(i3)).intValue() != ((Integer) list2.get(i3)).intValue()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean a(sg.a aVar) {
        a aVar2;
        int i3;
        int i10;
        if (this != aVar) {
            if (a.class == aVar.getClass() && (i3 = (aVar2 = (a) aVar).f54715a) == (i10 = this.f54715a)) {
                if (i10 == 0) {
                    if (this.f59425g == aVar2.f59425g) {
                        return true;
                    }
                    return false;
                } else if (i3 == 17) {
                    if (this.f59426i == aVar2.f59426i && this.h == aVar2.h && this.f59430m == aVar2.f59430m && this.f59425g == aVar2.f59425g && this.f54716b == aVar2.f54716b) {
                        return true;
                    }
                    return false;
                } else if (i10 == 5) {
                    if (this.f59426i == aVar2.f59426i && g(this.f59428k, aVar2.f59428k)) {
                        return true;
                    }
                    return false;
                } else if (i10 == 13 && this.f59426i == aVar2.f59426i && TextUtils.equals(this.f59422c, aVar2.f59422c)) {
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
                int i3 = this.f54715a;
                if (i3 == aVar.f54715a) {
                    if (i3 != 0) {
                        if (i3 == 17) {
                            if (this.f59426i == aVar.f59426i && this.f59430m == aVar.f59430m) {
                                return true;
                            }
                            return false;
                        } else if (i3 == 5) {
                            return g(this.f59428k, aVar.f59428k);
                        } else {
                            if (i3 == 13) {
                                return TextUtils.equals(this.f59422c, aVar.f59422c);
                            }
                            if (this.f59423e == aVar.f59423e && this.f59424f == aVar.f59424f && this.d == aVar.d && this.f59430m == aVar.f59430m && this.f59425g == aVar.f59425g && this.f59426i == aVar.f59426i && this.f59427j == aVar.f59427j && this.h == aVar.h && this.f59429l == aVar.f59429l && TextUtils.equals(this.f59422c, aVar.f59422c)) {
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
