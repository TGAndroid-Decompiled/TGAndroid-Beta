package zh;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.w31;
public final class j2 implements a20 {
    public final int f60307a;
    public final m3 f60308b;
    public final k60 f60309c;

    public j2(m3 m3Var, k60 k60Var, int i7) {
        this.f60307a = i7;
        this.f60308b = m3Var;
        this.f60309c = k60Var;
    }

    @Override
    public final void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        w31 w31Var = (w31) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        switch (this.f60307a) {
            case 0:
                long j3 = ((TL_stars.starGiftAttributePattern) w31Var.G).document.f26958id;
                d3 d3Var = this.f60308b.d;
                HashSet hashSet = d3Var.f60182l;
                if (!hashSet.contains(Long.valueOf(j3))) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = d3Var.h;
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj3 = arrayList.get(i7);
                            i7++;
                            long j10 = ((TL_stars.starGiftAttributePattern) obj3).document.f26958id;
                            if (j10 != j3) {
                                hashSet.add(Long.valueOf(j10));
                            }
                        }
                    } else {
                        hashSet.add(Long.valueOf(j3));
                    }
                } else {
                    hashSet.remove(Long.valueOf(j3));
                }
                d3Var.h();
                this.f60309c.u();
                return;
            case 1:
                int i10 = ((TL_stars.starGiftAttributeBackdrop) w31Var.G).backdrop_id;
                d3 d3Var2 = this.f60308b.d;
                HashSet hashSet2 = d3Var2.f60181k;
                if (!hashSet2.contains(Integer.valueOf(i10))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = d3Var2.f60178g;
                        int size2 = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj4 = arrayList2.get(i11);
                            i11++;
                            int i12 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                            if (i12 != i10) {
                                hashSet2.add(Integer.valueOf(i12));
                            }
                        }
                    } else {
                        hashSet2.add(Integer.valueOf(i10));
                    }
                } else {
                    hashSet2.remove(Integer.valueOf(i10));
                }
                d3Var2.h();
                this.f60309c.u();
                return;
            default:
                long j11 = ((TL_stars.starGiftAttributeModel) w31Var.G).document.f26958id;
                d3 d3Var3 = this.f60308b.d;
                HashSet hashSet3 = d3Var3.f60180j;
                if (!hashSet3.contains(Long.valueOf(j11))) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = d3Var3.f60177f;
                        int size3 = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            Object obj5 = arrayList3.get(i13);
                            i13++;
                            long j12 = ((TL_stars.starGiftAttributeModel) obj5).document.f26958id;
                            if (j12 != j11) {
                                hashSet3.add(Long.valueOf(j12));
                            }
                        }
                    } else {
                        hashSet3.add(Long.valueOf(j11));
                    }
                } else {
                    hashSet3.remove(Long.valueOf(j11));
                }
                d3Var3.h();
                this.f60309c.u();
                return;
        }
    }
}
