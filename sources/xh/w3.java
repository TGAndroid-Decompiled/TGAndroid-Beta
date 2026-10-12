package xh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.u61;
public final class w3 implements Utilities.Callback5 {
    public final int f51805a;
    public final f4 f51806b;
    public final s80 f51807c;

    public w3(f4 f4Var, s80 s80Var, int i10) {
        this.f51805a = i10;
        this.f51806b = f4Var;
        this.f51807c = s80Var;
    }

    @Override
    public final void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        u61 u61Var = (u61) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        switch (this.f51805a) {
            case 0:
                long j3 = ((TL_stars.starGiftAttributeModel) u61Var.G).document.f19809id;
                u3 u3Var = this.f51806b.f51477c;
                HashSet hashSet = u3Var.f51779j;
                HashSet hashSet2 = u3Var.f51779j;
                if (!hashSet.contains(Long.valueOf(j3))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList = u3Var.f51776f;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj6 = arrayList.get(i10);
                            i10++;
                            long j10 = ((TL_stars.starGiftAttributeModel) obj6).document.f19809id;
                            if (j10 != j3) {
                                hashSet2.add(Long.valueOf(j10));
                            }
                        }
                    } else {
                        hashSet2.add(Long.valueOf(j3));
                    }
                } else {
                    hashSet2.remove(Long.valueOf(j3));
                }
                u3Var.h();
                this.f51807c.u();
                return;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) u61Var.G).backdrop_id;
                u3 u3Var2 = this.f51806b.f51477c;
                HashSet hashSet3 = u3Var2.f51780k;
                HashSet hashSet4 = u3Var2.f51780k;
                if (!hashSet3.contains(Integer.valueOf(i11))) {
                    if (hashSet4.isEmpty()) {
                        ArrayList arrayList2 = u3Var2.f51777g;
                        int size2 = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj7 = arrayList2.get(i12);
                            i12++;
                            int i13 = ((TL_stars.starGiftAttributeBackdrop) obj7).backdrop_id;
                            if (i13 != i11) {
                                hashSet4.add(Integer.valueOf(i13));
                            }
                        }
                    } else {
                        hashSet4.add(Integer.valueOf(i11));
                    }
                } else {
                    hashSet4.remove(Integer.valueOf(i11));
                }
                u3Var2.h();
                this.f51807c.u();
                return;
            default:
                long j11 = ((TL_stars.starGiftAttributePattern) u61Var.G).document.f19809id;
                u3 u3Var3 = this.f51806b.f51477c;
                HashSet hashSet5 = u3Var3.f51781l;
                HashSet hashSet6 = u3Var3.f51781l;
                if (!hashSet5.contains(Long.valueOf(j11))) {
                    if (hashSet6.isEmpty()) {
                        ArrayList arrayList3 = u3Var3.h;
                        int size3 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj8 = arrayList3.get(i14);
                            i14++;
                            long j12 = ((TL_stars.starGiftAttributePattern) obj8).document.f19809id;
                            if (j12 != j11) {
                                hashSet6.add(Long.valueOf(j12));
                            }
                        }
                    } else {
                        hashSet6.add(Long.valueOf(j11));
                    }
                } else {
                    hashSet6.remove(Long.valueOf(j11));
                }
                u3Var3.h();
                this.f51807c.u();
                return;
        }
    }
}
