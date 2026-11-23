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
    public final Context f51874r;
    public final HashMap f51875s = new HashMap();
    public final ArrayList f51876w = new ArrayList();
    public final ts f51877x;

    public rs(ts tsVar, Context context, ArrayList arrayList, boolean z10) {
        Comparator ow0Var;
        Locale locale;
        this.f51877x = tsVar;
        this.f51874r = context;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ps psVar = (ps) arrayList.get(i7);
                String upperCase = psVar.f51135a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.f51875s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.f51875s.put(upperCase, arrayList2);
                    this.f51876w.add(upperCase);
                }
                arrayList2.add(psVar);
            }
        } else {
            try {
                InputStream open = org.telegram.messenger.t0.f27013b.getResources().getAssets().open("countries.txt");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    ?? obj = new Object();
                    obj.f51135a = split[2];
                    obj.f51137c = split[0];
                    String str = split[1];
                    obj.d = str;
                    if (!str.equals("FT") || !z10) {
                        String upperCase2 = obj.f51135a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.f51875s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.f51875s.put(upperCase2, arrayList3);
                            this.f51876w.add(upperCase2);
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
            if (org.telegram.messenger.gd.E0().f24342y != null) {
                locale = org.telegram.messenger.gd.E0().f24342y;
            } else {
                locale = Locale.getDefault();
            }
            Collator collator = Collator.getInstance(locale);
            Objects.requireNonNull(collator);
            ow0Var = new di.s4(collator, 6);
        } else {
            ow0Var = new ow0(13);
        }
        Collections.sort(this.f51876w, ow0Var);
        for (ArrayList arrayList4 : this.f51875s.values()) {
            Collections.sort(arrayList4, new qs(ow0Var, 0));
        }
    }

    @Override
    public final String F(int i7) {
        int S = S(i7);
        ArrayList arrayList = this.f51876w;
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
        ArrayList arrayList = this.f51876w;
        int size = ((ArrayList) this.f51875s.get(arrayList.get(i7))).size();
        if (i7 != arrayList.size() - 1) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int P(int i7, int i10) {
        if (i10 < ((ArrayList) this.f51875s.get(this.f51876w.get(i7))).size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final int R() {
        return this.f51876w.size();
    }

    @Override
    public final View T(int i7, View view) {
        return null;
    }

    @Override
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        if (i10 < ((ArrayList) this.f51875s.get(this.f51876w.get(i7))).size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.f1 f1Var) {
        if (f1Var.f59249f == 0) {
            ps psVar = (ps) ((ArrayList) this.f51875s.get(this.f51876w.get(i7))).get(i10);
            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) f1Var.f59245a;
            String str = null;
            CharSequence m10 = org.telegram.messenger.j6.m(ts.a0(psVar), w9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
            if (this.f51877x.h) {
                str = "+" + psVar.f51137c;
            }
            w9Var.c(m10, str, false, false);
        }
    }

    @Override
    public final ps O(int i7, int i10) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f51876w;
            if (i7 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.f51875s.get(arrayList.get(i7));
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
        Context context = this.f51874r;
        if (i7 != 0) {
            Z = new org.telegram.ui.Cells.f3(context, null);
            Z.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f));
        } else {
            Z = ts.Z(context);
        }
        return new v4.f1(Z);
    }
}
