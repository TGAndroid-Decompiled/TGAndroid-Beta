package xh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.g61;
public final class x3 implements Utilities.Callback5 {
    public final int f50314a;
    public final g4 f50315b;
    public final b80 f50316c;

    public x3(g4 g4Var, b80 b80Var, int i10) {
        this.f50314a = i10;
        this.f50315b = g4Var;
        this.f50316c = b80Var;
    }

    @Override
    public final void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        g61 g61Var = (g61) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        switch (this.f50314a) {
            case 0:
                long j3 = ((TL_stars.starGiftAttributeModel) g61Var.G).document.f20048id;
                v3 v3Var = this.f50315b.f49973c;
                HashSet hashSet = v3Var.f50288j;
                HashSet hashSet2 = v3Var.f50288j;
                if (!hashSet.contains(Long.valueOf(j3))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList = v3Var.f50285f;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj6 = arrayList.get(i10);
                            i10++;
                            long j10 = ((TL_stars.starGiftAttributeModel) obj6).document.f20048id;
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
                this.f50316c.u();
                return;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) g61Var.G).backdrop_id;
                v3 v3Var2 = this.f50315b.f49973c;
                HashSet hashSet3 = v3Var2.f50289k;
                HashSet hashSet4 = v3Var2.f50289k;
                if (!hashSet3.contains(Integer.valueOf(i11))) {
                    if (hashSet4.isEmpty()) {
                        ArrayList arrayList2 = v3Var2.f50286g;
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
                this.f50316c.u();
                return;
            default:
                long j11 = ((TL_stars.starGiftAttributePattern) g61Var.G).document.f20048id;
                v3 v3Var3 = this.f50315b.f49973c;
                HashSet hashSet5 = v3Var3.f50290l;
                HashSet hashSet6 = v3Var3.f50290l;
                if (!hashSet5.contains(Long.valueOf(j11))) {
                    if (hashSet6.isEmpty()) {
                        ArrayList arrayList3 = v3Var3.h;
                        int size3 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj8 = arrayList3.get(i14);
                            i14++;
                            long j12 = ((TL_stars.starGiftAttributePattern) obj8).document.f20048id;
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
                this.f50316c.u();
                return;
        }
    }
}
