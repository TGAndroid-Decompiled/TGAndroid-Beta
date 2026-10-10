package xh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.q61;
public final class w3 implements Utilities.Callback2 {
    public final int f51622a;
    public final String[] f51623b;
    public final g4 f51624c;
    public final ArrayList d;

    public w3(String[] strArr, g4 g4Var, ArrayList arrayList, int i10) {
        this.f51622a = i10;
        this.f51623b = strArr;
        this.f51624c = g4Var;
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
        int i11 = this.f51622a;
        boolean z11 = false;
        String str3 = " ";
        ArrayList arrayList = this.d;
        g4 g4Var = this.f51624c;
        String[] strArr = this.f51623b;
        switch (i11) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                d71 d71Var = (d71) obj2;
                String lowerCase = strArr[0].toLowerCase();
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                v3 v3Var = g4Var.f51300c;
                boolean isEmpty = v3Var.f51603j.isEmpty();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                    boolean contains = v3Var.f51603j.contains(Long.valueOf(stargiftattributemodel.document.f20048id));
                    boolean z12 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(translitSafe) || bi.w(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || bi.w(" ", translitSafe, stargiftattributemodel.name.toLowerCase())) {
                        Integer num = (Integer) v3Var.f51606m.get(Long.valueOf(stargiftattributemodel.document.f20048id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i13 = p3.f51500a;
                        q61 J = q61.J(p3.class);
                        J.G = stargiftattributemodel;
                        J.f30063l = lowerCase;
                        J.f30076z = intValue;
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
                    arrayList2.add(k3.a(LocaleController.getString(R.string.Gift2ResaleFiltersModelEmpty)));
                    return;
                }
                return;
            case 1:
                String str4 = " ";
                ArrayList arrayList3 = (ArrayList) obj;
                d71 d71Var2 = (d71) obj2;
                String lowerCase2 = strArr[0].toLowerCase();
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                v3 v3Var2 = g4Var.f51300c;
                boolean isEmpty2 = v3Var2.f51604k.isEmpty();
                int size2 = arrayList.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj4 = arrayList.get(i14);
                    i14++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = v3Var2.f51604k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z13 = !contains2;
                    if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(translitSafe2)) {
                        str = str4;
                        if (!bi.w(str, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !bi.w(str, translitSafe2, stargiftattributebackdrop.name.toLowerCase())) {
                            str4 = str;
                        }
                    } else {
                        str = str4;
                    }
                    Integer num2 = (Integer) v3Var2.f51607n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    if (num2 == null) {
                        intValue2 = 0;
                    } else {
                        intValue2 = num2.intValue();
                    }
                    int i15 = i3.f51325a;
                    q61 J2 = q61.J(i3.class);
                    J2.G = stargiftattributebackdrop;
                    J2.f30063l = lowerCase2;
                    J2.f30076z = intValue2;
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
                    arrayList3.add(k3.a(LocaleController.getString(R.string.Gift2ResaleFiltersBackdropEmpty)));
                    return;
                }
                return;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                d71 d71Var3 = (d71) obj2;
                String lowerCase3 = strArr[0].toLowerCase();
                String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                v3 v3Var3 = g4Var.f51300c;
                boolean isEmpty3 = v3Var3.f51605l.isEmpty();
                int size3 = arrayList.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj5 = arrayList.get(i16);
                    i16++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                    boolean contains3 = v3Var3.f51605l.contains(Long.valueOf(stargiftattributepattern.document.f20048id));
                    boolean z14 = !contains3;
                    if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(translitSafe3) && !bi.w(str3, lowerCase3, stargiftattributepattern.name.toLowerCase()) && !bi.w(str3, translitSafe3, stargiftattributepattern.name.toLowerCase())) {
                        z10 = z11;
                        str2 = str3;
                    } else {
                        z10 = z11;
                        str2 = str3;
                        Integer num3 = (Integer) v3Var3.f51608o.get(Long.valueOf(stargiftattributepattern.document.f20048id));
                        if (num3 == null) {
                            i10 = z10;
                        } else {
                            i10 = num3.intValue();
                        }
                        int i17 = s3.f51566a;
                        q61 J3 = q61.J(s3.class);
                        J3.G = stargiftattributepattern;
                        J3.f30063l = lowerCase3;
                        J3.f30076z = i10;
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
                    arrayList4.add(k3.a(LocaleController.getString(R.string.Gift2ResaleFiltersSymbolEmpty)));
                    return;
                }
                return;
        }
    }
}
