package vf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
public final class o extends FrameLayout {
    public final l5 f49152a;
    public final jh.s f49153b;
    public final l5 f49154c;
    public final g6 d;
    public boolean f49155e;
    public TL_account.TL_businessChatLink f49156f;

    public o(Context context, g6 g6Var) {
        super(context);
        int i10;
        int i11;
        this.d = g6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(k6.K(AndroidUtilities.dp(36.0f), k6.w0(null, k6.Oh, false)));
        imageView.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 24));
        addView(imageView, c6.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        l5 l5Var = new l5(context);
        this.f49152a = l5Var;
        l5Var.setTextSize(15);
        l5Var.setTextColor(k6.w0(null, k6.G6, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        l5Var.setGravity(i10);
        addView(l5Var, c6.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        l5 l5Var2 = new l5(context);
        this.f49154c = l5Var2;
        l5Var2.setTextSize(14);
        int i12 = k6.f22053z6;
        l5Var2.setTextColor(k6.w0(null, i12, false));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        l5Var2.setGravity(i11);
        addView(l5Var2, c6.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        jh.s sVar = new jh.s(context);
        this.f49153b = sVar;
        sVar.setTextSize(1, 13.0f);
        sVar.setMaxLines(1);
        sVar.setEllipsize(TextUtils.TruncateAt.END);
        sVar.setTextColor(k6.v0(i12, g6Var));
        sVar.setGravity(LocaleController.isRTL ? 5 : 3);
        sVar.f10189f = false;
        sVar.setUseAlphaForEmoji(false);
        NotificationCenter.listenEmojiLoading(sVar);
        addView(sVar, c6.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f49155e) {
            Paint T0 = k6.T0("paintDivider", this.d);
            if (T0 == null) {
                T0 = k6.f21779k0;
            }
            Paint paint = T0;
            float f11 = 64.0f;
            if (LocaleController.isRTL) {
                f10 = 0.0f;
            } else {
                f10 = 64.0f;
            }
            float dp = AndroidUtilities.dp(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!LocaleController.isRTL) {
                f11 = 0.0f;
            }
            canvas.drawRect(dp, measuredHeight, width - AndroidUtilities.dp(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        boolean z10 = LocaleController.isRTL;
        l5 l5Var = this.f49154c;
        l5 l5Var2 = this.f49152a;
        if (z10) {
            l5Var2.setPadding(l5Var.getTextWidth(), 0, 0, 0);
        } else {
            l5Var2.setPadding(0, 0, l5Var.getTextWidth(), 0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f) + (this.f49155e ? 1 : 0), 1073741824));
    }
}
