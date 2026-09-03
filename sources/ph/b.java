package ph;

import android.graphics.RectF;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.wg;
import org.telegram.ui.web.s0;
import qh.aa;
import qh.ba;
import qh.f8;
import qh.m9;
import qh.r6;
public final class b implements ki {
    public final mi f44404a;
    public final String f44405b;
    public final p f44406c;

    public b(p pVar, mi miVar, String str) {
        this.f44406c = pVar;
        this.f44404a = miVar;
        this.f44405b = str;
    }

    @Override
    public final void B0(wg wgVar) {
        wgVar.run();
    }

    @Override
    public final void I1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        int i13;
        aa aaVar;
        p pVar = this.f44406c;
        long j12 = pVar.d;
        mi miVar = this.f44404a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = miVar.f29072g0;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof MediaController.PhotoEntry) {
                    r6 l10 = r6.l((MediaController.PhotoEntry) next);
                    l10.J0 = j12;
                    String str = this.f44405b;
                    l10.K0 = str;
                    l10.A();
                    ba E = ba.E(pVar.f44437a.getParentActivity(), pVar.f44438b);
                    RectF rectF = E.E;
                    WindowManager.LayoutParams layoutParams = E.h;
                    int i14 = E.f45047c;
                    WindowManager windowManager = E.f45058f;
                    if (!E.d) {
                        if (MessagesController.getInstance(i14).isFrozen()) {
                            org.telegram.ui.c.b(i14);
                        } else {
                            E.f45099s0 = j12;
                            E.f45102t0 = str;
                            E.f45095r0 = false;
                            E.f45054e = false;
                            E.f45122y2 = false;
                            if (windowManager != null && (aaVar = E.f45081n) != null && aaVar.getParent() == null) {
                                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.f45081n, layoutParams);
                                windowManager.addView(E.f45081n, layoutParams);
                                E.g0();
                            }
                            E.H1 = l10;
                            l10.J0 = j12;
                            l10.K0 = str;
                            E.L1 = l10.K ? 1 : 0;
                            E.f45088p0.f45409g = false;
                            E.G = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.D = AndroidUtilities.dp(8.0f);
                            E.f45094r.c();
                            m9 m9Var = E.f45055e0;
                            int i15 = E.G;
                            if (i15 != 1 && i15 != 0) {
                                i13 = -14737633;
                            } else {
                                i13 = 0;
                            }
                            m9Var.setBackgroundColor(i13);
                            E.f45094r.setTranslationX(0.0f);
                            E.f45094r.setTranslationY(0.0f);
                            E.f45094r.b(0.0f);
                            E.f45094r.setScaleX(1.0f);
                            E.f45094r.setScaleY(1.0f);
                            E.H = 0.0f;
                            AndroidUtilities.lockOrientation(E.f45043b, 1);
                            r6 r6Var = E.H1;
                            if (r6Var != null) {
                                E.Z0.setText(r6Var.C0);
                            }
                            E.K(1, false);
                            E.l0(-1, false, false);
                            E.Y0.b(false, false);
                            E.Y0.b(true, true);
                            E.g(1.0f, true, new f8(E, 6));
                            E.e();
                        }
                    }
                    AndroidUtilities.runOnUIThread(new s0(miVar, 6), 400L);
                }
            }
        }
    }

    @Override
    public final boolean b2() {
        return true;
    }

    @Override
    public final boolean h0() {
        return false;
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void Z0(Object obj) {
    }

    @Override
    public final void o1(TLRPC.User user) {
    }

    @Override
    public final void f2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
