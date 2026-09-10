package xh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.y00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wy;
public final class b1 implements Runnable {
    public final int f45259a;
    public final x3 f45260b;

    public b1(x3 x3Var, int i10) {
        this.f45259a = i10;
        this.f45260b = x3Var;
    }

    @Override
    public final void run() {
        String str;
        ImageReceiver imageReceiver;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        e3 e3Var;
        int i10 = this.f45259a;
        x3 x3Var = this.f45260b;
        switch (i10) {
            case 0:
                x3.q0(x3Var);
                return;
            case 1:
                new t(x3Var.getContext()).show();
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
                x3Var.f46285j0.setLoading(false);
                x3Var.q2(0, true, null);
                return;
            case 6:
                new t(x3Var.getContext()).show();
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
                x3.o0(x3Var);
                return;
            case 15:
                x3Var.dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                TL_stars.TL_starGiftUnique K1 = x3Var.K1();
                if (U != null && K1 != null) {
                    wy wyVar = new wy(org.telegram.messenger.a2.e(4, "onlySelect", "dialogsType", true));
                    wyVar.C2 = new f21(x3Var, K1, wyVar, 9);
                    U.presentFragment(wyVar);
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
                    str = hc.b.l(x3Var.B1().num, ',', sb2);
                } else {
                    str = "";
                }
                pc M = x3Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str)), R.raw.gift_upgrade);
                M.f26081j = 5000;
                M.f26091t = true;
                M.j();
                y00 y00Var = x3Var.f46267a0;
                if (y00Var != null) {
                    y00Var.c(true);
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
                u3 u3Var = x3Var.f46275e0;
                bi.d dVar = x3Var.f46285j0;
                f3 f3Var = x3Var.M0.h;
                if (f3Var != null && (e3Var = f3Var.f45402c) != null) {
                    imageReceiver = ((h3) e3Var).d;
                } else {
                    imageReceiver = null;
                }
                w9 w9Var = u3Var.d[0];
                if (imageReceiver != null && w9Var != null && w9Var.getImageReceiver() != null) {
                    hj0 lottieAnimation = imageReceiver.getLottieAnimation();
                    hj0 lottieAnimation2 = w9Var.getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.S(lottieAnimation.t(), false);
                    } else if (lottieAnimation2 == null && lottieAnimation != null) {
                        imageReceiver.clearImage();
                        w9Var.setImageDrawable(lottieAnimation);
                    }
                }
                u3Var.f46099b.setAlpha(1.0f);
                u3Var.f46101c.setAlpha(0.0f);
                if (x3Var.f46297q0 && x3Var.Z != null && x3Var.D0 != null && x3Var.G1() >= 0 && x3Var.D0.b(x3Var.G1()) >= 0) {
                    dVar.setFilled(false);
                    int b10 = x3Var.D0.b(x3Var.G1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                    Object obj = x3Var.D0.get(b10);
                    if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
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
                new qg.a1((org.telegram.ui.ActionBar.p2) new bi.o1(x3Var, 10), 12, false).show();
                return;
        }
    }
}
