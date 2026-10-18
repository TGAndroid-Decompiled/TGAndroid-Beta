package yh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i80;
public final class w3 implements Utilities.Callback5 {
    public final int f50616a;
    public final f4 f50617b;
    public final i80 f50618c;

    public w3(f4 f4Var, i80 i80Var, int i10) {
        this.f50616a = i10;
        this.f50617b = f4Var;
        this.f50618c = i80Var;
    }

    @Override
    public final void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        f61 f61Var = (f61) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        switch (this.f50616a) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributeModel) f61Var.G).document.f20285id;
                t3 t3Var = this.f50617b.f50287c;
                HashSet hashSet = t3Var.f50564j;
                HashSet hashSet2 = t3Var.f50564j;
                if (!hashSet.contains(Long.valueOf(j10))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList = t3Var.f50561f;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj6 = arrayList.get(i10);
                            i10++;
                            long j11 = ((TL_stars.starGiftAttributeModel) obj6).document.f20285id;
                            if (j11 != j10) {
                                hashSet2.add(Long.valueOf(j11));
                            }
                        }
                    } else {
                        hashSet2.add(Long.valueOf(j10));
                    }
                } else {
                    hashSet2.remove(Long.valueOf(j10));
                }
                t3Var.h();
                this.f50618c.u();
                return;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) f61Var.G).backdrop_id;
                t3 t3Var2 = this.f50617b.f50287c;
                HashSet hashSet3 = t3Var2.f50565k;
                HashSet hashSet4 = t3Var2.f50565k;
                if (!hashSet3.contains(Integer.valueOf(i11))) {
                    if (hashSet4.isEmpty()) {
                        ArrayList arrayList2 = t3Var2.f50562g;
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
                this.f50618c.u();
                return;
            default:
                long j12 = ((TL_stars.starGiftAttributePattern) f61Var.G).document.f20285id;
                t3 t3Var3 = this.f50617b.f50287c;
                HashSet hashSet5 = t3Var3.f50566l;
                HashSet hashSet6 = t3Var3.f50566l;
                if (!hashSet5.contains(Long.valueOf(j12))) {
                    if (hashSet6.isEmpty()) {
                        ArrayList arrayList3 = t3Var3.h;
                        int size3 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj8 = arrayList3.get(i14);
                            i14++;
                            long j13 = ((TL_stars.starGiftAttributePattern) obj8).document.f20285id;
                            if (j13 != j12) {
                                hashSet6.add(Long.valueOf(j13));
                            }
                        }
                    } else {
                        hashSet6.add(Long.valueOf(j12));
                    }
                } else {
                    hashSet6.remove(Long.valueOf(j12));
                }
                t3Var3.h();
                this.f50618c.u();
                return;
        }
    }
}
