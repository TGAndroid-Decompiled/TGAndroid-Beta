package xh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.y70;
public final class x3 implements Utilities.Callback5 {
    public final int f46468a;
    public final g4 f46469b;
    public final y70 f46470c;

    public x3(g4 g4Var, y70 y70Var, int i10) {
        this.f46468a = i10;
        this.f46469b = g4Var;
        this.f46470c = y70Var;
    }

    @Override
    public final void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        v51 v51Var = (v51) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        switch (this.f46468a) {
            case 0:
                long j3 = ((TL_stars.starGiftAttributeModel) v51Var.G).document.f18327id;
                v3 v3Var = this.f46469b.f46145c;
                HashSet hashSet = v3Var.f46442j;
                HashSet hashSet2 = v3Var.f46442j;
                if (!hashSet.contains(Long.valueOf(j3))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList = v3Var.f46439f;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj6 = arrayList.get(i10);
                            i10++;
                            long j10 = ((TL_stars.starGiftAttributeModel) obj6).document.f18327id;
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
                v3Var.h();
                this.f46470c.u();
                return;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) v51Var.G).backdrop_id;
                v3 v3Var2 = this.f46469b.f46145c;
                HashSet hashSet3 = v3Var2.f46443k;
                HashSet hashSet4 = v3Var2.f46443k;
                if (!hashSet3.contains(Integer.valueOf(i11))) {
                    if (hashSet4.isEmpty()) {
                        ArrayList arrayList2 = v3Var2.f46440g;
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
                v3Var2.h();
                this.f46470c.u();
                return;
            default:
                long j11 = ((TL_stars.starGiftAttributePattern) v51Var.G).document.f18327id;
                v3 v3Var3 = this.f46469b.f46145c;
                HashSet hashSet5 = v3Var3.f46444l;
                HashSet hashSet6 = v3Var3.f46444l;
                if (!hashSet5.contains(Long.valueOf(j11))) {
                    if (hashSet6.isEmpty()) {
                        ArrayList arrayList3 = v3Var3.h;
                        int size3 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj8 = arrayList3.get(i14);
                            i14++;
                            long j12 = ((TL_stars.starGiftAttributePattern) obj8).document.f18327id;
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
                v3Var3.h();
                this.f46470c.u();
                return;
        }
    }
}
