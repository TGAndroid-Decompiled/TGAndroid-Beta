package qf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import h7.z5;
import lh.c5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;

public final class q extends FrameLayout {

    public final h5 f46424a;

    public final eh.s f46425b;

    public final h5 f46426c;
    public final c6 d;

    public boolean f46427e;

    public TL_account.TL_businessChatLink f46428f;

    public q(Context context, c6 c6Var) {
        super(context);
        this.d = c6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(g6.K(AndroidUtilities.dp(36.0f), g6.w0(null, g6.Oh, false)));
        imageView.setOnClickListener(new c5(this, 20));
        addView(imageView, z5.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        h5 h5Var = new h5(context);
        this.f46424a = h5Var;
        h5Var.setTextSize(15);
        h5Var.setTextColor(g6.w0(null, g6.G6, false));
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(h5Var, z5.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        h5 h5Var2 = new h5(context);
        this.f46426c = h5Var2;
        h5Var2.setTextSize(14);
        int i10 = g6.f23441z6;
        h5Var2.setTextColor(g6.w0(null, i10, false));
        h5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(h5Var2, z5.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        eh.s sVar = new eh.s(context);
        this.f46425b = sVar;
        sVar.setTextSize(1, 13.0f);
        sVar.setMaxLines(1);
        sVar.setEllipsize(TextUtils.TruncateAt.END);
        sVar.setTextColor(g6.v0(i10, c6Var));
        sVar.setGravity(LocaleController.isRTL ? 5 : 3);
        sVar.f5567f = false;
        sVar.setUseAlphaForEmoji(false);
        NotificationCenter.listenEmojiLoading(sVar);
        addView(sVar, z5.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f46427e) {
            Paint paintT0 = g6.T0("paintDivider", this.d);
            if (paintT0 == null) {
                paintT0 = g6.f23175k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 64.0f : 0.0f), getMeasuredHeight(), paintT0);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = LocaleController.isRTL;
        h5 h5Var = this.f46426c;
        h5 h5Var2 = this.f46424a;
        if (z11) {
            h5Var2.setPadding(h5Var.getTextWidth(), 0, 0, 0);
        } else {
            h5Var2.setPadding(0, 0, h5Var.getTextWidth(), 0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f) + (this.f46427e ? 1 : 0), 1073741824));
    }
}
