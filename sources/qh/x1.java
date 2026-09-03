package qh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.im;
import org.telegram.ui.ek;
public class x1 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static int D = 1;
    public vf.g B;
    public Utilities.CallbackReturn C;
    public String f46298b;
    public int f46299c;
    public final x0 d;
    public final y0 f46300e;
    public final ek f46301f;
    public final w1 h;
    public float f46302n;
    public final boolean f46303r;
    public final boolean f46304s;
    public boolean v;
    public c4 f46305w;
    public float f46306x;
    public Utilities.Callback3Return f46307y;

    public x1(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, boolean z10) {
        super(context, g6Var, true, false);
        int i10;
        this.f46298b = null;
        this.f46299c = -1;
        this.d = new TLRPC.Document();
        this.f46300e = new TLRPC.Document();
        this.f46302n = -1.0f;
        this.f46303r = z4;
        this.f46304s = z10;
        this.useSmoothKeyboard = true;
        fixNavigationBar(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21733h5, g6Var));
        this.occupyNavigationBar = true;
        setUseLightStatusBar(false);
        this.containerView = new a1(this, context);
        ek ekVar = new ek(this, context, 6);
        this.f46301f = ekVar;
        if (z4) {
            i10 = 0;
        } else {
            i10 = D;
        }
        ekVar.f28685b = i10;
        ekVar.setAdapter(new z0(this, z4, context));
        this.containerView.addView(ekVar, k7.c6.e(-1, -1, 87));
        new h3(this.containerView, false, new w0(this, 0));
        if (!z4) {
            w1 w1Var = new w1(context);
            this.h = w1Var;
            w1Var.D = new w0(this, 1);
            w1Var.C = ekVar.f28685b;
            w1Var.invalidate();
            this.containerView.addView(w1Var, k7.c6.e(-1, -2, 87));
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
        FileLog.disableGson(true);
        if (!z4) {
            MediaDataController.getInstance(this.currentAccount).checkStickers(5);
            MediaDataController.getInstance(this.currentAccount).checkFeaturedEmoji();
            MediaDataController.getInstance(this.currentAccount).loadRecents(0, true, true, false);
        }
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(7, false, true, false);
    }

    public static int D(x1 x1Var) {
        return x1Var.currentAccount;
    }

    public static int E(x1 x1Var) {
        return x1Var.currentAccount;
    }

    public static int G(x1 x1Var) {
        return x1Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.g6 H(x1 x1Var) {
        return x1Var.resourcesProvider;
    }

    public static int T(x1 x1Var) {
        return x1Var.currentAccount;
    }

    public static int V(x1 x1Var) {
        return x1Var.currentAccount;
    }

    public static int W(x1 x1Var) {
        return x1Var.currentAccount;
    }

    public static void m(x1 x1Var) {
        boolean z4 = x1Var.v;
        boolean z10 = x1Var.keyboardVisible;
        if (z4 != z10) {
            x1Var.v = z10;
            x1Var.container.clearAnimation();
            float f10 = 0.0f;
            if (x1Var.keyboardVisible) {
                int i10 = AndroidUtilities.displaySize.y;
                int i11 = x1Var.keyboardHeight;
                f10 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - x1Var.f46306x, (-i11) / 3.0f));
            }
            x1Var.container.animate().translationY(f10).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.f22251w).start();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f46301f.getTranslationY() >= ((int) this.f46302n)) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        View[] viewPages;
        if (i10 == NotificationCenter.stickersDidLoad || i10 == NotificationCenter.groupStickersDidLoad) {
            for (View view : this.f46301f.getViewPages()) {
                if (view instanceof n1) {
                    n1 n1Var = (n1) view;
                    if (i10 == NotificationCenter.groupStickersDidLoad || ((n1Var.f45424a == 0 && ((Integer) objArr[0]).intValue() == 5) || (n1Var.f45424a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        m1 m1Var = n1Var.f45793c;
                        if (m1Var.E == null) {
                            m1Var.D(null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        o0();
        super.dismiss();
        FileLog.disableGson(false);
    }

    @Override
    public final int getContainerViewHeight() {
        if (this.containerView.getMeasuredHeight() <= 0) {
            return AndroidUtilities.displaySize.y;
        }
        return (int) (this.containerView.getMeasuredHeight() - this.f46301f.getY());
    }

    public boolean l0(Integer num) {
        return true;
    }

    public boolean m0(Integer num) {
        return true;
    }

    public boolean n0(im imVar) {
        return true;
    }

    public final void o0() {
        View[] viewPages;
        r1 r1Var;
        this.keyboardVisible = false;
        this.container.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.f22251w).start();
        for (View view : this.f46301f.getViewPages()) {
            if (view instanceof n1) {
                r1 r1Var2 = ((n1) view).f45795f;
                if (r1Var2 != null) {
                    AndroidUtilities.hideKeyboard(r1Var2.d);
                }
            } else if ((view instanceof h1) && (r1Var = ((h1) view).d) != null) {
                AndroidUtilities.hideKeyboard(r1Var.d);
            }
        }
    }

    public final void p0(int i10) {
        if (l0(Integer.valueOf(i10))) {
            if ((i10 != 1 || n0(new im(this, i10, 29))) && ((Boolean) this.C.run(Integer.valueOf(i10))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void q0(Utilities.CallbackReturn callbackReturn) {
        View[] viewPages;
        this.C = callbackReturn;
        for (View view : this.f46301f.getViewPages()) {
            if (view instanceof n1) {
                m1 m1Var = ((n1) view).f45793c;
                if (m1Var.E == null) {
                    m1Var.D(null);
                }
            }
        }
    }
}
