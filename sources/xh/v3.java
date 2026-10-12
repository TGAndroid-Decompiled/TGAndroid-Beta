package xh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.u61;
public final class v3 implements Utilities.Callback2 {
    public final int f51795a;
    public final String[] f51796b;
    public final f4 f51797c;
    public final ArrayList d;

    public v3(String[] strArr, f4 f4Var, ArrayList arrayList, int i10) {
        this.f51795a = i10;
        this.f51796b = strArr;
        this.f51797c = f4Var;
        this.d = arrayList;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int intValue;
        String str;
        int intValue2;
        boolean z10;
        String str2;
        int i10;
        int i11 = this.f51795a;
        boolean z11 = false;
        String str3 = " ";
        ArrayList arrayList = this.d;
        f4 f4Var = this.f51797c;
        String[] strArr = this.f51796b;
        switch (i11) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                h71 h71Var = (h71) obj2;
                String lowerCase = strArr[0].toLowerCase();
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                u3 u3Var = f4Var.f51477c;
                boolean isEmpty = u3Var.f51779j.isEmpty();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                    boolean contains = u3Var.f51779j.contains(Long.valueOf(stargiftattributemodel.document.f19809id));
                    boolean z12 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || org.telegram.messenger.v0.w(" ", translitSafe, stargiftattributemodel.name.toLowerCase())) {
                        Integer num = (Integer) u3Var.f51782m.get(Long.valueOf(stargiftattributemodel.document.f19809id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i13 = o3.f51674a;
                        u61 J = u61.J(o3.class);
                        J.G = stargiftattributemodel;
                        J.f31071l = lowerCase;
                        J.f31084z = intValue;
                        if (!TextUtils.isEmpty(lowerCase)) {
                            if (!isEmpty && !contains) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        }
                        J.K(z12);
                        arrayList2.add(J);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(j3.a(LocaleController.getString(R.string.Gift2ResaleFiltersModelEmpty)));
                    return;
                }
                return;
            case 1:
                String str4 = " ";
                ArrayList arrayList3 = (ArrayList) obj;
                h71 h71Var2 = (h71) obj2;
                String lowerCase2 = strArr[0].toLowerCase();
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                u3 u3Var2 = f4Var.f51477c;
                boolean isEmpty2 = u3Var2.f51780k.isEmpty();
                int size2 = arrayList.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj4 = arrayList.get(i14);
                    i14++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = u3Var2.f51780k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z13 = !contains2;
                    if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(translitSafe2)) {
                        str = str4;
                        if (!org.telegram.messenger.v0.w(str, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !org.telegram.messenger.v0.w(str, translitSafe2, stargiftattributebackdrop.name.toLowerCase())) {
                            str4 = str;
                        }
                    } else {
                        str = str4;
                    }
                    Integer num2 = (Integer) u3Var2.f51783n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    if (num2 == null) {
                        intValue2 = 0;
                    } else {
                        intValue2 = num2.intValue();
                    }
                    int i15 = h3.f51504a;
                    u61 J2 = u61.J(h3.class);
                    J2.G = stargiftattributebackdrop;
                    J2.f31071l = lowerCase2;
                    J2.f31084z = intValue2;
                    if (!TextUtils.isEmpty(lowerCase2)) {
                        if (!isEmpty2 && !contains2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                    J2.K(z13);
                    arrayList3.add(J2);
                    str4 = str;
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(j3.a(LocaleController.getString(R.string.Gift2ResaleFiltersBackdropEmpty)));
                    return;
                }
                return;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                h71 h71Var3 = (h71) obj2;
                String lowerCase3 = strArr[0].toLowerCase();
                String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                u3 u3Var3 = f4Var.f51477c;
                boolean isEmpty3 = u3Var3.f51781l.isEmpty();
                int size3 = arrayList.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj5 = arrayList.get(i16);
                    i16++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                    boolean contains3 = u3Var3.f51781l.contains(Long.valueOf(stargiftattributepattern.document.f19809id));
                    boolean z14 = !contains3;
                    if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(translitSafe3) && !org.telegram.messenger.v0.w(str3, lowerCase3, stargiftattributepattern.name.toLowerCase()) && !org.telegram.messenger.v0.w(str3, translitSafe3, stargiftattributepattern.name.toLowerCase())) {
                        z10 = z11;
                        str2 = str3;
                    } else {
                        z10 = z11;
                        str2 = str3;
                        Integer num3 = (Integer) u3Var3.f51784o.get(Long.valueOf(stargiftattributepattern.document.f19809id));
                        if (num3 == null) {
                            i10 = z10;
                        } else {
                            i10 = num3.intValue();
                        }
                        int i17 = r3.f51740a;
                        u61 J3 = u61.J(r3.class);
                        J3.G = stargiftattributepattern;
                        J3.f31071l = lowerCase3;
                        J3.f31084z = i10;
                        if (!TextUtils.isEmpty(lowerCase3)) {
                            if (!isEmpty3 && !contains3) {
                                z14 = true;
                            } else {
                                z14 = z10;
                            }
                        }
                        J3.K(z14);
                        arrayList4.add(J3);
                    }
                    z11 = z10;
                    str3 = str2;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(j3.a(LocaleController.getString(R.string.Gift2ResaleFiltersSymbolEmpty)));
                    return;
                }
                return;
        }
    }
}
