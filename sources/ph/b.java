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
import qh.ba;
import qh.ca;
import qh.g8;
import qh.n9;
import qh.s6;
public final class b implements ki {
    public final mi f44373a;
    public final String f44374b;
    public final p f44375c;

    public b(p pVar, mi miVar, String str) {
        this.f44375c = pVar;
        this.f44373a = miVar;
        this.f44374b = str;
    }

    @Override
    public final void B0(wg wgVar) {
        wgVar.run();
    }

    @Override
    public final void I1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        int i13;
        ba baVar;
        p pVar = this.f44375c;
        long j12 = pVar.d;
        mi miVar = this.f44373a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = miVar.f29054g0;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof MediaController.PhotoEntry) {
                    s6 l10 = s6.l((MediaController.PhotoEntry) next);
                    l10.J0 = j12;
                    String str = this.f44374b;
                    l10.K0 = str;
                    l10.A();
                    ca E = ca.E(pVar.f44406a.getParentActivity(), pVar.f44407b);
                    RectF rectF = E.E;
                    WindowManager.LayoutParams layoutParams = E.h;
                    int i14 = E.f45081c;
                    WindowManager windowManager = E.f45092f;
                    if (!E.d) {
                        if (MessagesController.getInstance(i14).isFrozen()) {
                            org.telegram.ui.c.b(i14);
                        } else {
                            E.f45133s0 = j12;
                            E.f45136t0 = str;
                            E.f45129r0 = false;
                            E.f45088e = false;
                            E.f45156y2 = false;
                            if (windowManager != null && (baVar = E.f45115n) != null && baVar.getParent() == null) {
                                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.f45115n, layoutParams);
                                windowManager.addView(E.f45115n, layoutParams);
                                E.g0();
                            }
                            E.H1 = l10;
                            l10.J0 = j12;
                            l10.K0 = str;
                            E.L1 = l10.K ? 1 : 0;
                            E.f45122p0.f45427g = false;
                            E.G = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.D = AndroidUtilities.dp(8.0f);
                            E.f45128r.c();
                            n9 n9Var = E.f45089e0;
                            int i15 = E.G;
                            if (i15 != 1 && i15 != 0) {
                                i13 = -14737633;
                            } else {
                                i13 = 0;
                            }
                            n9Var.setBackgroundColor(i13);
                            E.f45128r.setTranslationX(0.0f);
                            E.f45128r.setTranslationY(0.0f);
                            E.f45128r.b(0.0f);
                            E.f45128r.setScaleX(1.0f);
                            E.f45128r.setScaleY(1.0f);
                            E.H = 0.0f;
                            AndroidUtilities.lockOrientation(E.f45077b, 1);
                            s6 s6Var = E.H1;
                            if (s6Var != null) {
                                E.Z0.setText(s6Var.C0);
                            }
                            E.K(1, false);
                            E.l0(-1, false, false);
                            E.Y0.b(false, false);
                            E.Y0.b(true, true);
                            E.g(1.0f, true, new g8(E, 6));
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
