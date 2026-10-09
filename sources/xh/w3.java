package xh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.p61;
public final class w3 implements Utilities.Callback2 {
    public final int f51576a;
    public final String[] f51577b;
    public final g4 f51578c;
    public final ArrayList d;

    public w3(String[] strArr, g4 g4Var, ArrayList arrayList, int i10) {
        this.f51576a = i10;
        this.f51577b = strArr;
        this.f51578c = g4Var;
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
        int i11 = this.f51576a;
        boolean z11 = false;
        String str3 = " ";
        ArrayList arrayList = this.d;
        g4 g4Var = this.f51578c;
        String[] strArr = this.f51577b;
        switch (i11) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                c71 c71Var = (c71) obj2;
                String lowerCase = strArr[0].toLowerCase();
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                v3 v3Var = g4Var.f51254c;
                boolean isEmpty = v3Var.f51557j.isEmpty();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                    boolean contains = v3Var.f51557j.contains(Long.valueOf(stargiftattributemodel.document.f20044id));
                    boolean z12 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(translitSafe) || bi.w(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || bi.w(" ", translitSafe, stargiftattributemodel.name.toLowerCase())) {
                        Integer num = (Integer) v3Var.f51560m.get(Long.valueOf(stargiftattributemodel.document.f20044id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i13 = p3.f51454a;
                        p61 J = p61.J(p3.class);
                        J.G = stargiftattributemodel;
                        J.f29734l = lowerCase;
                        J.f29747z = intValue;
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
                c71 c71Var2 = (c71) obj2;
                String lowerCase2 = strArr[0].toLowerCase();
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                v3 v3Var2 = g4Var.f51254c;
                boolean isEmpty2 = v3Var2.f51558k.isEmpty();
                int size2 = arrayList.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj4 = arrayList.get(i14);
                    i14++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = v3Var2.f51558k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z13 = !contains2;
                    if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(translitSafe2)) {
                        str = str4;
                        if (!bi.w(str, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !bi.w(str, translitSafe2, stargiftattributebackdrop.name.toLowerCase())) {
                            str4 = str;
                        }
                    } else {
                        str = str4;
                    }
                    Integer num2 = (Integer) v3Var2.f51561n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    if (num2 == null) {
                        intValue2 = 0;
                    } else {
                        intValue2 = num2.intValue();
                    }
                    int i15 = i3.f51279a;
                    p61 J2 = p61.J(i3.class);
                    J2.G = stargiftattributebackdrop;
                    J2.f29734l = lowerCase2;
                    J2.f29747z = intValue2;
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
                c71 c71Var3 = (c71) obj2;
                String lowerCase3 = strArr[0].toLowerCase();
                String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                v3 v3Var3 = g4Var.f51254c;
                boolean isEmpty3 = v3Var3.f51559l.isEmpty();
                int size3 = arrayList.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj5 = arrayList.get(i16);
                    i16++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                    boolean contains3 = v3Var3.f51559l.contains(Long.valueOf(stargiftattributepattern.document.f20044id));
                    boolean z14 = !contains3;
                    if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(translitSafe3) && !bi.w(str3, lowerCase3, stargiftattributepattern.name.toLowerCase()) && !bi.w(str3, translitSafe3, stargiftattributepattern.name.toLowerCase())) {
                        z10 = z11;
                        str2 = str3;
                    } else {
                        z10 = z11;
                        str2 = str3;
                        Integer num3 = (Integer) v3Var3.f51562o.get(Long.valueOf(stargiftattributepattern.document.f20044id));
                        if (num3 == null) {
                            i10 = z10;
                        } else {
                            i10 = num3.intValue();
                        }
                        int i17 = s3.f51520a;
                        p61 J3 = p61.J(s3.class);
                        J3.G = stargiftattributepattern;
                        J3.f29734l = lowerCase3;
                        J3.f29747z = i10;
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
