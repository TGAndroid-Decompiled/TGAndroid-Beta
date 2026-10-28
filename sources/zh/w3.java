package zh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.u61;
public final class w3 implements Utilities.Callback5 {
    public final int f53374a;
    public final f4 f53375b;
    public final l80 f53376c;

    public w3(f4 f4Var, l80 l80Var, int i10) {
        this.f53374a = i10;
        this.f53375b = f4Var;
        this.f53376c = l80Var;
    }

    @Override
    public final void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        u61 u61Var = (u61) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        switch (this.f53374a) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributeModel) u61Var.G).document.f22034id;
                u3 u3Var = this.f53375b.f53033c;
                HashSet hashSet = u3Var.f53329j;
                HashSet hashSet2 = u3Var.f53329j;
                if (!hashSet.contains(Long.valueOf(j10))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList = u3Var.f53326f;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj6 = arrayList.get(i10);
                            i10++;
                            long j11 = ((TL_stars.starGiftAttributeModel) obj6).document.f22034id;
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
                u3Var.h();
                this.f53376c.u();
                return;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) u61Var.G).backdrop_id;
                u3 u3Var2 = this.f53375b.f53033c;
                HashSet hashSet3 = u3Var2.f53330k;
                HashSet hashSet4 = u3Var2.f53330k;
                if (!hashSet3.contains(Integer.valueOf(i11))) {
                    if (hashSet4.isEmpty()) {
                        ArrayList arrayList2 = u3Var2.f53327g;
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
                this.f53376c.u();
                return;
            default:
                long j12 = ((TL_stars.starGiftAttributePattern) u61Var.G).document.f22034id;
                u3 u3Var3 = this.f53375b.f53033c;
                HashSet hashSet5 = u3Var3.f53331l;
                HashSet hashSet6 = u3Var3.f53331l;
                if (!hashSet5.contains(Long.valueOf(j12))) {
                    if (hashSet6.isEmpty()) {
                        ArrayList arrayList3 = u3Var3.h;
                        int size3 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj8 = arrayList3.get(i14);
                            i14++;
                            long j13 = ((TL_stars.starGiftAttributePattern) obj8).document.f22034id;
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
                u3Var3.h();
                this.f53376c.u();
                return;
        }
    }
}
