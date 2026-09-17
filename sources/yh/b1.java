package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wy;
public final class b1 implements Runnable {
    public final int f47028a;
    public final a4 f47029b;

    public b1(a4 a4Var, int i10) {
        this.f47028a = i10;
        this.f47029b = a4Var;
    }

    @Override
    public final void run() {
        String str;
        ImageReceiver imageReceiver;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        h3 h3Var;
        int i10 = this.f47028a;
        a4 a4Var = this.f47029b;
        switch (i10) {
            case 0:
                a4.q0(a4Var);
                return;
            case 1:
                new s(a4Var.getContext()).show();
                return;
            case 2:
                a4Var.dismiss();
                return;
            case 3:
                a4.W(a4Var);
                return;
            case 4:
                a4.Y(a4Var);
                return;
            case 5:
                a4Var.f46986j0.setLoading(false);
                a4Var.q2(0, true, null);
                return;
            case 6:
                new s(a4Var.getContext()).show();
                return;
            case 7:
                a4.w0(a4Var);
                return;
            case 8:
                a4.b0(a4Var);
                return;
            case 9:
                a4Var.onBackPressed();
                return;
            case 10:
                a4.g1(a4Var);
                return;
            case 11:
                a4Var.W1(true);
                return;
            case 12:
                a4Var.U1();
                return;
            case 13:
                a4Var.S1();
                return;
            case 14:
                a4.o0(a4Var);
                return;
            case 15:
                a4Var.dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                TL_stars.TL_starGiftUnique K1 = a4Var.K1();
                if (U != null && K1 != null) {
                    wy wyVar = new wy(org.telegram.messenger.w1.e(4, "onlySelect", "dialogsType", true));
                    wyVar.C2 = new s50(a4Var, K1, wyVar, 11);
                    U.presentFragment(wyVar);
                    return;
                }
                return;
            case 16:
                a4Var.Y1();
                return;
            case 17:
                long A1 = a4Var.A1();
                if (A1 != 0) {
                    a4Var.X1(A1);
                    return;
                }
                return;
            case 18:
                a4Var.onBackPressed();
                return;
            case 19:
                a4Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                return;
            case 20:
                if (a4Var.B1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(a4Var.B1().title);
                    sb2.append(" #");
                    str = hg.k0.k(a4Var.B1().num, ',', sb2);
                } else {
                    str = "";
                }
                oc M = a4Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str)), R.raw.gift_upgrade);
                M.f26702j = 5000;
                M.f26712t = true;
                M.j();
                r00 r00Var = a4Var.f46968a0;
                if (r00Var != null) {
                    r00Var.c(true);
                    return;
                }
                return;
            case 21:
                a4Var.d.v0(((a4) a4Var.Q0.d).P0.length - 1);
                return;
            case 22:
                a4Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                return;
            case 23:
                x3 x3Var = a4Var.f46976e0;
                ci.d dVar = a4Var.f46986j0;
                i3 i3Var = a4Var.M0.h;
                if (i3Var != null && (h3Var = i3Var.f47307c) != null) {
                    imageReceiver = ((k3) h3Var).d;
                } else {
                    imageReceiver = null;
                }
                u9 u9Var = x3Var.d[0];
                if (imageReceiver != null && u9Var != null && u9Var.getImageReceiver() != null) {
                    yi0 lottieAnimation = imageReceiver.getLottieAnimation();
                    yi0 lottieAnimation2 = u9Var.getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.S(lottieAnimation.t(), false);
                    } else if (lottieAnimation2 == null && lottieAnimation != null) {
                        imageReceiver.clearImage();
                        u9Var.setImageDrawable(lottieAnimation);
                    }
                }
                x3Var.f47988b.setAlpha(1.0f);
                x3Var.f47990c.setAlpha(0.0f);
                if (a4Var.f46998q0 && a4Var.Z != null && a4Var.D0 != null && a4Var.G1() >= 0 && a4Var.D0.b(a4Var.G1()) >= 0) {
                    dVar.setFilled(false);
                    int b10 = a4Var.D0.b(a4Var.G1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                    Object obj = a4Var.D0.get(b10);
                    if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.x5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar.g(spannableStringBuilder, true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new e1(a4Var, b10, 0));
                    return;
                }
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), true, true);
                dVar.f(null, true);
                dVar.setOnClickListener(new u0(a4Var, 2));
                return;
            default:
                a4Var.getClass();
                new rg.x0((org.telegram.ui.ActionBar.o2) new ai.y3(a4Var, 12), 12, false).show();
                return;
        }
    }
}
