package zh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.x31;
public final class g2 implements v10 {
    public final int f60339a;
    public final l3 f60340b;
    public final String[] f60341c;
    public final ArrayList d;

    public g2(l3 l3Var, String[] strArr, ArrayList arrayList, int i7) {
        this.f60339a = i7;
        this.f60340b = l3Var;
        this.f60341c = strArr;
        this.d = arrayList;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int intValue;
        int intValue2;
        int i7;
        int i10 = this.f60339a;
        boolean z9 = false;
        ArrayList arrayList = this.d;
        String[] strArr = this.f60341c;
        l3 l3Var = this.f60340b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                l41 l41Var = (l41) obj2;
                String lowerCase = strArr[0].toLowerCase();
                String O3 = org.telegram.messenger.g0.O3(lowerCase);
                b3 b3Var = l3Var.d;
                boolean isEmpty = b3Var.f60242l.isEmpty();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                    boolean contains = b3Var.f60242l.contains(Long.valueOf(stargiftattributepattern.document.f26962id));
                    boolean z10 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O3))) {
                        Integer num = (Integer) b3Var.f60245o.get(Long.valueOf(stargiftattributepattern.document.f26962id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i12 = y2.f60616b;
                        x31 K = x31.K(y2.class);
                        K.G = stargiftattributepattern;
                        K.f40180l = lowerCase;
                        K.f40193z = intValue;
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
                    arrayList2.add(r2.i(id.M0(2131750009, null)));
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                l41 l41Var2 = (l41) obj2;
                String lowerCase2 = strArr[0].toLowerCase();
                String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                b3 b3Var2 = l3Var.d;
                boolean isEmpty2 = b3Var2.f60241k.isEmpty();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = b3Var2.f60241k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z11 = !contains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                        Integer num2 = (Integer) b3Var2.f60244n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            intValue2 = num2.intValue();
                        }
                        int i14 = p2.f60502b;
                        x31 K2 = x31.K(p2.class);
                        K2.G = stargiftattributebackdrop;
                        K2.f40180l = lowerCase2;
                        K2.f40193z = intValue2;
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
                    arrayList3.add(r2.i(id.M0(2131750016, null)));
                    return;
                }
                return;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                l41 l41Var3 = (l41) obj2;
                String lowerCase3 = strArr[0].toLowerCase();
                String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                b3 b3Var3 = l3Var.d;
                boolean isEmpty3 = b3Var3.f60240j.isEmpty();
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj5;
                    boolean z12 = z9;
                    boolean contains3 = b3Var3.f60240j.contains(Long.valueOf(stargiftattributemodel.document.f26962id));
                    boolean z13 = !contains3;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O33))) {
                        Integer num3 = (Integer) b3Var3.f60243m.get(Long.valueOf(stargiftattributemodel.document.f26962id));
                        if (num3 == null) {
                            i7 = z12;
                        } else {
                            i7 = num3.intValue();
                        }
                        int i16 = v2.f60569b;
                        x31 K3 = x31.K(v2.class);
                        K3.G = stargiftattributemodel;
                        K3.f40180l = lowerCase3;
                        K3.f40193z = i7;
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
                    arrayList4.add(r2.i(id.M0(2131750011, null)));
                    return;
                }
                return;
        }
    }
}
