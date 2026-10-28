package zh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.u61;
public final class u2 implements Utilities.Callback2 {
    public final int f53320a;
    public final h4 f53321b;
    public final String[] f53322c;
    public final ArrayList d;

    public u2(h4 h4Var, String[] strArr, ArrayList arrayList, int i10) {
        this.f53320a = i10;
        this.f53321b = h4Var;
        this.f53322c = strArr;
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
        int i11 = this.f53320a;
        boolean z11 = false;
        String str3 = " ";
        ArrayList arrayList = this.d;
        String[] strArr = this.f53322c;
        h4 h4Var = this.f53321b;
        switch (i11) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                k71 k71Var = (k71) obj2;
                String lowerCase = strArr[0].toLowerCase();
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                u3 u3Var = h4Var.d;
                boolean isEmpty = u3Var.f53331l.isEmpty();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                    boolean contains = u3Var.f53331l.contains(Long.valueOf(stargiftattributepattern.document.f22034id));
                    boolean z12 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(translitSafe) || wh.u(" ", lowerCase, stargiftattributepattern.name.toLowerCase()) || wh.u(" ", translitSafe, stargiftattributepattern.name.toLowerCase())) {
                        Integer num = (Integer) u3Var.f53334o.get(Long.valueOf(stargiftattributepattern.document.f22034id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i13 = r3.f53298a;
                        u61 K = u61.K(r3.class);
                        K.G = stargiftattributepattern;
                        K.f33249l = lowerCase;
                        K.f33262z = intValue;
                        if (!TextUtils.isEmpty(lowerCase)) {
                            if (!isEmpty && !contains) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        }
                        K.L(z12);
                        arrayList2.add(K);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(j3.a(LocaleController.getString(R.string.Gift2ResaleFiltersSymbolEmpty)));
                    return;
                }
                return;
            case 1:
                String str4 = " ";
                ArrayList arrayList3 = (ArrayList) obj;
                k71 k71Var2 = (k71) obj2;
                String lowerCase2 = strArr[0].toLowerCase();
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                u3 u3Var2 = h4Var.d;
                boolean isEmpty2 = u3Var2.f53330k.isEmpty();
                int size2 = arrayList.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj4 = arrayList.get(i14);
                    i14++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = u3Var2.f53330k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z13 = !contains2;
                    if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(translitSafe2)) {
                        str = str4;
                        if (!wh.u(str, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !wh.u(str, translitSafe2, stargiftattributebackdrop.name.toLowerCase())) {
                            str4 = str;
                        }
                    } else {
                        str = str4;
                    }
                    Integer num2 = (Integer) u3Var2.f53333n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    if (num2 == null) {
                        intValue2 = 0;
                    } else {
                        intValue2 = num2.intValue();
                    }
                    int i15 = h3.f53084a;
                    u61 K2 = u61.K(h3.class);
                    K2.G = stargiftattributebackdrop;
                    K2.f33249l = lowerCase2;
                    K2.f33262z = intValue2;
                    if (!TextUtils.isEmpty(lowerCase2)) {
                        if (!isEmpty2 && !contains2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                    K2.L(z13);
                    arrayList3.add(K2);
                    str4 = str;
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(j3.a(LocaleController.getString(R.string.Gift2ResaleFiltersBackdropEmpty)));
                    return;
                }
                return;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                k71 k71Var3 = (k71) obj2;
                String lowerCase3 = strArr[0].toLowerCase();
                String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                u3 u3Var3 = h4Var.d;
                boolean isEmpty3 = u3Var3.f53329j.isEmpty();
                int size3 = arrayList.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj5 = arrayList.get(i16);
                    i16++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj5;
                    boolean contains3 = u3Var3.f53329j.contains(Long.valueOf(stargiftattributemodel.document.f22034id));
                    boolean z14 = !contains3;
                    if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributemodel.name.toLowerCase().startsWith(translitSafe3) && !wh.u(str3, lowerCase3, stargiftattributemodel.name.toLowerCase()) && !wh.u(str3, translitSafe3, stargiftattributemodel.name.toLowerCase())) {
                        z10 = z11;
                        str2 = str3;
                    } else {
                        z10 = z11;
                        str2 = str3;
                        Integer num3 = (Integer) u3Var3.f53332m.get(Long.valueOf(stargiftattributemodel.document.f22034id));
                        if (num3 == null) {
                            i10 = z10;
                        } else {
                            i10 = num3.intValue();
                        }
                        int i17 = o3.f53237a;
                        u61 K3 = u61.K(o3.class);
                        K3.G = stargiftattributemodel;
                        K3.f33249l = lowerCase3;
                        K3.f33262z = i10;
                        if (!TextUtils.isEmpty(lowerCase3)) {
                            if (!isEmpty3 && !contains3) {
                                z14 = true;
                            } else {
                                z14 = z10;
                            }
                        }
                        K3.L(z14);
                        arrayList4.add(K3);
                    }
                    z11 = z10;
                    str3 = str2;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(j3.a(LocaleController.getString(R.string.Gift2ResaleFiltersModelEmpty)));
                    return;
                }
                return;
        }
    }
}
