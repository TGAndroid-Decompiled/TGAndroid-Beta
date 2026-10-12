package xh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.u61;
public final class v2 implements Utilities.Callback5 {
    public final int f51792a;
    public final h4 f51793b;
    public final s80 f51794c;

    public v2(h4 h4Var, s80 s80Var, int i10) {
        this.f51792a = i10;
        this.f51793b = h4Var;
        this.f51794c = s80Var;
    }

    @Override
    public final void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.f51792a;
        u61 u61Var = (u61) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        h4 h4Var = this.f51793b;
        h4Var.getClass();
        switch (i10) {
            case 0:
                long j3 = ((TL_stars.starGiftAttributePattern) u61Var.G).document.f19809id;
                u3 u3Var = h4Var.d;
                HashSet hashSet = u3Var.f51781l;
                if (!hashSet.contains(Long.valueOf(j3))) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = u3Var.h;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj6 = arrayList.get(i11);
                            i11++;
                            long j10 = ((TL_stars.starGiftAttributePattern) obj6).document.f19809id;
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
                u3Var.h();
                this.f51794c.u();
                return;
            case 1:
                int i12 = ((TL_stars.starGiftAttributeBackdrop) u61Var.G).backdrop_id;
                u3 u3Var2 = h4Var.d;
                HashSet hashSet2 = u3Var2.f51780k;
                if (!hashSet2.contains(Integer.valueOf(i12))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = u3Var2.f51777g;
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
                u3Var2.h();
                this.f51794c.u();
                return;
            default:
                long j11 = ((TL_stars.starGiftAttributeModel) u61Var.G).document.f19809id;
                u3 u3Var3 = h4Var.d;
                HashSet hashSet3 = u3Var3.f51779j;
                if (!hashSet3.contains(Long.valueOf(j11))) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = u3Var3.f51776f;
                        int size3 = arrayList3.size();
                        int i15 = 0;
                        while (i15 < size3) {
                            Object obj8 = arrayList3.get(i15);
                            i15++;
                            long j12 = ((TL_stars.starGiftAttributeModel) obj8).document.f19809id;
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
                u3Var3.h();
                this.f51794c.u();
                return;
        }
    }
}
