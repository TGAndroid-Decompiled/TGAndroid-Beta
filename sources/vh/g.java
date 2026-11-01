package vh;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.e20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.w9;
import org.telegram.ui.LaunchActivity;
public final class g implements TextWatcher {
    public int f51186a;
    public boolean f51187b;
    public final k f51188c;

    public g(k kVar) {
        this.f51188c = kVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        boolean z10;
        k kVar = this.f51188c;
        e eVar = kVar.f51352c0;
        org.telegram.ui.Components.f6 f6Var = kVar.f51375w;
        kVar.f51377x = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = kVar.getCaptionLimit();
        if (kVar.f51377x + 25 > captionLimit) {
            str = "" + (captionLimit - kVar.f51377x);
        } else {
            str = null;
        }
        f6Var.a();
        f6Var.setText(str);
        if (kVar.f51377x >= captionLimit) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        f6Var.setTextColor(i10);
        if (kVar.f51377x > captionLimit && !e20.i(kVar.U).q() && kVar.f51377x < kVar.getCaptionPremiumLimit() && kVar.f51377x > this.f51186a && (kVar.e() || wp.r1(kVar.U).A3())) {
            int i11 = -kVar.N;
            kVar.N = i11;
            org.telegram.messenger.i0.F3(i11, f6Var, null);
            org.telegram.messenger.t2.APP_ERROR.a();
        }
        int i12 = kVar.f51377x;
        this.f51186a = i12;
        if (i12 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f51187b) {
            kVar.q(z10);
        }
        this.f51187b = z10;
        if (!kVar.V) {
            org.telegram.messenger.i0.r(eVar);
            org.telegram.messenger.i0.h3(eVar, 1500L);
        }
        kVar.V = false;
        org.telegram.messenger.i0.g3(new sg.v(this, 27));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        k kVar = this.f51188c;
        ObjectAnimator objectAnimator = kVar.f51356f0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        kVar.f51348a0 = kVar.f51355f.getEditText().getScrollY();
        kVar.W = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        k kVar = this.f51188c;
        f fVar = kVar.f51355f;
        if (!fVar.getEditText().h) {
            if (kVar.M == null) {
                oh ohVar = new oh(kVar, kVar.getContext(), kVar.f51379y, LaunchActivity.Q(), new th.b(), 1);
                kVar.M = ohVar;
                kVar.T = new w9(kVar.O, ohVar, 0, false);
                kVar.M.p(new m2.t(kVar, 29));
                tg.b bVar = kVar.f51357g0;
                if (bVar != null) {
                    oh ohVar2 = kVar.M;
                    vg.f c10 = bVar.c(ohVar2, null, false);
                    c10.o(w7.b9.i(kVar.f51347a));
                    ohVar2.setBackgroundDrawable(c10);
                }
                kVar.f51349b.addView(kVar.M, w7.b6.e(-1, -1, 83));
                kVar.w();
            }
            if (kVar.M.getAdapter() != null) {
                zf.x0 adapter = kVar.M.getAdapter();
                wp.r1(kVar.U).Z1(Long.valueOf(kVar.f51379y));
                TLRPC.Chat L0 = wp.r1(kVar.U).L0(Long.valueOf(-kVar.f51379y));
                adapter.getClass();
                adapter.f55676l0 = L0;
                kVar.M.getAdapter().U(charSequence, fVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
