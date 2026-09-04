package org.telegram.ui;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
public final class xt extends org.telegram.ui.Components.hl0 {
    public final Context f42887r;
    public final HashMap f42888s = new HashMap();
    public final ArrayList v = new ArrayList();
    public final bu f42889w;

    public xt(bu buVar, Context context, ArrayList arrayList, boolean z10) {
        Comparator f11Var;
        Locale locale;
        this.f42889w = buVar;
        this.f42887r = context;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                vt vtVar = (vt) arrayList.get(i10);
                String upperCase = vtVar.f41693a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.f42888s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.f42888s.put(upperCase, arrayList2);
                    this.v.add(upperCase);
                }
                arrayList2.add(vtVar);
            }
        } else {
            try {
                InputStream open = ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    ?? obj = new Object();
                    obj.f41693a = split[2];
                    obj.f41695c = split[0];
                    String str = split[1];
                    obj.d = str;
                    if (!str.equals("FT") || !z10) {
                        String upperCase2 = obj.f41693a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.f42888s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.f42888s.put(upperCase2, arrayList3);
                            this.v.add(upperCase2);
                        }
                        arrayList3.add(obj);
                    }
                }
                bufferedReader.close();
                open.close();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (LocaleController.getInstance().getCurrentLocale() != null) {
                locale = LocaleController.getInstance().getCurrentLocale();
            } else {
                locale = Locale.getDefault();
            }
            Collator collator = Collator.getInstance(locale);
            Objects.requireNonNull(collator);
            f11Var = new bi.l7(collator, 5);
        } else {
            f11Var = new f11(9);
        }
        Collections.sort(this.v, f11Var);
        for (ArrayList arrayList4 : this.f42888s.values()) {
            Collections.sort(arrayList4, new wt(f11Var, 0));
        }
    }

    @Override
    public final String F(int i10) {
        int S = S(i10);
        ArrayList arrayList = this.v;
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        return (String) arrayList.get(S);
    }

    @Override
    public final void G(org.telegram.ui.Components.ll0 ll0Var, float f7, int[] iArr) {
        iArr[0] = (int) (h() * f7);
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        ArrayList arrayList = this.v;
        int size = ((ArrayList) this.f42888s.get(arrayList.get(i10))).size();
        if (i10 != arrayList.size() - 1) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i11 < ((ArrayList) this.f42888s.get(this.v.get(i10))).size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final int R() {
        return this.v.size();
    }

    @Override
    public final View T(int i10, View view) {
        return null;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i11 < ((ArrayList) this.f42888s.get(this.v.get(i10))).size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        String str;
        if (c1Var.f45742f == 0) {
            vt vtVar = (vt) ((ArrayList) this.f42888s.get(this.v.get(i10))).get(i11);
            org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) c1Var.f45738a;
            CharSequence replaceEmoji = Emoji.replaceEmoji(bu.V(vtVar), eaVar.getTextView().getPaint().getFontMetricsInt(), false);
            if (this.f42889w.h) {
                str = "+" + vtVar.f41695c;
            } else {
                str = null;
            }
            eaVar.c(replaceEmoji, str, false, false);
        }
    }

    @Override
    public final vt O(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.f42888s.get(arrayList.get(i10));
                if (i11 >= 0 && i11 < arrayList2.size()) {
                    return (vt) arrayList2.get(i11);
                }
            }
        }
        return null;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View U;
        Context context = this.f42887r;
        if (i10 != 0) {
            U = new org.telegram.ui.Cells.c3(context, null);
            U.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        } else {
            U = bu.U(context);
        }
        return new s4.c1(U);
    }
}
