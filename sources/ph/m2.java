package ph;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
public final class m2 implements j20 {
    public final int f45234a;
    public final r3 f45235b;
    public final String[] f45236c;
    public final ArrayList d;

    public m2(r3 r3Var, String[] strArr, ArrayList arrayList, int i10) {
        this.f45234a = i10;
        this.f45235b = r3Var;
        this.f45236c = strArr;
        this.d = arrayList;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int intValue;
        int intValue2;
        int i10;
        int i11 = this.f45234a;
        boolean z10 = false;
        ArrayList arrayList = this.d;
        String[] strArr = this.f45236c;
        r3 r3Var = this.f45235b;
        switch (i11) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                p51 p51Var = (p51) obj2;
                String lowerCase = strArr[0].toLowerCase();
                String N3 = org.telegram.messenger.i0.N3(lowerCase);
                h3 h3Var = r3Var.d;
                boolean isEmpty = h3Var.f45097l.isEmpty();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                    boolean contains = h3Var.f45097l.contains(Long.valueOf(stargiftattributepattern.document.f19799id));
                    boolean z11 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(N3) || sc.e.y(" ", lowerCase, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N3))) {
                        Integer num = (Integer) h3Var.f45100o.get(Long.valueOf(stargiftattributepattern.document.f19799id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i13 = e3.f45029b;
                        a51 K = a51.K(e3.class);
                        K.G = stargiftattributepattern;
                        K.f24292l = lowerCase;
                        K.f24305z = intValue;
                        if (!TextUtils.isEmpty(lowerCase)) {
                            if (!isEmpty && !contains) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                        K.L(z11);
                        arrayList2.add(K);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(x2.i(cd.L0(2131750017, null)));
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                p51 p51Var2 = (p51) obj2;
                String lowerCase2 = strArr[0].toLowerCase();
                String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                h3 h3Var2 = r3Var.d;
                boolean isEmpty2 = h3Var2.f45096k.isEmpty();
                int size2 = arrayList.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj4 = arrayList.get(i14);
                    i14++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = h3Var2.f45096k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z12 = !contains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || sc.e.y(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                        Integer num2 = (Integer) h3Var2.f45099n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            intValue2 = num2.intValue();
                        }
                        int i15 = v2.f45331b;
                        a51 K2 = a51.K(v2.class);
                        K2.G = stargiftattributebackdrop;
                        K2.f24292l = lowerCase2;
                        K2.f24305z = intValue2;
                        if (!TextUtils.isEmpty(lowerCase2)) {
                            if (!isEmpty2 && !contains2) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        }
                        K2.L(z12);
                        arrayList3.add(K2);
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(x2.i(cd.L0(2131750024, null)));
                    return;
                }
                return;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                p51 p51Var3 = (p51) obj2;
                String lowerCase3 = strArr[0].toLowerCase();
                String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                h3 h3Var3 = r3Var.d;
                boolean isEmpty3 = h3Var3.f45095j.isEmpty();
                int size3 = arrayList.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj5 = arrayList.get(i16);
                    i16++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj5;
                    boolean z13 = z10;
                    boolean contains3 = h3Var3.f45095j.contains(Long.valueOf(stargiftattributemodel.document.f19799id));
                    boolean z14 = !contains3;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(N33) || sc.e.y(" ", lowerCase3, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N33))) {
                        Integer num3 = (Integer) h3Var3.f45098m.get(Long.valueOf(stargiftattributemodel.document.f19799id));
                        if (num3 == null) {
                            i10 = z13;
                        } else {
                            i10 = num3.intValue();
                        }
                        int i17 = b3.f44981b;
                        a51 K3 = a51.K(b3.class);
                        K3.G = stargiftattributemodel;
                        K3.f24292l = lowerCase3;
                        K3.f24305z = i10;
                        if (!TextUtils.isEmpty(lowerCase3)) {
                            if (!isEmpty3 && !contains3) {
                                z14 = true;
                            } else {
                                z14 = z13;
                            }
                        }
                        K3.L(z14);
                        arrayList4.add(K3);
                    }
                    z10 = z13;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(x2.i(cd.L0(2131750019, null)));
                    return;
                }
                return;
        }
    }
}
