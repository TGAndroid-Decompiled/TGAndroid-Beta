package yh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.l61;
public final class v3 implements Utilities.Callback5 {
    public final int f51022a;
    public final e4 f51023b;
    public final h80 f51024c;

    public v3(e4 e4Var, h80 h80Var, int i10) {
        this.f51022a = i10;
        this.f51023b = e4Var;
        this.f51024c = h80Var;
    }

    @Override
    public final void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        l61 l61Var = (l61) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        switch (this.f51022a) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributeModel) l61Var.G).document.f20350id;
                s3 s3Var = this.f51023b.f50680c;
                HashSet hashSet = s3Var.f50971j;
                HashSet hashSet2 = s3Var.f50971j;
                if (!hashSet.contains(Long.valueOf(j10))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList = s3Var.f50968f;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj6 = arrayList.get(i10);
                            i10++;
                            long j11 = ((TL_stars.starGiftAttributeModel) obj6).document.f20350id;
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
                s3Var.h();
                this.f51024c.u();
                return;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) l61Var.G).backdrop_id;
                s3 s3Var2 = this.f51023b.f50680c;
                HashSet hashSet3 = s3Var2.f50972k;
                HashSet hashSet4 = s3Var2.f50972k;
                if (!hashSet3.contains(Integer.valueOf(i11))) {
                    if (hashSet4.isEmpty()) {
                        ArrayList arrayList2 = s3Var2.f50969g;
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
                s3Var2.h();
                this.f51024c.u();
                return;
            default:
                long j12 = ((TL_stars.starGiftAttributePattern) l61Var.G).document.f20350id;
                s3 s3Var3 = this.f51023b.f50680c;
                HashSet hashSet5 = s3Var3.f50973l;
                HashSet hashSet6 = s3Var3.f50973l;
                if (!hashSet5.contains(Long.valueOf(j12))) {
                    if (hashSet6.isEmpty()) {
                        ArrayList arrayList3 = s3Var3.h;
                        int size3 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj8 = arrayList3.get(i14);
                            i14++;
                            long j13 = ((TL_stars.starGiftAttributePattern) obj8).document.f20350id;
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
                s3Var3.h();
                this.f51024c.u();
                return;
        }
    }
}
