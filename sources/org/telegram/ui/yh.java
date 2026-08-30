package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public abstract class yh {
    public static void A(int i10, ArrayList arrayList) {
        arrayList.add(org.telegram.ui.Components.i51.B(LocaleController.getString(i10)));
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

    public static void a(r3.v vVar, h5.w wVar, int i10) {
        vVar.a(i10, wVar);
    }

    public static boolean b(int i10, int i11, int i12) {
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

    public static float c(float f10, float f11, float f12, float f13) {
        return f13 - ((f10 - f11) * f12);
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return Math.max(i13, Math.min(Math.max(i10, i11), i12));
    }

    public static int e(int i10, int i11, int i12, ArrayList arrayList) {
        arrayList.add(Integer.valueOf(i10));
        return i11 + i12;
    }

    public static int f(int i10, int i11, ArrayList arrayList) {
        return i11 - (arrayList.size() + i10);
    }

    public static int g(Random random, int i10) {
        return Math.abs(random.nextInt() % i10);
    }

    public static int h(org.telegram.ui.Components.t00 t00Var, int i10) {
        return t00Var.c(t00Var.getMeasuredWidth()) + i10;
    }

    public static TextView i(FrameLayout frameLayout, TextView textView, FrameLayout.LayoutParams layoutParams, Context context) {
        frameLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static TextView j(LinearLayout linearLayout, TextView textView, LinearLayout.LayoutParams layoutParams, Context context) {
        linearLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static Object k(int i10, List list) {
        return list.get(list.size() - i10);
    }

    public static String l(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static StringBuilder m(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static o1.k n(float f10, float f11, float f12) {
        o1.k kVar = new o1.k(f10);
        kVar.b(f11);
        kVar.a(f12);
        return kVar;
    }

    public static org.telegram.ui.Components.el0 o(View view, View view2, int i10, int i11) {
        view.setLayoutParams(new f2.w0(i10, i11));
        return new f2.l1(view2);
    }

    public static void p(float f10, int i10, TextView textView) {
        textView.setTextSize(i10, f10);
        textView.setTypeface(AndroidUtilities.bold());
    }

    public static void q(int i10, int i11, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(LocaleController.getString(i10));
        arrayList2.add(Integer.valueOf(i11));
    }

    public static void r(int i10, ArrayList arrayList) {
        arrayList.add(org.telegram.ui.Components.i51.t(LocaleController.getString(i10)));
    }

    public static void s(int i10, Object[] objArr, org.telegram.ui.Components.qc qcVar, int i11, int i12) {
        qcVar.Q(i11, i12, LocaleController.formatString(i10, objArr)).j();
    }

    public static void t(int i10, boolean[] zArr, boolean z4, TextView textView, int i11) {
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(zArr, i10, z4));
        textView.setGravity(i11);
    }

    public static void u(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.TL_error tL_error, boolean z4) {
        new org.telegram.ui.Components.qc(frameLayout, f6Var).d0(tL_error, z4);
    }

    public static void v(com.google.firebase.messaging.r rVar) {
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(rVar);
    }

    public static void w(String str, StringBuilder sb) {
        sb.append(str);
        FileLog.d(sb.toString());
    }

    public static void x(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static void y(tf.k kVar, int i10, ArrayList arrayList) {
        arrayList.add(new tf.i(kVar, i10));
    }

    public static void z(boolean z4, org.telegram.ui.ActionBar.k kVar) {
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.i2(z4));
    }
}
