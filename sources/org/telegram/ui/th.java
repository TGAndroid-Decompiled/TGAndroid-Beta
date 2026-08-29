package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public abstract class th {
    public static void A(int i10, ArrayList arrayList) {
        arrayList.add(org.telegram.ui.Components.w41.B(LocaleController.getString(i10)));
    }

    public static String B(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return "FAILED";
                    }
                    throw null;
                }
                return "PENDING";
            }
            return "CANCELLED";
        }
        return "PAID";
    }

    public static boolean a(int i10, int i11, int i12) {
        switch (i10) {
            case 1:
                if (((i11 + i12) & 1) == 0) {
                    return true;
                }
                return false;
            case 2:
                if ((i11 & 1) == 0) {
                    return true;
                }
                return false;
            case 3:
                if (i12 % 3 == 0) {
                    return true;
                }
                return false;
            case 4:
                if ((i11 + i12) % 3 == 0) {
                    return true;
                }
                return false;
            case 5:
                if ((((i12 / 3) + (i11 / 2)) & 1) == 0) {
                    return true;
                }
                return false;
            case 6:
                if ((i11 * i12) % 6 == 0) {
                    return true;
                }
                return false;
            case 7:
                if ((i11 * i12) % 6 < 3) {
                    return true;
                }
                return false;
            default:
                if (((((i11 * i12) % 3) + i11 + i12) & 1) == 0) {
                    return true;
                }
                return false;
        }
    }

    public static float b(float f9, float f10, float f11, float f12) {
        return f12 - ((f9 - f10) * f11);
    }

    public static int c(int i10, int i11, int i12, int i13) {
        return Math.max(i13, Math.min(Math.max(i10, i11), i12));
    }

    public static int d(int i10, int i11, int i12, ArrayList arrayList) {
        arrayList.add(Integer.valueOf(i10));
        return i11 + i12;
    }

    public static int e(int i10, int i11, ArrayList arrayList) {
        return i11 - (arrayList.size() + i10);
    }

    public static int f(Random random, int i10) {
        return Math.abs(random.nextInt() % i10);
    }

    public static int g(org.telegram.ui.Components.p00 p00Var, int i10) {
        return p00Var.c(p00Var.getMeasuredWidth()) + i10;
    }

    public static TextView h(FrameLayout frameLayout, TextView textView, FrameLayout.LayoutParams layoutParams, Context context) {
        frameLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static TextView i(LinearLayout linearLayout, TextView textView, LinearLayout.LayoutParams layoutParams, Context context) {
        linearLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static String j(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static StringBuilder k(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static o1.l l(float f9, float f10, float f11) {
        o1.l lVar = new o1.l(f9);
        lVar.b(f10);
        lVar.a(f11);
        return lVar;
    }

    public static org.telegram.ui.Components.vk0 m(View view, View view2, int i10, int i11) {
        view.setLayoutParams(new f2.x0(i10, i11));
        return new f2.n1(view2);
    }

    public static void n(float f9, int i10, TextView textView) {
        textView.setTextSize(i10, f9);
        textView.setTypeface(AndroidUtilities.bold());
    }

    public static void o(int i10, int i11, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(LocaleController.getString(i10));
        arrayList2.add(Integer.valueOf(i11));
    }

    public static void p(int i10, ArrayList arrayList) {
        arrayList.add(org.telegram.ui.Components.w41.t(LocaleController.getString(i10)));
    }

    public static void q(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(LocaleController.getString(i10));
        arrayList2.add(num);
    }

    public static void r(int i10, Object[] objArr, org.telegram.ui.Components.tc tcVar, int i11, int i12) {
        tcVar.Q(i11, i12, LocaleController.formatString(i10, objArr)).j();
    }

    public static void s(int i10, boolean[] zArr, boolean z10, TextView textView, int i11) {
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(zArr, i10, z10));
        textView.setGravity(i11);
    }

    public static void t(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, TLRPC.TL_error tL_error, boolean z10) {
        new org.telegram.ui.Components.tc(frameLayout, c6Var).d0(tL_error, z10);
    }

    public static void u(com.google.firebase.messaging.s sVar) {
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(sVar);
    }

    public static void v(String str, StringBuilder sb2) {
        sb2.append(str);
        FileLog.d(sb2.toString());
    }

    public static void w(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static void x(rf.l lVar, int i10, ArrayList arrayList) {
        arrayList.add(new rf.j(lVar, i10));
    }

    public static void y(boolean z10, org.telegram.ui.ActionBar.l lVar) {
        lVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(z10));
    }

    public static int z(int i10, int i11, int i12, int i13) {
        return Math.max(i13, Math.min(Math.min(i10, i11), i12));
    }
}
