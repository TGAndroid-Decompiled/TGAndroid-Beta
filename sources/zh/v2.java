package zh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.t61;
public final class v2 implements Utilities.Callback5 {
    public final int f53299a;
    public final h4 f53300b;
    public final k80 f53301c;

    public v2(h4 h4Var, k80 k80Var, int i10) {
        this.f53299a = i10;
        this.f53300b = h4Var;
        this.f53301c = k80Var;
    }

    @Override
    public final void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.f53299a;
        t61 t61Var = (t61) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        h4 h4Var = this.f53300b;
        h4Var.getClass();
        switch (i10) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributePattern) t61Var.G).document.f22033id;
                u3 u3Var = h4Var.d;
                HashSet hashSet = u3Var.f53273l;
                if (!hashSet.contains(Long.valueOf(j10))) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = u3Var.h;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj6 = arrayList.get(i11);
                            i11++;
                            long j11 = ((TL_stars.starGiftAttributePattern) obj6).document.f22033id;
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
                u3Var.h();
                this.f53301c.u();
                return;
            case 1:
                int i12 = ((TL_stars.starGiftAttributeBackdrop) t61Var.G).backdrop_id;
                u3 u3Var2 = h4Var.d;
                HashSet hashSet2 = u3Var2.f53272k;
                if (!hashSet2.contains(Integer.valueOf(i12))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = u3Var2.f53269g;
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
                this.f53301c.u();
                return;
            default:
                long j12 = ((TL_stars.starGiftAttributeModel) t61Var.G).document.f22033id;
                u3 u3Var3 = h4Var.d;
                HashSet hashSet3 = u3Var3.f53271j;
                if (!hashSet3.contains(Long.valueOf(j12))) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = u3Var3.f53268f;
                        int size3 = arrayList3.size();
                        int i15 = 0;
                        while (i15 < size3) {
                            Object obj8 = arrayList3.get(i15);
                            i15++;
                            long j13 = ((TL_stars.starGiftAttributeModel) obj8).document.f22033id;
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
                u3Var3.h();
                this.f53301c.u();
                return;
        }
    }
}
