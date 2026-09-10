package z9;

import android.util.JsonReader;
import android.view.WindowManager;
import bi.u6;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rv0;
import q9.d;
import zh.x0;
public final class a implements b, d, NativeInstance.AudioLevelsCallback, qv0, rv0, c2 {
    public final int f47855a;

    public a(int i10) {
        this.f47855a = i10;
    }

    @Override
    public Object P1(u6 u6Var) {
        switch (this.f47855a) {
            case 2:
                return FirebaseSessionsRegistrar.e(u6Var);
            case 3:
                return FirebaseSessionsRegistrar.f(u6Var);
            case 4:
                return FirebaseSessionsRegistrar.a(u6Var);
            case 5:
                return FirebaseSessionsRegistrar.b(u6Var);
            case 6:
                return FirebaseSessionsRegistrar.d(u6Var);
            default:
                return FirebaseSessionsRegistrar.c(u6Var);
        }
    }

    @Override
    public Object a(JsonReader jsonReader) {
        return c.a(jsonReader);
    }

    @Override
    public void b(Object obj, float f7) {
        x0 x0Var = (x0) obj;
        switch (this.f47855a) {
            case 10:
                WindowManager.LayoutParams layoutParams = x0Var.f49027c;
                x0Var.N = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(x0Var.f49026b, x0Var.d, layoutParams);
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = x0Var.f49027c;
                x0Var.O = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(x0Var.f49026b, x0Var.d, layoutParams2);
                return;
        }
    }

    @Override
    public void f(d2 d2Var, int i10) {
        switch (this.f47855a) {
            case 13:
                d2Var.dismiss();
                return;
            default:
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        x0 x0Var = (x0) obj;
        switch (this.f47855a) {
            case 9:
                return x0Var.N;
            default:
                return x0Var.O;
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
