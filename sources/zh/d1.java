package zh;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.wr;
public final class d1 {
    public final long f48338a;
    public final float f48339b;
    public final float f48340c;
    public final hj0 d;
    public final Paint e;
    public final ImageReceiver f48341f;
    public final t01 f48342g;
    public boolean h;
    public final org.telegram.ui.Components.d6 f48343i;
    public final org.telegram.ui.Components.d6 f48344j;

    public d1(e1 e1Var, View view, int i10, long j3, int i11, boolean z10) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f48338a = j3;
        this.f48339b = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        this.f48340c = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        if (z10) {
            int[] iArr = e1Var.f48364f;
            hj0 hj0Var = new hj0(iArr[Utilities.fastRandom.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
            this.d = hj0Var;
            hj0Var.f23672v0 = view;
            hj0Var.J(true);
            hj0Var.K(0);
            hj0Var.start();
        }
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j3);
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.p(userOrChat);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f48341f = imageReceiver;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        imageReceiver.setForUserOrChat(userOrChat, g9Var);
        view.addOnAttachStateChangeListener(new l.d(this, 14));
        if (view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        uq uqVar = new uq(R.drawable.star, 0);
        uqVar.spaceScaleX = 0.875f;
        spannableStringBuilder.setSpan(uqVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i11, ','));
        this.f48342g = new t01(spannableStringBuilder, 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(view, 2000L, new LinearInterpolator());
        this.f48343i = d6Var;
        d6Var.d(0.0f, true);
        d6Var.d(1.0f, false);
        this.f48344j = new org.telegram.ui.Components.d6(view, 350L, 240L, wr.h);
    }
}
