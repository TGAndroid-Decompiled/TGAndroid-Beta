package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.w9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qy;
public final class b1 implements Runnable {
    public final int f47219a;
    public final x3 f47220b;

    public b1(x3 x3Var, int i10) {
        this.f47219a = i10;
        this.f47220b = x3Var;
    }

    @Override
    public final void run() {
        String str;
        ImageReceiver imageReceiver;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        e3 e3Var;
        int i10 = this.f47219a;
        x3 x3Var = this.f47220b;
        switch (i10) {
            case 0:
                x3.p0(x3Var);
                return;
            case 1:
                new s(x3Var.getContext()).show();
                return;
            case 2:
                x3Var.dismiss();
                return;
            case 3:
                x3.W(x3Var);
                return;
            case 4:
                x3.Y(x3Var);
                return;
            case 5:
                x3Var.f48246j0.setLoading(false);
                x3Var.q2(0, true, null);
                return;
            case 6:
                new s(x3Var.getContext()).show();
                return;
            case 7:
                x3.w0(x3Var);
                return;
            case 8:
                x3.b0(x3Var);
                return;
            case 9:
                x3Var.onBackPressed();
                return;
            case 10:
                x3.g1(x3Var);
                return;
            case 11:
                x3Var.W1(true);
                return;
            case 12:
                x3Var.U1();
                return;
            case 13:
                x3Var.S1();
                return;
            case 14:
                x3.n0(x3Var);
                return;
            case 15:
                x3Var.dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                TL_stars.TL_starGiftUnique K1 = x3Var.K1();
                if (U != null && K1 != null) {
                    qy qyVar = new qy(ok.e(4, "onlySelect", "dialogsType", true));
                    qyVar.C2 = new s50(x3Var, K1, qyVar, 12);
                    U.presentFragment(qyVar);
                    return;
                }
                return;
            case 16:
                x3Var.Y1();
                return;
            case 17:
                long A1 = x3Var.A1();
                if (A1 != 0) {
                    x3Var.X1(A1);
                    return;
                }
                return;
            case 18:
                x3Var.onBackPressed();
                return;
            case 19:
                x3Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                return;
            case 20:
                if (x3Var.B1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(x3Var.B1().title);
                    sb2.append(" #");
                    str = org.telegram.messenger.f0.h(x3Var.B1().num, ',', sb2);
                } else {
                    str = "";
                }
                qc M = x3Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str)), R.raw.gift_upgrade);
                M.f27577j = 5000;
                M.f27587t = true;
                M.j();
                s00 s00Var = x3Var.f48228a0;
                if (s00Var != null) {
                    s00Var.c(true);
                    return;
                }
                return;
            case 21:
                x3Var.d.u0(((x3) x3Var.Q0.d).P0.length - 1);
                return;
            case 22:
                x3Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                return;
            case 23:
                u3 u3Var = x3Var.f48236e0;
                ci.d dVar = x3Var.f48246j0;
                f3 f3Var = x3Var.M0.h;
                if (f3Var != null && (e3Var = f3Var.f47369c) != null) {
                    imageReceiver = ((h3) e3Var).d;
                } else {
                    imageReceiver = null;
                }
                w9 w9Var = u3Var.d[0];
                if (imageReceiver != null && w9Var != null && w9Var.getImageReceiver() != null) {
                    ij0 lottieAnimation = imageReceiver.getLottieAnimation();
                    ij0 lottieAnimation2 = w9Var.getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.T(lottieAnimation.t(), false);
                    } else if (lottieAnimation2 == null && lottieAnimation != null) {
                        imageReceiver.clearImage();
                        w9Var.setImageDrawable(lottieAnimation);
                    }
                }
                u3Var.f48082b.setAlpha(1.0f);
                u3Var.f48084c.setAlpha(0.0f);
                if (x3Var.f48258q0 && x3Var.Z != null && x3Var.D0 != null && x3Var.G1() >= 0 && x3Var.D0.b(x3Var.G1()) >= 0) {
                    dVar.setFilled(false);
                    int b10 = x3Var.D0.b(x3Var.G1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                    Object obj = x3Var.D0.get(b10);
                    if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.z5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar.g(spannableStringBuilder, true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new e1(x3Var, b10, 0));
                    return;
                }
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), true, true);
                dVar.f(null, true);
                dVar.setOnClickListener(new u0(x3Var, 2));
                return;
            default:
                x3Var.getClass();
                new rg.x0((org.telegram.ui.ActionBar.m2) new ai.y3(x3Var, 12), 12, false).show();
                return;
        }
    }
}
