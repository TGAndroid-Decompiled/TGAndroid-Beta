package yh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i80;
public final class t2 implements Utilities.Callback5 {
    public final int f50519a;
    public final g4 f50520b;
    public final i80 f50521c;

    public t2(g4 g4Var, i80 i80Var, int i10) {
        this.f50519a = i10;
        this.f50520b = g4Var;
        this.f50521c = i80Var;
    }

    @Override
    public final void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.f50519a;
        f61 f61Var = (f61) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        g4 g4Var = this.f50520b;
        g4Var.getClass();
        switch (i10) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributePattern) f61Var.G).document.f20278id;
                s3 s3Var = g4Var.d;
                HashSet hashSet = s3Var.f50506l;
                if (!hashSet.contains(Long.valueOf(j10))) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = s3Var.h;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj6 = arrayList.get(i11);
                            i11++;
                            long j11 = ((TL_stars.starGiftAttributePattern) obj6).document.f20278id;
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
                s3Var.h();
                this.f50521c.u();
                return;
            case 1:
                int i12 = ((TL_stars.starGiftAttributeBackdrop) f61Var.G).backdrop_id;
                s3 s3Var2 = g4Var.d;
                HashSet hashSet2 = s3Var2.f50505k;
                if (!hashSet2.contains(Integer.valueOf(i12))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = s3Var2.f50502g;
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
                s3Var2.h();
                this.f50521c.u();
                return;
            default:
                long j12 = ((TL_stars.starGiftAttributeModel) f61Var.G).document.f20278id;
                s3 s3Var3 = g4Var.d;
                HashSet hashSet3 = s3Var3.f50504j;
                if (!hashSet3.contains(Long.valueOf(j12))) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = s3Var3.f50501f;
                        int size3 = arrayList3.size();
                        int i15 = 0;
                        while (i15 < size3) {
                            Object obj8 = arrayList3.get(i15);
                            i15++;
                            long j13 = ((TL_stars.starGiftAttributeModel) obj8).document.f20278id;
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
                s3Var3.h();
                this.f50521c.u();
                return;
        }
    }
}
