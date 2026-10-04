package xh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.g61;
public final class w2 implements Utilities.Callback5 {
    public final int f50304a;
    public final i4 f50305b;
    public final b80 f50306c;

    public w2(i4 i4Var, b80 b80Var, int i10) {
        this.f50304a = i10;
        this.f50305b = i4Var;
        this.f50306c = b80Var;
    }

    @Override
    public final void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.f50304a;
        g61 g61Var = (g61) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        i4 i4Var = this.f50305b;
        i4Var.getClass();
        switch (i10) {
            case 0:
                long j3 = ((TL_stars.starGiftAttributePattern) g61Var.G).document.f20048id;
                v3 v3Var = i4Var.d;
                HashSet hashSet = v3Var.f50290l;
                if (!hashSet.contains(Long.valueOf(j3))) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = v3Var.h;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj6 = arrayList.get(i11);
                            i11++;
                            long j10 = ((TL_stars.starGiftAttributePattern) obj6).document.f20048id;
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
                v3Var.h();
                this.f50306c.u();
                return;
            case 1:
                int i12 = ((TL_stars.starGiftAttributeBackdrop) g61Var.G).backdrop_id;
                v3 v3Var2 = i4Var.d;
                HashSet hashSet2 = v3Var2.f50289k;
                if (!hashSet2.contains(Integer.valueOf(i12))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = v3Var2.f50286g;
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
                v3Var2.h();
                this.f50306c.u();
                return;
            default:
                long j11 = ((TL_stars.starGiftAttributeModel) g61Var.G).document.f20048id;
                v3 v3Var3 = i4Var.d;
                HashSet hashSet3 = v3Var3.f50288j;
                if (!hashSet3.contains(Long.valueOf(j11))) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = v3Var3.f50285f;
                        int size3 = arrayList3.size();
                        int i15 = 0;
                        while (i15 < size3) {
                            Object obj8 = arrayList3.get(i15);
                            i15++;
                            long j12 = ((TL_stars.starGiftAttributeModel) obj8).document.f20048id;
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
                v3Var3.h();
                this.f50306c.u();
                return;
        }
    }
}
