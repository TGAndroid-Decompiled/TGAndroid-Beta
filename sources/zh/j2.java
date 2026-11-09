package zh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.y31;
public final class j2 implements v10 {
    public final int f60412a;
    public final m3 f60413b;
    public final String[] f60414c;
    public final ArrayList d;

    public j2(m3 m3Var, String[] strArr, ArrayList arrayList, int i7) {
        this.f60412a = i7;
        this.f60413b = m3Var;
        this.f60414c = strArr;
        this.d = arrayList;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int intValue;
        int intValue2;
        int i7;
        int i10 = this.f60412a;
        boolean z9 = false;
        ArrayList arrayList = this.d;
        String[] strArr = this.f60414c;
        m3 m3Var = this.f60413b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                m41 m41Var = (m41) obj2;
                String lowerCase = strArr[0].toLowerCase();
                String O3 = org.telegram.messenger.g0.O3(lowerCase);
                c3 c3Var = m3Var.d;
                boolean isEmpty = c3Var.f60268j.isEmpty();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                    boolean contains = c3Var.f60268j.contains(Long.valueOf(stargiftattributemodel.document.f26962id));
                    boolean z10 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                        Integer num = (Integer) c3Var.f60271m.get(Long.valueOf(stargiftattributemodel.document.f26962id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i12 = w2.f60593b;
                        y31 K = y31.K(w2.class);
                        K.G = stargiftattributemodel;
                        K.f40568l = lowerCase;
                        K.f40581z = intValue;
                        if (!TextUtils.isEmpty(lowerCase)) {
                            if (!isEmpty && !contains) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                        K.L(z10);
                        arrayList2.add(K);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(s2.i(id.M0(2131750010, null)));
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                m41 m41Var2 = (m41) obj2;
                String lowerCase2 = strArr[0].toLowerCase();
                String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                c3 c3Var2 = m3Var.d;
                boolean isEmpty2 = c3Var2.f60269k.isEmpty();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = c3Var2.f60269k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z11 = !contains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                        Integer num2 = (Integer) c3Var2.f60272n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            intValue2 = num2.intValue();
                        }
                        int i14 = p2.f60512b;
                        y31 K2 = y31.K(p2.class);
                        K2.G = stargiftattributebackdrop;
                        K2.f40568l = lowerCase2;
                        K2.f40581z = intValue2;
                        if (!TextUtils.isEmpty(lowerCase2)) {
                            if (!isEmpty2 && !contains2) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                        K2.L(z11);
                        arrayList3.add(K2);
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(s2.i(id.M0(2131750015, null)));
                    return;
                }
                return;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                m41 m41Var3 = (m41) obj2;
                String lowerCase3 = strArr[0].toLowerCase();
                String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                c3 c3Var3 = m3Var.d;
                boolean isEmpty3 = c3Var3.f60270l.isEmpty();
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                    boolean z12 = z9;
                    boolean contains3 = c3Var3.f60270l.contains(Long.valueOf(stargiftattributepattern.document.f26962id));
                    boolean z13 = !contains3;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                        Integer num3 = (Integer) c3Var3.f60273o.get(Long.valueOf(stargiftattributepattern.document.f26962id));
                        if (num3 == null) {
                            i7 = z12;
                        } else {
                            i7 = num3.intValue();
                        }
                        int i16 = z2.f60650b;
                        y31 K3 = y31.K(z2.class);
                        K3.G = stargiftattributepattern;
                        K3.f40568l = lowerCase3;
                        K3.f40581z = i7;
                        if (!TextUtils.isEmpty(lowerCase3)) {
                            if (!isEmpty3 && !contains3) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                        }
                        K3.L(z13);
                        arrayList4.add(K3);
                    }
                    z9 = z12;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(s2.i(id.M0(2131750008, null)));
                    return;
                }
                return;
        }
    }
}
