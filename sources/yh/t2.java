package yh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
public final class t2 implements Utilities.Callback2 {
    public final int f50530a;
    public final h4 f50531b;
    public final String[] f50532c;
    public final ArrayList d;

    public t2(h4 h4Var, String[] strArr, ArrayList arrayList, int i10) {
        this.f50530a = i10;
        this.f50531b = h4Var;
        this.f50532c = strArr;
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
        int i11 = this.f50530a;
        boolean z11 = false;
        String str3 = " ";
        ArrayList arrayList = this.d;
        String[] strArr = this.f50532c;
        h4 h4Var = this.f50531b;
        switch (i11) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                s61 s61Var = (s61) obj2;
                String lowerCase = strArr[0].toLowerCase();
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                t3 t3Var = h4Var.d;
                boolean isEmpty = t3Var.f50541l.isEmpty();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                    boolean contains = t3Var.f50541l.contains(Long.valueOf(stargiftattributepattern.document.f20278id));
                    boolean z12 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(translitSafe) || wh.w(" ", lowerCase, stargiftattributepattern.name.toLowerCase()) || wh.w(" ", translitSafe, stargiftattributepattern.name.toLowerCase())) {
                        Integer num = (Integer) t3Var.f50544o.get(Long.valueOf(stargiftattributepattern.document.f20278id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i13 = q3.f50502a;
                        f61 J = f61.J(q3.class);
                        J.G = stargiftattributepattern;
                        J.f26140l = lowerCase;
                        J.f26153z = intValue;
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
                    arrayList2.add(i3.a(LocaleController.getString(R.string.Gift2ResaleFiltersSymbolEmpty)));
                    return;
                }
                return;
            case 1:
                String str4 = " ";
                ArrayList arrayList3 = (ArrayList) obj;
                s61 s61Var2 = (s61) obj2;
                String lowerCase2 = strArr[0].toLowerCase();
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                t3 t3Var2 = h4Var.d;
                boolean isEmpty2 = t3Var2.f50540k.isEmpty();
                int size2 = arrayList.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj4 = arrayList.get(i14);
                    i14++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = t3Var2.f50540k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z13 = !contains2;
                    if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(translitSafe2)) {
                        str = str4;
                        if (!wh.w(str, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !wh.w(str, translitSafe2, stargiftattributebackdrop.name.toLowerCase())) {
                            str4 = str;
                        }
                    } else {
                        str = str4;
                    }
                    Integer num2 = (Integer) t3Var2.f50543n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    if (num2 == null) {
                        intValue2 = 0;
                    } else {
                        intValue2 = num2.intValue();
                    }
                    int i15 = g3.f50267a;
                    f61 J2 = f61.J(g3.class);
                    J2.G = stargiftattributebackdrop;
                    J2.f26140l = lowerCase2;
                    J2.f26153z = intValue2;
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
                s61 s61Var3 = (s61) obj2;
                String lowerCase3 = strArr[0].toLowerCase();
                String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                t3 t3Var3 = h4Var.d;
                boolean isEmpty3 = t3Var3.f50539j.isEmpty();
                int size3 = arrayList.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj5 = arrayList.get(i16);
                    i16++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj5;
                    boolean contains3 = t3Var3.f50539j.contains(Long.valueOf(stargiftattributemodel.document.f20278id));
                    boolean z14 = !contains3;
                    if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributemodel.name.toLowerCase().startsWith(translitSafe3) && !wh.w(str3, lowerCase3, stargiftattributemodel.name.toLowerCase()) && !wh.w(str3, translitSafe3, stargiftattributemodel.name.toLowerCase())) {
                        z10 = z11;
                        str2 = str3;
                    } else {
                        z10 = z11;
                        str2 = str3;
                        Integer num3 = (Integer) t3Var3.f50542m.get(Long.valueOf(stargiftattributemodel.document.f20278id));
                        if (num3 == null) {
                            i10 = z10;
                        } else {
                            i10 = num3.intValue();
                        }
                        int i17 = n3.f50433a;
                        f61 J3 = f61.J(n3.class);
                        J3.G = stargiftattributemodel;
                        J3.f26140l = lowerCase3;
                        J3.f26153z = i10;
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
                    arrayList4.add(i3.a(LocaleController.getString(R.string.Gift2ResaleFiltersModelEmpty)));
                    return;
                }
                return;
        }
    }
}
