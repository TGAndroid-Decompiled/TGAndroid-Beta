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
public final class rs extends org.telegram.ui.Components.zj0 {
    public final Context f51755r;
    public final HashMap f51756s = new HashMap();
    public final ArrayList f51757w = new ArrayList();
    public final us f51758x;

    public rs(us usVar, Context context, ArrayList arrayList, boolean z10) {
        Comparator qw0Var;
        Locale locale;
        this.f51758x = usVar;
        this.f51755r = context;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ps psVar = (ps) arrayList.get(i7);
                String upperCase = psVar.f50965a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.f51756s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.f51756s.put(upperCase, arrayList2);
                    this.f51757w.add(upperCase);
                }
                arrayList2.add(psVar);
            }
        } else {
            try {
                InputStream open = org.telegram.messenger.t0.f26941b.getResources().getAssets().open("countries.txt");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    ?? obj = new Object();
                    obj.f50965a = split[2];
                    obj.f50967c = split[0];
                    String str = split[1];
                    obj.d = str;
                    if (!str.equals("FT") || !z10) {
                        String upperCase2 = obj.f50965a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.f51756s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.f51756s.put(upperCase2, arrayList3);
                            this.f51757w.add(upperCase2);
                        }
                        arrayList3.add(obj);
                    }
                }
                bufferedReader.close();
                open.close();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (org.telegram.messenger.gd.E0().f24269y != null) {
                locale = org.telegram.messenger.gd.E0().f24269y;
            } else {
                locale = Locale.getDefault();
            }
            Collator collator = Collator.getInstance(locale);
            Objects.requireNonNull(collator);
            qw0Var = new di.s4(collator, 6);
        } else {
            qw0Var = new qw0(13);
        }
        Collections.sort(this.f51757w, qw0Var);
        for (ArrayList arrayList4 : this.f51756s.values()) {
            Collections.sort(arrayList4, new qs(qw0Var, 0));
        }
    }

    @Override
    public final String F(int i7) {
        int S = S(i7);
        ArrayList arrayList = this.f51757w;
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        return (String) arrayList.get(S);
    }

    @Override
    public final void G(org.telegram.ui.Components.ek0 ek0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        ArrayList arrayList = this.f51757w;
        int size = ((ArrayList) this.f51756s.get(arrayList.get(i7))).size();
        if (i7 != arrayList.size() - 1) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int P(int i7, int i10) {
        if (i10 < ((ArrayList) this.f51756s.get(this.f51757w.get(i7))).size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final int R() {
        return this.f51757w.size();
    }

    @Override
    public final View T(int i7, View view) {
        return null;
    }

    @Override
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        if (i10 < ((ArrayList) this.f51756s.get(this.f51757w.get(i7))).size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.f1 f1Var) {
        if (f1Var.f59165f == 0) {
            ps psVar = (ps) ((ArrayList) this.f51756s.get(this.f51757w.get(i7))).get(i10);
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) f1Var.f59161a;
            String str = null;
            CharSequence m10 = org.telegram.messenger.j6.m(us.a0(psVar), x9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
            if (this.f51758x.h) {
                str = "+" + psVar.f50967c;
            }
            x9Var.c(m10, str, false, false);
        }
    }

    @Override
    public final ps O(int i7, int i10) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f51757w;
            if (i7 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.f51756s.get(arrayList.get(i7));
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    return (ps) arrayList2.get(i10);
                }
            }
        }
        return null;
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View Z;
        Context context = this.f51755r;
        if (i7 != 0) {
            Z = new org.telegram.ui.Cells.f3(context, null);
            Z.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f));
        } else {
            Z = us.Z(context);
        }
        return new v4.f1(Z);
    }
}
