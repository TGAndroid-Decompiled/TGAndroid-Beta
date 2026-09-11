package yh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n70;
public final class v3 implements Utilities.Callback5 {
    public final int f50605a;
    public final e4 f50606b;
    public final n70 f50607c;

    public v3(e4 e4Var, n70 n70Var, int i10) {
        this.f50605a = i10;
        this.f50606b = e4Var;
        this.f50607c = n70Var;
    }

    @Override
    public final void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h51 h51Var = (h51) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        switch (this.f50605a) {
            case 0:
                long j3 = ((TL_stars.starGiftAttributeModel) h51Var.G).document.f19875id;
                t3 t3Var = this.f50606b.f50265c;
                HashSet hashSet = t3Var.f50563j;
                HashSet hashSet2 = t3Var.f50563j;
                if (!hashSet.contains(Long.valueOf(j3))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList = t3Var.f50560f;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj6 = arrayList.get(i10);
                            i10++;
                            long j10 = ((TL_stars.starGiftAttributeModel) obj6).document.f19875id;
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
                t3Var.h();
                this.f50607c.u();
                return;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) h51Var.G).backdrop_id;
                t3 t3Var2 = this.f50606b.f50265c;
                HashSet hashSet3 = t3Var2.f50564k;
                HashSet hashSet4 = t3Var2.f50564k;
                if (!hashSet3.contains(Integer.valueOf(i11))) {
                    if (hashSet4.isEmpty()) {
                        ArrayList arrayList2 = t3Var2.f50561g;
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
                t3Var2.h();
                this.f50607c.u();
                return;
            default:
                long j11 = ((TL_stars.starGiftAttributePattern) h51Var.G).document.f19875id;
                t3 t3Var3 = this.f50606b.f50265c;
                HashSet hashSet5 = t3Var3.f50565l;
                HashSet hashSet6 = t3Var3.f50565l;
                if (!hashSet5.contains(Long.valueOf(j11))) {
                    if (hashSet6.isEmpty()) {
                        ArrayList arrayList3 = t3Var3.h;
                        int size3 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj8 = arrayList3.get(i14);
                            i14++;
                            long j12 = ((TL_stars.starGiftAttributePattern) obj8).document.f19875id;
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
                t3Var3.h();
                this.f50607c.u();
                return;
        }
    }
}
