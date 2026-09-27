package xh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.x51;
public final class y3 implements Utilities.Callback5 {
    public final int f46555a;
    public final h4 f46556b;
    public final a80 f46557c;

    public y3(h4 h4Var, a80 a80Var, int i10) {
        this.f46555a = i10;
        this.f46556b = h4Var;
        this.f46557c = a80Var;
    }

    @Override
    public final void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        x51 x51Var = (x51) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        switch (this.f46555a) {
            case 0:
                long j3 = ((TL_stars.starGiftAttributeModel) x51Var.G).document.f18335id;
                w3 w3Var = this.f46556b.f46234c;
                HashSet hashSet = w3Var.f46531j;
                HashSet hashSet2 = w3Var.f46531j;
                if (!hashSet.contains(Long.valueOf(j3))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList = w3Var.f46528f;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj6 = arrayList.get(i10);
                            i10++;
                            long j10 = ((TL_stars.starGiftAttributeModel) obj6).document.f18335id;
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
                w3Var.h();
                this.f46557c.u();
                return;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) x51Var.G).backdrop_id;
                w3 w3Var2 = this.f46556b.f46234c;
                HashSet hashSet3 = w3Var2.f46532k;
                HashSet hashSet4 = w3Var2.f46532k;
                if (!hashSet3.contains(Integer.valueOf(i11))) {
                    if (hashSet4.isEmpty()) {
                        ArrayList arrayList2 = w3Var2.f46529g;
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
                w3Var2.h();
                this.f46557c.u();
                return;
            default:
                long j11 = ((TL_stars.starGiftAttributePattern) x51Var.G).document.f18335id;
                w3 w3Var3 = this.f46556b.f46234c;
                HashSet hashSet5 = w3Var3.f46533l;
                HashSet hashSet6 = w3Var3.f46533l;
                if (!hashSet5.contains(Long.valueOf(j11))) {
                    if (hashSet6.isEmpty()) {
                        ArrayList arrayList3 = w3Var3.h;
                        int size3 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj8 = arrayList3.get(i14);
                            i14++;
                            long j12 = ((TL_stars.starGiftAttributePattern) obj8).document.f18335id;
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
                w3Var3.h();
                this.f46557c.u();
                return;
        }
    }
}
