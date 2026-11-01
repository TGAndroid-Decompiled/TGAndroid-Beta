package sg;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import kg.i1;
import org.telegram.messenger.at;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.tw;
import org.telegram.ui.un;
import org.telegram.ui.zx;
import th.c7;
import th.d2;
import th.e5;
import th.f7;
import th.g2;
import th.h4;
import th.i5;
import th.j4;
import th.l6;
import th.n7;
import th.o7;
import th.q4;
import th.q6;
import th.s0;
import th.s5;
import th.s6;
import th.u3;
import th.v2;
import th.w0;
import th.x6;
import th.x7;
import th.y3;
import th.z2;
import th.z5;
import vh.i6;
import vh.p2;
import vh.t0;
public final class v implements Runnable {
    public final int f48490a;
    public final Object f48491b;

    public v(Object obj, int i10) {
        this.f48490a = i10;
        this.f48491b = obj;
    }

    @Override
    public final void run() {
        String str;
        boolean z10 = false;
        switch (this.f48490a) {
            case 0:
                ((ValueAnimator) this.f48491b).start();
                return;
            case 1:
                k2 k2Var = ((w) this.f48491b).f48494g2.f48300r;
                if (k2Var instanceof un) {
                    k2Var.showDialog(new i1(k2Var, 11, false));
                    return;
                }
                k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.showDialog(new i1(k2Var, 11, false));
                    return;
                }
                return;
            case 2:
                zx zxVar = ((tw) this.f48491b).O0;
                if (zxVar.L && zxVar.j4().I()) {
                    zxVar.E0.h();
                    return;
                } else {
                    zxVar.J4(true, true);
                    return;
                }
            case 3:
                ((th.q0) this.f48491b).f49392a.t(false);
                return;
            case 4:
                s0 s0Var = ((th.r0) this.f48491b).f49418a;
                at.f(s0Var.e).k(176, Long.valueOf(s0Var.g()));
                return;
            case 5:
                w0 w0Var = (w0) this.f48491b;
                w0Var.H = false;
                w0Var.j(false);
                w0Var.T = false;
                return;
            case 6:
                ((d2) this.f48491b).f48886a.O0();
                return;
            case 7:
                z2 z2Var = ((g2) this.f48491b).f49009y;
                v2 v2Var = z2Var.f49797z1;
                if (v2Var != null) {
                    if (!z2Var.C1 && !z2Var.D1 && !z2Var.E1) {
                        o7 o7Var = ((f7) v2Var).d;
                        if (!o7Var.f49333n0.getCurrentPeerView().b1(true) && !o7Var.f49333n0.E(true)) {
                            o7Var.D(true);
                            return;
                        }
                        return;
                    } else if (z2Var.f49790x1.e) {
                        ((n7) z2Var.f49783v2.f10769c).loopBack();
                        return;
                    } else {
                        z2Var.F0 = 0L;
                        return;
                    }
                }
                return;
            case 8:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f48491b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f48491b;
                int i10 = ProfileStoriesView.f34063s0;
                profileStoriesView.getClass();
                org.telegram.messenger.i0.b4(profileStoriesView);
                return;
            case 10:
                y3.a(((u3) this.f48491b).d);
                return;
            case 11:
                h4 h4Var = (h4) this.f48491b;
                if (h4Var.isShowing()) {
                    h4Var.J0(true);
                    return;
                }
                return;
            case 12:
                t0 t0Var = (t0) this.f48491b;
                t0Var.b(t0Var.f51963b);
                t0Var.f51964c = false;
                return;
            case 13:
                ((i6) this.f48491b).run();
                return;
            case 14:
                i5 i5Var = (i5) this.f48491b;
                i5Var.c();
                i5Var.a(true);
                return;
            case 15:
                ((j4) this.f48491b).a(null);
                return;
            case 16:
                ((s5) this.f48491b).R();
                return;
            case 17:
                z5 z5Var = (z5) this.f48491b;
                ArrayList arrayList = z5Var.f49802c;
                if (arrayList != null) {
                    z5Var.f49800a.f49732i1 = arrayList;
                }
                z2 z2Var2 = z5Var.f49800a;
                long j10 = z5Var.f49801b;
                if (z2Var2.f49740k1 != j10 || z2Var2.f49732i1 != null) {
                    z2Var2.f49740k1 = j10;
                    z2Var2.h1();
                    z2Var2.g1();
                    z2Var2.d1(true);
                    TL_stories.PeerStories peerStories = z2Var2.f49769s0.Q0;
                    if (peerStories != null) {
                        z2Var2.B1.V(peerStories, true);
                        return;
                    }
                    e5 e5Var = z2Var2.B1;
                    TL_stories.PeerStories y3 = e5Var.y(j10);
                    if (y3 == null) {
                        y3 = e5Var.z(j10);
                        z10 = true;
                    }
                    e5Var.V(y3, z10);
                    return;
                }
                return;
            case 18:
                ((ji.a) this.f48491b).f(true);
                return;
            case 19:
                ((l6) this.f48491b).requestLayout();
                return;
            case 20:
                s6 s6Var = (s6) this.f48491b;
                p2 p2Var = s6Var.f49454c;
                if (p2Var != null) {
                    p2Var.e(true);
                    s6Var.f49454c = null;
                }
                s6Var.b(false);
                return;
            case 21:
                q6 q6Var = (q6) this.f48491b;
                if (q6Var.f49412w) {
                    q6Var.E = true;
                    q6Var.F = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    q6Var.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    q6Var.f49408f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    q6Var.invalidate();
                    return;
                }
                return;
            case 22:
                o7 o7Var2 = ((x6) this.f48491b).f49668b;
                try {
                    c7 c7Var = o7Var2.f49344s;
                    if (c7Var != null) {
                        if (o7Var2.f49307b) {
                            org.telegram.messenger.i0.E2(c7Var);
                        } else {
                            o7Var2.f49332n.removeView(c7Var);
                        }
                        o7Var2.f49344s = null;
                        o7Var2.E();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 23:
                ((c7) this.f48491b).f48872r0.Y(true);
                return;
            case 24:
                ((x7) this.f48491b).c();
                return;
            case 25:
                ((bi) this.f48491b).hide();
                return;
            case 26:
                uh.i iVar = (uh.i) this.f48491b;
                vq0 vq0Var = iVar.W;
                q4 q4Var = iVar.f50259a;
                if (q4Var == null) {
                    str = "";
                } else {
                    str = q4Var.E;
                }
                vq0Var.a(str);
                return;
            case 27:
                ((vh.g) this.f48491b).f51188c.W = false;
                return;
            case 28:
                ((vh.j) this.f48491b).invalidateSelf();
                return;
            default:
                ((vh.w) this.f48491b).f52091g = -1L;
                return;
        }
    }
}
