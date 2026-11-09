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
public final class qs extends org.telegram.ui.Components.lj0 {
    public final Context f49183r;
    public final HashMap f49184s = new HashMap();
    public final ArrayList f49185w = new ArrayList();
    public final ss f49186x;

    public qs(ss ssVar, Context context, ArrayList arrayList, boolean z9) {
        Comparator wn0Var;
        Locale locale;
        this.f49186x = ssVar;
        this.f49183r = context;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                os osVar = (os) arrayList.get(i7);
                String upperCase = osVar.f48510a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.f49184s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.f49184s.put(upperCase, arrayList2);
                    this.f49185w.add(upperCase);
                }
                arrayList2.add(osVar);
            }
        } else {
            try {
                InputStream open = org.telegram.messenger.t0.f25566b.getResources().getAssets().open("countries.txt");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    ?? obj = new Object();
                    obj.f48510a = split[2];
                    obj.f48512c = split[0];
                    String str = split[1];
                    obj.d = str;
                    if (!str.equals("FT") || !z9) {
                        String upperCase2 = obj.f48510a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.f49184s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.f49184s.put(upperCase2, arrayList3);
                            this.f49185w.add(upperCase2);
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
            if (org.telegram.messenger.id.E0().f23185y != null) {
                locale = org.telegram.messenger.id.E0().f23185y;
            } else {
                locale = Locale.getDefault();
            }
            Collator collator = Collator.getInstance(locale);
            Objects.requireNonNull(collator);
            wn0Var = new bi.s5(collator, 8);
        } else {
            wn0Var = new wn0(14);
        }
        Collections.sort(this.f49185w, wn0Var);
        for (ArrayList arrayList4 : this.f49184s.values()) {
            Collections.sort(arrayList4, new ps(wn0Var, 0));
        }
    }

    @Override
    public final String F(int i7) {
        int S = S(i7);
        ArrayList arrayList = this.f49185w;
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        return (String) arrayList.get(S);
    }

    @Override
    public final void G(org.telegram.ui.Components.qj0 qj0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        ArrayList arrayList = this.f49185w;
        int size = ((ArrayList) this.f49184s.get(arrayList.get(i7))).size();
        if (i7 != arrayList.size() - 1) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int P(int i7, int i10) {
        if (i10 < ((ArrayList) this.f49184s.get(this.f49185w.get(i7))).size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final int R() {
        return this.f49185w.size();
    }

    @Override
    public final View T(int i7, View view) {
        return null;
    }

    @Override
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        if (i10 < ((ArrayList) this.f49184s.get(this.f49185w.get(i7))).size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.d1 d1Var) {
        if (d1Var.f57060f == 0) {
            os osVar = (os) ((ArrayList) this.f49184s.get(this.f49185w.get(i7))).get(i10);
            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) d1Var.f57056a;
            String str = null;
            CharSequence m10 = org.telegram.messenger.i6.m(ss.a0(osVar), w9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
            if (this.f49186x.h) {
                str = "+" + osVar.f48512c;
            }
            w9Var.c(m10, str, false, false);
        }
    }

    @Override
    public final os O(int i7, int i10) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f49185w;
            if (i7 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.f49184s.get(arrayList.get(i7));
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    return (os) arrayList2.get(i10);
                }
            }
        }
        return null;
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View Z;
        Context context = this.f49183r;
        if (i7 != 0) {
            Z = new org.telegram.ui.Cells.e3(context, null);
            Z.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f));
        } else {
            Z = ss.Z(context);
        }
        return new v4.d1(Z);
    }
}
