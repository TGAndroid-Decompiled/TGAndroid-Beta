package zh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.sk;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.z9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yy;
public final class a1 implements Runnable {
    public final int f50254a;
    public final r3 f50255b;

    public a1(r3 r3Var, int i10) {
        this.f50254a = i10;
        this.f50255b = r3Var;
    }

    @Override
    public final void run() {
        String str;
        ImageReceiver imageReceiver;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        z2 z2Var;
        int i10 = this.f50254a;
        r3 r3Var = this.f50255b;
        switch (i10) {
            case 0:
                r3.q0(r3Var);
                return;
            case 1:
                new t(r3Var.getContext()).show();
                return;
            case 2:
                r3Var.dismiss();
                return;
            case 3:
                r3.X(r3Var);
                return;
            case 4:
                r3.Z(r3Var);
                return;
            case 5:
                r3Var.f51089k0.setLoading(false);
                r3Var.s2(0, true, null);
                return;
            case 6:
                new t(r3Var.getContext()).show();
                return;
            case 7:
                r3.x0(r3Var);
                return;
            case 8:
                r3.c0(r3Var);
                return;
            case 9:
                r3Var.onBackPressed();
                return;
            case 10:
                r3.h1(r3Var);
                return;
            case 11:
                r3Var.X1(true);
                return;
            case 12:
                r3Var.V1();
                return;
            case 13:
                r3Var.T1();
                return;
            case 14:
                r3.o0(r3Var);
                return;
            case 15:
                r3Var.dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                TL_stars.TL_starGiftUnique L1 = r3Var.L1();
                if (U != null && L1 != null) {
                    yy yyVar = new yy(sk.d(4, "onlySelect", "dialogsType", true));
                    yyVar.C2 = new nz(r3Var, L1, yyVar, 13);
                    U.presentFragment(yyVar);
                    return;
                }
                return;
            case 16:
                r3Var.Z1();
                return;
            case 17:
                long B1 = r3Var.B1();
                if (B1 != 0) {
                    r3Var.Y1(B1);
                    return;
                }
                return;
            case 18:
                r3Var.onBackPressed();
                return;
            case 19:
                r3Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                return;
            case 20:
                if (r3Var.C1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(r3Var.C1().title);
                    sb2.append(" #");
                    str = org.telegram.messenger.g0.h(r3Var.C1().num, ',', sb2);
                } else {
                    str = "";
                }
                sc M = r3Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str)), R.raw.gift_upgrade);
                M.f28805j = 5000;
                M.f28815t = true;
                M.j();
                d10 d10Var = r3Var.f51069a0;
                if (d10Var != null) {
                    d10Var.c(true);
                    return;
                }
                return;
            case 21:
                r3Var.d.u0(((r3) r3Var.R0.d).Q0.length - 1);
                return;
            case 22:
                r3Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                return;
            case 23:
                o3 o3Var = r3Var.f51079f0;
                di.d dVar = r3Var.f51089k0;
                a3 a3Var = r3Var.N0.h;
                if (a3Var != null && (z2Var = a3Var.f50260c) != null) {
                    imageReceiver = ((c3) z2Var).d;
                } else {
                    imageReceiver = null;
                }
                z9 z9Var = o3Var.d[0];
                if (imageReceiver != null && z9Var != null && z9Var.getImageReceiver() != null) {
                    yj0 lottieAnimation = imageReceiver.getLottieAnimation();
                    yj0 lottieAnimation2 = z9Var.getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.T(lottieAnimation.t(), false);
                    } else if (lottieAnimation2 == null && lottieAnimation != null) {
                        imageReceiver.clearImage();
                        z9Var.setImageDrawable(lottieAnimation);
                    }
                }
                o3Var.f50909b.setAlpha(1.0f);
                o3Var.f50911c.setAlpha(0.0f);
                if (r3Var.f51101r0 && r3Var.Z != null && r3Var.E0 != null && r3Var.H1() >= 0 && r3Var.E0.b(r3Var.H1()) >= 0) {
                    dVar.setFilled(false);
                    int b10 = r3Var.E0.b(r3Var.H1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                    Object obj = r3Var.E0.get(b10);
                    if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.b6(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar.g(spannableStringBuilder, true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new d1(r3Var, b10, 0));
                    return;
                }
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), true, true);
                dVar.f(null, true);
                dVar.setOnClickListener(new t0(r3Var, 2));
                return;
            default:
                r3Var.getClass();
                new sg.y0((org.telegram.ui.ActionBar.m2) new bi.o3(r3Var, 12), 12, false).show();
                return;
        }
    }
}
