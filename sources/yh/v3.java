package yh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.m61;
public final class v3 implements Utilities.Callback5 {
    public final int f49160a;
    public final e4 f49161b;
    public final l80 f49162c;

    public v3(e4 e4Var, l80 l80Var, int i10) {
        this.f49160a = i10;
        this.f49161b = e4Var;
        this.f49162c = l80Var;
    }

    @Override
    public final void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m61 m61Var = (m61) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        switch (this.f49160a) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributeModel) m61Var.G).document.f18922id;
                t3 t3Var = this.f49161b.f48850c;
                HashSet hashSet = t3Var.f49134j;
                HashSet hashSet2 = t3Var.f49134j;
                if (!hashSet.contains(Long.valueOf(j10))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList = t3Var.f49131f;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj6 = arrayList.get(i10);
                            i10++;
                            long j11 = ((TL_stars.starGiftAttributeModel) obj6).document.f18922id;
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
                this.f49162c.u();
                return;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) m61Var.G).backdrop_id;
                t3 t3Var2 = this.f49161b.f48850c;
                HashSet hashSet3 = t3Var2.f49135k;
                HashSet hashSet4 = t3Var2.f49135k;
                if (!hashSet3.contains(Integer.valueOf(i11))) {
                    if (hashSet4.isEmpty()) {
                        ArrayList arrayList2 = t3Var2.f49132g;
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
                this.f49162c.u();
                return;
            default:
                long j12 = ((TL_stars.starGiftAttributePattern) m61Var.G).document.f18922id;
                t3 t3Var3 = this.f49161b.f48850c;
                HashSet hashSet5 = t3Var3.f49136l;
                HashSet hashSet6 = t3Var3.f49136l;
                if (!hashSet5.contains(Long.valueOf(j12))) {
                    if (hashSet6.isEmpty()) {
                        ArrayList arrayList3 = t3Var3.h;
                        int size3 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj8 = arrayList3.get(i14);
                            i14++;
                            long j13 = ((TL_stars.starGiftAttributePattern) obj8).document.f18922id;
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
                this.f49162c.u();
                return;
        }
    }
}
