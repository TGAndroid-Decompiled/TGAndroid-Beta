package xh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.v51;
public final class v2 implements Utilities.Callback2 {
    public final int f46119a;
    public final i4 f46120b;
    public final String[] f46121c;
    public final ArrayList d;

    public v2(i4 i4Var, String[] strArr, ArrayList arrayList, int i10) {
        this.f46119a = i10;
        this.f46120b = i4Var;
        this.f46121c = strArr;
        this.d = arrayList;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int intValue;
        String str;
        int intValue2;
        String str2;
        int intValue3;
        int i10 = this.f46119a;
        String str3 = " ";
        ArrayList arrayList = this.d;
        String[] strArr = this.f46121c;
        i4 i4Var = this.f46120b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                v51 v51Var = (v51) obj2;
                String lowerCase = strArr[0].toLowerCase();
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                v3 v3Var = i4Var.d;
                boolean isEmpty = v3Var.f46130l.isEmpty();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                    boolean contains = v3Var.f46130l.contains(Long.valueOf(stargiftattributepattern.document.f18089id));
                    boolean z10 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(translitSafe) || org.telegram.messenger.z0.w(" ", lowerCase, stargiftattributepattern.name.toLowerCase()) || org.telegram.messenger.z0.w(" ", translitSafe, stargiftattributepattern.name.toLowerCase())) {
                        Integer num = (Integer) v3Var.f46133o.get(Long.valueOf(stargiftattributepattern.document.f18089id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i12 = s3.f46078a;
                        h51 J = h51.J(s3.class);
                        J.G = stargiftattributepattern;
                        J.f24507l = lowerCase;
                        J.f24520z = intValue;
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
                    arrayList2.add(k3.a(LocaleController.getString(R.string.Gift2ResaleFiltersSymbolEmpty)));
                    return;
                }
                return;
            case 1:
                String str4 = " ";
                ArrayList arrayList3 = (ArrayList) obj;
                v51 v51Var2 = (v51) obj2;
                String lowerCase2 = strArr[0].toLowerCase();
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                v3 v3Var2 = i4Var.d;
                boolean isEmpty2 = v3Var2.f46129k.isEmpty();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = v3Var2.f46129k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z11 = !contains2;
                    if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(translitSafe2)) {
                        str = str4;
                        if (!org.telegram.messenger.z0.w(str, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !org.telegram.messenger.z0.w(str, translitSafe2, stargiftattributebackdrop.name.toLowerCase())) {
                            str4 = str;
                        }
                    } else {
                        str = str4;
                    }
                    Integer num2 = (Integer) v3Var2.f46132n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    if (num2 == null) {
                        intValue2 = 0;
                    } else {
                        intValue2 = num2.intValue();
                    }
                    int i14 = i3.f45852a;
                    h51 J2 = h51.J(i3.class);
                    J2.G = stargiftattributebackdrop;
                    J2.f24507l = lowerCase2;
                    J2.f24520z = intValue2;
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
                v51 v51Var3 = (v51) obj2;
                String lowerCase3 = strArr[0].toLowerCase();
                String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                v3 v3Var3 = i4Var.d;
                boolean isEmpty3 = v3Var3.f46128j.isEmpty();
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj5;
                    boolean contains3 = v3Var3.f46128j.contains(Long.valueOf(stargiftattributemodel.document.f18089id));
                    boolean z12 = !contains3;
                    if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributemodel.name.toLowerCase().startsWith(translitSafe3) && !org.telegram.messenger.z0.w(str3, lowerCase3, stargiftattributemodel.name.toLowerCase()) && !org.telegram.messenger.z0.w(str3, translitSafe3, stargiftattributemodel.name.toLowerCase())) {
                        str2 = str3;
                    } else {
                        str2 = str3;
                        Integer num3 = (Integer) v3Var3.f46131m.get(Long.valueOf(stargiftattributemodel.document.f18089id));
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            intValue3 = num3.intValue();
                        }
                        int i16 = p3.f46020a;
                        h51 J3 = h51.J(p3.class);
                        J3.G = stargiftattributemodel;
                        J3.f24507l = lowerCase3;
                        J3.f24520z = intValue3;
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
                    arrayList4.add(k3.a(LocaleController.getString(R.string.Gift2ResaleFiltersModelEmpty)));
                    return;
                }
                return;
        }
    }
}
