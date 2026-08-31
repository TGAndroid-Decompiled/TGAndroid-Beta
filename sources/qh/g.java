package qh;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.zh;
import org.telegram.ui.LaunchActivity;
public final class g implements TextWatcher {
    public int f45346a;
    public boolean f45347b;
    public final k f45348c;

    public g(k kVar) {
        this.f45348c = kVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        boolean z4;
        k kVar = this.f45348c;
        e eVar = kVar.W;
        org.telegram.ui.Components.k6 k6Var = kVar.v;
        kVar.f45537w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = kVar.getCaptionLimit();
        if (kVar.f45537w + 25 > captionLimit) {
            str = "" + (captionLimit - kVar.f45537w);
        } else {
            str = null;
        }
        k6Var.a();
        k6Var.setText(str);
        if (kVar.f45537w >= captionLimit) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        k6Var.setTextColor(i10);
        if (kVar.f45537w > captionLimit && !UserConfig.getInstance(kVar.R).isPremium() && kVar.f45537w < kVar.getCaptionPremiumLimit() && kVar.f45537w > this.f45346a && (kVar.e() || MessagesController.getInstance(kVar.R).premiumFeaturesBlocked())) {
            int i11 = -kVar.K;
            kVar.K = i11;
            AndroidUtilities.shakeViewSpring(k6Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i12 = kVar.f45537w;
        this.f45346a = i12;
        if (i12 > captionLimit) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 != this.f45347b) {
            kVar.q(z4);
        }
        this.f45347b = z4;
        if (!kVar.S) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        kVar.S = false;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.s0(this, 8));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        k kVar = this.f45348c;
        ObjectAnimator objectAnimator = kVar.f45514d0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        kVar.U = kVar.f45517f.getEditText().getScrollY();
        kVar.T = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        k kVar = this.f45348c;
        f fVar = kVar.f45517f;
        if (!fVar.getEditText().suppressOnTextChanged) {
            if (kVar.J == null) {
                zh zhVar = new zh(kVar, kVar.getContext(), kVar.f45539x, LaunchActivity.R(), new oh.b(), 1);
                kVar.J = zhVar;
                kVar.Q = new org.telegram.ui.Components.fa(kVar.L, zhVar, 0, false);
                kVar.J.p(new ai(kVar, 7));
                og.a aVar = kVar.f45516e0;
                if (aVar != null) {
                    zh zhVar2 = kVar.J;
                    qg.b c3 = aVar.c(zhVar2, null, false);
                    c3.n(sg.b.i(kVar.f45508a));
                    zhVar2.setBackgroundDrawable(c3);
                }
                kVar.f45510b.addView(kVar.J, k7.c6.e(-1, -1, 83));
                kVar.w();
            }
            if (kVar.J.getAdapter() != null) {
                uf.u0 adapter = kVar.J.getAdapter();
                MessagesController.getInstance(kVar.R).getUser(Long.valueOf(kVar.f45539x));
                TLRPC.Chat chat = MessagesController.getInstance(kVar.R).getChat(Long.valueOf(-kVar.f45539x));
                adapter.getClass();
                adapter.f48704i0 = chat;
                kVar.J.getAdapter().U(charSequence, fVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
