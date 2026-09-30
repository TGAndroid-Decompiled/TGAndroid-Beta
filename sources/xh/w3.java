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
public final class w3 implements Utilities.Callback2 {
    public final int f46477a;
    public final String[] f46478b;
    public final g4 f46479c;
    public final ArrayList d;

    public w3(String[] strArr, g4 g4Var, ArrayList arrayList, int i10) {
        this.f46477a = i10;
        this.f46478b = strArr;
        this.f46479c = g4Var;
        this.d = arrayList;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int intValue;
        String str;
        int intValue2;
        String str2;
        int intValue3;
        int i10 = this.f46477a;
        String str3 = " ";
        ArrayList arrayList = this.d;
        g4 g4Var = this.f46479c;
        String[] strArr = this.f46478b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                l61 l61Var = (l61) obj2;
                String lowerCase = strArr[0].toLowerCase();
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                v3 v3Var = g4Var.f46161c;
                boolean isEmpty = v3Var.f46458j.isEmpty();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                    boolean contains = v3Var.f46458j.contains(Long.valueOf(stargiftattributemodel.document.f18343id));
                    boolean z10 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || org.telegram.messenger.f0.w(" ", translitSafe, stargiftattributemodel.name.toLowerCase())) {
                        Integer num = (Integer) v3Var.f46461m.get(Long.valueOf(stargiftattributemodel.document.f18343id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i12 = p3.f46350a;
                        x51 J = x51.J(p3.class);
                        J.G = stargiftattributemodel;
                        J.f30278l = lowerCase;
                        J.f30291z = intValue;
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
                    arrayList2.add(k3.a(LocaleController.getString(R.string.Gift2ResaleFiltersModelEmpty)));
                    return;
                }
                return;
            case 1:
                String str4 = " ";
                ArrayList arrayList3 = (ArrayList) obj;
                l61 l61Var2 = (l61) obj2;
                String lowerCase2 = strArr[0].toLowerCase();
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                v3 v3Var2 = g4Var.f46161c;
                boolean isEmpty2 = v3Var2.f46459k.isEmpty();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = v3Var2.f46459k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z11 = !contains2;
                    if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(translitSafe2)) {
                        str = str4;
                        if (!org.telegram.messenger.f0.w(str, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !org.telegram.messenger.f0.w(str, translitSafe2, stargiftattributebackdrop.name.toLowerCase())) {
                            str4 = str;
                        }
                    } else {
                        str = str4;
                    }
                    Integer num2 = (Integer) v3Var2.f46462n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    if (num2 == null) {
                        intValue2 = 0;
                    } else {
                        intValue2 = num2.intValue();
                    }
                    int i14 = i3.f46182a;
                    x51 J2 = x51.J(i3.class);
                    J2.G = stargiftattributebackdrop;
                    J2.f30278l = lowerCase2;
                    J2.f30291z = intValue2;
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
                    arrayList3.add(k3.a(LocaleController.getString(R.string.Gift2ResaleFiltersBackdropEmpty)));
                    return;
                }
                return;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                l61 l61Var3 = (l61) obj2;
                String lowerCase3 = strArr[0].toLowerCase();
                String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                v3 v3Var3 = g4Var.f46161c;
                boolean isEmpty3 = v3Var3.f46460l.isEmpty();
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                    boolean contains3 = v3Var3.f46460l.contains(Long.valueOf(stargiftattributepattern.document.f18343id));
                    boolean z12 = !contains3;
                    if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(translitSafe3) && !org.telegram.messenger.f0.w(str3, lowerCase3, stargiftattributepattern.name.toLowerCase()) && !org.telegram.messenger.f0.w(str3, translitSafe3, stargiftattributepattern.name.toLowerCase())) {
                        str2 = str3;
                    } else {
                        str2 = str3;
                        Integer num3 = (Integer) v3Var3.f46463o.get(Long.valueOf(stargiftattributepattern.document.f18343id));
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            intValue3 = num3.intValue();
                        }
                        int i16 = s3.f46408a;
                        x51 J3 = x51.J(s3.class);
                        J3.G = stargiftattributepattern;
                        J3.f30278l = lowerCase3;
                        J3.f30291z = intValue3;
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
                    arrayList4.add(k3.a(LocaleController.getString(R.string.Gift2ResaleFiltersSymbolEmpty)));
                    return;
                }
                return;
        }
    }
}
