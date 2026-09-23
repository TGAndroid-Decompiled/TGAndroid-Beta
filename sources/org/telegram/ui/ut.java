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
public final class ut extends org.telegram.ui.Components.il0 {
    public final Context f38215r;
    public final HashMap f38216s = new HashMap();
    public final ArrayList v = new ArrayList();
    public final xt f38217w;

    public ut(xt xtVar, Context context, ArrayList arrayList, boolean z10) {
        Comparator cb1Var;
        Locale locale;
        this.f38217w = xtVar;
        this.f38215r = context;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                st stVar = (st) arrayList.get(i10);
                String upperCase = stVar.f37415a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.f38216s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.f38216s.put(upperCase, arrayList2);
                    this.v.add(upperCase);
                }
                arrayList2.add(stVar);
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
                    obj.f37415a = split[2];
                    obj.f37417c = split[0];
                    String str = split[1];
                    obj.d = str;
                    if (!str.equals("FT") || !z10) {
                        String upperCase2 = obj.f37415a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.f38216s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.f38216s.put(upperCase2, arrayList3);
                            this.v.add(upperCase2);
                        }
                        arrayList3.add(obj);
                    }
                }
                bufferedReader.close();
                open.close();
            } catch (Exception e) {
                FileLog.e(e);
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
            cb1Var = new ai.e8(collator, 5);
        } else {
            cb1Var = new cb1(7);
        }
        Collections.sort(this.v, cb1Var);
        for (ArrayList arrayList4 : this.f38216s.values()) {
            Collections.sort(arrayList4, new tt(cb1Var, 0));
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
    public final void G(org.telegram.ui.Components.ml0 ml0Var, float f7, int[] iArr) {
        iArr[0] = (int) (h() * f7);
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        ArrayList arrayList = this.v;
        int size = ((ArrayList) this.f38216s.get(arrayList.get(i10))).size();
        if (i10 != arrayList.size() - 1) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i11 < ((ArrayList) this.f38216s.get(this.v.get(i10))).size()) {
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
        if (i11 < ((ArrayList) this.f38216s.get(this.v.get(i10))).size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        String str;
        if (c1Var.f42630f == 0) {
            st stVar = (st) ((ArrayList) this.f38216s.get(this.v.get(i10))).get(i11);
            org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) c1Var.f42627a;
            CharSequence replaceEmoji = Emoji.replaceEmoji(xt.V(stVar), faVar.getTextView().getPaint().getFontMetricsInt(), false);
            if (this.f38217w.h) {
                str = "+" + stVar.f37417c;
            } else {
                str = null;
            }
            faVar.c(replaceEmoji, str, false, false);
        }
    }

    @Override
    public final st O(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.f38216s.get(arrayList.get(i10));
                if (i11 >= 0 && i11 < arrayList2.size()) {
                    return (st) arrayList2.get(i11);
                }
            }
        }
        return null;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View U;
        Context context = this.f38215r;
        if (i10 != 0) {
            U = new org.telegram.ui.Cells.c3(context, null);
            U.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        } else {
            U = xt.U(context);
        }
        return new s4.c1(U);
    }
}
