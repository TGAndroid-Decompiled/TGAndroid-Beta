package zh;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.x31;
public final class h2 implements a20 {
    public final int f60364a;
    public final l3 f60365b;
    public final k60 f60366c;

    public h2(l3 l3Var, k60 k60Var, int i7) {
        this.f60364a = i7;
        this.f60365b = l3Var;
        this.f60366c = k60Var;
    }

    @Override
    public final void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        x31 x31Var = (x31) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        switch (this.f60364a) {
            case 0:
                long j3 = ((TL_stars.starGiftAttributePattern) x31Var.G).document.f26962id;
                b3 b3Var = this.f60365b.d;
                HashSet hashSet = b3Var.f60242l;
                if (!hashSet.contains(Long.valueOf(j3))) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = b3Var.h;
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj3 = arrayList.get(i7);
                            i7++;
                            long j10 = ((TL_stars.starGiftAttributePattern) obj3).document.f26962id;
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
                b3Var.h();
                this.f60366c.u();
                return;
            case 1:
                int i10 = ((TL_stars.starGiftAttributeBackdrop) x31Var.G).backdrop_id;
                b3 b3Var2 = this.f60365b.d;
                HashSet hashSet2 = b3Var2.f60241k;
                if (!hashSet2.contains(Integer.valueOf(i10))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = b3Var2.f60238g;
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
                b3Var2.h();
                this.f60366c.u();
                return;
            default:
                long j11 = ((TL_stars.starGiftAttributeModel) x31Var.G).document.f26962id;
                b3 b3Var3 = this.f60365b.d;
                HashSet hashSet3 = b3Var3.f60240j;
                if (!hashSet3.contains(Long.valueOf(j11))) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = b3Var3.f60237f;
                        int size3 = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            Object obj5 = arrayList3.get(i13);
                            i13++;
                            long j12 = ((TL_stars.starGiftAttributeModel) obj5).document.f26962id;
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
                b3Var3.h();
                this.f60366c.u();
                return;
        }
    }
}
