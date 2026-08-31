package qh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jm;
import org.telegram.ui.ek;
public class y1 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static int D = 1;
    public vf.g B;
    public Utilities.CallbackReturn C;
    public String f46342b;
    public int f46343c;
    public final x0 d;
    public final y0 f46344e;
    public final ek f46345f;
    public final x1 h;
    public float f46346n;
    public final boolean f46347r;
    public final boolean f46348s;
    public boolean v;
    public d4 f46349w;
    public float f46350x;
    public Utilities.Callback3Return f46351y;

    public y1(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, boolean z10) {
        super(context, g6Var, true, false);
        int i10;
        this.f46342b = null;
        this.f46343c = -1;
        this.d = new TLRPC.Document();
        this.f46344e = new TLRPC.Document();
        this.f46346n = -1.0f;
        this.f46347r = z4;
        this.f46348s = z10;
        this.useSmoothKeyboard = true;
        fixNavigationBar(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, g6Var));
        this.occupyNavigationBar = true;
        setUseLightStatusBar(false);
        this.containerView = new a1(this, context);
        ek ekVar = new ek(this, context, 6);
        this.f46345f = ekVar;
        if (z4) {
            i10 = 0;
        } else {
            i10 = D;
        }
        ekVar.f28985b = i10;
        ekVar.setAdapter(new z0(this, z4, context));
        this.containerView.addView(ekVar, k7.c6.e(-1, -1, 87));
        new i3(this.containerView, false, new w0(this, 0));
        if (!z4) {
            x1 x1Var = new x1(context);
            this.h = x1Var;
            x1Var.D = new w0(this, 1);
            x1Var.C = ekVar.f28985b;
            x1Var.invalidate();
            this.containerView.addView(x1Var, k7.c6.e(-1, -2, 87));
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

    public static int D(y1 y1Var) {
        return y1Var.currentAccount;
    }

    public static int E(y1 y1Var) {
        return y1Var.currentAccount;
    }

    public static int G(y1 y1Var) {
        return y1Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.g6 H(y1 y1Var) {
        return y1Var.resourcesProvider;
    }

    public static int T(y1 y1Var) {
        return y1Var.currentAccount;
    }

    public static int V(y1 y1Var) {
        return y1Var.currentAccount;
    }

    public static int W(y1 y1Var) {
        return y1Var.currentAccount;
    }

    public static void m(y1 y1Var) {
        boolean z4 = y1Var.v;
        boolean z10 = y1Var.keyboardVisible;
        if (z4 != z10) {
            y1Var.v = z10;
            y1Var.container.clearAnimation();
            float f10 = 0.0f;
            if (y1Var.keyboardVisible) {
                int i10 = AndroidUtilities.displaySize.y;
                int i11 = y1Var.keyboardHeight;
                f10 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - y1Var.f46350x, (-i11) / 3.0f));
            }
            y1Var.container.animate().translationY(f10).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.f22249w).start();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f46345f.getTranslationY() >= ((int) this.f46346n)) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        View[] viewPages;
        if (i10 == NotificationCenter.stickersDidLoad || i10 == NotificationCenter.groupStickersDidLoad) {
            for (View view : this.f46345f.getViewPages()) {
                if (view instanceof o1) {
                    o1 o1Var = (o1) view;
                    if (i10 == NotificationCenter.groupStickersDidLoad || ((o1Var.f45454a == 0 && ((Integer) objArr[0]).intValue() == 5) || (o1Var.f45454a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        n1 n1Var = o1Var.f45821c;
                        if (n1Var.E == null) {
                            n1Var.D(null);
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
        return (int) (this.containerView.getMeasuredHeight() - this.f46345f.getY());
    }

    public boolean l0(Integer num) {
        return true;
    }

    public boolean m0(Integer num) {
        return true;
    }

    public boolean n0(jm jmVar) {
        return true;
    }

    public final void o0() {
        View[] viewPages;
        s1 s1Var;
        this.keyboardVisible = false;
        this.container.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.f22249w).start();
        for (View view : this.f46345f.getViewPages()) {
            if (view instanceof o1) {
                s1 s1Var2 = ((o1) view).f45823f;
                if (s1Var2 != null) {
                    AndroidUtilities.hideKeyboard(s1Var2.d);
                }
            } else if ((view instanceof i1) && (s1Var = ((i1) view).d) != null) {
                AndroidUtilities.hideKeyboard(s1Var.d);
            }
        }
    }

    public final void p0(int i10) {
        if (l0(Integer.valueOf(i10))) {
            if ((i10 != 1 || n0(new jm(this, i10, 29))) && ((Boolean) this.C.run(Integer.valueOf(i10))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void q0(Utilities.CallbackReturn callbackReturn) {
        View[] viewPages;
        this.C = callbackReturn;
        for (View view : this.f46345f.getViewPages()) {
            if (view instanceof o1) {
                n1 n1Var = ((o1) view).f45821c;
                if (n1Var.E == null) {
                    n1Var.D(null);
                }
            }
        }
    }
}
