package ph;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.zh;
import org.telegram.ui.Components.zz;
import org.telegram.ui.LaunchActivity;
public final class g implements TextWatcher {
    public int f41710a;
    public boolean f41711b;
    public final k f41712c;

    public g(k kVar) {
        this.f41712c = kVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        boolean z4;
        k kVar = this.f41712c;
        e eVar = kVar.W;
        org.telegram.ui.Components.k6 k6Var = kVar.v;
        kVar.f41862w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = kVar.getCaptionLimit();
        if (kVar.f41862w + 25 > captionLimit) {
            str = "" + (captionLimit - kVar.f41862w);
        } else {
            str = null;
        }
        k6Var.a();
        k6Var.setText(str);
        if (kVar.f41862w >= captionLimit) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        k6Var.setTextColor(i10);
        if (kVar.f41862w > captionLimit && !UserConfig.getInstance(kVar.R).isPremium() && kVar.f41862w < kVar.getCaptionPremiumLimit() && kVar.f41862w > this.f41710a && (kVar.e() || MessagesController.getInstance(kVar.R).premiumFeaturesBlocked())) {
            int i11 = -kVar.K;
            kVar.K = i11;
            AndroidUtilities.shakeViewSpring(k6Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i12 = kVar.f41862w;
        this.f41710a = i12;
        if (i12 > captionLimit) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 != this.f41711b) {
            kVar.q(z4);
        }
        this.f41711b = z4;
        if (!kVar.S) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        kVar.S = false;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(this, 7));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        k kVar = this.f41712c;
        ObjectAnimator objectAnimator = kVar.f41840d0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        kVar.U = kVar.f41842f.getEditText().getScrollY();
        kVar.T = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        k kVar = this.f41712c;
        f fVar = kVar.f41842f;
        if (!fVar.getEditText().suppressOnTextChanged) {
            if (kVar.J == null) {
                zh zhVar = new zh(kVar, kVar.getContext(), kVar.f41864x, LaunchActivity.R(), new nh.b(), 1);
                kVar.J = zhVar;
                kVar.Q = new org.telegram.ui.Components.fa(kVar.L, zhVar, 0, false);
                kVar.J.p(new zz(kVar, 6));
                ng.a aVar = kVar.f41841e0;
                if (aVar != null) {
                    zh zhVar2 = kVar.J;
                    pg.b c3 = aVar.c(zhVar2, null, false);
                    c3.n(rg.b.i(kVar.f41834a));
                    zhVar2.setBackgroundDrawable(c3);
                }
                kVar.f41836b.addView(kVar.J, k7.b6.e(-1, -1, 83));
                kVar.w();
            }
            if (kVar.J.getAdapter() != null) {
                tf.u0 adapter = kVar.J.getAdapter();
                MessagesController.getInstance(kVar.R).getUser(Long.valueOf(kVar.f41864x));
                TLRPC.Chat chat = MessagesController.getInstance(kVar.R).getChat(Long.valueOf(-kVar.f41864x));
                adapter.getClass();
                adapter.f44909i0 = chat;
                kVar.J.getAdapter().U(charSequence, fVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
