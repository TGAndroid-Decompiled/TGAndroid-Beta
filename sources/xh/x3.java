package xh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.x51;
public final class x3 implements Utilities.Callback2 {
    public final int f46547a;
    public final String[] f46548b;
    public final h4 f46549c;
    public final ArrayList d;

    public x3(String[] strArr, h4 h4Var, ArrayList arrayList, int i10) {
        this.f46547a = i10;
        this.f46548b = strArr;
        this.f46549c = h4Var;
        this.d = arrayList;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int intValue;
        String str;
        int intValue2;
        String str2;
        int intValue3;
        int i10 = this.f46547a;
        String str3 = " ";
        ArrayList arrayList = this.d;
        h4 h4Var = this.f46549c;
        String[] strArr = this.f46548b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                l61 l61Var = (l61) obj2;
                String lowerCase = strArr[0].toLowerCase();
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                w3 w3Var = h4Var.f46234c;
                boolean isEmpty = w3Var.f46531j.isEmpty();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                    boolean contains = w3Var.f46531j.contains(Long.valueOf(stargiftattributemodel.document.f18335id));
                    boolean z10 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || org.telegram.messenger.l0.v(" ", translitSafe, stargiftattributemodel.name.toLowerCase())) {
                        Integer num = (Integer) w3Var.f46534m.get(Long.valueOf(stargiftattributemodel.document.f18335id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i12 = q3.f46429a;
                        x51 J = x51.J(q3.class);
                        J.G = stargiftattributemodel;
                        J.f30302l = lowerCase;
                        J.f30315z = intValue;
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
                    arrayList2.add(l3.a(LocaleController.getString(R.string.Gift2ResaleFiltersModelEmpty)));
                    return;
                }
                return;
            case 1:
                String str4 = " ";
                ArrayList arrayList3 = (ArrayList) obj;
                l61 l61Var2 = (l61) obj2;
                String lowerCase2 = strArr[0].toLowerCase();
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                w3 w3Var2 = h4Var.f46234c;
                boolean isEmpty2 = w3Var2.f46532k.isEmpty();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = w3Var2.f46532k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z11 = !contains2;
                    if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(translitSafe2)) {
                        str = str4;
                        if (!org.telegram.messenger.l0.v(str, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !org.telegram.messenger.l0.v(str, translitSafe2, stargiftattributebackdrop.name.toLowerCase())) {
                            str4 = str;
                        }
                    } else {
                        str = str4;
                    }
                    Integer num2 = (Integer) w3Var2.f46535n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    if (num2 == null) {
                        intValue2 = 0;
                    } else {
                        intValue2 = num2.intValue();
                    }
                    int i14 = j3.f46284a;
                    x51 J2 = x51.J(j3.class);
                    J2.G = stargiftattributebackdrop;
                    J2.f30302l = lowerCase2;
                    J2.f30315z = intValue2;
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
                    arrayList3.add(l3.a(LocaleController.getString(R.string.Gift2ResaleFiltersBackdropEmpty)));
                    return;
                }
                return;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                l61 l61Var3 = (l61) obj2;
                String lowerCase3 = strArr[0].toLowerCase();
                String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                w3 w3Var3 = h4Var.f46234c;
                boolean isEmpty3 = w3Var3.f46533l.isEmpty();
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                    boolean contains3 = w3Var3.f46533l.contains(Long.valueOf(stargiftattributepattern.document.f18335id));
                    boolean z12 = !contains3;
                    if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(translitSafe3) && !org.telegram.messenger.l0.v(str3, lowerCase3, stargiftattributepattern.name.toLowerCase()) && !org.telegram.messenger.l0.v(str3, translitSafe3, stargiftattributepattern.name.toLowerCase())) {
                        str2 = str3;
                    } else {
                        str2 = str3;
                        Integer num3 = (Integer) w3Var3.f46536o.get(Long.valueOf(stargiftattributepattern.document.f18335id));
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            intValue3 = num3.intValue();
                        }
                        int i16 = t3.f46479a;
                        x51 J3 = x51.J(t3.class);
                        J3.G = stargiftattributepattern;
                        J3.f30302l = lowerCase3;
                        J3.f30315z = intValue3;
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
                    arrayList4.add(l3.a(LocaleController.getString(R.string.Gift2ResaleFiltersSymbolEmpty)));
                    return;
                }
                return;
        }
    }
}
