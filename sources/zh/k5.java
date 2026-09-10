package zh;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.j90;
public final class k5 implements Runnable {
    public final int f48590a;
    public final Object f48591b;

    public k5(Object obj, int i10) {
        this.f48590a = i10;
        this.f48591b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f48590a;
        boolean z10 = false;
        Object obj = this.f48591b;
        switch (i10) {
            case 0:
                n5 n5Var = (n5) obj;
                n5Var.c();
                n5Var.a(true);
                return;
            case 1:
                ((m4) obj).accept(null);
                return;
            case 2:
                ((w5) obj).onDetachedFromWindow();
                return;
            case 3:
                e6 e6Var = (e6) obj;
                ArrayList arrayList = e6Var.f48386c;
                if (arrayList != null) {
                    e6Var.f48384a.f48232z1 = arrayList;
                }
                a3 a3Var = e6Var.f48384a;
                long j3 = e6Var.f48385b;
                if (a3Var.B1 != j3 || a3Var.f48232z1 != null) {
                    a3Var.B1 = j3;
                    a3Var.j1();
                    a3Var.i1();
                    a3Var.f1(true);
                    TL_stories.PeerStories peerStories = a3Var.J0.Q0;
                    if (peerStories != null) {
                        a3Var.S1.S(peerStories, true);
                        return;
                    }
                    i5 i5Var = a3Var.S1;
                    TL_stories.PeerStories y3 = i5Var.y(j3);
                    if (y3 == null) {
                        y3 = i5Var.z(j3);
                        z10 = true;
                    }
                    i5Var.S(y3, z10);
                    return;
                }
                return;
            case 4:
                ((j90) obj).d(true);
                return;
            case 5:
                ((r6) obj).requestLayout();
                return;
            case 6:
                y6 y6Var = (y6) obj;
                bi.x4 x4Var = y6Var.f49117c;
                if (x4Var != null) {
                    x4Var.e(true);
                    y6Var.f49117c = null;
                }
                y6Var.b(false);
                return;
            case 7:
                w6 w6Var = (w6) obj;
                if (w6Var.v) {
                    w6Var.E = true;
                    w6Var.F = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    w6Var.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    w6Var.f49015f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    w6Var.invalidate();
                    return;
                }
                return;
            case 8:
                u7 u7Var = ((d7) obj).f48353b;
                try {
                    i7 i7Var = u7Var.f48958s;
                    if (i7Var != null) {
                        if (u7Var.f48921b) {
                            AndroidUtilities.removeFromParent(i7Var);
                        } else {
                            u7Var.f48946n.removeView(i7Var);
                        }
                        u7Var.f48958s = null;
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 9:
                ((i7) obj).I0.K(true);
                return;
            default:
                ((d8) obj).c();
                return;
        }
    }
}
