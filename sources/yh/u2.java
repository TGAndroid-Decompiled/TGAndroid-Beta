package yh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m80;
public final class u2 implements Utilities.Callback5 {
    public final int f49148a;
    public final g4 f49149b;
    public final m80 f49150c;

    public u2(g4 g4Var, m80 m80Var, int i10) {
        this.f49148a = i10;
        this.f49149b = g4Var;
        this.f49150c = m80Var;
    }

    @Override
    public final void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.f49148a;
        l61 l61Var = (l61) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        g4 g4Var = this.f49149b;
        g4Var.getClass();
        switch (i10) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributePattern) l61Var.G).document.f19222id;
                t3 t3Var = g4Var.d;
                HashSet hashSet = t3Var.f49137l;
                if (!hashSet.contains(Long.valueOf(j10))) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = t3Var.h;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj6 = arrayList.get(i11);
                            i11++;
                            long j11 = ((TL_stars.starGiftAttributePattern) obj6).document.f19222id;
                            if (j11 != j10) {
                                hashSet.add(Long.valueOf(j11));
                            }
                        }
                    } else {
                        hashSet.add(Long.valueOf(j10));
                    }
                } else {
                    hashSet.remove(Long.valueOf(j10));
                }
                t3Var.h();
                this.f49150c.u();
                return;
            case 1:
                int i12 = ((TL_stars.starGiftAttributeBackdrop) l61Var.G).backdrop_id;
                t3 t3Var2 = g4Var.d;
                HashSet hashSet2 = t3Var2.f49136k;
                if (!hashSet2.contains(Integer.valueOf(i12))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = t3Var2.f49133g;
                        int size2 = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            Object obj7 = arrayList2.get(i13);
                            i13++;
                            int i14 = ((TL_stars.starGiftAttributeBackdrop) obj7).backdrop_id;
                            if (i14 != i12) {
                                hashSet2.add(Integer.valueOf(i14));
                            }
                        }
                    } else {
                        hashSet2.add(Integer.valueOf(i12));
                    }
                } else {
                    hashSet2.remove(Integer.valueOf(i12));
                }
                t3Var2.h();
                this.f49150c.u();
                return;
            default:
                long j12 = ((TL_stars.starGiftAttributeModel) l61Var.G).document.f19222id;
                t3 t3Var3 = g4Var.d;
                HashSet hashSet3 = t3Var3.f49135j;
                if (!hashSet3.contains(Long.valueOf(j12))) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = t3Var3.f49132f;
                        int size3 = arrayList3.size();
                        int i15 = 0;
                        while (i15 < size3) {
                            Object obj8 = arrayList3.get(i15);
                            i15++;
                            long j13 = ((TL_stars.starGiftAttributeModel) obj8).document.f19222id;
                            if (j13 != j12) {
                                hashSet3.add(Long.valueOf(j13));
                            }
                        }
                    } else {
                        hashSet3.add(Long.valueOf(j12));
                    }
                } else {
                    hashSet3.remove(Long.valueOf(j12));
                }
                t3Var3.h();
                this.f49150c.u();
                return;
        }
    }
}
