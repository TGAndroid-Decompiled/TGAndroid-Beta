package pg;

import android.graphics.Color;
import bg.i0;
import i7.w;
import og.d;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.xx0;
public abstract class a {
    public static d a(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f19560e = new xx0(17);
        dVar.d(385875968, 402653183);
        dVar.c(385875968, 402653183);
        dVar.b(285212672, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        dVar.f19562n = dpf2;
        dVar.f19563r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        dVar.f19561f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d b(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f19560e = new i0(1, c6Var);
        dVar.d(-1, 687865855);
        dVar.c(-1, 352321535);
        dVar.b(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(0.5f);
        float dpf22 = AndroidUtilities.dpf2(0.5f);
        dVar.f19561f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static boolean c(int i10, c6 c6Var) {
        boolean q6;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = g6.I.q();
        }
        boolean chatBlurEnabled = SharedConfig.chatBlurEnabled();
        if (chatBlurEnabled && !q6 && MessagesController.getInstance(i10).config.disableBlurInLightTheme.get()) {
            chatBlurEnabled = false;
        }
        if (chatBlurEnabled && q6 && MessagesController.getInstance(i10).config.disableBlurInDarkTheme.get()) {
            return false;
        }
        return chatBlurEnabled;
    }

    public static d d(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f19560e = new xx0(21);
        dVar.d(-1, 687865855);
        dVar.c(-1, 352321535);
        dVar.b(1073741824, 0);
        float dpf2 = AndroidUtilities.dpf2(3.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f19562n = dpf2;
        dVar.f19563r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.5f);
        float dpf24 = AndroidUtilities.dpf2(0.5f);
        dVar.f19561f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d e(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f19560e = new xx0(8);
        dVar.d(687865855, 687865855);
        dVar.c(352321535, 352321535);
        dVar.b(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f19562n = dpf2;
        dVar.f19563r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f19561f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d f(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f19560e = new xx0(16);
        dVar.d(285212672, 117440511);
        dVar.c(536870912, 301989887);
        dVar.b(536870912, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.667f);
        float dpf22 = AndroidUtilities.dpf2(0.85f);
        dVar.f19562n = dpf2;
        dVar.f19563r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        dVar.f19561f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d g(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f19560e = new xx0(9);
        dVar.d(1157627903, 0);
        dVar.c(587202559, 0);
        dVar.b(939524096, 0);
        dVar.f19562n = AndroidUtilities.dpf2(3.5f);
        dVar.f19563r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f19561f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static d h(c6 c6Var) {
        return g(c6Var);
    }

    public static d i(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f19560e = new xx0(20);
        dVar.d(687865855, 687865855);
        dVar.c(352321535, 352321535);
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f19561f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static d j(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f19560e = new xx0(15);
        dVar.d(1157627903, 0);
        dVar.c(587202559, 0);
        dVar.b(637534208, 0);
        dVar.f19562n = AndroidUtilities.dpf2(4.0f);
        dVar.f19563r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f19561f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static d k(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.d(0, 687865855);
        dVar.c(0, 352321535);
        dVar.b(805306368, 83886079);
        float dpf2 = AndroidUtilities.dpf2(4.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        dVar.f19562n = dpf2;
        dVar.f19563r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        dVar.f19561f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static int l(float f9, int i10, int i11) {
        float a2 = w.a(f9, 0.0f, 1.0f);
        if (a2 <= 0.0f) {
            return Color.argb(0, 0, 0, 0);
        }
        if (a2 >= 1.0f) {
            return Color.argb(255, Color.red(i11), Color.green(i11), Color.blue(i11));
        }
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        int red2 = Color.red(i11);
        int green2 = Color.green(i11);
        int blue2 = Color.blue(i11);
        float f10 = 1.0f - a2;
        return Color.argb(w.b(Math.round(a2 * 255.0f), 0, 255), w.b(Math.round((red2 - (red * f10)) / a2), 0, 255), w.b(Math.round((green2 - (green * f10)) / a2), 0, 255), w.b(Math.round((blue2 - (blue * f10)) / a2), 0, 255));
    }

    public static d m(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f19560e = new xx0(10);
        dVar.d(285212672, 117440511);
        dVar.c(536870912, 301989887);
        dVar.b(536870912, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.667f);
        float dpf22 = AndroidUtilities.dpf2(0.85f);
        dVar.f19562n = dpf2;
        dVar.f19563r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        dVar.f19561f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d n(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f19560e = new i0(3, c6Var);
        dVar.d(-1, 553648127);
        dVar.c(-1, 352321535);
        dVar.b(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(0.55f);
        float dpf22 = AndroidUtilities.dpf2(0.55f);
        dVar.f19561f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static d o(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f19560e = new xx0(19);
        dVar.d(0, 0);
        dVar.c(0, 0);
        dVar.b(0, 0);
        dVar.f19562n = 0.0f;
        dVar.f19563r = 0.0f;
        dVar.f19561f = 0.0f;
        dVar.h = 0.0f;
        return dVar;
    }

    public static d p(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f19560e = new i0(2, c6Var);
        dVar.d(0, 0);
        dVar.c(0, 0);
        dVar.b(0, 0);
        dVar.f19562n = 0.0f;
        dVar.f19563r = 0.0f;
        dVar.f19561f = 0.0f;
        dVar.h = 0.0f;
        return dVar;
    }
}
