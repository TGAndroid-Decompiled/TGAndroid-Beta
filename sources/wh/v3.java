package wh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.v51;
public final class v3 implements Utilities.Callback2 {
    public final int f44391a;
    public final String[] f44392b;
    public final f4 f44393c;
    public final ArrayList d;

    public v3(String[] strArr, f4 f4Var, ArrayList arrayList, int i10) {
        this.f44391a = i10;
        this.f44392b = strArr;
        this.f44393c = f4Var;
        this.d = arrayList;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int intValue;
        String str;
        int intValue2;
        String str2;
        int intValue3;
        int i10 = this.f44391a;
        String str3 = " ";
        ArrayList arrayList = this.d;
        f4 f4Var = this.f44393c;
        String[] strArr = this.f44392b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                j61 j61Var = (j61) obj2;
                String lowerCase = strArr[0].toLowerCase();
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                u3 u3Var = f4Var.f44094c;
                boolean isEmpty = u3Var.f44374j.isEmpty();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                    boolean contains = u3Var.f44374j.contains(Long.valueOf(stargiftattributemodel.document.f17201id));
                    boolean z10 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(translitSafe) || org.telegram.messenger.a2.w(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || org.telegram.messenger.a2.w(" ", translitSafe, stargiftattributemodel.name.toLowerCase())) {
                        Integer num = (Integer) u3Var.f44377m.get(Long.valueOf(stargiftattributemodel.document.f17201id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i12 = n3.f44267a;
                        v51 J = v51.J(n3.class);
                        J.G = stargiftattributemodel;
                        J.f27829l = lowerCase;
                        J.f27842z = intValue;
                        if (!TextUtils.isEmpty(lowerCase)) {
                            if (!isEmpty && !contains) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                        J.K(z10);
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
                j61 j61Var2 = (j61) obj2;
                String lowerCase2 = strArr[0].toLowerCase();
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                u3 u3Var2 = f4Var.f44094c;
                boolean isEmpty2 = u3Var2.f44375k.isEmpty();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = u3Var2.f44375k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z11 = !contains2;
                    if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(translitSafe2)) {
                        str = str4;
                        if (!org.telegram.messenger.a2.w(str, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !org.telegram.messenger.a2.w(str, translitSafe2, stargiftattributebackdrop.name.toLowerCase())) {
                            str4 = str;
                        }
                    } else {
                        str = str4;
                    }
                    Integer num2 = (Integer) u3Var2.f44378n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    if (num2 == null) {
                        intValue2 = 0;
                    } else {
                        intValue2 = num2.intValue();
                    }
                    int i14 = g3.f44100a;
                    v51 J2 = v51.J(g3.class);
                    J2.G = stargiftattributebackdrop;
                    J2.f27829l = lowerCase2;
                    J2.f27842z = intValue2;
                    if (!TextUtils.isEmpty(lowerCase2)) {
                        if (!isEmpty2 && !contains2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    J2.K(z11);
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
                j61 j61Var3 = (j61) obj2;
                String lowerCase3 = strArr[0].toLowerCase();
                String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                u3 u3Var3 = f4Var.f44094c;
                boolean isEmpty3 = u3Var3.f44376l.isEmpty();
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                    boolean contains3 = u3Var3.f44376l.contains(Long.valueOf(stargiftattributepattern.document.f17201id));
                    boolean z12 = !contains3;
                    if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(translitSafe3) && !org.telegram.messenger.a2.w(str3, lowerCase3, stargiftattributepattern.name.toLowerCase()) && !org.telegram.messenger.a2.w(str3, translitSafe3, stargiftattributepattern.name.toLowerCase())) {
                        str2 = str3;
                    } else {
                        str2 = str3;
                        Integer num3 = (Integer) u3Var3.f44379o.get(Long.valueOf(stargiftattributepattern.document.f17201id));
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            intValue3 = num3.intValue();
                        }
                        int i16 = q3.f44327a;
                        v51 J3 = v51.J(q3.class);
                        J3.G = stargiftattributepattern;
                        J3.f27829l = lowerCase3;
                        J3.f27842z = intValue3;
                        if (!TextUtils.isEmpty(lowerCase3)) {
                            if (!isEmpty3 && !contains3) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        }
                        J3.K(z12);
                        arrayList4.add(J3);
                    }
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
