package wh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w70;
public final class u2 implements Utilities.Callback5 {
    public final int f44365a;
    public final h4 f44366b;
    public final w70 f44367c;

    public u2(h4 h4Var, w70 w70Var, int i10) {
        this.f44365a = i10;
        this.f44366b = h4Var;
        this.f44367c = w70Var;
    }

    @Override
    public final void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.f44365a;
        v51 v51Var = (v51) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        h4 h4Var = this.f44366b;
        h4Var.getClass();
        switch (i10) {
            case 0:
                long j3 = ((TL_stars.starGiftAttributePattern) v51Var.G).document.f17201id;
                u3 u3Var = h4Var.d;
                HashSet hashSet = u3Var.f44376l;
                if (!hashSet.contains(Long.valueOf(j3))) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = u3Var.h;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj6 = arrayList.get(i11);
                            i11++;
                            long j10 = ((TL_stars.starGiftAttributePattern) obj6).document.f17201id;
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
                this.f44367c.u();
                return;
            case 1:
                int i12 = ((TL_stars.starGiftAttributeBackdrop) v51Var.G).backdrop_id;
                u3 u3Var2 = h4Var.d;
                HashSet hashSet2 = u3Var2.f44375k;
                if (!hashSet2.contains(Integer.valueOf(i12))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = u3Var2.f44372g;
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
                this.f44367c.u();
                return;
            default:
                long j11 = ((TL_stars.starGiftAttributeModel) v51Var.G).document.f17201id;
                u3 u3Var3 = h4Var.d;
                HashSet hashSet3 = u3Var3.f44374j;
                if (!hashSet3.contains(Long.valueOf(j11))) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = u3Var3.f44371f;
                        int size3 = arrayList3.size();
                        int i15 = 0;
                        while (i15 < size3) {
                            Object obj8 = arrayList3.get(i15);
                            i15++;
                            long j12 = ((TL_stars.starGiftAttributeModel) obj8).document.f17201id;
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
                this.f44367c.u();
                return;
        }
    }
}
