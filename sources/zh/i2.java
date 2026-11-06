package zh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.w31;
public final class i2 implements v10 {
    public final int f60282a;
    public final m3 f60283b;
    public final String[] f60284c;
    public final ArrayList d;

    public i2(m3 m3Var, String[] strArr, ArrayList arrayList, int i7) {
        this.f60282a = i7;
        this.f60283b = m3Var;
        this.f60284c = strArr;
        this.d = arrayList;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int intValue;
        int intValue2;
        int i7;
        int i10 = this.f60282a;
        boolean z9 = false;
        ArrayList arrayList = this.d;
        String[] strArr = this.f60284c;
        m3 m3Var = this.f60283b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                k41 k41Var = (k41) obj2;
                String lowerCase = strArr[0].toLowerCase();
                String O3 = org.telegram.messenger.g0.O3(lowerCase);
                d3 d3Var = m3Var.d;
                boolean isEmpty = d3Var.f60182l.isEmpty();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                    boolean contains = d3Var.f60182l.contains(Long.valueOf(stargiftattributepattern.document.f26958id));
                    boolean z10 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O3))) {
                        Integer num = (Integer) d3Var.f60185o.get(Long.valueOf(stargiftattributepattern.document.f26958id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i12 = a3.f60117b;
                        w31 K = w31.K(a3.class);
                        K.G = stargiftattributepattern;
                        K.f39830l = lowerCase;
                        K.f39843z = intValue;
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
                    arrayList2.add(t2.i(hd.M0(2131750007, null)));
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                k41 k41Var2 = (k41) obj2;
                String lowerCase2 = strArr[0].toLowerCase();
                String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                d3 d3Var2 = m3Var.d;
                boolean isEmpty2 = d3Var2.f60181k.isEmpty();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = d3Var2.f60181k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z11 = !contains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                        Integer num2 = (Integer) d3Var2.f60184n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            intValue2 = num2.intValue();
                        }
                        int i14 = r2.f60430b;
                        w31 K2 = w31.K(r2.class);
                        K2.G = stargiftattributebackdrop;
                        K2.f39830l = lowerCase2;
                        K2.f39843z = intValue2;
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
                    arrayList3.add(t2.i(hd.M0(2131750014, null)));
                    return;
                }
                return;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                k41 k41Var3 = (k41) obj2;
                String lowerCase3 = strArr[0].toLowerCase();
                String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                d3 d3Var3 = m3Var.d;
                boolean isEmpty3 = d3Var3.f60180j.isEmpty();
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj5;
                    boolean z12 = z9;
                    boolean contains3 = d3Var3.f60180j.contains(Long.valueOf(stargiftattributemodel.document.f26958id));
                    boolean z13 = !contains3;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O33))) {
                        Integer num3 = (Integer) d3Var3.f60183m.get(Long.valueOf(stargiftattributemodel.document.f26958id));
                        if (num3 == null) {
                            i7 = z12;
                        } else {
                            i7 = num3.intValue();
                        }
                        int i16 = x2.f60494b;
                        w31 K3 = w31.K(x2.class);
                        K3.G = stargiftattributemodel;
                        K3.f39830l = lowerCase3;
                        K3.f39843z = i7;
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
                    arrayList4.add(t2.i(hd.M0(2131750009, null)));
                    return;
                }
                return;
        }
    }
}
