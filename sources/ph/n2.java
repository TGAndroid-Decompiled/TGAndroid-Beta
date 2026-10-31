package ph;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.o20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.z60;
public final class n2 implements o20 {
    public final int f45247a;
    public final r3 f45248b;
    public final z60 f45249c;

    public n2(r3 r3Var, z60 z60Var, int i10) {
        this.f45247a = i10;
        this.f45248b = r3Var;
        this.f45249c = z60Var;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        a51 a51Var = (a51) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        switch (this.f45247a) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributePattern) a51Var.G).document.f19799id;
                h3 h3Var = this.f45248b.d;
                HashSet hashSet = h3Var.f45097l;
                if (!hashSet.contains(Long.valueOf(j10))) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = h3Var.h;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj3 = arrayList.get(i10);
                            i10++;
                            long j11 = ((TL_stars.starGiftAttributePattern) obj3).document.f19799id;
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
                h3Var.h();
                this.f45249c.u();
                return;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) a51Var.G).backdrop_id;
                h3 h3Var2 = this.f45248b.d;
                HashSet hashSet2 = h3Var2.f45096k;
                if (!hashSet2.contains(Integer.valueOf(i11))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = h3Var2.f45093g;
                        int size2 = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj4 = arrayList2.get(i12);
                            i12++;
                            int i13 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                            if (i13 != i11) {
                                hashSet2.add(Integer.valueOf(i13));
                            }
                        }
                    } else {
                        hashSet2.add(Integer.valueOf(i11));
                    }
                } else {
                    hashSet2.remove(Integer.valueOf(i11));
                }
                h3Var2.h();
                this.f45249c.u();
                return;
            default:
                long j12 = ((TL_stars.starGiftAttributeModel) a51Var.G).document.f19799id;
                h3 h3Var3 = this.f45248b.d;
                HashSet hashSet3 = h3Var3.f45095j;
                if (!hashSet3.contains(Long.valueOf(j12))) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = h3Var3.f45092f;
                        int size3 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj5 = arrayList3.get(i14);
                            i14++;
                            long j13 = ((TL_stars.starGiftAttributeModel) obj5).document.f19799id;
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
                h3Var3.h();
                this.f45249c.u();
                return;
        }
    }
}
