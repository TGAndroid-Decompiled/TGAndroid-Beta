package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.t50;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ry;
public final class b1 implements Runnable {
    public final int f46913a;
    public final y3 f46914b;

    public b1(y3 y3Var, int i10) {
        this.f46913a = i10;
        this.f46914b = y3Var;
    }

    @Override
    public final void run() {
        String str;
        ImageReceiver imageReceiver;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        f3 f3Var;
        int i10 = this.f46913a;
        y3 y3Var = this.f46914b;
        switch (i10) {
            case 0:
                y3.p0(y3Var);
                return;
            case 1:
                new s(y3Var.getContext()).show();
                return;
            case 2:
                y3Var.dismiss();
                return;
            case 3:
                y3.W(y3Var);
                return;
            case 4:
                y3.Y(y3Var);
                return;
            case 5:
                y3Var.f47964j0.setLoading(false);
                y3Var.q2(0, true, null);
                return;
            case 6:
                new s(y3Var.getContext()).show();
                return;
            case 7:
                y3.w0(y3Var);
                return;
            case 8:
                y3.b0(y3Var);
                return;
            case 9:
                y3Var.onBackPressed();
                return;
            case 10:
                y3.g1(y3Var);
                return;
            case 11:
                y3Var.W1(true);
                return;
            case 12:
                y3Var.U1();
                return;
            case 13:
                y3Var.S1();
                return;
            case 14:
                y3.n0(y3Var);
                return;
            case 15:
                y3Var.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                TL_stars.TL_starGiftUnique K1 = y3Var.K1();
                if (U != null && K1 != null) {
                    ry ryVar = new ry(org.telegram.messenger.z0.e(4, "onlySelect", "dialogsType", true));
                    ryVar.C2 = new t50(y3Var, K1, ryVar, 12);
                    U.presentFragment(ryVar);
                    return;
                }
                return;
            case 16:
                y3Var.Y1();
                return;
            case 17:
                long A1 = y3Var.A1();
                if (A1 != 0) {
                    y3Var.X1(A1);
                    return;
                }
                return;
            case 18:
                y3Var.onBackPressed();
                return;
            case 19:
                y3Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                return;
            case 20:
                if (y3Var.B1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(y3Var.B1().title);
                    sb2.append(" #");
                    str = hg.c.k(y3Var.B1().num, ',', sb2);
                } else {
                    str = "";
                }
                qc M = y3Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str)), R.raw.gift_upgrade);
                M.f27306j = 5000;
                M.f27316t = true;
                M.j();
                s00 s00Var = y3Var.f47946a0;
                if (s00Var != null) {
                    s00Var.c(true);
                    return;
                }
                return;
            case 21:
                y3Var.d.u0(((y3) y3Var.Q0.d).P0.length - 1);
                return;
            case 22:
                y3Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                return;
            case 23:
                v3 v3Var = y3Var.f47954e0;
                ci.d dVar = y3Var.f47964j0;
                g3 g3Var = y3Var.M0.h;
                if (g3Var != null && (f3Var = g3Var.f47117c) != null) {
                    imageReceiver = ((i3) f3Var).d;
                } else {
                    imageReceiver = null;
                }
                w9 w9Var = v3Var.d[0];
                if (imageReceiver != null && w9Var != null && w9Var.getImageReceiver() != null) {
                    yi0 lottieAnimation = imageReceiver.getLottieAnimation();
                    yi0 lottieAnimation2 = w9Var.getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.T(lottieAnimation.t(), false);
                    } else if (lottieAnimation2 == null && lottieAnimation != null) {
                        imageReceiver.clearImage();
                        w9Var.setImageDrawable(lottieAnimation);
                    }
                }
                v3Var.f47804b.setAlpha(1.0f);
                v3Var.f47806c.setAlpha(0.0f);
                if (y3Var.f47976q0 && y3Var.Z != null && y3Var.D0 != null && y3Var.G1() >= 0 && y3Var.D0.b(y3Var.G1()) >= 0) {
                    dVar.setFilled(false);
                    int b10 = y3Var.D0.b(y3Var.G1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                    Object obj = y3Var.D0.get(b10);
                    if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.z5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar.g(spannableStringBuilder, true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new e1(y3Var, b10, 0));
                    return;
                }
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), true, true);
                dVar.f(null, true);
                dVar.setOnClickListener(new u0(y3Var, 2));
                return;
            default:
                y3Var.getClass();
                new rg.x0((org.telegram.ui.ActionBar.n2) new ai.y3(y3Var, 12), 12, false).show();
                return;
        }
    }
}
