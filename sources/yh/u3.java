package yh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.yh;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.z61;
public final class u3 implements Utilities.Callback2 {
    public final int f49151a;
    public final String[] f49152b;
    public final e4 f49153c;
    public final ArrayList d;

    public u3(String[] strArr, e4 e4Var, ArrayList arrayList, int i10) {
        this.f49151a = i10;
        this.f49152b = strArr;
        this.f49153c = e4Var;
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
        int i11 = this.f49151a;
        boolean z11 = false;
        String str3 = " ";
        ArrayList arrayList = this.d;
        e4 e4Var = this.f49153c;
        String[] strArr = this.f49152b;
        switch (i11) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                z61 z61Var = (z61) obj2;
                String lowerCase = strArr[0].toLowerCase();
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                t3 t3Var = e4Var.f48851c;
                boolean isEmpty = t3Var.f49135j.isEmpty();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                    boolean contains = t3Var.f49135j.contains(Long.valueOf(stargiftattributemodel.document.f19222id));
                    boolean z12 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(translitSafe) || yh.v(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || yh.v(" ", translitSafe, stargiftattributemodel.name.toLowerCase())) {
                        Integer num = (Integer) t3Var.f49138m.get(Long.valueOf(stargiftattributemodel.document.f19222id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i13 = n3.f49037a;
                        l61 J = l61.J(n3.class);
                        J.G = stargiftattributemodel;
                        J.f26954l = lowerCase;
                        J.f26967z = intValue;
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
                    arrayList2.add(i3.a(LocaleController.getString(R.string.Gift2ResaleFiltersModelEmpty)));
                    return;
                }
                return;
            case 1:
                String str4 = " ";
                ArrayList arrayList3 = (ArrayList) obj;
                z61 z61Var2 = (z61) obj2;
                String lowerCase2 = strArr[0].toLowerCase();
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                t3 t3Var2 = e4Var.f48851c;
                boolean isEmpty2 = t3Var2.f49136k.isEmpty();
                int size2 = arrayList.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj4 = arrayList.get(i14);
                    i14++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = t3Var2.f49136k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z13 = !contains2;
                    if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(translitSafe2)) {
                        str = str4;
                        if (!yh.v(str, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !yh.v(str, translitSafe2, stargiftattributebackdrop.name.toLowerCase())) {
                            str4 = str;
                        }
                    } else {
                        str = str4;
                    }
                    Integer num2 = (Integer) t3Var2.f49139n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    if (num2 == null) {
                        intValue2 = 0;
                    } else {
                        intValue2 = num2.intValue();
                    }
                    int i15 = g3.f48877a;
                    l61 J2 = l61.J(g3.class);
                    J2.G = stargiftattributebackdrop;
                    J2.f26954l = lowerCase2;
                    J2.f26967z = intValue2;
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
                    arrayList3.add(i3.a(LocaleController.getString(R.string.Gift2ResaleFiltersBackdropEmpty)));
                    return;
                }
                return;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                z61 z61Var3 = (z61) obj2;
                String lowerCase3 = strArr[0].toLowerCase();
                String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                t3 t3Var3 = e4Var.f48851c;
                boolean isEmpty3 = t3Var3.f49137l.isEmpty();
                int size3 = arrayList.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj5 = arrayList.get(i16);
                    i16++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                    boolean contains3 = t3Var3.f49137l.contains(Long.valueOf(stargiftattributepattern.document.f19222id));
                    boolean z14 = !contains3;
                    if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(translitSafe3) && !yh.v(str3, lowerCase3, stargiftattributepattern.name.toLowerCase()) && !yh.v(str3, translitSafe3, stargiftattributepattern.name.toLowerCase())) {
                        z10 = z11;
                        str2 = str3;
                    } else {
                        z10 = z11;
                        str2 = str3;
                        Integer num3 = (Integer) t3Var3.f49140o.get(Long.valueOf(stargiftattributepattern.document.f19222id));
                        if (num3 == null) {
                            i10 = z10;
                        } else {
                            i10 = num3.intValue();
                        }
                        int i17 = q3.f49099a;
                        l61 J3 = l61.J(q3.class);
                        J3.G = stargiftattributepattern;
                        J3.f26954l = lowerCase3;
                        J3.f26967z = i10;
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
                    arrayList4.add(i3.a(LocaleController.getString(R.string.Gift2ResaleFiltersSymbolEmpty)));
                    return;
                }
                return;
        }
    }
}
